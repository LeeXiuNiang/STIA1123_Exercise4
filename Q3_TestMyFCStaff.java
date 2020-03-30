import java.util.Scanner;

public class Q3_TestMyFCStaff {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        String name, staffID;
        double totalHoursWork, totalSales;
        System.out.printf("Name: ");
        name = input.nextLine();
        System.out.print("Staff ID: ");
        staffID = input.nextLine();
        System.out.print("Working Hours: ");
        totalHoursWork = input.nextDouble();
        System.out.print("Total Sales: ");
        totalSales = input.nextDouble();

        MyFCStaff fcs = new MyFCStaff(name,staffID,totalHoursWork,totalSales);

        fcs.displaySalary();
    }
}

class MyFCStaff{
    private String name, staffID;
    private double totalHoursWork, totalSales, totalSalary, commission;

    public MyFCStaff(String name, String staffID,double totalHoursWork,double totalSales){
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSales = totalSales;
    }

    public double calculateCommission(){
        if(totalSales>=150 && totalSales<=300){
            commission = 0.05 * totalSales;
        }else if(totalSales>=301 && totalSales<=500){
            commission = 0.1 * totalSales;
        }else if(totalSales>500){
            commission = 0.15 * totalSales;
        }else{
            commission = 0;
        }
        return commission;
    }

    public double calculateSalary(){
        totalSalary = totalHoursWork*8 + calculateCommission();
        return totalSalary;
    }

    public void displaySalary(){
        String myFormat1="%-15s%-2s%s\n";
        String myFormat2="%-15s%-5s%.2f\n";

        System.out.printf(myFormat1,"Staff Name",":",name);
        System.out.printf(myFormat1,"Staff ID",":",staffID);
        System.out.printf("%-15s%-2s%.0f\n","Hours Work",":",totalHoursWork);
        System.out.printf(myFormat2,"Total Sale",": RM ",totalSales);
        System.out.printf(myFormat2,"Total Salary",": RM ",calculateSalary());
    }
}
