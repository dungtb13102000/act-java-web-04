/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_9;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        System.out.println("Nhap x:");
        int x = input.nextInt();
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (int) Math.pow(x, i);
        }
        System.out.println("Tong s(x,n)= " + s);
    }

}
