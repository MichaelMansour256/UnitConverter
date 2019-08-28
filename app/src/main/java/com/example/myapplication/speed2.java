package com.example.myapplication;

public class speed2 {
    float sped ;

    public float getSped() {
        return sped;
    }

    public void setSped(float sped) {
        this.sped = sped;
    }
    public float mps_kmph (float x)
    {
        return (float) (x*3.6);
    }
    public float mps_fps (float x)
    {
        return (float) (x*3.281);
    }
    public float mps_mph (float x)
    {
        return (float) (x*2.237);
    }
    public float kmph_mps (float x)
    {
        return (float) (x/3.6);
    }
    public float kmph_fps (float x)
    {
        return (float) (x/1.097);
    }
    public float fps_mps (float x)
    {
        return (float) (x/3.281);
    }
    public float fps_mph (float x)
    {
        return (float) (x/ 1.467);
    }
    public float fps_kmph (float x)
    {
        return (float) (x*1.097);
    }
    public float mph_mps (float x)
    {
        return (float) (x/2.237);
    }
    public float mph_fps (float x)
    {
        return (float) (x* 1.467);
    }
    public float mph_kmph (float x)
    {
        return (float) (x* 1.609);
    }
    public float kmph_mph (float x)
    {
        return (float) (x/ 1.609);
    }





}
