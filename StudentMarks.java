/*
* Copyright (c) 2020
*
* This program determines the average mark of 
* students in class.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/03
*/


// Imports Java Classes:
import java.util.Arrays;
import java.util.Random;

public class StudentMarks {
  /**
   * This function calculates the average of numbers 
   * in the given array.
   */
  static int average(int [][] array1) {
    
    // Declaring variables:
    int sumMark = 0;
    
    // For loop to add every mark in the 2D array:
    for (int studentNumber = 0; studentNumber < 4; studentNumber++) {
      for (int markNumber = 0; markNumber < 6; markNumber++) {
        sumMark += array1[studentNumber][markNumber];
      }
    }
    
    // Calculating average:
    int average = sumMark / 24; 
    
    // Returning average:
    return average;
  }

  /**
  * This function generates random numbers and appends them
  * in an array.
  */
  public static void main(String[] args) {
  
    // Random number generator:
    Random randomNumber = new Random();
    
    // Creating a 2d array of integers: 
    int[][] array1 = new int [4][6];
    // For loop to generate and append marks for every student in the array:
    for (int counter1 = 0; counter1 < 4; counter1++) {
      System.out.println("");
      System.out.print("Student " + (counter1 + 1) + " marks:");
      System.out.println("");
      System.out.print("(");
      for (int counter2 = 0; counter2 < 6; counter2++) {
        array1[counter1][counter2] = randomNumber.nextInt(99) + 1;
        System.out.print(array1[counter1][counter2]);
        System.out.print(",");
      }  
      System.out.print(")");
    }
    
    // Process / Output
    // Calling average function:
    int avg = average(array1);
    System.out.println("");
    System.out.println("");
    System.out.println("The class average is: " + avg + "%");
  }
}