import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
    /*1. Создать программу определения меньшего, среднего и большего возраста.
    Пользователь вводит в программу 3 РАЗНЫХ целых числа(возраста).
    Программа должна определить какой возраст меньший, больший, и средний. У нас не может быть 2х одинаковых возрастов.*/
public class Lesson4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 возраста");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
                    //if-else 1 способ
        if (a > b && a > c) {
            System.out.println("Максимальный возраст " + a);
            if (b > c) {
                System.out.println("Средний возраст " + b);
                System.out.println("Минимальный возраст " + c);
            } else {
                System.out.println("Средний возраст " + c);
                System.out.println("Минимальный возраст " + b);
            }
        } else if (a < b && b > c) {
            System.out.println("Максимальный возраст " + b);
            if (a > c) {
                System.out.println("Средний возраст " + a);
                System.out.println("Минимальный возраст " + c);
            } else {
                System.out.println("Средний возраст " + c);
                System.out.println("Минимальный возраст " + a);
            }
        } else if (a < c && c > b) {
            System.out.println("Максимальный возраст " + c);
            if (a > b) {
                System.out.println("Средний возраст " + a);
                System.out.println("Минимальный возраст " + b);
            } else {
                System.out.println("Средний возраст " + b);
                System.out.println("Минимальный возраст " + a);
            }
        }
    }
}
                // Сортировка массива 2 способ

            //int[] array = new int[]{a,b,c};
           // Arrays.sort(array);
        //System.out.println("Минимальный возраст "+ array[0]);
       // System.out.println("Средний возраст "+ array[1]);
       // System.out.println("Максимальный возраст "+ array[2]);



