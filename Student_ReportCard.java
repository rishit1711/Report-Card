package binarysearch.CODSOFT;
import java.util.*;

public class Student_ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Marks in Maths : ");
        int s1 = sc.nextInt();
        System.out.print("Enter Marks in Physics : ");
        int s2 = sc.nextInt();
        System.out.print("Enter Marks in Chemistry : ");
        int s3 = sc.nextInt();
        int no_of_subjects = 3;

        int total_marks = s1+s2+s3;
        System.out.println("TOTAL MARKS:" + total_marks);
        double percent = total_marks/no_of_subjects;
        System.out.println("Your Percentage is : " + percent);
        if(percent>=90){
            System.out.println("A+ GRADE");

        }
        else if(percent>=80){
            System.out.println("A GRADE");

        }
        else if(percent>=70){
            System.out.println("B+ Grade");
        }
        else if(percent>=60){
            System.out.println("C Grade");
        }
        else if(percent>=50){
            System.out.println("D GRADE");

        }
        else {
            System.out.println("FAIL");
        }
    }
    
}
