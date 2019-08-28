package com.example.myapplication;

public class currency2 {
    private float curr ;

    public float getCurr() {
        return curr;
    }

    public void setCurr(float curr) {
        this.curr = curr;
    }
    public float egypound_to_euro(float x)
    {
        return (x/20) ;
    }
    public float euro_to_egypound(float x)
    {
        return (x*20) ;
    }
    public float egypound_to_doler(float x)
    {
        return (x/18) ;
    }
    public float doler_to_egypound(float x)
    {
        return (x*18) ;
    }
    public float egypound_to_Saudiriyal(float x)
    {
        return (x/5) ;
    }
    public float Saudiriyal_to_egypound(float x)
    {
        return (x*5) ;
    }
    public float doler_to_euro(float x)
    {
        return (x*18/(20)) ;
    }
    public float euro_to_doler(float x)
    {
        return (x*20/(18)) ;
    }
    public float doler_to_saudiriyal(float x)
    {
        return (x*18/(5)) ;
    }
    public float Saudiriyal_to_doler(float x)
    {
        return (x*5/(18)) ;
    }
    public float Saudiriyal_to_euro(float x)
    {
        return (x*5/(20)) ;
    }
    public float euro_to_Saudiriyal(float x)
    {
        return (x*20/(5)) ;
    }
}
