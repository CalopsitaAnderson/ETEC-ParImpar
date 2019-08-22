package br.com.etechoracio.parimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtNumero;
    TextView lblResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Basicamente, falar para o android que o txtNumero é o que tem dentro da Caixa txtNumero
        txtNumero = findViewById(R.id.txtNumero);
        //Falar para o android que o lblResultado2 é o que aparece dentro da caixa lblResultado2
        lblResultado2 = findViewById(R.id.lblResultado2);
    }
    //Mostrar se o numero for par ou impar
    public void onProcessar(View v){

        if( txtNumero.getText().toString().isEmpty()) {
            Toast.makeText(this,"Digite algum valor numérico",Toast.LENGTH_SHORT).show();
        }
        else{

            int numero = Integer.parseInt(txtNumero.getText().toString());
            if (numero % 2 == 0) {
                lblResultado2.setText("PAR");
            } else
            {
                lblResultado2.setText("IMPAR");
            }
        }

    }
}
