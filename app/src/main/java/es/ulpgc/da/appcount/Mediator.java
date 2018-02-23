package es.ulpgc.da.appcount;

import es.ulpgc.da.appcount.mainscreen.MainPresenter;
import es.ulpgc.da.appcount.mainscreen.MainView;

public interface Mediator {
    MainPresenter getPresenter(MainView view);
    void resetApp();
    void log_d(String tag, String text);

    interface lifecycle {

    }

    interface navigation {
        void openWebPage(String url);
    }

}
