package OOP.GroßeAnwendung.Bill_Anwendung_Hamburger;

public class Main {
    public static void main(String[] args) {
    Item coke = new Item("drink","coke",1.50);
    coke.printItem();
    coke.setSize("LARGE");
    coke.printItem();

    Item avacado = new Item("Topping","avocado",1.50);
    avacado.printItem();
    System.out.println("-".repeat(30));

    Burger burger = new Burger("regular",4.00);
    burger.addToppings("BACON","CHEESE","MAYO");
    burger.printItem();
    System.out.println("-".repeat(30));

    MealOrder mealOrder = new MealOrder();
    mealOrder.addBurgerTopping("BACON","CHEESE","Katchap");
    mealOrder.setDrinkSize("LARGE");
    mealOrder.printItemizedList();
    System.out.println("-".repeat(30));

    MealOrder secondOrder = new MealOrder("turkey","7-up","chili");
    secondOrder.addBurgerTopping("LETTUCE","CHEESE","MAYO");
    secondOrder.setDrinkSize("SMALL");
    secondOrder.printItemizedList();
    System.out.println("-".repeat(30));

    MealOrder deluxMeal = new MealOrder("deluxe","7-up","chili");
    deluxMeal.addBurgerTopping("AVOCADO","CHEESE","Mayo","BACON","LETTUCE");
    deluxMeal.setDrinkSize("LARGE");
    deluxMeal.printItemizedList();
    }
}
