package com.example.staceylawson.draw;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt1 = findViewById(R.id.button);
        final TextView tv1 = findViewById(R.id.editText2);
        final TextView tv2 = findViewById(R.id.textView1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(getRandomColor());
                int currentTextColor = tv1.getCurrentTextColor();
                String s = String.format("#%06X", (0xFFFFFF & currentTextColor));
                int r1 = Color.red(currentTextColor);
                int g1 = Color.green(currentTextColor);
                int b1 = Color.blue(currentTextColor);
                tv2.setTextColor(currentTextColor);
                tv2.setText("COLOR: " +  + r1 + "r"+", "  + g1 + "g" +", "  + b1 + "b" + ", " + s);

                Button bt2 = findViewById(R.id.nextButton);
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startDrawActivity();
                    }

                });
            }
        });
    }

    public int getRandomColor() {
        Random rnd = new Random();
        int r = rnd.nextInt(256);
        int g = rnd.nextInt(256);
        int b = rnd.nextInt(256);
        int color = Color.rgb(r, g, b);
        return color;
    }


    private void startDrawActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

}


