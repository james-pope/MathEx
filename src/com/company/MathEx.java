package com.company;

public class MathEx {

    // swap() only works with numbers 0-999
    public static void main(String[] args) {
        int y = swap(123);
        System.out.println(y);
        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        int a = dayOfWeek(0, 1);
        System.out.println(a);
        int b = dayOfWeek(0, 14);
        System.out.println(b);
        int c = dayOfWeek(6, 22);
        System.out.println(c);
        int d = dayOfWeek(5, 4);
        System.out.println(d);
        int e = dayOfWeek(1, 24);
        System.out.println(e);
        int f = dayOfWeek(2, 1);
        System.out.println(f);

    }

    public static int swap(int numSwitch) {
        System.out.println("Original Number: " + numSwitch);
        int a = (numSwitch / 100) % 10;                        //gets the 100th place
        int b = (numSwitch / 10) % 10;                        //gets the 10th place
        int c = numSwitch % 10;                               //gets the 1's place
        numSwitch = (a * 100) + (c * 10) + (b);               //creates the switched number
        return numSwitch;

    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int a = curHour * 60 + curMin;     // finds the number of minutes for current time
        int b = depHour * 60 + depMin;     // finds the number of minutes for departure time
        int c = b - a;                   // finds the difference in minutes between times
        int d = c / 60;                    // finds the hours between current and departure
        int f = c % 60;                   // finds the number of minutes, without hours factored in
        System.out.println(d + " hours and " + f + " minutes");

    }

    public static int dayOfWeek(int day, int date) {
        date = date + day - 1;       // makes date equal to itself plus day-1 in order to make it the new day
        return date % 7;            // there is 7 days in a week, so this makes it into sets of 7.
    }
}
/**
outputs 
Original Number: 123
132
3 hours and 21 minutes
6 hours and 41 minutes
0
6
6
1
3
2
**/