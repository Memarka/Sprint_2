package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        super.isVegetarian = true;

    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_COLOR)) return Discount.RED_APPLE_DISCOUNT;
        return Discount.DEFAULT_DISCOUNT;
    }
}
