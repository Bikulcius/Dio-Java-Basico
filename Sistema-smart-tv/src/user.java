public class user {
    public static void main(String[]args) {
        SmartTV SmarTv = new SmartTV();
      
        System.out.println("TV ligada? "+SmarTv.powerOn);
        System.out.println("Canal Atual: "+SmarTv.chanel);
        System.out.println("Volume Atual: "+SmarTv.sound);
        
        SmarTv.ligar();
        System.out.println("Novo status -> TV ligada "+SmarTv.powerOn);

        SmarTv.aumentaVolume();
        System.out.println("Aumentei o volume para :" +SmarTv.sound);
        SmarTv.diminuirVolume();
        System.out.println("O volume esta em :"+SmarTv.sound);
    }
    
}
