package com.company;
import java.awt.font.FontRenderContext;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    int n;

        System.out.print("Basamak Sayısını Griniz : ");
        n = input.nextInt();

        for (int i = (n-1); i>=1; i--){
            for (int x = 1; x<=(n-i); x++){
                System.out.print(" ");
            }

            for (int y = (2*i)-1; y>=1; y--){
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
