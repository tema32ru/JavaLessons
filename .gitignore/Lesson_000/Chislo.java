package Lesson_000;
/*Известны объём и масса тела. Определить плотность материала этого тела.*/
import java.util.*;
public class Chislo {
        public static void main(String[] args) {
            double V, M;
            double P;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите объём V = ");
            V = in.nextInt();
            System.out.print("Введите массу m = ");
            M = in.nextInt();

            P = (M/V);
            System.out.print("Плотность материала P = ");
            System.out.print(P);
        }
    }


