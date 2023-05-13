package com.bridglabz.ArrayProgram;

public class ArrayPrograms {
    public static void main(String[] args) {
        printArray1();
        largestArrayElement3();
    }
    public static void printArray1(){
        int arr1[]=new int[10];
        for(int i=1;i<=arr1.length;i++){
            arr1[i]=i+1;
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
    }
    public static void largestArrayElement3(){
        int arr3[]={1,2,4,3,7,9,5,6};
        int max= arr3[0];
        for(int i=0;i<=arr3.length;i++){
            if(arr3[i]>max){
                max=arr3[i];
            }
            System.out.println("Largest Element is :  "+max);
        }
    }
}


