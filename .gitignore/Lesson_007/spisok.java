package Lesson_007;
/*Списочный массив из N элементов(N- четное) заполняется словами.
 Составить из каждой пары словосочетание и вывести их на экран столбиком*/
import java.util.Scanner;
import java.util.ArrayList;
public class spisok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите колличество слов: ");
        int n = scn.nextInt();
        scn.nextLine();
        if (n % 2 != 0 ) {
            System.out.print("Нечётное колличество слов");
        }else {

            System.out.println("Введите слова: ");
            ArrayList <String> slova = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                slova.add(scn.nextLine());
            }
            for (int i=0; i < n ; i+=2) {

                System.out.println("Пары словосочетаний: " + slova.get(i) + " " + slova.get(i+1));
                }

            }


    }




    }

