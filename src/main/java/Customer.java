import behaviours.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<ISell> purchasedItems;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.purchasedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addItemToPurchasedItems(ISell item){
        this.purchasedItems.add(item);
    }

    public void removeItemFromPurchasedItems(ISell item) {
        this.purchasedItems.remove(item);
    }
}
