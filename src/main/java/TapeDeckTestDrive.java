public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck TD = new TapeDeck();
        TD.canRecord = true;
        TD.playTape();
        if(TD.canRecord == true){
            TD.recordTape();
        }
    }
}
class  TapeDeck{
    boolean canRecord = false;

    void playTape(){
        System.out.println("пленка проигрывается");
    }
    void recordTape(){
        System.out.println("идет запись на пленку");
    }
}

