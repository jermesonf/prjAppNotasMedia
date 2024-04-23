package com.example.appnotasmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;
    EditText nota3;
    TextView resultado;
    double soma;
    double val1;
    double val2;
    double val3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.etxtNota1);
        nota2 = findViewById(R.id.etxtNota2);
        nota3 = findViewById(R.id.etxtNota3);
        resultado = findViewById(R.id.txtResultado);

    }


    public void calculo(){

       val1 = Double.parseDouble(nota1.getText().toString());
       val2 = Double.parseDouble(nota2.getText().toString());
       val3 = Double.parseDouble(nota3.getText().toString());

       soma = (val1 + val2 + val3) / 3;
    }

    public void mostre(View v){
        try {
            calculo();

            if (soma >= 4 && soma <= 4.99) {
                resultado.setText(" CONSELHO! \n Média: " + String.format("%.2f", soma));
            } else if (soma < 5) {
                resultado.setText(" REPROVADO! \n Média: " + String.format("%.2f", soma));
            } else if (soma >= 5) {
                resultado.setText(" APROVADO! \n Média: " + String.format("%.2f", soma));
            } else if (soma == 10) {
                resultado.setText("PARABÉNS APROVADO! \n Média: " + String.format("%.2f", soma));
            }

        }
        catch(Exception erro){

            Toast.makeText(this, "Preencha os campos vazios.", Toast.LENGTH_LONG).show();
        }
    }
}