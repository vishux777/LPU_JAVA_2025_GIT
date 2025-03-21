interface Camera{
    void clickPhoto();
    void recordVideo();
}

interface Audio{
    void playMusic();
    void playRadio();
    void recordVoice();
}


class SmartPhone implements Camera, Audio{
       public void clickPhoto(){
        System.out.println("Clicking photo");
       } 

       public void recordVideo(){
        System.out.println("Recording video");
       }

       public void playMusic(){
        System.out.println("Playing music");
       }

       public void playRadio(){
        System.out.println("Playing radio");
       }

       public void recordVoice(){
        System.out.println("Recording voice");
       }
}

public class interface_5 {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();

        obj.clickPhoto();
    }
}


