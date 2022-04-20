package com.company;

public class Main {

    public static void main(String[] args) {
        doExercise1(2022);
        String osName = "iOS";
        doExercise2(osName,2018);
        doExercise3 (95);
        doExercise4("aabccddefgghiijjkk");
        int[] massive = {3, 2, 1, 6, 5};
        doExercise5(massive);


    }

    public static void doExercise1(int year) {
        // Exercise 1
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println(year + " this year is intercalary year.");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " this year is interalary year.");
        else if (year % 100 == 0)
            System.out.println(year + " this year is not interalary year.");
        else
            System.out.println(year + " this year is not interalary year.");
    }

    // Exercise 2
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void doExercise2(String osName, int phoneYear) {
            int clientOS = getClientOS(osName);
            int currentYear = 2022;
            if (phoneYear < currentYear && clientOS == 0)
                System.out.println("Please download lite IOS app for your phone. Use this link ...");
            else if (clientOS == 1 && phoneYear < currentYear)
                System.out.println("Please download lite Android app for your phone. Use this link ...");
            else if (phoneYear == currentYear && clientOS == 0)
                System.out.println("Download IOS app from this link.");
            else if (phoneYear == currentYear && clientOS == 1)
                System.out.println("Download Android app from this link.");
        }
    // Exercise 3
    public static void doExercise3(int deliveryDistance) {
        if (deliveryDistance <= 20)
            System.out.println("Cart arrive next day.");
        else if (deliveryDistance >= 20 && deliveryDistance <= 60)
            System.out.println("Cart arrive after two days.");
        else if (deliveryDistance >= 60 && deliveryDistance <= 100)
            System.out.println("Cart arrive after three days.");
        else
            System.out.println("Cart arrive on a work week.");
    }
    // Exercise 4
    public static void doExercise4(String str) {
        String[] arrSortArrays = str.split("");
        var elem = arrSortArrays[0];
        for (int i = 1; i < arrSortArrays.length; i++) {
            if (elem.equals(arrSortArrays[i])) {
                System.out.println("Дубль" + elem);
            }
            elem = arrSortArrays[i];
        }
    }
    // Exercise 5
    public static void doExercise5(int[] massive) {
        System.out.println();
        for (int i = massive.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massive[i]);
            } else {
                System.out.print(massive[i] + ", ");
            }
        }
    }


}

