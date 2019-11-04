package com.fadergs.swipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import br.pro.adalto.quiztouch.OnSwipeTouchListener;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout tela;
    TextView tvSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tela = findViewById(R.id.tela);
        tvSwipe = findViewById(R.id.tvSwipe);

        tela.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tvSwipe.setText("Swipou pra baixo");
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvSwipe.setText("Swipou pra cima");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvSwipe.setText("Swipou pra esquerda");
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tvSwipe.setText("Swipou pra direita");
            }
        });
    }

}
