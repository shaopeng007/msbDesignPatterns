package com.shaopeng.strategy.mytest;

public class PhonePortablePowerCharge implements Charge<Phone> {

    @Override
    public int toCharge(int time) {
        int battery=0;
      if (time>0&&time<=10){
          battery=10;
      }else if(time>10&&time<=30){
          battery=40;
      }else if(time>30&&time<=50) {
          battery = 70;
      }else if(time>50&&time<=70){
          battery =90 ;
      }else if (time>70){
          battery = 100;
      }
      return battery;
    }
}
