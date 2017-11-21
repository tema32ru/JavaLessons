package Lesson_006;
/*Текст зашифрован перестановкой букв наоборот. Восстановить их исходный текст.*/
import java.util.Scanner;
public class Stroka {
    public static void main(String[] args) {
        String text;
        String perev="";
        int i;
        Scanner scn = new Scanner(System.in);
        System.out.print("введите перевёрнутые слова: ");
        text = scn.nextLine();
        for (i = text.length()-1; i >= 0; i--) {
            perev = perev + text.charAt(i);
        }
        System.out.println(perev);
    }
}
