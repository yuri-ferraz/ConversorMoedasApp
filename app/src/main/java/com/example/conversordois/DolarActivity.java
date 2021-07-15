package com.example.conversordois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DolarActivity extends AppCompatActivity implements View.OnClickListener {

    MainActivity.ViewHolder mViewHolder = new MainActivity.ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textReal = findViewById(R.id.text_real);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();
    }

    private void clearValues() {
        this.mViewHolder.textReal.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calculate) {
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)) {
                Toast.makeText(this,this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
            } else {
                Double dolar = Double.valueOf(value);
                this.mViewHolder.textReal.setText(String.format(" $ %.2f", (dolar * 5.05)));
                this.mViewHolder.textEuro.setText(String.format(" $ %.2f", (dolar * 0.84)));
            }

        }

    }
}