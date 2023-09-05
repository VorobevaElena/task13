package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите строку");
           String str=scan.nextLine();
           String[] result=str.split(" ");
           int sum=0;
           for (int i=0; i<result.length;i++)
           {
               if (result[i].matches("[a-zA-Z]+"))
               { System.out.println(result[i]);
                   sum++;}
           }
           System.out.println("Количество латинских слов - " + sum);

        }
}
