package br.com.bossini.usjt_ads3anmca_navegacao_telas_simples;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView exibeTextoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        exibeTextoTextView = findViewById(R.id.exibeTextoTextView);
        Intent origemIntent = getIntent();
        String texto = origemIntent.getStringExtra("texto");
        exibeTextoTextView.setText(texto);

    }
}
