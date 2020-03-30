import java.util.Scanner;

class Q2_TestStaff {
    static Scanner console = new Scanner(System.in);

    public static void main(String arg[]){
        String name, staffID;
        double salary;
        int workingDay;
        System.out.print("Name: ");
        name = console.nextLine();
        System.out.print("Staff ID: ");
        staffID = console.nextLine();
        System.out.print("Working Day: ");
        workingDay = console.nextInt();

        Staff s = new Staff();
        s.setStaffInfo(name,staffID,workingDay);
        s.calculateSalary();
        System.out.printf("%22s\n","<<<STAFF INFO>>>");
        System.out.printf("%-15s%-2s%s\n","Staff Name",": " , s.getName());
        System.out.printf("%-15s%-2s%s\n","Staff ID",": " , s.getStaffID());
        System.out.printf("%-15s%-4s%.2f\n","Staff Salary",": RM",s.getSalary());
    }
}

class Staff {
    private String name, staffID;
    private double salary;
    private int workingDay;
    public void setStaffInfo(String nm, String id, int wDay){
        name=nm;
        staffID=id;
        workingDay=wDay;
    }
    public void calculateSalary(){
        salary = workingDay * 35.0;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getStaffID(){
        return staffID;
    }
}//end class
