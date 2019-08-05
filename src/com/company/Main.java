package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int sum = 0;
            String number = Integer.toString(num);
            String tempNum; // holds single digit
            String tempRemain; // holds remaining digits

            for (int i = 0; i < number.length(); i++) {

                tempNum = number.substring(i,i+1); // grabs single digit
                tempRemain = number.substring(0,i) + number.substring(i+1); // grabs remaining digits around tempNum

                for (int j = 0; j < number.length()-1; j++){
                    String tempRemain2 = tempRemain.substring(j,j+1); // grabs single digit
                    String result = tempNum+tempRemain2; // concat tempNum with single digit from the remaining string
                    sum += Integer.parseInt(result);
                    System.out.print(result + " ");
                }
            }
            if (sum == 0) { System.out.println("Sum: " + number); }
            else { System.out.println("Sum: " + sum); }
        } // end of try
        catch (Exception e) {
            System.out.println("Error: Invalid Input");
            main(args);
        } // end of catch
    }
}