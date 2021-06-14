public class PlayingDog {
    public static void main(String[] args) {

    }
    public static boolean isDogPlaying(boolean summer, int temperature){
        if (summer && temperature >= 25 && temperature <= 45){
            return true;
        }else if (!summer && temperature >= 25 && temperature <=35){
            return true;
        }else {return false;
        }
    }
}
