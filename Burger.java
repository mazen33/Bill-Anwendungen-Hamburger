package OOP.GroßeAnwendung.Bill_Anwendung_Hamburger;
//werden wir mehr über so genannte Container lernen, mit denen man die gleiche Art von Elementen gruppieren kann.
// Anstatt drei Attribute wie hier zu haben,
// könnten wir also einen Container mit zusätzlichen Toppings haben,
public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }
    @Override
    public String getName() {
        return super.getName() + " Burger";
    }
    @Override
    public double getAdjustPreis() {
        return getBasePrice() +
                ((extra1 == null)? 0 : extra1.getAdjustPreis()) +
                ((extra2 == null)? 0 : extra2.getAdjustPreis()) +
                ((extra3 == null)? 0 : extra3.getAdjustPreis());
    }
    public double getExtraPreis(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO","CHEESE" -> 1.0;
            case "BACON","HAM","SALAMI" ->1.5;
            default -> 0.0;
        };
    }
    public void addToppings(String extra1,String extra2,String extra3){
        this.extra1 = new Item("TOPPING",extra1,getExtraPreis(extra1));
        this.extra2 = new Item("TOPPING",extra2,getExtraPreis(extra2));
        this.extra3 = new Item("TOPPING",extra3,getExtraPreis(extra3));
    }
    public void printItemizedList(){
        printItem("BASE REGULAR",getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }
    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
