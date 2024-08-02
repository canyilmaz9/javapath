# javapath

## ATMProject
Create an ATM project where the user can manage his bank account using Java loops. Perform ATM transactions using "Switch-Case".

## AddingEvenNumbersAndMultiplesOf4
Write a program in Java that accepts input from the user until a single number is entered using loops, adds even numbers and multiples of 4 from the entered values and prints them on the screen.

## AdvancedCalculator
Create a calculator with Java that performs user-selected operations.
Functions of the calculator:

1- Summation Operation
2- Removal Operation
3- Multiplication Operation
4- Division Operation
5- Exponent Number Calculation
6- Factorial Calculation
7- Getting Mode
8- Rectangular Area and Perimeter Calculation

## ArmstrongNumbers
If the sum of the nth powers of the digits of an n-digit number is equal to the number itself, such numbers are called Armstrong numbers.

Take the number 407 for example. Returns (4^3)+ (0^3)+(7^3) = 64+0+343 = 407. This shows that the number 407 is an Armstrong number.

Let's also look at the number 1342. Since the number (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 is not equal to 1342, it is not an Armstrong number.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

## ArrayMinMaxValue
Write a program that finds the closest number to the smallest number and the closest number to the largest number of the elements in the array.

## CalculatingExponentsWithRecursiveMethods
Write a program in Java language that uses the "Recursive" method to perform the exponentiation process whose base and exponent values are received from the user.

## DiamondWithStars
Make stars and diamonds using loops in Java.

## EbobEkok
We write a program in Java that finds the GCF and LCM values of two numbers.

GCF: The largest common divisor of two or more natural numbers is called the greatest common divisor of these numbers, in short, GCF.

EXAMPLE: Let's find the greatest common divisor of the numbers 18 and 24 step by step.

Divisors of 18: 1, 2, 3, 6, 9, 18

Divisors of 24: 1, 2, 3, 4, 6, 8, 12, 24

The largest of these common divisors is the number 6, EBOB.

LCM: The smallest common multiple of two or more natural numbers is called the least common multiple of these numbers, in short, LCM.

EXAMPLE: Let's find the least common multiple of the numbers 6 and 8 step by step.

Multiples of 6: 6, 12, 18, 24, 30, 36, 42, 48, …

Multiples of 8: 8, 16, 24, 32, 40, 48, 56, 64, …

The smallest of these common multiples is the number 24, LCM.

LCM = (n1*n2) / GCF

## Elevator
Try to use the principles of Object Oriented Programming and relationships between classes. (Encapsulation, Inheritance, Polymorphism, Abstraction)

We Code The Insurance Company wants to build a 12-story office building and equip it with the latest elevator technology. The company wants you to create a software simulator that models the operations of the building's elevators to see if they can meet traffic flow needs within the building.

The building will have five elevators, each capable of reaching the building's 12 floors. Each elevator has a capacity of approximately six adult passengers. Elevators are designed to be energy efficient, so they only move when necessary. Each elevator has its own door, floor indicator light and control panel. The control panel includes target buttons, door open and close buttons, and an emergency signal button.

Each floor in the building has a door for each of the five elevator shafts and an arrival bell for each door. The arrival bell indicates that the elevators have arrived at a floor. A signal light above each door indicates the arrival of the elevator and the direction in which the elevator is moving. Each floor also has three sets of elevator call buttons.

A person calls an elevator by pressing the appropriate call button (up or down). A scheduler assigns one of five elevators to the floor where the call begins. Once inside the elevator, a passenger typically presses one or more destination buttons. As the elevator moves from floor to floor, an indicator light inside the elevator informs passengers of the elevator's location. The arrival of an elevator at a floor is indicated by the indicator light on the outer elevator door turning on and the floor bell ringing. When an elevator stops on a floor, both sets of doors automatically open for a predetermined period of time, allowing passengers to enter and exit the elevator.

The simulator uses a "clock" to simulate the actual passage of time and timestamp and log events that occur in the simulation. A random number generator is used by the simulator to generate passengers and determine departure and arrival floors for each passenger.

### Homework
Write the GCF and LCM values of two numbers in Java using the "While Loop".

