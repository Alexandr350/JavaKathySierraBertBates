public class WeDive {
    public static void MyFirstApp() {
        System.out.println("Я управляю ");
        System.out.println("миром");
    } // стр 39
    public static void Loopy() {
        int x = 1;
        System.out.println("Перед началом цикла");
        while (x<4){
            System.out.println("Внутри цикла");
            System.out.println("Значение х равно " + x);
            x = x + 1;
        }
        System.out.println("После оконччания цикла");
    } // Пример цикла Стр 42
    public static void IfTest(){
        int x = 3;
        if(x == 3){
            System.out.println("х должен равняться 3");
        }
        System.out.println("Эта строка выполняется в любом случае");
    }// Пример условия Стр 43
    public static void IfTest2(){
        int x = 2;
        if(x == 3){
            System.out.println("х должен равняться 3");
        }else {
            System.out.println("х не равнен 3");
        }
        System.out.println("Эта строка выполняется в любом случае");
    }// Пример условия Стр 43
    public static void DooBee(){
        int x = 1;
        while (x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3){
            System.out.print("Do");
        }
        System.out.println(" ");
    }// задача на стр 43
    public static void BeerSong(){
        int beerNum = 99;
        String word = "бутылок (бутылки)";
        while (beerNum > 0){
            if(beerNum == 1){
                word = "бутылка";
            }
            //System.out.println(beerNum + " " + word + " пива на стене");
            //System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1;
            if(beerNum != 0){
                System.out.println(beerNum + " " + word + " пива на стене");
            }else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }


}

