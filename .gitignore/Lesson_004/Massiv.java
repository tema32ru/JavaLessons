package Lesson_004;
/*В массиве хранится информация о сопротивлении каждого из 20 элементов электрической цепи.
  Все элементы соединены параллельно. Определить общее сопротивление цепи.*/
import java.util.Scanner;
public class Massiv {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            final int N = 20;
            int k = 0;
            double proiz = 0;
            double sopr = 0 ;
            double soprotiv;
            double[] array = new double[N];
            for (int j = 0; j < N; j++) {
                System.out.print(j + "-й элемент = ");
                array[j] = scn.nextInt();
            }
            for (int i = 0; i < N; i++) {
                proiz = 1.0 / array[i];
                sopr = sopr + proiz;
            }
            soprotiv = 1.0 / sopr;
            System.out.print("Общее споротивление цепи = " + soprotiv);
        }
    }


