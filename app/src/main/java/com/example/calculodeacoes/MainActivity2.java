package com.example.calculodeacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            TextView tvATIVO = findViewById(R.id.tvATIVO);
            TextView tvLPA = findViewById(R.id.tvLPA);
            TextView tvPL = findViewById(R.id.tvPL);
            TextView tvROE = findViewById(R.id.tvROE);
            TextView tvVPA = findViewById(R.id.tvVPA);
            TextView tvPVP = findViewById(R.id.tvPVP);

            Bundle parametros = getIntent().getExtras();

            if (parametros != null) {

                String ativo = parametros.getString("ativo");
                Double lpa = parametros.getDouble("lpa");
                Double pl = parametros.getDouble("pl");
                Double roe = parametros.getDouble("roe");
                Double vpa = parametros.getDouble("vpa");
                Double pvp = parametros.getDouble("pvp");

                tvATIVO.setText(String.valueOf(ativo));
                tvLPA.setText("R$" + String.valueOf(lpa));
                tvPL.setText("R$" + String.valueOf(pl));
                tvROE.setText("R$" + String.valueOf(roe));
                tvVPA.setText("R$" + String.valueOf(vpa));
                tvPVP.setText("R$" + String.valueOf(pvp));


        }

    }

}
