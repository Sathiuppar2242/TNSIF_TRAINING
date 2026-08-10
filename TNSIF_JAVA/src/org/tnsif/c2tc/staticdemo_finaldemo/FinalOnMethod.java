package org.tnsif.c2tc.staticdemo_finaldemo;

class Bank {
    final void security_Rule() {
        System.out.println("Follow KYC and OTP verification");
    }
}

class SBI extends Bank {
    // Cannot override security_Rule() because it is final
}

public class FinalOnMethod {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.security_Rule();
    }
}