package com.mdgz.dam.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnAct1);
        btn2 = findViewById(R.id.btnAct2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,MainActivity2.class);
                i2.putExtra("UN_EXTRA",9999L);

                startActivityForResult(i2,999);
                //startActivity(i2);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,MainActivity2.class);
                i2.putExtra("UN_EXTRA",9999L);

                startActivityForResult(i2,998);
                //startActivity(i2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==999){
            if(resultCode== Activity.RESULT_OK){
                String res = data.getStringExtra("RESULT_A2");
                for (String unaClave : data.getExtras().keySet()){
                    Log.d("MAINACITVITY", "onActivityResult: "+data.getExtras().get(unaClave).toString());
                }
                Toast.makeText(MainActivity.this,"RESULTADO = "+res,Toast.LENGTH_LONG).show();
            }
        }
        if(requestCode==998){
            if(resultCode== Activity.RESULT_OK){
                String res = data.getStringExtra("RESULT_A2");
                Toast.makeText(MainActivity.this,"RESULTADO 9998 "+res,Toast.LENGTH_LONG).show();
            }
        }
    }
}