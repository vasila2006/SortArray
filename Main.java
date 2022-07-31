package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        String[] arrName={"Ali","Abbose","Ahror","Bilool","Bobur","Begzod"};
        String[] a =new String[100];
        String[] b=new String[100];
        int count=0;
        for (int i = 0; i < arrName.length; i++) {

            if (arrName[i].startsWith("A")){
                a[count]=arrName[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(a[i]);
        }
        count=0;
        System.out.println("=============================================");
        for (int i = 0; i < arrName.length; i++) {
            if (arrName[i].startsWith("B")){
                b[count]=arrName[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(b[i]);
        }






    }
}
