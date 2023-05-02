package org.example;

public class JuliusCaesar extends CaesarCrypto{
    private int[] shift;
    public JuliusCaesar(){
        super(0);
        this.shift = new int[]{0};
    }
    public JuliusCaesar(int key,int[] shift){
        super(key);
        this.shift = shift;
    }
    public  String encrypt(String phrase){
        phrase = super.encrypt(phrase);
        String newPhrase= "";
        int j=0;
        for (char c:phrase.toCharArray()){
            newPhrase += shiftp(c,this.shift[j]);
            j = (j + 1) % shift.length;
        }
        super.setText(newPhrase);
        return newPhrase;
    }
    public  String decrypt(String phrase){
        phrase = super.decrypt(phrase);
        String newPhrase= "";
        int j=0;
        for (char c:phrase.toCharArray()){
            newPhrase += shiftm(c,this.shift[j]);
            j = (j + 1) % shift.length;
        }
        super.setText(newPhrase);
        return newPhrase;
    }
}
