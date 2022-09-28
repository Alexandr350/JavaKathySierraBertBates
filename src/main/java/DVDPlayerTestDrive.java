public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;

        if(d.canRecord){
            d.canRecord();
        }
    }
}
class DVDPlayer{
    boolean canRecord = false;

    void  canRecord(){
        System.out.println("идет запись DVD");
    }
}