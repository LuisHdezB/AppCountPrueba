package es.ulpgc.da.appcount.mainscreen;

import es.ulpgc.da.appcount.Mediator;

public class MainPresenter implements Main.ViewToPresenter, Main.ModelToPresenter {
    protected final String TAG = this.getClass().getSimpleName();

    private Mediator myMediator;
    private Main.PresenterToModel myModel;
    private Main.PresenterToView  myView;

    public MainPresenter(Mediator mediator,
                         Main.PresenterToModel model,
                         Main.PresenterToView view) {
        mediator.log_d(TAG, "starting MainPresenter");
        myMediator = mediator;
        myModel = model;
        myView = view;
    }

    @Override
    public String getTextToDisplay() {
        return "" + myModel.getContador();
    }

    @Override
    public void buttonPlusPressed() {
        myModel.increment();

        if (myModel.getContador() % 3 == 0) {
            myView.displayShortMessage("Congrats!!! You reached " + myModel.getContador());

            ((Mediator.navigation) myMediator).openWebPage("http://www.ulpgc.es");
        }
    }
}
