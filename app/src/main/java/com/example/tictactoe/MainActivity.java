package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    int flag = 0, count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);

    }

    public void newGame() {
        bt1.setText(" ");
        bt2.setText(" ");
        bt3.setText(" ");
        bt4.setText(" ");
        bt5.setText(" ");
        bt6.setText(" ");
        bt7.setText(" ");
        bt8.setText(" ");
        bt9.setText(" ");
        flag = 0;
        count = 0;
    }


    public void check(View view) {
        Button current = (Button) view;

        if (count < 9 && " ".equals(current.getText().toString())) {
            count++;

            if (flag == 0) {
                current.setText("X");
                flag = 1;
            } else {
                current.setText("O");
                flag = 0;
            }

            if (count >= 5) {
                checkWinner();
            }
        } else if (count == 9) {
            Toast.makeText(this, "Game tied", Toast.LENGTH_SHORT).show();
            newGame();
        }
    }

    private void checkWinner() {
        String[] buttonsText = new String[9];
        Button[] buttons = {bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9};

        for (int i = 0; i < 9; i++) {
            buttonsText[i] = buttons[i].getText().toString();
        }
        if (b1.equals(b2) && b2.equals(b3) && !b1.equals(" ")) {
            Toast.makeText(this, "WINNER" + b1, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b4.equals(b5) && b5.equals(b6) && !b4.equals(" ")) {
            Toast.makeText(this, "WINNER" + b4, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b7.equals(b8) && b8.equals(b9) && !b7.equals(" ")) {
            Toast.makeText(this, "WINNER" + b7, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b1.equals(b4) && b4.equals(b7) && !b1.equals(" ")) {
            Toast.makeText(this, "WINNER" + b1, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b2.equals(b5) && b5.equals(b8) && !b5.equals(" ")) {
            Toast.makeText(this, "WINNER" + b5, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b3.equals(b6) && b6.equals(b9) && !b3.equals(" ")) {
            Toast.makeText(this, "WINNER" + b3, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b1.equals(b5) && b5.equals(b9) && !b5.equals(" ")) {
            Toast.makeText(this, "WINNER" + b1, Toast.LENGTH_SHORT).show();
            newGame();
        }
        if (b3.equals(b5) && b5.equals(b7) && !b7.equals(" ")) {
            Toast.makeText(this, "WINNER" + b7, Toast.LENGTH_SHORT).show();
            newGame();
        } else if (count == 9) {
            Toast.makeText(this, "game tied", Toast.LENGTH_SHORT).show();
            newGame();
        }
    }


        }




