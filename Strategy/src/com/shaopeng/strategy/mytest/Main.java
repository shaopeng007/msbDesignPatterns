package com.shaopeng.strategy.mytest;

public class Main {

    public static void main(String[] args) {
        Phone NewPhone1 = new Phone();
        Phone NewPhone2 = new Phone();
        Phone NewPhone3 = new Phone();
        NewPhone1.charge(new PhoneWiredCharge(),30);
        NewPhone2.charge(new PhoneNoWiredCharge(),30);
        NewPhone3.charge(new PhonePortablePowerCharge(),30);
        System.out.println(NewPhone1.state);
        System.out.println(NewPhone2.state);
        System.out.println(NewPhone3.state);

        /*System.out.println(MyNewPhone.state);

        MyNewPhone.charge(new PhoneNoWiredCharge(),30);

        System.out.println(MyNewPhone.state);

        MyNewPhone.charge(new PhonePortablePowerCharge(),30);

        System.out.println(MyNewPhone.state);
        MyNewPhone.charge(new PhonePortablePowerCharge(),30);
        System.out.println(MyNewPhone.state);*/


    }
}
