package org.example;

import java.util.Random;

class Employee_wage
 {
     public  void Attendance()
         {
             Random rn=new Random();
             int a=rn.nextInt(2);
             if (a==0)
             {
                 System.out.println("Employee is Present ");
             }
             else
             {
                 System.out.println("Employee is Absent");
             }
         }
 }
