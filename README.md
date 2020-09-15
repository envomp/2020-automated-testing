# Test Driven Development Practice

## Introduction

This is a **graded practice exercise** for learning TDD by practicing TDD using [code kata](http://vinaikopp.com/2016/02/09/about_code_katas/). The idea behind TDD with code kata is simple: we are going to work on a single functionality but we will increase the complexity bit by bit while adding new tests in a TDD manner.  

### Main points about this exercise  
- **Deadline:** 2020-09-27 23:59
- **Mark:** You can get a total of **20 points** for this exercise, 4 per requirement.
- The first 3 requirements are not marked... a warm up so to speak.
- Once you are done, **grant me access to your project with Developer rights**

The flow should look something like this:
1. Take next requirement
1. Writes tests for that requirement
1. **commit code**
1. When you run the tests they should fail (because there is no implementation yet)
1. Write enough code to make the tests pass
1. **commit code**
1. Refactor or make the code better (clean up unneeded things, make it more readable or maintanable, etc)
1. **commit code** (don't force this one, if you see no improvement spots then move along)
1. Go back to step 1.  

The commit messages should look something like this:  
```commandline
Req 1: add tests
Req 1: implement code for tests to pass
Req 1: remove dummy code
```  

In other words I should see:  
1. what requirement these commits belong to
1. distinct commits for the TDD process: *<span style="color:red">Red</span>, <span style="color:green">Green</span>, <span style="color:blue">Refactor</span>*

## Code Kata: Greeting

### Requirement 1
Write a method ```greet(name)``` that interpolates ```name``` in a simple greeting. For example, when 
```name``` is ```"Bob"```, the method should return a string ```"Hello, Bob."```.

### Requirement 2
Handle nulls by introducing a stand-in. For example, when ```name``` is null, then the method 
should return the string ```"Hello, my friend."```.

### Requirement 3
Handle shouting. When ```name``` is all uppercase, then the method should shout back to the user. 
For example, when ```name``` is ```"JERRY"``` then the method should return the string ```"HELLO, JERRY!"```.

### Requirement 4
Handle two names of input. When ```name``` is an array of two names (or, in languages that support 
it, varargs or a splat), then both names should be printed. For example, when ```name``` is 
```["Jill", "Jane"]```, then the method should return the string ```"Hello, Jill and Jane."```.

### Requirement 5
Handle an arbitrary number of names as input. When ```name``` represents more than two names, 
separate them with commas and close with an Oxford comma and "and". For example, when ```name``` 
is ```["Amy", "Brian", "Charlotte"]```, then the method should return the string ```"Hello, Amy, Brian, 
and Charlotte."```

### Requirement 6
Allow mixing of normal and shouted names by separating the response into two greetings. 
For example, when ```name``` is ```["Amy", "BRIAN", "Charlotte"]```, then the method should return 
the string ```"Hello, Amy and Charlotte. AND HELLO BRIAN!"```.

### Requirement 7
If any entries in ```name``` are a string containing a comma, split it as its own input. For 
example, when ```name``` is ```["Bob", "Charlie, Dianne"]```, then the method should return the 
string ```"Hello, Bob, Charlie, and Dianne."```.

### Requirement 8
Allow the input to escape intentional commas introduced by Requirement 7. These can 
be escaped in the same manner that CSV is, with double quotes surrounding the entry. 
For example, when ```name``` is ```["Bob", "\"Charlie, Dianne\""]```, then the method should return 
the string ```"Hello, Bob and Charlie, Dianne."```.

## Reference material
- Look through week 3 slides (*week_3_clean_code_unit_testing_tdd*)
- Watch or attend week 3 lecture LIVE
    - lecture on tdd, clean code, unit testing
    - guide for setting up development environment for practice excercise with Java
