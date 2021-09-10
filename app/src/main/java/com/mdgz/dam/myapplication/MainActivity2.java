package com.mdgz.dam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn2;
    EditText edtValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Long unArg = this.getIntent().getLongExtra("UN_EXTRA",10L);
        btn2 = findViewById(R.id.btnAct2);
        TextView tvExtra = findViewById(R.id.tvExtra);
        tvExtra.setText(" EL ARGUMENTO ES "+unArg);
        edtValor = findViewById(R.id.edtIngreseValor);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity2.this,MainActivity.class);
                i1.putExtra("RESULT_A2",edtValor.getText().toString());
                setResult(RESULT_OK,i1);
                finish();
                //startActivity(i1);
            }
        });
    }
}