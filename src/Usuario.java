public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
       
        smartTv.mudarCanal(515);
        System.out.println("Canal: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);
    }
}
