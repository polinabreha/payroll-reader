package com.pluralsight;
import java.io.*;

public class PayrollReader {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/employees.csv/"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split("\\|");
                Employee employee = new Employee(Integer.parseInt(fields[0]),
                        fields[1],
                        Double.parseDouble(fields[2]),
                        Double.parseDouble(fields[3]));
                Thread.sleep(1000);

                System.out.printf("ID: %d  Name: %s  Gross Pay : $%.2f\n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());



            }

        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }catch (IOException e){
            System.out.println("IOException");
        }













    }
}
