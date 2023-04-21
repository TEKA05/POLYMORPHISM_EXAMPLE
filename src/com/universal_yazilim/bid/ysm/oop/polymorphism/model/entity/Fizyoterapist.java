package com.universal_yazilim.bid.ysm.oop.polymorphism.model.entity;

public class Fizyoterapist extends Calisan
{

    public Fizyoterapist(int calisanID, String ad, String soyad) {
        super(calisanID, ad, soyad);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void isYap()
    {
        System.out.println("Tedavi programi uygulaniyor.");
    }


}
