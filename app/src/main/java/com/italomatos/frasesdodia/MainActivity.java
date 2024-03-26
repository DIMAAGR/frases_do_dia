package com.italomatos.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private final List<String> phrases = Arrays.asList(
            "Acredite em si mesmo e você será imparável",
            "Cada dia é uma nova oportunidade para brilhar",
            "O sucesso é a soma de pequenos esforços repetidos dia após dia",
            "Encare cada desafio como uma chance de crescimento",
            "A motivação vem de fazer as coisas acontecerem",
            "A paixão e a perseverança abrem portas que antes pareciam fechadas",
            "Acredite no poder dos seus sonhos e siga em frente",
            "Não importa que você vá devagar, contanto que você não pare",
            "A inspiração existe, porém temos que encontrá-la trabalhando",
            "Conhecer a si mesmo é o começo de toda sabedoria"
    );

    public void generateList(View view) {
        TextView motivationalText = findViewById(R.id.motivationalTextView);

        Random random = new Random();
        motivationalText.setText(phrases.get(random.nextInt(9)));
    }
}