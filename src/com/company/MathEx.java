package com.company;

public class MathEx {

    // swap() only works with numbers 0-999
    public static void main(String[] args) {
        //int y = swap(123);
        //System.out.println(y);
        timeLeft(1, 19, 5, 48);
        //dayOfWeek(0,1);
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
**/
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        curHour = depHour - curHour;
        curMin = depMin - curMin;
         if (curMin < 0){
             curMin += 60;
             curHour--;
     }
        System.out.println(curHour + " hours and " + curMin + " minutes");
     }

     public static void dayOfWeek(int day, int date){

     }

}