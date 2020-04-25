package com.example.thefactorfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText e2;
    List <Integer> fi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e2 = findViewById(R.id.editText1);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(e2.getText().toString());
                b2.setBackgroundColor(Color.WHITE);
                b3.setBackgroundColor(Color.WHITE);
                b4.setBackgroundColor(Color.WHITE);
                Random rand = new Random();
                List<Integer> li = new ArrayList<>();
                List<Integer> lo = new ArrayList<>();
                for (int i = 1; i <= n; ++i) {
                    if (n % i == 0) {
                        li.add(i);
                    } else {
                        lo.add(i);
                    }
                }
                fi = li;
                List<Integer> ans = new ArrayList<>();
                ans.add(li.get(rand.nextInt(li.size())));
                ans.add(lo.get(rand.nextInt(lo.size())));
                ans.add(n + 1);
                int op1 = ans.get(rand.nextInt(ans.size()));
                ans.remove(new Integer(op1));
                int op2 = ans.get(rand.nextInt(ans.size()));
                ans.remove(new Integer(op2));
                int op3 = ans.get(0);
                b2.setText(String.valueOf(op1));
                b3.setText(String.valueOf(op2));
                b4.setText(String.valueOf(op3));

            }
        });
    }

        public void show(View v){

            int one=Integer.parseInt(b2.getText().toString());
            int two=Integer.parseInt(b3.getText().toString());
            int three=Integer.parseInt(b4.getText().toString());

            for(int i=0;i<fi.size();i++){

                if(fi.get(i)==one){
                    b2.setBackgroundColor(Color.GREEN);
                    b3.setBackgroundColor(Color.RED);
                    b4.setBackgroundColor(Color.RED);
                }

                if(fi.get(i)==two){
                    b2.setBackgroundColor(Color.RED);
                    b3.setBackgroundColor(Color.GREEN);
                    b4.setBackgroundColor(Color.RED);
                }

                if(fi.get(i)==three){
                    b2.setBackgroundColor(Color.RED);
                    b3.setBackgroundColor(Color.RED);
                    b4.setBackgroundColor(Color.GREEN);
                }



            }


        }

    }

