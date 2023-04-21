package com.universal_yazilim.bid.ysm.oop.polymorphism.program;


import com.universal_yazilim.bid.ysm.oop.polymorphism.model.entity.Fizyoterapist;
import com.universal_yazilim.bid.ysm.oop.polymorphism.model.entity.Muhasebeci;



public class Driver
{
    public static void main(String[] args)
    {


        Muhasebeci muhasebeci1 = new Muhasebeci(555555, "Umut Tugay", "Kılıç");
        muhasebeci1.isYap();

        Fizyoterapist fizyoterapist1 = new Fizyoterapist(666666, "Talia Venüs", "Kılıç");
        fizyoterapist1.isYap();




    }


}
