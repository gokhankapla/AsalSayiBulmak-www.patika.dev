package com.gokhankaplan.asalsayibulmak;

import java.util.Scanner;

public class AsalSayiBulmak {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            int sayi = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayi ++;
                }
            }
            if (sayi == 2) {
                System.out.println(i);
            }
        }

    }
}
