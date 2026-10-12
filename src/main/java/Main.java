import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main( String[] args ) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED_COLOR);
        Food appleGreen = new Apple(8, 60, Colour.GREEN_COLOR);

    Food[] products = {meat, appleRed, appleGreen};

    ShoppingCart cart = new ShoppingCart(products);

    double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
    System.out.printf("Общая сумма без скидки: %.2f%n", totalWithoutDiscount);

    double totalWithDiscount = cart.getTotalPriceWithDiscount();
    System.out.printf("Общая сумма со скидкой: %.2f%n", totalWithDiscount);

    double vegetarianTotal = cart.getTotalVegetarianPrice();
    System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n", vegetarianTotal);


    }

}
