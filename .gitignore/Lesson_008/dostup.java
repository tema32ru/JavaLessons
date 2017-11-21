package Lesson_008;
/*Дан текстовый файл. Подсчитать количество строк в нем*/
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
    public class dostup {
        public static void main(String[] args) throws Exception {
            int i=0;
            FileReader fileReader = new FileReader("C:\\Users\\Maxim\\IdeaProjects\\Burenkov\\src\\Lesson_008\\text.txt");
            Scanner reader = new Scanner(fileReader);
            ArrayList<String> array = new ArrayList<>();
            while (reader.hasNextLine()) {
                array.add(reader.nextLine());
                i++;
            }
            System.out.print(i);
        }
    }

