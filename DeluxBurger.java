package OOP.GroßeAnwendung.Bill_Anwendung_Hamburger;

public class DeluxBurger extends Burger{
      Item delux1;
      Item delux2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (delux1 != null) {
            delux1.printItem();
        }
        if (delux2 != null) {
            delux2.printItem();
        }
    }
    public void addToppings(String extra1, String extra2,
                            String extra3 , String extra4 , String extra5) {
        super.addToppings(extra1, extra2, extra3);
        delux1 = new Item("TOPPING",extra4,0);
        delux2 = new Item("TOPPING",extra5,0);
    }

    @Override
    public double getExtraPreis(String toppingName) {
        return 0;
    }
}
