package exercicio4;

public class ControleRemoto {

    public static void main(String[] args) {
        
        Televisao tv = new Televisao();
        tv.status();
        tv.ligaDesliga();
        tv.aumentarCanal();
        tv.aumentarVolume();
        tv.mudarCanal(140);
        tv.status();
    } 
}