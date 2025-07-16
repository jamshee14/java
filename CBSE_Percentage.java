
package com.company;
import java.util.Scanner;
public class CBSE_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks1");
        int marks1=sc.nextInt();
        System.out.println("enter the mark2");
        int marks2=sc.nextInt();
        System.out.println("enter the mark3");
        int marks3=sc.nextInt();
        System.out.println("enter the marks 4");
        int marks4=sc.nextInt();
        System.out.println("enter the marks 5");
        int marks5=sc.nextInt();
        double total_marks=  marks1+marks2+marks3+marks4+marks5;
        double marks_is_out_of;
        System.out.println("enter the total marks out of");
        marks_is_out_of=sc.nextDouble();
        double percentage=(total_marks/marks_is_out_of)*100;
        System.out.println("total marks="+total_marks);
        System.out.println("total percentage="+percentage+"%");


    }

}