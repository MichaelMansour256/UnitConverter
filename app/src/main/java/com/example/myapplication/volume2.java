package com.example.myapplication;

public class volume2 {
    private float vol ;

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }
    public float cm_to_meter (float x)
    {
        return (x/(100^3)) ;
    }
    public float meter_to_cm (float x)
    {
        return  (x*(100^3));
    }
    public float cm_to_kilo (float x)
    {
        return (x/(100000^3));
    }
    public float kilo_to_cm (float x)
    {
        return (x*(100000^3));
    }
    public float meter_to_kilo (float x)
    {
        return (x/(1000^3)) ;
    }
    public float kilo_to_meter (float x)
    {
        return (x*(1000^3)) ;
    }
    public float mm_to_cm (float x)
    {
        return (x/(10^3)) ;
    }
    public float meter_to_mm (float x)
    {
        return (x*(1000^3)) ;
    }
    public float kilo_to_mm (float x)
    {
        return (x*(1000000^3)) ;
    }
    public float cm_to_mm (float x)
    {
        return (x*(10^3)) ;
    }
    public float mm_to_meter (float x)
    {
        return (x/(1000^3)) ;
    }
    public float mm_to_kilo (float x)
    {
        return (x/(1000000^3)) ;
    }

}
