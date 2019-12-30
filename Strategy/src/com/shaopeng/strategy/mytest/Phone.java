package com.shaopeng.strategy.mytest;

import com.shaopeng.strategy.mytest.Charge;

public class Phone {

    int state=0;

    public void charge(Charge c,int time){

        int i = c.toCharge(time);
        if ((state+i)>100) {
            this.state=100;
        }else{
            this.state=state+i;
        }

    }
}
