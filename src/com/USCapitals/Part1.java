package com.USCapitals;

import java.util.Scanner;

/**
 * The program asks the user to enter a capital for a U.S. state.
 *
 * Upon receiving the user input, the program reports whether the user input
 * is correct.
 *
 * For this application, the 50 states and their capitals are
 * stored in a two-dimensional array in order by state name.
 *
 * Display the current contents of the array then use a bubble sort to sort the content
 * by capital.
 *
 * Next, prompt the user to enter answers for all the state capitals and then display the total correct count.
 *
 * The user's answer is not case-sensitive.
 */

public class Part1 {
    public static void main(String[] args) {

        int correctAnswers = 0;
        //function to print the capitals is called
        printCapitals();
        //function to bubble sort and print capitals is called
        bubbleSortAndPrintCapitals();
        //scanner is initialized
        Scanner userInput = new Scanner(System.in);

        System.out.println("---------------------------------------------");

        //algorithm to get user input and to update the correctAnswer variable
        //at the end, it prints out how many correct answers the user provided
        for (int i = 0; i < capitals.length; i++) {
            System.out.println();
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println("Please enter the capital of " + capitals[i][0] +":");
            String input = userInput.nextLine();
            if (input.equalsIgnoreCase(capitals[i][1])){
                correctAnswers++;
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer. The capital of " + capitals[i][0] + " is " + capitals[i][1]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("You answered " + correctAnswers + " capitals correctly!");
        System.out.println("---------------------------------------------");
    }

    //function to print capitals by using a for loop
    private static void printCapitals() {
        System.out.println("---------------------------------------------");
        System.out.println("State Capitals Array Without Sorting");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < capitals.length; i++) {
            System.out.println(capitals[i][1] + ", " + capitals[i][0]);
        }
    }

    //function to bubble sort and print the array of capitals by using two for loops
    private static void bubbleSortAndPrintCapitals(){
        String temp;
        String[][] sortedCapitals = capitals;
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("State Capitals Array Sorted Using Bubble Sort");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < sortedCapitals.length; i++) {
            for (int j = i + 1; j < sortedCapitals.length; j++ ) {
                if (sortedCapitals[j][0].compareTo(sortedCapitals[i][0]) < 0) {
                    temp = sortedCapitals[i][0];
                    sortedCapitals[i][0] = sortedCapitals[j][0];
                    sortedCapitals[j][0] = temp;
                }
            }
            System.out.println(sortedCapitals[i][1] + ", " + sortedCapitals[i][0]);
        }
    }

    //creates the capitals array
    private static final String[][] capitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Maryland", "Annapolis"},
            {"Minnesota", "Saint Paul"},
            {"Iowa", "Des Moines"},
            {"Maine", "Augusta"},
            {"Kentucky", "Frankfort"},
            {"Indiana", "Indianapolis"},
            {"Kansas", "Topeka"},
            {"Louisiana", "Baton Rouge"},
            {"Oregon", "Salem"},
            {"Oklahoma", "Oklahoma City"},
            {"Ohio", "Columbus"},
            {"North Dakota", "Bismark"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"New Jersey", "Trenton"},
            {"New Hampshire", "Concord"},
            {"Nevada", "Carson City"},
            {"Nebraska", "Lincoln"},
            {"Montana", "Helena"},
            {"North Carolina", "Raleigh"},
            {"Missouri", "Jefferson City"},
            {"Mississippi", "Jackson"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
    };
}