## Employee
In Java, you should write a class called "Employee" that represents factory employees and calculates the salaries of the employees with its methods. This class will have 4 attributes and 5 methods.

Class Attributes

name: Name and surname of the employee
salary: Employee's salary
workHours: Weekly working hours
hireYear: Year of start of employment
Methods of the Class

Employee(name,salary,workHours,hireYear): It is a constructor method and will take 4 parameters.
tax() : It will calculate the tax applied to the salary.
If the employee's salary is less than 1000 TL, no tax will be applied.
If the employee's salary is more than 1000 TL, a tax of 3% of his salary will be applied.
bonus(): If the employee works more than 40 hours a week, bonus wages will be calculated as 30 TL for each extra hour worked.
raiseSalary(): It will calculate the salary increase based on the employee's starting year. Take the current year as 2021.
If the employee has been working for less than 10 years, his salary will be increased by 5%.
If the employee has been working for more than 9 years and less than 20 years, his salary will be increased by 10%.
If the employee has been working for more than 19 years, there will be a 15% raise.
ToString(): It will print the employee information on the screen.

## FactorialAndCombination
The number of different groups with r elements to be formed with the elements of a set with n elements is called the r combination of n. The combination of n with r is shown as C(n,r).

Write a program to calculate combinations in Java.
Combination formula
C(n,r) = n! / (r! * (n-r)!)

## FibonacciSeries
Write a program to find Fibonacci series using Java loops. Get the number of elements of the Fibonacci series from the user.

What is Fibonacci Series?
The Fibonacci series is a series of numbers formed by adding each number to the previous one. In this series that continues in this way, when the numbers are proportional to each other, the golden ratio emerges, that is, when a number is divided by the number before it, a series that gets closer and closer to the golden ratio is obtained.

The Fibonacci sequence starts from 0 and goes to infinity. Each digit is added to the previous digit. The result obtained is written on the right side of the number. The first ten numbers of the Fibonacci sequence are as follows:

9 Element Fibonacci Series: 0 1 1 2 3 5 8 13 21 34

## FlightManagementSystem
Design a system for managing flights and pilots.

Airline companies operate the flights. Every airline has an ID.
The airline has different types of aircraft.
Aircraft may be operational or in a state of repair.
Each flight has a unique ID, departure and landing airport, departure and landing times.
Each flight has a pilot and co-pilot and they operate the aircraft.
Airports have unique identities and names.
Airline companies have pilots and each pilot has a level of experience.
An aircraft type may require a certain number of pilots.
Draw the Class diagram depicting this system.

## GuessingNumberGame
Make a "Number Guessing Game" in Java where we ask the user to guess a number that the program randomly chooses between 0-100.

## HarmonicMean
Write a program that calculates the harmonic mean of the numbers in the series. 
Harmonic Mean formula: n (number of elements) / harmonic series of elements(1+1/2+1/3... +1/n)

## HarmonicNumbers
It can be shown to diverge using the integral test by comparison with the function 1/x.

## HesapMakinesi
Build the calculator using switch-case.

## Kullanici
Basic User Login

## InvertedTriangle
Write a program in Java that takes the number of digits from the user and draws an inverted triangle on the screen with asterisks (*) using loops.

## LargestAndSmallestNumber
Write a program in Java that finds the largest and smallest numbers among N counting numbers entered from the keyboard and writes these numbers to the screen.

## MinefieldGame
Make a Minesweeper game in Java.

## OnlineFilmApp
Design the system of the application that sells or rents movies online.

Movies can be listed and sorted in the application and users can subscribe to the application.
Users purchase credits through the system for subscription.
Only subscribed users can rent movies with their credits, and the credit cost of the rented movie will be deducted from their account.
Regular users and subscribers can purchase movies.
If the movie is not available, it can be requested.
Draw the Class diagram depicting this system.

## PalindromeNumber
What is a Palindrome Number?
Palindromic numbers are numbers that are the same in the direction they are read when read from both sides.

Example: 1, 4, 8, 99, 101, 363, 4004, 9889

