package avi;

public class App {

    public static void main(String[] args) {
        Aviao14bis aviao = new Aviao14bis();
        AviaoListenerConsole aviaoListenerConsole = new AviaoListenerConsole();
        aviao.adicionarListener(aviaoListenerConsole);
        aviao.parar();
        aviao.planar();
        aviao.pousar();
    }
}
