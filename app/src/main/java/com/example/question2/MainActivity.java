package com.example.question2;




import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText PrincipalAmount, Rate, Time;
    TextView paymentresult;
    Button SimpleInterestButton, LoanRepayment, QuitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PrincipalAmount = findViewById(R.id.PrincipalAmount);
        Rate = findViewById(R.id.Rate);
        Time = findViewById(R.id.Time);
        paymentresult = findViewById(R.id.paymentresult);
        SimpleInterestButton = findViewById(R.id.SimpleInterestButton);
        LoanRepayment = findViewById(R.id.LoanRepayment);
        QuitButton = findViewById(R.id.QuitButton);

        SimpleInterestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PrincipalAmount.getText().toString().isEmpty() ||
                        Rate.getText().toString().isEmpty() ||
                        Time.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the required data", Toast.LENGTH_SHORT).show();
                } else {
                    int principle = Integer.parseInt(PrincipalAmount.getText().toString());
                    int rate = Integer.parseInt(Rate.getText().toString());
                    int time = Integer.parseInt(Time.getText().toString());

                    int simpleInterest = (principle * rate * time) / 100;
                    paymentresult.setText("The Simple Interest is " + simpleInterest);
                }
            }
        });

        LoanRepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PrincipalAmount.getText().toString().isEmpty() ||
                        Rate.getText().toString().isEmpty() ||
                        Time.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the required data", Toast.LENGTH_SHORT).show();
                } else {
                    double principle = Double.parseDouble(PrincipalAmount.getText().toString());
                    double rate = Double.parseDouble(Rate.getText().toString());
                    double time = Double.parseDouble(Time.getText().toString());

                    double loan = (principle + (principle * rate * time)) / (time * 12);
                    paymentresult.setText("The Loan Payment is " + loan);
                }
            }
        });

        QuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}
