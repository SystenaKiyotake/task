package com.example.kiyotakei.task1;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //ToastのonClick
    public void toast(View v){
        Toast.makeText(MainActivity.this, "HELLO!", Toast.LENGTH_SHORT).show();
    }

    //色を変える時用のflag
    int flag = 0;

    //dialogのonClick
    public void dialog(View v){
        //dialogのインスタンス生成
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("dialogです。");

        //OKボタン
        alertDialog.setPositiveButton("OKです", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "OKボタン", Toast.LENGTH_SHORT).show();
            }
        });

        //キャンセルボタン
        alertDialog.setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "キャンセルボタン", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();
    }

    //colorのonClick
    public void color(View v){
        if (flag == 0) {
            Button btn = findViewById(R.id.buttonColor);
            btn.setBackgroundColor(Color.BLUE);
            btn.setTextColor(Color.WHITE);

            Button btn2 = findViewById(R.id.buttonColor2);
            btn2.setBackgroundColor(Color.BLUE);
            btn2.setTextColor(Color.WHITE);

            Button btn3 = findViewById(R.id.buttonColor3);
            btn3.setBackgroundColor(Color.BLUE);
            btn3.setTextColor(Color.WHITE);

            flag = 1;
        } else {
            Button btn = findViewById(R.id.buttonColor);
            btn.setBackgroundResource(android.R.drawable.btn_default);
            btn.setTextColor(Color.BLACK);

            Button btn2 = findViewById(R.id.buttonColor2);
            btn2.setBackgroundResource(android.R.drawable.btn_default);
            btn2.setTextColor(Color.BLACK);

            Button btn3 = findViewById(R.id.buttonColor3);
            btn3.setBackgroundResource(android.R.drawable.btn_default);
            btn3.setTextColor(Color.BLACK);

            flag = 0;
        }
    }
}
