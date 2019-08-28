package com.example.myapplication;

public class timeZone2 {
    private float tim ;

    public float getTim() {
        return tim;
    }

    public void setTim(float tim) {
        this.tim = tim;
    }
    public float egy_to_mexico (float x)
    {
        if (x-7>0)
            return  (x-7) ;
        else
            return  (x-7+12) ;

    }
    public float egy_to_suadia (float x)
    {
        if (x+1<=12)
            return (x+1) ;
        else
            return (x+1-12) ;
    }
    public float suadia_to_egy (float x)
    {
        if (x-1>12)
            return (x-1) ;
        else
            return (x-1+12) ;
    }
    public float egy_to_tokyo (float x)
    {
        if (x-5 > 0 )
            return (x-5) ;
        else
            return (x-5+12) ;
    }
    public float mexico_to_egy (float x)
    {
        if (x+7<=12)
            return (x+7) ;
        else
            return (x+7-12) ;
    }
    public float mexico_to_saudia (float x)
    {
        if (x+7+1<=12)
            return (x+7+1) ;
        else
            return (x+7+1-12) ;
    }
    public float mexico_to_tokyo (float x)
    {
        if (x+7-5<=12)
            return (x+7-5) ;
        else
            return (x+7-5-12) ;
    }
    public float sauida_to_mixico (float x)
    {
        if (x-1-7>0)
            return (x-1-7) ;
        else
            return (x-1-7+12) ;
    }
    public float sauida_to_tokyo (float x)
    {
        if (x-1-5>12)
            return (x-1-5) ;
        else
            return (x-1-5+12) ;
    }
    public float tokyo_to_mixico (float x)
    {
        if (x+5-7>0)
            return (x+5-7) ;
        else
            return (x+5-7+12) ;
    }
    public float tokyo_to_egy (float x)
    {
        if (x+5>=12)
            return (x+5) ;
        else
            return (x+5-12) ;
    }
    public float tokyo_to_saudia (float x)
    {
        if (x+5+1>=12)
            return (x+5+1) ;
        else
            return (x+5+1-12) ;
    }

}
