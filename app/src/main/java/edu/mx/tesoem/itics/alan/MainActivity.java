package edu.mx.tesoem.itics.alan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner Listadez;
    GridView datosgv;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] elementossp ={"suma","resta","division","multiplicacion","potencia"};
        String[] elementogv ={"Nombre","edad","correo","pablo","22","sad@gmail.com","juarez","21","sades@gmail.com","suares","18","sadines@gmail.com"
                ,"steve","100","apple@gmail.com","chente","52","potro@gmail.com"};

        Listadez = (Spinner) findViewById(R.id.spinner);
        datosgv = (GridView) findViewById(R.id.datosgv);

        ArrayAdapter<String> Elementossp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,elementossp);
        ArrayAdapter<String> Elementogv = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,elementogv);

        Listadez.setAdapter(Elementossp);
        datosgv.setAdapter(Elementogv);
        r1 = (RadioButton) findViewById(R.id.uno);
        r2 = (RadioButton) findViewById(R.id.dos);
        r3 = (RadioButton) findViewById(R.id.tres);
        r4 = (RadioButton) findViewById(R.id.cuatro);

    }

        public void checaRadioBoton(View v){
            if (r1.isChecked()){
                Toast.makeText(this,"Se presiono suma",Toast.LENGTH_LONG).show();
            } else if (r2.isChecked()) {
                Toast.makeText(this,"Se presiono resta",Toast.LENGTH_LONG).show();
            } else if (r3.isChecked()) {
                Toast.makeText(this,"Se presiono multiplicacion",Toast.LENGTH_LONG).show();
            } else if (r4.isChecked()) {
                Toast.makeText(this,"Se presiono division",Toast.LENGTH_LONG).show();
            }

    }
}
