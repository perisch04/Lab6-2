package org.example;

public class SimpleText implements Printable {
    private String text;

    public SimpleText(){
        text = "";
    }
    public SimpleText(String text){
        this.text = text;
    }
    String getText(){
        return text;
    }
    void setText(String text){
        this.text = text;
    }
    public void print(){
        System.out.println(text);
    }
}
