public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarDesligar() {
        if (ligada) {
            ligada = false;
        } else {
            ligada = true;
        }
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuído para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

}