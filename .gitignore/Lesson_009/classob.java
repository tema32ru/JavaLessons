package Lesson_009;
/*Написать класс, который проверяет большую из двух скоростей,
 одна скорость – в километрах в час, другая – в метрах в секунду.
 Написать тестовый класс для проверки*/
public class classob {
    double skorost1;
    double skorost2;
    int v1;
    int v2;
    String massage;
    void  sravnenie(){
        skorost2= v2*1000/3600;
        skorost1= v1*1;
        if(skorost1>skorost2){
            massage="Cкорость в километрах в час  больше!";
        }else {
            massage="Cкорость в метрах в секунду больше!";
        }
    }

}

