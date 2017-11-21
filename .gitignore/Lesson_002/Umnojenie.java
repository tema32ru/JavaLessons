package Lesson_002;
/*Напечатать таблицу умножения на число n
(Значение n вводится с клавиатуры; 1 n 9)*/
import java.util.Scanner;
public class Umnojenie {
        public static void main(String[] args) {
            int a;
            Scanner scn = new Scanner(System.in);
            System.out.print("Введите число: ");
            a = scn.nextInt();
            for (int b = 1; b <= 10; b++) {
                int result = a * b;
                System.out.println(a + "*" + b + "=" + result);
            }
        }
    }

