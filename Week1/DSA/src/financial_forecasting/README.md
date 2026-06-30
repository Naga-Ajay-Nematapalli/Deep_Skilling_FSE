# Financial Forecasting

## Problem Statement

Develop a financial forecasting tool that predicts future values using a recursive algorithm.

---

## What is Recursion?

Recursion is a programming technique in which a method calls itself until a stopping condition (base case) is reached.

A recursive solution consists of:

- Base Case
- Recursive Case

---

## Formula Used

Future Value = Current Value × (1 + Growth Rate)

Repeated every year recursively.

Example:

Year 1 = 100000 × 1.10

Year 2 = Year1 × 1.10

Year 3 = Year2 × 1.10

...

---

## Classes

- FinancialForecast.java
- ForecastCalculator.java
- ForecastTest.java

---

## Algorithm

1. If years become 0, return current value.
2. Otherwise,
   - increase current value using growth rate
   - recursively calculate for remaining years.

---

## Time Complexity

O(n)

where n = number of years

because one recursive call is made for every year.

---

## Space Complexity

O(n)

because recursive calls are stored in the call stack.

---

## Optimization

Instead of recursion, we can:

- use iteration (loop) to eliminate recursive call stack.
- directly apply the compound growth formula

Future Value = Present Value × (1 + r)^n

which is more efficient and avoids excessive recursive calls.

---

## Conclusion

Recursion provides a clean solution for repeated yearly calculations, but iterative or mathematical approaches are preferred for larger inputs because they avoid stack overhead.