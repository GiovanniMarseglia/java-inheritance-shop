package org.learning.shop;

public class Headphone extends Product{
    private String color;
    private boolean cable=true;
    public Headphone(int price,int iva,String name,String color,boolean cable){
        super(price,iva,name);
        setColor(color);
        setCable(cable);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    public void fidelity(){
        if(cable){
            super.setdiscount(7);
        }else{
            super.setdiscount(2);
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ", Colore: " + color + ", Cablato: " + cable + ", prezzo base: " + getPrice() + ", prezzo con iva: " + getPriceWithIva() + "Prezzo con lo sconto: " +  ", iva: " + getIva() + ", code: " + getCode();
    }
}
