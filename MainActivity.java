package com.example.diceroller_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     private ImageButton mydice;
     private Random myrandomnumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydice = findViewById(R.id.imagebutton);
        mydice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
            }
        });

    }
    private void rolldice(){
        int myrannumber = myrandomnumber.nextInt(6)+1;

        switch (myrannumber){

            case 1:
                mydice.setImageResource(R.drawable.one);
                Toast.makeText(this, "You Got 1 Try  More", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                mydice.setImageResource(R.drawable.two);
                Toast.makeText(this, "You Got 2 Ohho", Toast.LENGTH_SHORT).show();
                break;

            case 3:
                mydice.setImageResource(R.drawable.three);
                Toast.makeText(this, "You Got 3 Not Good", Toast.LENGTH_SHORT).show();
                break;

            case 4:
                mydice.setImageResource(R.drawable.four);
                Toast.makeText(this, "You Got 4 Good", Toast.LENGTH_SHORT).show();
                break;

            case 5:
                mydice.setImageResource(R.drawable.five);
                Toast.makeText(this, "You Got 5 Nice", Toast.LENGTH_SHORT).show();
                break;

            case 6:
                mydice.setImageResource(R.drawable.six);
                Toast.makeText(this, "You Got 6 Excellent", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
