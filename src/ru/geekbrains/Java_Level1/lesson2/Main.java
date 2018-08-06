package ru.geekbrains.Java_Level1.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        // ex.1
//        System.out.println("1-------------");
//        int[] arr = {1,1,0,0,1,0,1,1,0,1};
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i<10; i++){
//            if (arr[i] == 0){
//                arr[i] = 1;
//            }else{
//                arr[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("2-------------");
//
//        // ex.2
//        int[] arr1 = new int[8];
//        for (int i = 0; i < arr1.length; i++){
//            arr1[i] = i*3;
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("3-------------");
//
//        // ex.3
//        int[] arr2 = {1,5,3,2,11,4,5,2,4,8,9,1};
//        System.out.println(Arrays.toString(arr2));
//        for (int i = 0; i<arr2.length; i++){
//            if(arr2[i] < 6){
//                arr2[i] *= 2;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("4-------------");
//
//        //ex.4
//        int[][] arr3 = new int [4][4];
//        int a = 0;
//        for (int i = 0; i<arr3.length; i++){
//            if (arr3.length%2 == 0){
//                a += 1;
//            }
//            for(int j=0; j<arr3[i].length; j++){
//                if (a%2 == 0){
//                    arr3[i][j] = 1;
//                }else{
//                    arr3[i][j] = 0;
//                }
//                a++;
//                System.out.print(arr3[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("5-------------");
//
//        //ex.5
//        int[] arr4 = {2,-5,6,17,8,8,9,0};
//        int max = arr4[0];
//        int min = arr4[0];
//
//        for (int i : arr4){
//            if (i > max){
//                max = i;
//            }
//        }
//        for (int i : arr4){
//            if (i < min){
//                min = i;
//            }
//        }
//        System.out.println("arr4_min = " + min + "; " + "arr4_max = " + max);
//        System.out.println("6-------------");
//
//
//        // ex.6
//        int[] arr5 = {2,1,2,1,4,2};
//        System.out.println(checkBalance(arr5));
//        System.out.println();

        //ex.7
        int[] arr6 = {3,4,5};
        int d = -5;

        massMove(arr6,d);



    }
    public static void massMove(int[] arr, int x){

        System.out.println(Arrays.toString(arr));

        int n = x + arr.length;
        System.out.println(n);

        if (x > 0){
            int[] arr1 = new int[n];
            for (int i = 0; i < arr.length; i++){
                arr1[i+x] = arr[i];
            }
            System.out.println(Arrays.toString(arr1));
        } else{
            System.out.println("n < 0");
        }



//
//        int[] arr1 = new int[di + i];
//
//        for (int x : arr){
//            for (int y = i; y <arr1.length; y++){
//                arr1[y] = x;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//
    }


//    public static boolean checkBalance(int[] arr5){
//        int d = 0;
//        int sum = arr5[0] + arr5[1];
//        int sum1 = 0;
//        int y = 2;
//
//        if (arr5.length == 2){
//            if (arr5[0] == arr5[1]){
//                System.out.println("true");
//            }
//        }
//
//        while(y < arr5.length){
//            for (int i = y; i<arr5.length; i++){
//                d += arr5[i];
//            }
//            sum1 = d;
//
//
//            if (sum == sum1){
//                return true;
//            }
//            sum += arr5[y];
//            y++;
//            d = 0;
//        }
//        return false;
//    }
}
