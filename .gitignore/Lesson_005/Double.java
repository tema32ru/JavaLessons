package Lesson_005;
/*Известна информация о засеваемых площадях и урожае зерновых
по районам для нескольких областей (число районов в областях одинаковы).
Определить среднюю урожайность и область добившуюся наибольшей средней урожайности.*/

import java.util.Scanner;
import java.util.Random;

public class Double {
    public static void main(String[] args) {
        double sum = 0;
        double max = 0;
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Введите колличество областей: ");
        final int obl = scn.nextInt();
        System.out.print("Введите колличество районов: ");
        final int raion = scn.nextInt();

        int[][] array = new int[raion][obl];
        for (int i = 0; i < raion; i++) {
            for (int j = 0; j < obl; j++) {
                array[i][j] = rnd.nextInt(20) + 1;
            }
        }

        int[][] ar = new int[raion][obl];
        for (int i = 0; i < raion; i++) {
            for (int j = 0; j < obl; j++) {
                ar[i][j] = rnd.nextInt(20) + 1;
            }
        }
        for (int i = 0; i < raion; i++) {
            for (int j = 0; j < obl; j++) {
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }
        double sred1;
        double k = 0;
        for (int j = 0; j < obl; j++) {
            for (int i = 0; i < raion; i++) {
                sum = sum + ar[i][j];
            }

            System.out.println("Урожайность " + j + " области " + sum);
            sred1 = sum / raion;
            System.out.println("Средняя урожайность " + sred1);
            if (sred1 > k) {
                k = sred1;
            sum = 0;
            }

        }
        System.out.println("Наиболее урожайный " + k);
    }
}








