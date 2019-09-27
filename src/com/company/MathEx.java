package com.company;

public class MathEx {

    // swap() only works with numbers 0-999
    public static void main(String[] args) {
        //int y = swap(123);
        //System.out.println(y);
        //timeLeft(1, 34, 8, 20);
        int x = dayOfWeek(5, 4);
        System.out.println(x);
    }
/**
    public static int swap(int numSwitch) {
        System.out.println("Original Number: " + numSwitch);
        int a = (numSwitch/100) %10;
        int b = (numSwitch /10) %10;
        int c = numSwitch%10;
        numSwitch = (a*100) + (c * 10) + (b);
        return numSwitch;

    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int a;
        int b;
        int c;
        int d;
        int f;
        int g;
        a = curHour*60 + curMin;     // finds the number of minutes for current time
        b = depHour*60 + depMin;     // finds the number of minutes for departure time
        c = b - a;                   // finds the difference in minutes between times
        d = c/60;                    // finds the hours between current and departure
        f = c %60;
        System.out.println(d + " hours and " + f + " minutes");

     }
**/

     public static int dayOfWeek(int day, int date){
        date = date + day -1;       // makes date equal to itself plus day-1 in order to make it the new day
        return date % 7;            // there is 7 days in a week, so this makes it into sets of 7.
     }

}