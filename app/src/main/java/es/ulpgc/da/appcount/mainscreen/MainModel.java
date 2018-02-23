package es.ulpgc.da.appcount.mainscreen;

import es.ulpgc.da.appcount.Mediator;

public class MainModel implements Main.PresenterToModel {
    protected final String TAG = this.getClass().getSimpleName();
    private int contador;

    public MainModel(Mediator mediator) {
        mediator.log_d(TAG, "starting MainModel");
        reset();
    }

    @Override
    public void increment() {
        contador++;
    }

    @Override
    public int getContador() {
        return contador;
    }

    @Override
    public void reset() {
        contador = 0;
    }
}
