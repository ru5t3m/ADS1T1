# ADS1 
# T1
### Finding the minimum value in an array
This program prompts the user to input the size of an array ```n``` and then takes in ```n``` number of integers to populate an array ```arr```. 
It then calls the ```findMinimum``` function to determine the minimum value in the array and prints it to the console.

### Functionality
The program takes the following steps:

1) Prompt the user to input the size of the array ```n```.

2) Take in ```n``` number of integers to populate the array ```arr```.

3) Call the ```findMinimum``` function to determine the minimum value in the array.

4) Print the minimum value to the console.

The ```findMinimum``` function takes in an integer array ```arr``` and returns the minimum value in the array. If the array is empty, it throws an exception.

### Error Handling
If the input array is empty, the program will throw an exception with the message "n must be greater than 0".





# T2
### The program is written in Java and consists of two functions, main and findAverage.

Function: ```main```

The ```main``` function is the entry point of the program. 
It prompts the user to input the size of the array and the array elements, 
creates an array with the user-specified size, 
calls the findAverage function to calculate the average of the array elements, 
and then displays the result to the user.


Function: ```findAverage```

The ```findAverage``` function takes an integer array as input and returns the average of its elements. 
If the array is empty, it throws an exception.

Parameters - 
```arr```: An integer array containing the array elements.

Returns - 
```double```: The average of the array elements.

Exceptions - 
```Exception```: If the input array is empty.



# T3
### Determining if a Number is Prime
This program prompts the user to input a number ```n```, and then determines whether the number is prime or composite using the ```isPrime``` function. 
If the number is prime, the program outputs ```Prime```. If it is composite, the program outputs ```Composite```.

### Functionality
The program takes the following steps:

1) Prompt the user to input a number ```n```.

2) Call the isPrime function to determine whether the number is ```prime``` or ```composite```.

3) If the number is prime, output "Prime" to the console. If it is composite, output "Composite" to the console.

4) The ```isPrime``` function takes in an integer ```n``` and an integer ```i``` (initially set to 2). It returns a boolean value indicating whether ```n``` is prime or not. The function uses a recursive approach to determine if the number is prime, checking if ```n``` is divisible by any number between 2 and the ```square root of n```.


### Error Handling

If the input number is less than or equal to 1, the ```isPrime``` function will return false.


# T4
### Factorial Calculator

The ```T4``` class contains a single ```main``` method, which is responsible for getting user input, calling the ```factorial``` method to calculate the factorial, and outputting the result.

The ```factorial``` method is a recursive function that calculates the factorial of a given integer. If the input is 0, the function returns 1. Otherwise, it recursively calls itself with the input decremented by 1, and multiplies the result by the original input.

### Example:

For example, the user enters 5, and the program calculates the factorial of 5, which is 120.


# T5
### Calculate n^th Fibonacci number

The program uses a recursive function called ```fibonacci``` to calculate the nth Fibonacci number. The function takes an integer parameter ```n``` representing the index of the desired Fibonacci number. If ```n``` is 0 or 1, the function returns the corresponding Fibonacci number. Otherwise, the function recursively calls itself with the parameter ```n - 1``` and ```n - 2```, and returns the sum of these two function calls.

~~Мысалы~~ For example, suppose the user inputs 6. The program will calculate the 6th Fibonacci number using the ```fibonacci``` function, which is the sum of the 4th and 5th Fibonacci numbers. The 4th Fibonacci number is the sum of the 2nd and 3rd Fibonacci numbers, and the 5th Fibonacci number is the sum of the 3rd and 4th Fibonacci numbers. Continuing in this way, the program calculates that the 6th Fibonacci number is 8, and outputs this result.


# T6 
### Calculating the power

This program calculates the result of raising a given number ```a``` to the power of ```n``` using a recursive function ```power(a, n)```.

### Input

The program asks the user to input two integers, ```a``` and ```n```, separated by a space or submitted alone.

### Output

The program outputs the result of ```a``` raised to the power of ```n```.


The program uses a recursive function ```power(a, n)``` to calculate ```a^n```. If ```n``` is 0, the function returns 1. Otherwise, it calculates a multiplication with ```power(a, n-1)```.


# T7 
### Recursive Array Reversal

This program allows the user to input an array of integers, then uses recursion to reverse the order of the array. The reversed array is then output to the console.

### Code Explanation

The program begins by asking the user to input the size of the array, then creates an integer array of that size. The program then loops through the array and prompts the user to input each element.

The ```reverseArray``` function is used to reverse the order of the array. This function is called recursively with the start and end indices of the array. The base case of the recursion is when the start index is greater than or equal to the end index, meaning the array is already reversed.

In each recursive call, the first and last elements of the array are swapped, and the function is called recursively with the second and second-to-last elements until the base case is reached.

The reversed array is then output to the console using a loop that prints each element separated by a space.

# T8 

The program checks whether a given string consists only of digits or not using recursion. The program prompts the user to input a string and outputs "YES" if the string consists only of digits and "NO" otherwise.

The program uses a recursive function called ```isStringAllDigits``` to check if the input string consists only of digits. The function takes a string as input and checks if its first character is a digit. If it is, the function calls itself with the remainder of the string as input. If the string is empty, the function returns ```true```. If the first character is not a digit, the function returns ```false```.


# T9 
### Calculating the Binomial Coefficient.

The purpose of this code is to calculate the binomial coefficient using recursion. The binomial coefficient is the number of ways to choose k items from a set of n items, and it is represented mathematically as C(n, k).

The code is written in Java and consists of one class called ```T9```. The class has a ```main``` method that prompts the user for input values of ```n``` and ```k```, calls a recursive method ```binomialCoef``` to compute the binomial coefficient, and outputs the result.

The recursive method ```binomialCoef``` takes two integer parameters: ```n``` and ```k```. It first checks if ```k``` is equal to 0 or ```k``` is equal to ```n```. If ```true```, it returns 1 because the binomial coefficient in this case is 1. If ```false```, it recursively computes the binomial coefficient using the formula ```C(n-1, k-1) + C(n-1, k)```.


# T10 
### Recursive GCD Calculation

This program takes two integers ```a``` and ```b``` as input from the user and uses recursion to calculate their Greatest Common Divisor (GCD). The GCD is the largest positive integer that divides both ```a``` and ```b``` without leaving a remainder.

The program uses the Euclidean algorithm to recursively calculate the GCD of two numbers. The algorithm is based on the fact that the GCD of two numbers does not change if the smaller number is subtracted from the larger number.

The algorithm works as follows:

If ```b``` is 0, the GCD is ```a```.
Otherwise, compute the GCD of ```b``` and ```a % b```, where ```%``` is the modulus operator that returns the ```remainder``` of ```a``` divided by ```b```.
Repeat until ```b``` is 0.
The ```findGCD()``` function takes two integers ```a``` and ```b``` as parameters and returns their GCD using recursion. If either ```a``` or ```b``` is 0, the function returns the other number as the GCD. Otherwise, it calculates the GCD using the Euclidean algorithm.
