package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number_1=1;

        if (number_1==0){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

        int number_2=number_1>0?3:4;
        System.out.println(number_2);
    }
}
