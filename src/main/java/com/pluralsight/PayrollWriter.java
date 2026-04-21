package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class PayrollWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter the name of the file employee file to process: ");
            String fileName = input.nextLine();
            System.out.print("Enter the name of the payroll file to create: " );
            String payrollFileName = input.nextLine();

            FileWriter fileWriter = new FileWriter("src/main/resources/" + payrollFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);




        }catch(IOException e){
            System.out.println("ERROR: An unexpected error occurred");
        }



    }
}
