public class SmartTv {
     boolean ligada = true;   
        int canal = 1;
        int volume = 25;

        public void ligar() {
            ligada = true;
            System.out.println("Ligando a TV...");
            System.out.println("A TV está ligada? " + ligada);
        }

        public void desligar() {
            ligada = false;
        }

        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        }
        public void diminuirVolume() {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
            System.out.println("Mudando para o canal: " + canal);
        }
        public void aumentarCanal() {
            canal++;
            System.out.println("Aumentando o canal para: " + canal);
        }

        
}