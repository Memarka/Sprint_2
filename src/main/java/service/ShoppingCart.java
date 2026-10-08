package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {

        this.items = items;
    }
    // 1. Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double itemPrice = item.getAmount() * item.getPrice();
            total = total + itemPrice;
        }
        return total;
    }

    // 2. Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double price = item.getAmount() * item.getPrice();

            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                double discountPercent = discountItem.getDiscount();
                price = price - (price * discountPercent / 100.0);
            }
            total = total + price;
        }
        return total;
    }

    // 3. Сумма всех вегетарианских продуктов без скидки
    public double getTotalVegetarianPrice() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            if (item.isVegetarian()) {
                double itemPrice = item.getAmount() * item.getPrice();
                total = total + itemPrice;
            }
        }
        return total;
    }

}
