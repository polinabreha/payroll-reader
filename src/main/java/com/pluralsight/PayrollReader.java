package com.pluralsight;
import java.io.*;

public class PayrollReader {
    public static void main(String[] args) throws IOException {


        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split("\\|");
                Employee employee = new Employee(Integer.parseInt(fields[0]),
                        fields[1],
                        Double.parseDouble(fields[2]),
                        Double.parseDouble(fields[3]));
                Thread.sleep(1000);

                System.out.printf("\nID: %d  Name: %s  Gross Pay : $%.2f", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

            }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
