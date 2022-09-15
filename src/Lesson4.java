import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Lesson4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 возраста");
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int min = 0;
            int max = 0;
               /* if(a<b){
                  min = a;}
                else{
                    min = b;
                }
                if(min>c){
                    min = c;
                }
                if(a>b){
                max= a;}
                else {
                max =b;
                }
                if(max<c){
                 max=c;
                }*/
                if(a>b&&a>c){
                    System.out.println("Максимальный возраст "+a);
                    if(b>c){
                        System.out.println("Средний возраст "+b);
                        System.out.println("Минимальный возраст "+c);
                    }else {
                        System.out.println("Средний возраст "+c);
                        System.out.println("Минимальный возраст "+b);
                    }
                }
                else if(a<b&&b>c){
                    System.out.println("Максимальный возраст "+b);
                    if(a>c){
                        System.out.println("Средний возраст "+a);
                        System.out.println("Минимальный возраст "+c);
                    }
                    else{
                        System.out.println("Средний возраст "+c);
                        System.out.println("Минимальный возраст "+a);
                    }
                }else if (a<c&&c>b){
                    System.out.println("Максимальный возраст "+c);
                    if(a>b){
                        System.out.println("Средний возраст "+a);
                        System.out.println("Минимальный возраст "+b);
                    }else{
                        System.out.println("Средний возраст "+b);
                        System.out.println("Минимальный возраст "+a);
                    }
                }

       // System.out.println("Минимальный возраст "+min);
       // System.out.println("Средний возраст "+b);
       // System.out.println("Максимальный возраст "+max);
            }}
            //int[] array = new int[]{a,b,c};
           // Arrays.sort(array);
        //System.out.println("Минимальный возраст "+ array[0]);
       // System.out.println("Средний возраст "+ array[1]);
       // System.out.println("Максимальный возраст "+ array[2]);

             // хотел с помощью метода, не получилось
            //maxNum(a,b,c);
            /* public int maxNum(int num1, int num2, int num3){
            int max = 0;
            int mx = num1>num2?num1:num2;
            max = mx>num3?mx:num3;
            return max;
            } */



