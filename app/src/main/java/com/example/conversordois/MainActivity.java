package com.example.conversordois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ViewHolder mViewHolder = new ViewHolder();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonReal = findViewById(R.id.button_real);
        this.mViewHolder.buttonEuro = findViewById(R.id.button_euro);
        this.mViewHolder.buttonDolar = findViewById(R.id.button_dolar);

        this.mViewHolder.buttonReal.setOnClickListener(this);
        this.mViewHolder.buttonDolar.setOnClickListener(this);
        this.mViewHolder.buttonEuro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_real) {
            intent = new Intent(this, RealActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button_dolar) {
            intent = new Intent(this, DolarActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button_euro) {
            intent = new Intent(this, EuroActivity.class);
            startActivity(intent);
        }

    }

    public static class ViewHolder {
        TextView textReal;
        View buttonReal;
        View buttonDolar;
        View buttonEuro;
        TextView editValue;
        TextView textDolar;
        TextView textEuro;
        View buttonCalculate;
    }
}