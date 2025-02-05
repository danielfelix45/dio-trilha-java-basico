public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligarTv();
        System.out.println("Smart TV ligada: " + smartTv.ligada);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(5);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligarTv();
        System.out.println("Smart TV ligada: " + smartTv.ligada);
    }
}
