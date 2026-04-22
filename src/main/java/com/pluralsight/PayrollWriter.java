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

            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;

            FileWriter fileWriter = new FileWriter("src/main/resources/" + payrollFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("id|name|gross pay");
            bufferedWriter.newLine();


            while((text = bufferedReader.readLine()) != null){
                String [] fields = text.split("\\|");
                Employee employee = new Employee(Integer.parseInt(fields[0]),
                        fields[1],
                        Double.parseDouble(fields[2]),
                        Double.parseDouble(fields[3]));
                bufferedWriter.write(employee.getEmployeeId() + "|" + employee.getName() + "|" + employee.getGrossPay()) ;
                bufferedWriter.newLine();


            }
            bufferedReader.close();
            bufferedWriter.close();





        }catch(IOException e){
            System.out.println("ERROR: An unexpected error occurred");
        }



    }
}
