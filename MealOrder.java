package OOP.GroßeAnwendung.Bill_Anwendung_Hamburger;

// Kompisation
public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;   // Z.B. Pommes oder KartoffelSalat

    public MealOrder(){
        this("regular", "coke","fries");
    }
    public MealOrder(String burgerType, String drinkType , String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
            this.drink = new Item("drink", drinkType, 1.00);
            this.side = new Item("side", sideType, 1.50);
     }
    public double getTotalPrice(){
        if (burger instanceof DeluxBurger) {
            return burger.getAdjustPreis();
        }
        return side.getAdjustPreis() + drink.getAdjustPreis() + burger.getAdjustPreis();
    }
    public void printItemizedList(){
        burger.printItem();
        if (burger instanceof DeluxBurger) {
            Item.printItem(drink.getName(),0);
            Item.printItem(side.getName(),0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE" , getTotalPrice());
    }
    public void addBurgerTopping(String extra1, String extra2, String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }
    public void addBurgerTopping(String extra1, String extra2, String extra3 , String extra4 , String extra5) {
        if (burger instanceof DeluxBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }

}
