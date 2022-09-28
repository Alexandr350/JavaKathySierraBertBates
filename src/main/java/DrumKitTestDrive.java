public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playShare();
        d.playTopHat();
        if(d.snare == true){
            d.playShare();
        }
    }
}
class DrumKit{
    boolean topHat = true;
    boolean snare = true;
    void playShare(){
        System.out.println("бах бах ба-бах");
    }
    void playTopHat(){
        System.out.println("динь динь ди-динь");
    }
}
