package org.example;

abstract class CaesarCipher implements Printable{
    private int key;
    private String text;

    public CaesarCipher(){
        key = 0;
    }
    public CaesarCipher(int key){
        this.key = key;
    }
    public char shiftp(char c,int key){
        return (char)(c+key);
    }
    public char shiftm(char c,int key){
        return (char)(c-key);
    }
    @Override
    public void print(){
        System.out.println(text);
    }
    abstract String encrypt(String phrase);
    abstract String decrypt(String phrase);

    public int getKey(){
        return key;
    }
    public void setKey(int key){
        this.key = key;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText(){
        return text;
    }
}