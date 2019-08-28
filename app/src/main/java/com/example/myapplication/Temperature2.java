package com.example.myapplication;

public class Temperature2 {
    private float temp ;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float Fer_TO_Cel (float x)
    {
        return (x-32)*(5/9) ;
    }
    public float kelv_To_Cel (float x)
    {
        return (float) (x-273.15) ;
    }

    public float Cel_To_Fer (float x)
    {
        return (x*9/5)+32 ;
    }
    public float kelv_To_Fer (float x)
    {
        return (float) ((1.8*x)-459.67) ;
    }

    public float cel_To_kelvin (float x)
    {
        return (float) (x+237.15) ;
    }
    public float Fer_To_kelv (float x)
    {
        return (float) ((x+459.67)/1.8) ;
    }
}
