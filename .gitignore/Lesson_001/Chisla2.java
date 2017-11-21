package Lesson_001;
/*Давно двухзначное число. Определить:
1)Является-ли сумма его цифр двухзначным числом.
2)Больше-ли числа a сумма его цифр.*/
import java.util.Scanner;
public class Chisla2 {
        public static void main(String[] args) {
            int a, rez;
            String message;
            Scanner scn = new Scanner(System.in);
            System.out.print("Введите двухзначное число: ");
            a = scn.nextInt();
            int first = a / 10;
            int second = a % 10;

            if (first + second > 10) {
                rez = first + second;
                message = "Сумма цифр является двухзначным числом = ";
            } else {
                rez = first + second;
                message = "Сумма цифр не является двухзначным числом = ";
            }
            System.out.println(message + rez);
            if (first + second > a) {
                rez = first + second;
                message = "Сумма числа больше a и равняется = ";
            } else {
                rez = first + second;
                message = "Сумма чисел меньше числа a и равняется = ";
            }
            System.out.println(message + rez);
        }
    }

