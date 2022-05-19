package br.ufjf.dcc196.deocleciofilho.meustarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTestNome = findViewById(R.id.editTextNome);
        EditText editTestStarter = findViewById(R.id.editTextStarter);
    }

    public void clicaBotaoMensagem(View origem){
        TextView textViewMensagem = findViewById(R.id.textViewMensagemP);
      //  textViewMensagem.setText("Olá mundo!");
        EditText editTestNome = findViewById(R.id.editTextNome);
        EditText editTestStarter = findViewById(R.id.editTextStarter);

        //trabalha os dados
        String nome = editTestNome.getText().toString();
        String starter = editTestStarter.getText().toString();
        String mensagem = String.format("Olá treinador %s! Seu starter é %s!", nome, starter);

        // Apresenta resultado
        textViewMensagem.setText(mensagem);

    }
}