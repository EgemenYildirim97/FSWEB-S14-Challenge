package org.example.models;

public class DeluxeBurger extends Hamburger{
    private final String cips;
    private final String drink;

    public DeluxeBurger(String meat, String breadRollType) {
        super("DeluxeBurger", meat, breadRollType,19.10);
        this.cips = "Curvy";
        this.drink = "COKE";
    }
    public DeluxeBurger(){
        super("DeluxeBurger",19.10);
        this.cips = "Curvy";
        this.drink = "Coke";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
