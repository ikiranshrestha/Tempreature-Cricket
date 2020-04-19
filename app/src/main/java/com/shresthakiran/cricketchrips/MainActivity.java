package com.shresthakiran.cricketchrips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etchrips;
    TextView tvResult;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etchrips = findViewById(R.id.etTemp);
        tvResult = findViewById(R.id.tvResult);
        btnCheck = findViewById(R.id.btnCheck);
        tvResult.setVisibility(View.GONE);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cricketchrips = etchrips.getText().toString().trim();
                int num = Integer.parseInt(cricketchrips);

                double outsideTemp = (num/3) + 4;
                String stringResult = "The temperature outside is "+outsideTemp+"° F.";
                tvResult.setText((stringResult));
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}
