package com.example.art.onclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonA, botonB;

        botonA =  (Button) findViewById(R.id.botonA);
        botonB =  (Button) findViewById(R.id.botonB);

        //  utilizando OnClickListener
        botonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                modificarTexto(v);
            }
        });

        //  utilizando XML: utilizamos el atributo onClick en el XML del layout
        //  el método invocado desde el XML debe ser public, void y recibir un único parámetro
        //  (que será la View que ha sido pulsada)

    }

    public void modificarTexto(View v){

        TextView t= (TextView) findViewById(R.id.miTexto);

        if(v.getId() == R.id.botonA)
            t.setText("Has pulsado el botón A");
        else if(v.getId() == R.id.botonB)
            t.setText("Has pulsado el botón B");

        // otra forma de hacerlo
        // t.setText("Has pulsado el " + ((Button)v).getText());



    }
}
