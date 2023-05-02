package org.example;

public class Crypto {
    public static void main(String[] args){
     SimpleText text1 = new SimpleText("Welcome to Java");
        text1.print();
     CaesarCrypto text2 = new CaesarCrypto(3);
        text2.encrypt(text1.getText());
        text2.print();
     JuliusCaesar text3 = new JuliusCaesar(3,new int[]{5,4,6,7,8});
        text3.encrypt(text1.getText());
        text3.print();
     text2.decrypt(text2.getText());
        text2.print();
     text3.decrypt(text3.getText());
        text3.print();

    }
}