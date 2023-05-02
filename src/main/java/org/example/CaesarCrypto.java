package org.example;

public class CaesarCrypto extends CaesarCipher{
    public CaesarCrypto(){
        setKey(0);
    }
    public CaesarCrypto(int key){
        setKey(key);
    }
    String encrypt(String phrase){
        String newPhrase= "";
        for (char c:phrase.toCharArray()){
            newPhrase += super.shiftp(c,this.getKey());
        }
        super.setText(newPhrase);
        return newPhrase;
    }
    String decrypt(String phrase){
        String newPhrase= "";
        for (char c:phrase.toCharArray()){
            newPhrase += super.shiftm(c,this.getKey());
            super.setText(newPhrase);
        }
        return newPhrase;
    }
}
