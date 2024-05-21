package org.learning.shop;

public class Smartphone extends Product{
    private int imei;
    private int memory;

    public Smartphone(int price,int iva,String name,int imei,int memory){
        super(price,iva,name);
        setImei(imei);
        setMemory(memory);
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void fidelity(){
        if(memory<=32){
            super.setdiscount(5);
        }else{
            super.setdiscount(2);
        }
    }

    @Override
    public String toString() {

        return "Nome: " + getName() + ", IMEI: " + imei + ", memory: " + memory + ", prezzo base: " + getPrice() + ", prezzo con iva: " + getPriceWithIva() + ", iva: " + getIva() + ", code: " + getCode();
    }

}
