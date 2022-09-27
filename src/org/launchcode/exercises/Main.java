package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Write code here to test out 11.2.1 "Divide By Zero" Divide() function to throw an ArithmeticException!
        // Toggle off to get the CheckFileExtension() test further down to run/throw Exception.
        System.out.println(Divide(5, 0));

        // Write code here to test 11.2.2 "Test Studend Labs" CheckFileExtension() function to throw an Exception!
        // Toggle off/on as needed to test different results and that Exception is thrown.
        System.out.println(CheckFileExtension("Program.java")); // Returns 1 point b/c ends with .java
        System.out.println(CheckFileExtension("")); // Throws Exception Message and returns -1 points b/c No file!
        System.out.println(CheckFileExtension("MyCode.java"));  // Returns 1 point b/c ends with .java
        System.out.println(CheckFileExtension("CoolProgram.java"));  // Returns 1 point b/c ends with .java
        // I created another entry to check for a file w/o .java to equal 0 points.
        System.out.println(CheckFileExtension("NoDotJavaEndingProgram")); // Returns 0 points b/c no .java ending


    }

    // NOTE: I had to change the return type from <void> to <int> to complete the Chapter 11.2 Exercises.
    public static int Divide(int x, int y) {

        // Write code here (to throw an exception if y = 0.)
        if (y == 0) {  // check for y to be equal to 0. Use try/catch block to handle/throw the Exception & print message.
           try {
               throw new ArithmeticException("The value for y must be a positive number above 0.");
           } catch (ArithmeticException e) {
               e.printStackTrace();
           }
        }
        return x/y; // return the int value of x divided by y
    }

    /* NOTE: Had to change the return type from <int> to <void> to run/complete Chapter 11.1 WalkThru to run
    Main in the Temperature Package. */
    // Then I had to change the return type from <void> back to <int> to complete the Chapter 11.2 Exercises.
    public static int CheckFileExtension(String fileName) {

        // Write code here!
        int points;
        if (fileName == null || fileName == "") {   // check for null or "". Use try/catch block to handle the Exception.
            try {
                throw new RuntimeException("No file submitted!");   // Used general built-in Exception.
            } catch (RuntimeException e) {
                e.printStackTrace();    // print Exception message
            }
            points = -1;    // assign -1 points for not submitting any file
        } else if (fileName.contains(".java")) {    // check for fileName to have .java and give 1 point.
            points = 1;
        } else {
            points = 0;     // give 0 points (the else is assumed that the fileName does NOT contain .java.
        }
        return points;      // returns the int value of points earned for the file submitted.
    }

}
