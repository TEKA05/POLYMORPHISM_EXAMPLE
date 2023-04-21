package com.universal_yazilim.bid.ysm.oop.polymorphism.model.entity;

import com.universal_yazilim.bid.ysm.utility.Util;



public class Calisan  extends  Object
{

    public int calisanID;
    public String ad;
    public String soyad;

    public Calisan(int calisanID, String ad, String soyad)
    {
        super();
        this.calisanID = calisanID;
        this.ad = ad;
        this.soyad = soyad;
    }

    public Calisan(int calisanID)
    {
        this.calisanID = calisanID;
    }

    public void isYap()
    {
        System.out.println("iş yapılıyor.");
    }
}

