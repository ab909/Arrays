package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", value is " + myIntegers[i]);

                   int [] sorted = sortIntegers(myIntegers);
              
        }
//        System.out.println("The average is " + getAverage(myIntegers));


        public static int[] getIntegers (int number){
            System.out.println("Enter " + number + " integer values. \r");
            int[] values = new int[number];

            for (int i = 0; i < values.length; i++) {
                values[i] = scanner.nextInt();
            }
            return values;
        }
        public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
        }

        public static int [] sortIntegers(int[] array){
        int [] sortedArray = new int [array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i<sortedArray.length; i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
        }
    }

