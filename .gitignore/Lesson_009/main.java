package Lesson_009;
/*Тестовый класс*/
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Введите скорость в километрах в час: ");
        int v1 = scn.nextInt();
        System.out.print ("Введите скорость в метрах в секунду: ");
        int v2= scn.nextInt();
        classob qqq =new classob();
        qqq.v1=v1;
        qqq.v2=v2;
        qqq.sravnenie();
        System.out.println(qqq.massage);

    }
}

