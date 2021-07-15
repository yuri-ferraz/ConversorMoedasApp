package com.example.conversordois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EuroActivity extends AppCompatActivity implements View.OnClickListener {

    MainActivity.ViewHolder mViewHolder = new MainActivity.ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textReal = findViewById(R.id.text_real);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();
    }

    private void clearValues() {
        this.mViewHolder.textReal.setText("");
        this.mViewHolder.textDolar.setText("");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calculate) {
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)) {
                Toast.makeText(this,this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
            } else {
                Double euro = Double.valueOf(value);
                this.mViewHolder.textDolar.setText(String.format(" $ %.2f", (euro * 1.18)));
                this.mViewHolder.textReal.setText(String.format(" $ %.2f", (euro * 5.98)));
            }

        }

    }
}