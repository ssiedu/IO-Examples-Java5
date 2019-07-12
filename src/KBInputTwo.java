import java.util.Scanner;

public class KBInputTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Emp No : ");
        int eno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Emp Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Salary : ");
        double sal=sc.nextDouble();
        System.out.println("_______________________________________");
        System.out.println("Employee No     : "+eno);
        System.out.println("Employee Name   : "+name);
        System.out.println("Employee Salary : "+sal);
        System.out.println("_______________________________________");
    }
}
