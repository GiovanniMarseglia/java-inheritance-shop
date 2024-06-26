package org.learning.shop;

public class Tv extends Product{
    private int size;
    private boolean smart=true;
    public Tv(int price,int iva,String name,int size,boolean smart){
        super(price,iva,name);
        setSize(size);
        setCable(smart);

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCable(boolean smart) {
        this.smart = smart;
    }

    public void fidelity(){
        if (smart){
            super.setdiscount(2);
        }else{
            super.setdiscount(10);
        }
    }

    @Override
    public String toString() {

        return "Nome: " + getName() + ", Dimensioni: " + size + ", smart: " + smart + ", prezzo base: " + getPrice() + ", prezzo con iva: " + getPriceWithIva() + ", iva: " + getIva() + ", code: " + getCode();
    }
}
