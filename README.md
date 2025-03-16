# Java Exercises Project

This project contains a series of Java exercises designed to practice basic programming concepts such as input handling, array manipulation, and sorting algorithms. The exercises are implemented using Java and Maven for project management.

## Exercises

### Exercise 1
- **Description**: Reads an integer from the user and prints whether the number is odd or even.
- **File**: `src/main/java/com.vam404.Exercise1.java`

### Exercise 2
- **Description**: Reads a line of input from the user, extracts integers, sorts them, and prints the largest integer.
- **File**: `src/main/java/com.vam404.Exercise2.java`

### Exercise 3
- **Description**: Reads a line of input from the user, extracts integers, sorts them, and prints the smallest integer.
- **File**: `src/main/java/com.vam404.Exercise3.java`

## Requirements

- Java
- Maven

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Change the exercise number in the `configuration.mainClass` property in the `pom.xml` file to the desired exercise.

    ```xml
   <configuration>
     <mainClass>com.vam404.Exercise1</mainClass>
   </configuration>
    ```

3. Use Maven to compile and run the exercises:
   ```sh
   mvn compile
   mvn exec:java