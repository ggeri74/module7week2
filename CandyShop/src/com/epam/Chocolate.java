package com.epam;

public class Chocolate extends Gifts {
    private enum ChoclateType {DARK,MILK,WHITE};
    private ChoclateType type = ChoclateType.MILK;


    public Chocolate() {
        super("Milk Chocolate",210);
    }

    public Chocolate(String name, int price, int quantity, ChoclateType type) {
        super(name,price,quantity);
        this.type = type;
    }

    @Override
    public String getSpecialParameter() {
        return String.valueOf(type);
    }
}
