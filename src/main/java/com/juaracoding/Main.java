package com.juaracoding;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("my name is Andika");
        System.out.println("thanks for all, Java");
        System.out.println(" I will be develop application eginner");

        if(true){
            System.out.println("berhasil");
        }

        for(int i = 0;i<10;i++){
            System.out.println("perulangan ke "+ i);
        }
        //
        // mendeklarasikan variable yang benar
        int a;
        double b;

        //mendeklarasikan variabel dengan assignment
        int c = 10;
        //atau
        int C;
        C = 10;

        //rentang tipe data numeric
        //byte = -128 sampai 127;
        //short = -32768 sampai 32767;
        //int = -2pangkat31 sampai 2pangkat31-1
        //long = -2pangkat63 sampai 2pangkat63-1;
        //float;
        //double;

        //tipe data char
        char charA ='A';
        String stringA = "hartati";

        //casting adalah memngubah variabel menjadi bertipe data lain
        int intA= 2;
        long longA = intA;

        // variabel passing by value
        int umur = 10;
        int duplikatUmur = umur;
        System.out.println("duplikatUmur= "+duplikatUmur);
        duplikatUmur = 1000;
        System.out.println("umur  =" +umur);
        System.out.println("duplikatUmur = "+duplikatUmur);

        int ss=20;
        int dd = ss;
        ss = ss + 1;
        dd =  c + ss;
        boolean qq = true;

        System.out.println(qq);

    }
}