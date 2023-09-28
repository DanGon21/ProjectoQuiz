package com.example.exerprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray("formules");


        } catch (JSONException e){
            e.printStackTrace();
        }
    }
    public void onRadioButtonClicked(View view){
        TextView respuesta = findViewById(R.id.Resposta);

        boolean check = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.btnCars2:
                if(check)
                    respuesta.setText("Respuesta Correcta");
                    respuesta.setVisibility(View.VISIBLE);
                    respuesta.setTextColor(Color.GREEN);
                break;
            case R.id.btnCars1: case R.id.btnCars3: case R.id.btnCars4:
                if(check)
                    respuesta.setText("Respuesta Incorrecta");
                    respuesta.setVisibility(View.VISIBLE);
                    respuesta.setTextColor(Color.RED);
                break;
        }
    }
    public void onRadioButtonClicked2(View view){
        TextView respuesta = findViewById(R.id.Resposta2);

        boolean check = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.btnKFP3:
                if(check)
                    respuesta.setText("Respuesta Correcta");
                    respuesta.setVisibility(View.VISIBLE);
                    respuesta.setTextColor(Color.GREEN);
                break;
            case R.id.btnKFP1: case R.id.btnCars2: case R.id.btnKFP4:
                if(check)
                    respuesta.setText("Respuesta Incorrecta");
                    respuesta.setVisibility(View.VISIBLE);
                    respuesta.setTextColor(Color.RED);
                break;
        }
    }
}