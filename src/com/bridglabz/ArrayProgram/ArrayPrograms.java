package com.bridglabz.ArrayProgram;

public class ArrayPrograms {
    public static void main(String[] args) {
        printArray1();
    }
    public static void printArray1(){
        int arr1[]=new int[10];
        for(int i=1;i<=arr1.length;i++){
            arr1[i]=i+1;
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
    }

        }


