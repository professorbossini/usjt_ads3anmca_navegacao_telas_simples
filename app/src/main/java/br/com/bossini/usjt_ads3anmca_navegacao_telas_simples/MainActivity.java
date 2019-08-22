package br.com.bossini.usjt_ads3anmca_navegacao_telas_simples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensagemEditText = findViewById(R.id.mensagemEditText);

    }

    public void enviarMensagem (View view){
        //Toast.makeText(this, getString(R.string.teste_botao), Toast.LENGTH_SHORT).show();
        String textoDigitado = mensagemEditText.getEditableText().toString();
        Intent intent =
                new Intent (this, ExibeMensagemActivity.class);
        intent.putExtra("texto", textoDigitado);
        startActivity(intent);

    }
}
