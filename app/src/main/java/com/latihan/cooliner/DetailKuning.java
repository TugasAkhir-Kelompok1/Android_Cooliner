package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_sotokuning;

public class DetailKuning extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuning);

        Button BtnKuning = findViewById(btn_sotokuning);
        BtnKuning.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_sotokuning:
                Intent moveIntent = new Intent(DetailKuning.this, ResepSotoKuning.class);
                startActivity(moveIntent);
                break;
        }
    }
}