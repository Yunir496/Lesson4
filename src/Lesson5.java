
public class Lesson5 {
    public static void main(String[] args) {
        /*int milk = 300; //200 по условию
        int flour = 5;
        int eggs = 5; //3 по условию
        int sugar = 5;
        int oil = 30;
        int apples = 8;
        if(flour >= 400 && sugar >= 10 && milk >= 1000 && oil >= 30){
            System.out.println("Блины");
        }
        if(milk >= 300 && eggs >= 5 && flour >= 5){
            System.out.println("Омлет");
        }
        if(apples >= 3 && milk >= 100 && flour >= 300 && eggs >= 4){
            System.out.println("Яблочный пирог");
        }*/
       // for( int i = 0;i<=10;i++){
         //   System.out.println(200+i);
       // }

        for( int i = 0;i<=50;i++) {
          if(i>10 && i<20)
              continue;
            System.out.println(200+i);
        }
    }
}
