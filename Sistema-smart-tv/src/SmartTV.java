public class SmartTV{

    boolean powerOn= false;
    int chanel=1;
    int sound=25;

    public void ligar(){
            powerOn=true;
    }
    public void desligar(){
        powerOn=false;
    }
    public void aumentaVolume(){
        sound++;
    }
    public void diminuirVolume(){
        sound--;
    }
}

