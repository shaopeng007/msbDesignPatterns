package com.shaopeng.strategy.mytest;

public class PhoneWiredCharge implements Charge<Phone> {

    @Override
    public int toCharge(int time) {
        int battery=0;
      if (time>0&&time<=10){
          battery=30;
      }else if(time>10&&time<=30){
          battery=70;
      }else if(time>30&&time<=50) {
          battery = 90;
      }else if(time>50){
          battery = 100;
      }
      return battery;
    }
}
