# unit-5-2-assignment

## Clock
Write a method that takes a single integer parameter that represents the hour of the day (in 24 hour time) and prints the time of day as a string. The hours and corresponding times of the day are as follows:

0 = “midnight”
12 = “noon”
18 = “dusk”
0-12 (exclusive) = “morning”
12-18 (exclusive) = “afternoon”
18-24 (exclusive) = “evening”

You may assume that the actual parameter value passed to the method is always between 0 and 24, including 0 but excluding 24.
This method must be called `timeOfDay()` and it must have an integer parameter.

Calling `timeOfDay(8)` should print “morning” to the screen, and calling `timeOfDay(12)` should print “noon” to the screen.

Call your method in `main()` with some inputs to test and make sure it works.

## Coins
Write a method called `coinConverter that accepts a single integer parameter representing some number of pennies and prints the correct number of dollars, quarters, dimes, and nickels that can be made from the pennies. The method should also print any leftover pennies.

This method must be called `coinConverter()` and its parameter must be an integer.

Calling `coinConverter(1234)` would print the following:
```
Dollar Bills: 12
Quarters: 1
Dimes: 0
Nickels: 1
Pennies: 4
```
Call your method in `main()` with some inputs to test and make sure it works.

Hint - you might want to review the unit 1 lessons on the use of integer and modular division as you will need to use these in your answer. Start by thinking about how many pennies there are in a single dollar bill, and therefore how you would work out the number of whole dollar bills in a given number of pennies (and how many pennies would be leftover).
