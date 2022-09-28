public class Shufflel {
    public static void main(String[] args) {
        int x = 3;
        int a = 5;
        while (x > 0){

            if(x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");
            }
            if(x == 1){
                System.out.print("d");
                x--;
            }

        }
        while (a > 1){
            a = a - 1;
            if(a < 3){
                System.out.println("маленький икс");
            }
        }
    }
}

class Exerciselb{
    public static void main(String[] args) {
        int x = 1;
        while (x < 10){
            if(x < 3){
                System.out.println("большой икс");
                x = x + 1;
            }
        }
    } // Исправленный...стр 51
}
class Exerciselb2 {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1){
            x=x-1;
            if(x < 3){
                System.out.println("маленький икс");
            }
        }
    }
}
