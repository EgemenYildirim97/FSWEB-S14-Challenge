package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu",price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
        super.setPrice(super.getPrice() + price);
        System.out.println("Eklenen malzeme 1: " + this.healthyExtra1Name + ", Ücreti: " + this.healthyExtra1Price + " TL.");
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
        super.setPrice(super.getPrice() + price);
        System.out.println("Eklenen malzeme 2: " + this.healthyExtra2Name + ", Ücreti: " + this.healthyExtra2Price + " TL.");
    }

    @Override
    public String getMeat() {
        return "Tofu";
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("\n" + super.getName() + " siparişiniz:");
        System.out.println("Ekmek Türü: " + super.getBreadRollType());
        System.out.println("Et Türü: " + super.getMeat());
        System.out.println("Temel Fiyat: " + (super.getPrice() - (super.getAddition1Price() + super.getAddition2Price() + super.getAddition3Price() + super.getAddition4Price() + this.healthyExtra1Price + this.healthyExtra2Price)) + " TL.");
        if (super.getAddition1Name() != null) {
            System.out.println("- " + super.getAddition1Name() + ": " + super.getAddition1Price() + " TL.");
        }
        if (super.getAddition2Name() != null) {
            System.out.println("- " + super.getAddition2Name() + ": " + super.getAddition2Price() + " TL.");
        }
        if (super.getAddition3Name() != null) {
            System.out.println("- " + super.getAddition3Name() + ": " + super.getAddition3Price() + " TL.");
        }
        if (super.getAddition4Name() != null) {
            System.out.println("- " + super.getAddition4Name() + ": " + super.getAddition4Price() + " TL.");
        }
        if (this.healthyExtra1Name != null) {
            System.out.println("- " + this.healthyExtra1Name + ": " + this.healthyExtra1Price + " TL.");
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("- " + this.healthyExtra2Name + ": " + this.healthyExtra2Price + " TL.");
        }
        System.out.println("Toplam Ücret: " + super.getPrice() + " TL.");
        return super.getPrice();
    }
}
