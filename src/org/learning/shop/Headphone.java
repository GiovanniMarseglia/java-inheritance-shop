package org.learning.shop;

public class Headphone extends Product{
    private String color;
    private boolean cable=true;
    public Headphone(String color,boolean cable){
        setColor(color);
        setCable(cable);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ", Colore: " + color + ", Cablato: " + cable + ", prezzo base: " + getPrice() + ", prezzo con iva: " + getPriceWithIva() + ", iva: " + getIva() + ", code: " + getCode();
    }
}
