package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Hamburger(String name,String meat, double price, String breadRollType) {
        this.name = name;
        this.meat=meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger " + this.breadRollType + " ekmeği ile, " + this.meat + " seçeneğiyle hazırlanıyor. Fiyatı: " + this.price + " TL.");
    }

    public Hamburger() {

    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
        System.out.println("Eklenen malzeme 1: " + this.addition1Name + ", Ücreti: " + this.addition1Price + " TL.");
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
        System.out.println("Eklenen malzeme 2: " + this.addition2Name + ", Ücreti: " + this.addition2Price + " TL.");
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
        System.out.println("Eklenen malzeme 3: " + this.addition3Name + ", Ücreti: " + this.addition3Price + " TL.");
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
        System.out.println("Eklenen malzeme 4: " + this.addition4Name + ", Ücreti: " + this.addition4Price + " TL.");
    }
    public double itemizeHamburger() {
        System.out.println("\n" + this.name + " siparişiniz:");
        System.out.println("Ekmek Türü: " + this.breadRollType);
        System.out.println("Et Türü: " + this.meat);
        System.out.println("Temel Fiyat: " + (this.price - (this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price)) + " TL.");
        if (this.addition1Name != null) {
            System.out.println("- " + this.addition1Name + ": " + this.addition1Price + " TL.");
        }
        if (this.addition2Name != null) {
            System.out.println("- " + this.addition2Name + ": " + this.addition2Price + " TL.");
        }
        if (this.addition3Name != null) {
            System.out.println("- " + this.addition3Name + ": " + this.addition3Price + " TL.");
        }
        if (this.addition4Name != null) {
            System.out.println("- " + this.addition4Name + ": " + this.addition4Price + " TL.");
        }
        System.out.println("Toplam Ücret: " + this.price + " TL.");
        return this.price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
