package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        final Spinner temp_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner temp_to =  (Spinner) findViewById(R.id.spinner_to);
        temp_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Temperature2 tempfrom = new Temperature2();
               // Temperature2 tempto = new Temperature2();
                EditText Temp_value = findViewById(R.id.editText);
                TextView res =findViewById(R.id.res);

                if (! (Temp_value.getText().toString().equals(""))){
                    String selectOption_from = temp_from.getSelectedItem().toString();
                    String selectOption_to = temp_to.getSelectedItem().toString();
                    if(selectOption_from.equals("Celsius")){
                        if(selectOption_to.equals("Fahrenheit")){
                            float tempo = Float.parseFloat(Temp_value.getText().toString());
                            tempfrom.setTemp(tempo);
                            String result =String.valueOf (tempfrom.Cel_To_Fer(tempo));
                            res.setText(result);


                        }
                        else if (selectOption_to.equals("kelvin")){

                                float tempo = Float.parseFloat(Temp_value.getText().toString());
                                tempfrom.setTemp(tempo);
                                String result =String.valueOf (tempfrom.cel_To_kelvin(tempo));
                                res.setText(result);

                        }

                    }
                    else if(selectOption_from.equals("Fahrenheit")){
                        if(selectOption_to.equals("Celsius")){
                            float tempo = Float.parseFloat(Temp_value.getText().toString());
                            tempfrom.setTemp(tempo);
                            String result =String.valueOf (tempfrom.Fer_TO_Cel(tempo));
                            res.setText(result);


                        }
                        else if (selectOption_to.equals("kelvin")){

                            float tempo = Float.parseFloat(Temp_value.getText().toString());
                            tempfrom.setTemp(tempo);
                            String result =String.valueOf (tempfrom.Fer_To_kelv(tempo));
                            res.setText(result);

                        }

                    }
                    else if(selectOption_from.equals("kelvin")){
                        if(selectOption_to.equals("Celsius")){
                            float tempo = Float.parseFloat(Temp_value.getText().toString());
                            tempfrom.setTemp(tempo);
                            String result =String.valueOf (tempfrom.kelv_To_Cel(tempo));
                            res.setText(result);


                        }
                        else if (selectOption_to.equals("Fahrenheit")){

                            float tempo = Float.parseFloat(Temp_value.getText().toString());
                            tempfrom.setTemp(tempo);
                            String result =String.valueOf (tempfrom.kelv_To_Fer(tempo));
                            res.setText(result);

                        }

                    }



                }
                else{
                    Toast.makeText(getApplicationContext(),"enter valid value",Toast.LENGTH_LONG);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}