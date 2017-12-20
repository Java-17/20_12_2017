package com.sheygam.java_17_20_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button okBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        if(intent.getExtras()!=null){
            String name = intent.getStringExtra("NAME");
            String email = intent.getExtras().getString("EMAIL","empty");
            Toast.makeText(this, name + "\n" + email, Toast.LENGTH_SHORT).show();
        }
        okBtn = findViewById(R.id.ok_btn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("CALLBACK","Second activity callback msg");
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}