## Pass the class
Lessons: Mathematics, Physics, Turkish, Chemistry, Music
Passing Score: 55
Homework
If the course grades entered are not between 0 and 100, they are not included in the average.

## PerfectNumber
It detects whether a number entered from the keyboard is a perfect number or not, and if the number is a perfect number, "it is a perfect number" is displayed on the screen. If not, “it is not the perfect number.” Write a program in Java language that writes the expressions to the screen.

What is a Perfect Number?
A number whose sum of positive integer factors (dividing numbers without remainder) is equal to itself, excluding the number itself, is called a perfect number.

## PrimeNumberBetween1And100
Write a program in Java that prints prime numbers between 1 and 100 on the screen.

## PrimeNumberWithRecursive
Write a program in Java language that finds out whether the number received from the user is a "Prime" number, using the "Recursive" method.

## ProgramToCalculateExponents
Create a program in Java that calculates exponents with the values entered by the user using the "For Loop".

## ProgramToFindFibonacciSeriesWithRecursive
Create a program to find Fibonacci series using recursive methods in Java.

## ProgramToFindPalindromeWords
Write a program in Java that finds out whether the word entered by the user is "Palindromic" or not.
If reading a word backwards gives the same word, that word is a "Palindromic Word".
Example: abba , asa , kavak, kayak.

## ProgramToFindPowersOf4And5LessThanTheEnteredNumber
Write a program that prints the powers of 4 and 5 up to the entered number using Java loops.

## RepeatingEvenNumbers
Write a program that indicates repeating even numbers in a number sequence.

## RepeatingNumbers
Write a program in Java language that finds the frequency of the elements in the array, that is, how many times they are repeated.

## SortingElementsinAnArray
Write a program in Java language that sorts the elements in the array from smallest to largest. Get the size of the array and the elements of the array from the user.

## SortingNumbers - OrderNumbers
Write a program that sorts the 3 entered numbers "from smallest to largest".

## Subtraction5andAdd5
Write a "Recursive" method in Java language without using a loop that obeys the following rule according to the n value received from the user.

Rule: Subtract 5 from the entered number until the entered number is 0 or negative. Print the last value on the screen during each subtraction. After the number becomes negative or 0, add 5 again. Again, print the last value of the number to the screen with each addition.

## TransposeOfTheMatrix
Write a program in Java language to find the transpose of a matrix created with multidimensional arrays.

Transposing the matrix means swapping the same numbered rows and columns of the matrix. The matrix obtained as a result of this process is the transpose of the initial matrix. At this stage, the transpose of a kxn matrix becomes an nxk matrix. For example, let's have a matrix A. The transpose of this matrix A is denoted by A^T (A over T).

## University Management System
1 - There are classrooms, offices and departments belonging to the university.
2 - Offices are belonging to departments.
3 - There are employees of the university. These employees may be professors or civil servants.
4 - Every employee works in an office.

Draw the Class diagram depicting this system.

Note: There is no need to specify the attributes and behaviors of the classes.

## WeatherTemperature
Conditions:
Suggest "Skiing" if the temperature is less than 5 degrees.

-If the temperature is between 5 and 15 degrees, suggest the "Cinema" activity.
-If the temperature is between 15 and 25 degrees, suggest the "Picnic" activity.
-If the temperature is greater than 25 degrees, recommend the "Swimming" activity.
Instead of using if-else blocks, question operator was used in the second java class.

## WritingBwithMultipleArrays
Write a program that displays the letter "B" on the screen using "stars" using multidimensional arrays.

## ZooManagement
You are designing a system to track information about animals in a zoo.

Animals:
Horses (horses, zebras, donkeys, etc.),
Felines (tigers, lions, etc.),
It is characterized by species in groups such as rodents (rats, beavers, etc.).
Most of the information stored about animals is the same for all groupings.
species name, weight, age, etc.
The system should also be able to get the dosage of specific drugs for each animal => getDosage()
System should be able to calculate Feed timings => getFeedSchedule()
The logic by which the system performs these functions will be different for each grouping. For example, the feeding algorithm is different for horses and will be different for tigers.

Using the polymorphism model, design a class diagram to handle the situation described above.

