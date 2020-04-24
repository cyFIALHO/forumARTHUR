package avi;

public class AviaoListenerConsole implements AviaoListener {

    @Override
    public void aviaoEstaParado() {
        System.out.println("Avião está parado!");
    }

    @Override
    public void aviaoPlanando() {
        System.out.println("Avião está planando!");
    }

    @Override
    public void aviaoPousando() {
        System.out.println("Avião está pousando!");
    }
}