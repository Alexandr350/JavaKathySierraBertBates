public class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("Проигрывание фильма");
    }
}
class MovieTestDrive{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie tree = new Movie();
        tree.title = "Байт-Клуб";
        tree.genre = "Трагедия, но в целом веселая";
        tree.rating = 127;
    }
}
