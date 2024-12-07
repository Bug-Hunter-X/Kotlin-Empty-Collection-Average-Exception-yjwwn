# Kotlin Empty Collection Average Exception

This repository demonstrates a common error in Kotlin: attempting to calculate the average of an empty collection using the `average()` function. This results in a `java.lang.IllegalArgumentException`.

The `bug.kt` file shows the problematic code. The `bugSolution.kt` file provides a solution using the safe call operator and elvis operator to handle the potential exception.

## How to reproduce
1. Clone this repository.
2. Run the `bug.kt` file.
3. Observe the `IllegalArgumentException`.

## Solution
The solution utilizes the safe call operator (?.) and elvis operator(?:) to check for emptiness and provide a default value if needed. This handles the scenario gracefully and prevents the exception from being thrown.