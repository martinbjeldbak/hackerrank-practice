package com.martinbjeldbak.hackerrank.javaloopsii;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/problem
class Solution {
    public static void main(String [] argh) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++) {
                a += Math.pow(2, j) * b;

                System.out.printf("%d%s", a, j == n-1 ? "" : " ");
            }

            System.out.println();
        }
        in.close();
    }
}