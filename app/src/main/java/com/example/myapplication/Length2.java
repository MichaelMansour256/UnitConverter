package com.example.myapplication;

public class Length2 {
    private float leng ;

    public float getLeng() {
        return leng;
    }

    public void setLeng(float leng) {
        this.leng = leng;
    }
    public float meter_to_kilo (float x)
    {
        return (x/1000) ;
    }
    public float meter_to_cm (float x)
    {
        return (x*100) ;
    }
    public float kilo_to_meter (float x)
    {
        return (x*1000) ;
    }
    public float kilo_to_cm (float x)
    {
        return (x*100000) ;
    }
    public float cm_to_meter (float x)
    {
        return (x/100) ;
    }
    public float cm_to_kilo (float x)
    {
        return (x/100000) ;
    }
    public float cm_to_mel (float x)
    {
        return (x*10) ;
    }
    public float mel_to_cm (float x)
    {
        return (x/10) ;
    }
    public float mel_to_meter (float x)
    {
        return (x/1000) ;
    }
    public float meter_to_mele (float x)
    {
        return (x*1000) ;
    }
    public float mele_to_kilo (float x)
    {
        return (x/1000000) ;
    }
    public float kilo_to_mele (float x)
    {
        return (x*1000000) ;
    }
}
