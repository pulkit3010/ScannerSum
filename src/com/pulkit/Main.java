package com.pulkit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here");
        Scanner scanner = new Scanner(System.in);

        var i = 0;
        var y = 0;
        while(i<10){

            System.out.println("Enter #"+i);
            i++;
            boolean isInt = scanner.hasNextInt();

            if(isInt){

                int x = scanner.nextInt();
                y +=x;
            }
            else{
                System.out.println("invalid input");
               // i--;
            }scanner.nextLine();


        }
        System.out.println(y);
        scanner.close();




    }
}
