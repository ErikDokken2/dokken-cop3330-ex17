package exercises.ex17;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex17 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex17 example17 = new ex17();


        String alcoholInput = example17.alcoholInput();
        String weightInput = example17.weightInput();
        String genderInput = example17.genderInput();
        String timeInput = example17.timeInput();

//        //Convert
        int alcohol = example17.alcoholInt(alcoholInput);
        int weight = example17.weightInt(weightInput);
        int time = example17.timeInt(timeInput);

        //Calculate
        double bac = example17.bacCal(alcohol,weight,time,genderInput);

        //Output
        String outputString = example17.outputString(bac);

        example17.printOutput(outputString);
    }

    private void printOutput(String outputString) {System.out.print(outputString);
    }

    private String outputString(double bac) {
        if(bac <.08)
        {
            return "\nYour BAC is " + bac + "\nIt is legal for you to drive.";
        }
        return "\nYour BAC is " + bac + "\n" +
                "It is not legal for you to drive.";
    }

    private double bacCal(int alcohol, int weight, int time, String genderInput) {
        if(genderInput.equals("male"))
        {
            double bacMal = (alcohol * 5.14 / weight * .73) - 0.15 * time;
            return bacMal;
        }
        else
        {
            double bacFem = (alcohol * 5.14 / weight * .66) - 0.15 * time;
            return bacFem;
        }
    }

    private int timeInt(String timeInput) {
        int timeInt = Integer.parseInt(timeInput);
        return timeInt;
    }

    private int weightInt(String weightInput) {
        int weightInt = Integer.parseInt(weightInput);
        return weightInt;
    }

    private int alcoholInt(String alcoholInput) {
        int alcoholInt = Integer.parseInt(alcoholInput);
        return alcoholInt;
    }

    private String timeInput() {
        int counter = 0;
        do{
            System.out.print("How much as it been in hour's since you've drank? ");
            String time = in.nextLine();
            for(int x = 0; x < time.length();x++) {
                if (time.charAt(x) >= '0' && time.charAt(x) <= '9') {
                    counter = 0;
                }
                else
                    counter++;
            }
            if(counter == 0 )
            {
                return time;
            }

        }while(counter !=0);
        return "Error";
    }

    private String genderInput() {
        int counter = 0;
        do{
            System.out.print("What is your gender? ");
            String gender = in.nextLine();
            String genderLow = gender.toLowerCase();
            if((genderLow).equals("male") || (genderLow).equals("female"))
            {
                return genderLow;
            }
            counter = 1;

        }while(counter !=0);
        return "Error";
    }

    private String weightInput() {
        int counter = 0;
        do{
            System.out.print("How much is your weight in pounds? ");
            String weight = in.nextLine();
            for(int x = 0; x < weight.length();x++) {
                if (weight.charAt(x) >= '0' && weight.charAt(x) <= '9') {
                    counter = 0;
                }
                else
                    counter++;
            }
            if(counter == 0 )
            {
                return weight;
            }

        }while(counter !=0);
        return "Error";
    }

    private String alcoholInput() {
        int counter = 0;
        do{
            System.out.print("How much alcohol have you consumed in ounces? ");
            String alcohol = in.nextLine();
            for(int x = 0; x < alcohol.length();x++) {
                if (alcohol.charAt(x) >= '0' && alcohol.charAt(x) <= '9') {
                    counter = 0;
                }
                else
                    counter++;
            }
            if(counter == 0 )
            {
                return alcohol;
            }

        }while(counter !=0);
        return "Error";
    }

}
