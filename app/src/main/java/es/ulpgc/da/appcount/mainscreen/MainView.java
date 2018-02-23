package es.ulpgc.da.appcount.mainscreen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.ulpgc.da.appcount.R;
import es.ulpgc.da.appcount.Mediator;

public class MainView extends Activity implements Main.PresenterToView {
    protected final String TAG = this.getClass().getSimpleName();

    private TextView pantalla;
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "starting MainView");

        pantalla = findViewById(R.id.textView);
        boton1 = findViewById(R.id.button);

        final Mediator mediator = (Mediator) getApplication();
        final Main.ViewToPresenter myPresenter = mediator.getPresenter(this);

        pantalla.setText(mediator.getPresenter(this).getTextToDisplay());

        // Configurado el observador con una clase anonima
        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "boton pulsado");

                myPresenter.buttonPlusPressed();
                pantalla.setText(myPresenter.getTextToDisplay());
            }
        });
    }


    @Override
    public void displayShortMessage(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
