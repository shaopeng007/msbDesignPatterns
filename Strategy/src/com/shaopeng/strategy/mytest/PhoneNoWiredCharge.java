package com.shaopeng.strategy.mytest;

public class PhoneNoWiredCharge implements Charge<Phone> {

    @Override
    public int toCharge(int time) {
        int battery=0;
      if (time>0&&time<=10){
          battery=10;
      }else if(time>10&&time<=30){
          battery=30;
      }else if(time>30&&time<=50) {
          battery = 60;
      }else if(time>50&&time<=80){
          battery = 80;
      }else if(time>80 &&time<=100){
          battery = 90;
      }else if (time>100){
          battery = 100;
      }
      return battery;
    }
}
