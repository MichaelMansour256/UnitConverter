package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);
        final Spinner weight_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner weight_to =  (Spinner) findViewById(R.id.spinner_to);
        weight_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Wieght2 weightfrom = new Wieght2();
                // Temperature2 tempto = new Temperature2();
                EditText Weight_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(Weight_value.getText().toString().equals(""))) {
                    String selectOption_from = weight_from.getSelectedItem().toString();
                    String selectOption_to = weight_to.getSelectedItem().toString();
                    if (selectOption_from.equals("g")) {
                        if (selectOption_to.equals("kg")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.gram_to_kilo(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("pound")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.gram_to_pound(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("ton")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.gram_to_ton(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("kg")) {
                        if (selectOption_to.equals("g")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.kilo_to_gram(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("ton")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.kilo_to_ton(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("pound")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.kilo_to_pound(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("pound")) {
                        if (selectOption_to.equals("g")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.pound_to_gram(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("kg")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.pound_to_kilo(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("ton")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.pound_to_ton(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("ton")) {
                        if (selectOption_to.equals("g")) {
                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.ton_to_gram(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("kg")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.ton_to_kilo(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("pound")) {

                            float leng = Float.parseFloat(Weight_value.getText().toString());
                            weightfrom.setWeigh(leng);
                            String result = String.valueOf(weightfrom.ton_to_pound(leng));
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