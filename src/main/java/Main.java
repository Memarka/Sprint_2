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
    System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);

    double totalWithDiscount = cart.getTotalPriceWithDiscount();
    System.out.println("Общая сумма со скидкой: " + totalWithDiscount);

    double vegetarianTotal = cart.getTotalVegetarianPrice();
    System.out.println("Сумма вегетарианских продуктов без скидки: " + vegetarianTotal);


    }

}
