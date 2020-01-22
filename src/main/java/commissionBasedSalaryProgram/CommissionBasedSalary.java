package commissionBasedSalaryProgram;

import java.util.*;

public class CommissionBasedSalary  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basicSalary[]=new double[7];
        double salesAmount[]= new double[7];
        double totalSalary[] = new double[7];
        double salesTarget, commission;
        double grandTotal = 0; double avg = 0;
        //Employee employee[] = new Employee[7];
        System.out.println("Enter Sales Target: ");
        salesTarget = scanner.nextDouble();
        for (int i=0; i<7; i++){
                System.out.println("Enter basic salary of Employee: ");
                basicSalary[i] = scanner.nextDouble();
                System.out.println("Enter monthly sales of Employee: ");
                salesAmount[i]= scanner.nextDouble();
                if(salesAmount[i]>=salesTarget){
                    commission = 0.05 * salesAmount[i];
                }else if(salesAmount[i]>=salesTarget*0.8){
                    commission = 0.03 * salesAmount[i];
                }else {
                    commission = 0.01 * salesAmount[i];
                }
                totalSalary[i] = basicSalary[i]+ commission;
                System.out.println("Total Salary of this employee is:  " + totalSalary[i]);
                grandTotal+=totalSalary[i];
        }
        System.out.println("Total Salary of all Employees: " + grandTotal);
        avg=grandTotal/7;
        System.out.println("Average Payroll: " + avg);

    }
}
