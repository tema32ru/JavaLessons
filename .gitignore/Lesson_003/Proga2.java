package Lesson_003;
/*	Последовательно запрашивая у пользователя N произвольных чисел вычислить количество
положительных и отрицательных;
для положительных вычислить среднее геометрическое, для отрицательных – среднее арифметическое.*/
import java.util.Scanner;
public class Proga2 {
        public static void main(String[] args) {
            int n, a;
            int slozh = 0;
            int proizv = 1;
            int c = 0;
            int b = 0;
            double geo = 0;
            int arif = 0;
            Scanner scn = new Scanner(System.in);
            System.out.print("Введите колличество чисел = ");
            n = scn.nextInt();
            for (int i = 0; i < n; i++ ) {
                System.out.print("Введите числа =   ");
                a = scn.nextInt();
                if (a > 0) {
                    proizv =  proizv * a;
                    c++;
                } else {
                    slozh = slozh + a;
                    b++;
                }
            }
            arif = slozh / b;
            geo = Math.pow(proizv, c );
            System.out.println("Среднее арифметическое = " + arif);
            System.out.println("Среднее геометрическое = " + geo);
            System.out.println("Колличество отрицательных = " + b);
            System.out.println("Колличество положительных = " + c);

        }
    }

















