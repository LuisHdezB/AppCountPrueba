package es.ulpgc.da.appcount.mainscreen;

public interface Main {

    interface PresenterToModel {
        void increment();
        int getContador();
        void reset();
    }

    interface ModelToPresenter {
    }

    interface PresenterToView {
        void displayShortMessage(String text);
    }

    interface ViewToPresenter {
        String getTextToDisplay();

        void buttonPlusPressed();
    }

}
