package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Length extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);
        final Spinner length_from =  (Spinner) findViewById(R.id.spinner_from);
        final Spinner length_to =  (Spinner) findViewById(R.id.spinner_to);
        length_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Length2 lengthfrom = new Length2();
                // Temperature2 tempto = new Temperature2();
                EditText Length_value = findViewById(R.id.editText);
                TextView res = findViewById(R.id.res);

                if (!(Length_value.getText().toString().equals(""))) {
                    String selectOption_from = length_from.getSelectedItem().toString();
                    String selectOption_to = length_to.getSelectedItem().toString();
                    if (selectOption_from.equals("cm")) {
                        if (selectOption_to.equals("m")) {
                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.cm_to_meter(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("km")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.cm_to_kilo(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("mel")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.cm_to_mel(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("mel")) {
                        if (selectOption_to.equals("cm")) {
                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.mel_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("m")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.mel_to_meter(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("km")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.mele_to_kilo(leng));
                            res.setText(result);

                        }

                    } else if (selectOption_from.equals("m")) {
                        if (selectOption_to.equals("cm")) {
                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.meter_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("km")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.meter_to_kilo(leng));
                            res.setText(result);

                        }
                        else if (selectOption_to.equals("mel")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.meter_to_mele(leng));
                            res.setText(result);

                        }

                    }
                    else if (selectOption_from.equals("km")) {
                        if (selectOption_to.equals("cm")) {
                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.kilo_to_cm(leng));
                            res.setText(result);


                        } else if (selectOption_to.equals("m")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.kilo_to_meter(leng));
                            res.setText(result);

                        } else if (selectOption_to.equals("mel")) {

                            float leng = Float.parseFloat(Length_value.getText().toString());
                            lengthfrom.setLeng(leng);
                            String result = String.valueOf(lengthfrom.kilo_to_mele(leng));
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