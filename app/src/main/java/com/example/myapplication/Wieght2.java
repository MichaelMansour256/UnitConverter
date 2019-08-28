package com.example.myapplication;

public class Wieght2 {
    private float weigh ;

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }
    public float kilo_to_gram(float x)
    {
        return (x*1000) ;
    }
    public float gram_to_kilo(float x)
    {
        return (x/1000) ;
    }
    public float kilo_to_ton(float x)
    {
        return (x/1000) ;
    }
    public float ton_to_kilo(float x)
    {
        return (x*1000) ;
    }
    public float gram_to_ton(float x)
    {
        return (x/1000000) ;
    }
    public float ton_to_gram(float x)
    {
        return (x*1000000) ;
    }
    public float kilo_to_pound(float x)
    {
        return (float) (x*2.2046) ;
    }
    public float pound_to_kilo(float x)
    {
        return (float) (x/2.2046) ;
    }
    public float pound_to_gram(float x)
    {
        return (float) (x/2.2046*(1000)) ;
    }
    public float gram_to_pound(float x)
    {
        return (float) (x/1000*(2.2046)) ;
    }
    public float pound_to_ton(float x)
    {
        return (float) (x/2.2046/1000) ;
    }
    public float ton_to_pound(float x)
    {
        return (float) (x*1000*2.2046) ;
    }
}
