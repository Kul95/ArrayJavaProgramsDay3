package com.bridglabz.ArrayProgram;

public class ArrayPrograms {
    public static void main(String[] args) {
        printArray1();
        largestArrayElement3();
        smallestElement();
        oddArray();
    }
    public static void printArray1(){
        int arr1[]=new int[]{1,2,4,5,3,7,6,9};
        for(int elem:arr1)
    System.out.print(" "+elem);
        System.out.println();
    }
    public static void largestArrayElement3(){
        int arr3[]=new int[]{1,2,4,3,7,9,5,6};
        int max= arr3[0];
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]>max)
                max=arr3[i];
        }
        System.out.println("Largest Element is :  "+max);
    }
    public static void smallestElement(){
        int arr[]=new int[]{9,6,8,2,3,6,4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.print("Smallest element in an array:"+min);
        System.out.println();
    }
    public static void oddArray(){
        int arr6[]=new int[]{1,2,3,4,5,6,7,8,9};
        for(int oddArr:arr6){
            if(oddArr%2!=0){
            }
            System.out.print(" "+oddArr);
        }

    }
}


