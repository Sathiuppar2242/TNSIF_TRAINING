package org.tnsif.c2tc.staticdemo_finaldemo;

final class AadharGenerator {
    void generateId() {
        System.out.println("Generated aadhar ID");
    }
}

// This is not allowed because AadharGenerator is final
// class Myaadhar extends AadharGenerator {
// }

public class FinalOnClass {

    public static void main(String[] args) {
        AadharGenerator aadhar = new AadharGenerator();
        aadhar.generateId();
    }
}