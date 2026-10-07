# Section A — Concepts and Understanding

## Question 1 — Programming Vocabulary

1. Variable ; is where we store data value in a computer . it is where data value is stored ina computer memory

2. Expression ; is a combination of values, variables, operators, and function calls that the computer interprets and evaluates to produce a single value.

3. Assignment ;is the operation of storing a value inside a variable

4. Statement ; statement is a complete instruction that commands the computer to perform a specific action.

5. Data type ; is a classification that tells a computer's interpreter how a programmer intends to use a specific piece of data.

## Question 2 — Expressions and Statements

      a. The variable being declared

## Question 3 — Primitive and Reference Types

A primitive type stores the actual value directly in the stack memory, while a reference type stores a memory address  that points to an object located in the heap memory .


Then classify each of the following as either primitive or reference:


int: Reference data Type

String ; Primitive data type

double ;


boolean ;

char ;  Primitive data type


Student ; Reference data Type

long ;  Primitive data type

Integer ;   Reference data Type




## Question 4 — User-Defined Types

a. What is the data type of account?  The data type is BankAccount Account.

b. Is BankAccount a primitive type or a reference type? It is a reference type.

c. Why is BankAccount described as a user-defined type? Java comes out of the box with built-in tools like numbers (int) and letters (char). But Java has no idea what a Bank Account is so we have to type class BBankAccount Account to let java know the new concept you created.

d. Does the variable account itself contain an entire BankAccount object? Explain briefly. no not really because it not completed yet and also some mistake were made .





# Section B — Variables and Naming

##  Question 6 — Better Variable Names


Briefly explain why meaningful variable names are preferable to names such as x, a, and b in most programs.
Because computer does not understand our language so we have to use what it can understand

```java
int studentAge  = 25;
double monthlySalary  = 45000.50;
String customerFullName = "Ada Lovelace";
boolean accountActive  = true;
int studentCount = 120;

```

# Section C — Declarations, Assignment and Expressions

## Question 7 — Follow the Variables

``` java 

Statement        a            b            c

int a = 10;      10           20           35
int b =  4;       5           15           35
int c = a+b;     14           35           35

```
|Statement|a|b|c|
|---|---|---|---|
|int a =10;|10|- |- |
|int b = 4|10|4|-|
|int c = a + b ;| 10| 4| 14|
|int a = 20;| 20 | 4 | 14|
int b = a - b; | 20 | 15 | 14|
int c = a + b; |20 | 15 | 35|
| | | |
|Final Result | 20| 15 | 35|



##  Question 8 — Evaluate the Expressions

``` java`
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        double z = 2.5;

        System.out.println(x+y);

         System.out.println(x-y);

         System.out.println(x*y);

         System.out.println(x/y);

         System.out.println(x*z);

         System.out.println (x+y*2);


    }
}
```


## Question 9 — Assignment Is Not Equality

a. What is the final value of score? 15

b. Why does the second statement make sense in programming even though the mathematical equation .
it make sense in progr

## Question 9amming because it been assign.

c. Describe what the assignment operator = means in Java. it is use to assign the varable.


# Section D — Data Types

## Question 10 — Choosing Appropriate Types

A person’s age . int

b. A person’s full name . string

c. Whether a student has paid school fees . boolen

d. The price of a product such as 3500.75 . float

e. The number of people in Nigeria . int

f. A student’s grade represented by one character, such as A . char(character)

g. The distance between two cities measured in kilometres and containing decimal values . float

h. Whether an application is currently running

i. The number of books in a library . int

j. A very large whole number that might exceed the normal range of int . long



## Question 11 — Find the Type Problems

1. State whether it is valid Java.  it invaild

2. If it is invalid, explain the problem. 
1. the int age did not have any problem
2. the boolean is not to have quote
3. the char is to have single quote at the beginning of the letter and ending of the letter
4. the double does not have any problem
5. the string name there need the double quote 

3. Rewrite it correctly.
``` java 
   int age = 24;
    boolean loggedIn = true;
    char grade = 'A';
    double price = 499.99;
    String name = "Grace";
}
```



# Section E — Overflow and Reasoning

## Question 12 — Understanding Overflow

a. What is integer overflow?  it is when the number of the integer is more than the nomarl number . like in  a bank settings if there is and overflow  on someone  account it will cause the person to owing cause the maximum  it can take is about minus 2 billion


b. Why can overflow occur even though a computer can perform calculations very quickly?  the mistake might be from the programmer and due to the mistake of the programmer error this way cause of alot of issue to the Bank and also the owner of the accont.

c. Does Java automatically make an int larger when its maximum value is exceeded? no it does not

d. Why can overflow be dangerous in real software? because it have it rules



##  Question 13 — Predict the Result


a. What will the first println display? the number

b. What will the second println display? overflow

c. Explain why the second result occurs.

## Question 14 — Preventing the Problem


Explain why this code is dangerous.

Rewrite the declarations and expression using a more appropriate primitive type.

Explain why your chosen type is safer for this particular value.

# Section F — Programming Exercises

## Question 15 — Student Information Program

```Java

   String Name = "joy samuel";
int Age = 18;
char  Gender = 'f';
double GPA =  4.25;
boolean  Enrolled = true ;

```
## Question 16 — Simple Purchase Calculation

```Java
int priceOfOneBook = 3500;
int numberOfBooks = 4;
int totalPrice = priceOfOneBook * numberOfBooks;

  System.out.println("Total numberOfBooks is: " + totalPrice);
```
## Question 17 — Changing Values
``` java 
  public static void main(String[] args) {
        class BalanceCalculator {
            public static void main(String[] args) {

                double accountBalance = 50000.0;


                accountBalance = accountBalance + 15000.0;


                accountBalance = accountBalance - 10000.0;


                accountBalance = accountBalance + 2500.0;


                System.out.println("The final balance is: " + accountBalance);
    }
}
    }
}
```


# Section G — Read, Think and Debug

## Question 18 — Find the Errors

1. The progremmer made some mistake when running the code like some letter was not corresponding to each other.

2. correct it
``` java
       class StudentInfo {
            public static void main(String[] args) {
                int studentAge = 20;
                String studentClass = "Java";
                boolean isLearning = true;
                double score1 = 85.5;
                System.out.println(studentAge);
            }
        }
    }
    }


  
```

## Question 19 — Read Before You Run

a. it will print build successful

b. it cause the code willbe wrong or perharps the computer will not be able to runit.

c. it me that as a programmer pay attention to every detal in your code
    