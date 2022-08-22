package com.abdullahbalikci.myapplication1;

public class Calucalted {

    private int gelenSayi1, gelenSayi2;

    public Calucalted(int gelenSayi1, int gelenSayi2){
        this.gelenSayi1=gelenSayi1;
        this.gelenSayi2=gelenSayi2;

    }

    public int toplam(){
        return gelenSayi1+gelenSayi2;
    }

    public int cikarma(){
        return gelenSayi1-gelenSayi2;
    }
    public int carpma(){
        return gelenSayi1*gelenSayi2;
    }
    public int bolme(){
        return gelenSayi1/gelenSayi2;
    }
}

