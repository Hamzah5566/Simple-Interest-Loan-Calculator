# Simple Interest & Loan Repayment Calculator

An Android app that calculates simple interest on a principal amount, and the monthly repayment
on a loan, from the same three inputs.

## What it does

Enter a principal amount, an interest rate and a period in years, then choose either
calculation:

- **Simple interest** — `I = P × r × t`, the interest earned or owed over the period.
- **Loan repayment** — the total owed spread across the months of the term, giving a monthly
  figure.

Both results are shown in the app, and empty fields are caught before any calculation runs.

## What it demonstrates

- Android activity lifecycle and `onCreate` view binding via `findViewById`
- Click listeners driving two different calculations from one set of inputs
- Input validation with user feedback before parsing
- Edge-to-edge layout with window insets handled so content is not hidden behind the system bars
- XML layout design separated from the Java logic

## Running it

Clone the repository and open it in Android Studio, then run the `app` configuration on an
emulator or a device.

```bash
git clone https://github.com/Hamzah5566/Simple-Interest-Loan-Calculator.git
```

Requires JDK 17, which the Android Gradle Plugin needs.

## Built with

Java, the Android SDK, and Gradle with the Kotlin DSL.
