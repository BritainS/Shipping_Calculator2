package com.nellyville.shippingcalculator;

public class ShipItem {
    Double weight;
    static final Double BASE = 3.00;
    static final Double ADDED = 0.50;
    static final Double EXTRA = 4.00;
    static final int BASE_WEIGHT = 16;
    static final int EXTRA_WEIGHT = 30;

    public ShipItem(){weight = 0.0;}

    public ShipItem(Double weight){this.weight = weight;}

    public Double getBaseCost(){
       if(weight > BASE_WEIGHT) return EXTRA;
       return BASE;

    }

    public void setWeight(Double weight){this.weight = weight;}

    public Double getAddedCost(){
        if(weight>BASE_WEIGHT){
           Double overage = Math.ceil((weight - BASE_WEIGHT) / 4);
           return overage = ADDED;

        }
        return 0.0;
    }
    public Double getTotalCost(){return getBaseCost() + getAddedCost();}
}
