/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: Technology Science Fair Costs
*  Author: Victoria Kiselev
*  Date: [07/03/2024]
*  Description: Calculating the student cost for the RHHS science fair
****************************************************/

/**************** IPO CHART ************************
*INPUT: 
* Number of students doing an Arduino project
* Number of students doing a Raspberry PI project
* Number of students doing a VR project
*PROCESSING:
* Read in number of Arduino projects, Raspberry PI projects, and VR projects 
* Calculate the cost based on the rate for each total number of students
* If the student count is more than 100, include the discount in the calculations
*OUTPUT:
* Output the individual student cost for the user to see
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input                        Desired Output
*          arduinoNum, rasNum, vrNum    Output
*          0,0,0                        "There is no science fair with 0 students"
*          5,5,5                        "Each student needs to pay: $"+65
*          16,21,5                      "Each student needs to pay: $"+61.809
*          15,20,5                      "Each student needs to pay: $"+63.75
*          100,100,100                  "Each student needs to pay: $"+66.85
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
   // PROGRAM TechnologyScienceFairCosts
   // Read arduinoNum
   // Read rasNum
   // Read vrNum
   // studentTotal = arduinoNum + rasNum + vrNum
   // if (studentTotal = 0)
   // print "There is no science fair with 0 students"
   // baseCost = 50 * studentTotal
   // if (arduinoNum > 15)
   //   arduinoCost = 9*ardiunoNum
   // else
   //   arduinoCost = 10 * ardiunoNum
   // if (rasNum > 20)
   //   rasCost = 12 * rasNum
   // else
   //   rasCost = 15 * rasNum
   // vrCost = 20 * vrNum
   // preCost = vrCost + rasCost + arduinoCost + baseCost
   // if (studentTotal > 100)
   //   finalCost = preCost * 1.05
   // indCost = finalCost/studentTotal
   // print "Each student has to pay: " + indCost
   
   //CONSTANTS
   // N/A
   
   //VARIABLES
   // arduinoNum
   // rasNum
   // vrNum
   // studentTotal
   // baseCost
   // arduinoCost
   // rasCost
   // vrCost
   // preCost
   // finalCost
   // indCost
   //CODE
   
   Scanner kb = new Scanner(System.in);
   
   System.out.print("How many students are using an arduino kit? ");
   int arduinoNum = kb.nextInt();
   
   System.out.print("How many students are using a Raspberry PI kit? ");
   int rasNum = kb.nextInt();
   
   System.out.print("How many students are using a VR kit? ");
   int vrNum = kb.nextInt();
   
   int studentTotal = arduinoNum + rasNum + vrNum;
   
   if (studentTotal == 0){
    System.out.println("There is no science fair with 0 students.");
   }
   else{
    int baseCost = 50 * studentTotal;

    int arduinoCost;
    int rasCost;

    double finalCost;

    if (arduinoNum > 15){
        arduinoCost = arduinoNum * 9;
    }
    else{
        arduinoCost = arduinoNum * 10;
    }

    if (rasNum > 20){
        rasCost = rasNum * 12;
    }
    else{
        rasCost = rasNum * 15;
    }

    int vrCost = 20 * vrNum;

    int preCost = arduinoCost + rasCost + vrCost + baseCost;

    if (studentTotal > 100){
        finalCost = preCost * 1.05;
    }
    else{
        finalCost = preCost;
    } 

    double indCost = finalCost/studentTotal;

    System.out.print ("Each student needs to pay: $"+ indCost);
   }
  }  
}
