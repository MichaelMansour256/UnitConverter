package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class currency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currancy);

        final Spinner currency_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner currency_to =  (Spinner) findViewById(R.id.spinner_to);
        currency_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                currency2 currencyfrom = new currency2();
                // Temperature2 tempto = new Temperature2();
                EditText Weight_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(Weight_value.getText().toString().equals(""))) {
                    String selectOption_from = currency_from.getSelectedItem().toString();
                    String selectOption_to = currency_to.getSelectedItem().toString();
                    if (selectOption_from.equals("egy pound")) {
                        if (selectOption_to.equals("usd")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.egypound_to_doler(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("Euro")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.egypound_to_euro(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("Saudi riyal")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.egypound_to_Saudiriyal(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("Saudi riyal")) {
                        if (selectOption_to.equals("egy pound")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.Saudiriyal_to_egypound(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("usd")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.Saudiriyal_to_doler(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("Euro")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.Saudiriyal_to_euro(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("usd")) {
                        if (selectOption_to.equals("Saudi riyal")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.doler_to_saudiriyal(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("egy pound")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.doler_to_egypound(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("Euro")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.doler_to_euro(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("Euro")) {
                        if (selectOption_to.equals("usd")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.egypound_to_doler(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("Saudi riyal")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.egypound_to_Saudiriyal(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("egy pound")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            currencyfrom.setCurr(leng);
                            String result = String.valueOf(currencyfrom.euro_to_egypound(leng));
                            res.setText(result);

                        }
                    }


                } else {
                    Toast.makeText(getApplicationContext(), "enter valid value", Toast.LENGTH_LONG);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}