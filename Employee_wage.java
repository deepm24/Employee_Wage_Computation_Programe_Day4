package org.example;

import java.util.Random;

class Employee_wage
{
    public void Wage()
    {
        int perHourWage=20;
        int fullTimeHour=8;
        int partTimeHour=4;
        int fullDayWage;
        int halfDayWage;
        int workingDay=1;
        int monthDay=1;
        int monthlyWage=0;
        int Absent=0;
        Random rn=new Random();

        while(workingDay!=20 && monthDay!=30)
        {
            int check=rn.nextInt(3);

            switch (check)
            {
                case 0:
                    fullDayWage = perHourWage * fullTimeHour;
                    monthlyWage += fullDayWage;
                    monthDay ++;
                    workingDay ++;
                    break;
                case 1:
                    halfDayWage = perHourWage * partTimeHour;
                    monthlyWage+=halfDayWage;
                    monthDay++;
                    workingDay++;
                    break;
                case 2:
                    Absent ++;
                    monthDay++;
                    break;

            }
        }
        System.out.println("Monthly Wage :"+ monthlyWage);
        System.out.println("Absent in Month :"+ Absent);
        System.out.println("Working Day :"+ workingDay);
        System.out.println("MonthDay :"+ monthDay);

    }
}
