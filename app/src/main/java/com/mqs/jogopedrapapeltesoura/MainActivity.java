package com.mqs.jogopedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoPedra(View view)
    {
        this.opcaoGame("pedra");
    }

    public void opcaoPapel(View view)
    {
        this.opcaoGame("papel");
    }

    public void opcaoTesoura(View view)
    {
        this.opcaoGame("tesoura");
    }

    public void opcaoGame(String escolhaUsuario) {
        String[] selecao = {"pedra", "papel", "tesoura"};
        Random random = new Random();
        int numero = random.nextInt(selecao.length);

        ImageView jogada = (ImageView) findViewById(R.id.imageSelecao);

        switch(selecao[numero])
        {
            case "pedra":
                jogada.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                jogada.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                jogada.setImageResource(R.drawable.tesoura);
                break;
        }

        if (selecao[numero] == escolhaUsuario) {

            TextView textResultado = findViewById(R.id.TextResultado);
            textResultado.setText("Empate!!!! Vamos de novo");

        }
        else if ((selecao[numero] == "pedra" && escolhaUsuario == "tesoura") ||(selecao[numero] == "tesoura" && escolhaUsuario == "papel")||(selecao[numero] == "papel" && escolhaUsuario == "pedra"))
        {
            TextView textResultado = findViewById(R.id.TextResultado);
            textResultado.setText("Você Perdeu!!!! KKKKK");
        }
        else
            {
                TextView textResultado = findViewById(R.id.TextResultado);
                textResultado.setText("Você Ganhou!!!! Vamos Jogar de novo!");
            }



    }




}