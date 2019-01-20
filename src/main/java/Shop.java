import Instruments.Instrument;
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;


    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

    public int getTotalNumberOfItemsInStock(){
        return stock.size();
    }

    public double getTotalPotentialProfitOfStock(){
        double total = 0.00;
        for (ISell item: stock) {
            total += item.calculateMarkup();
        }
        return total;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public double getItemPriceForSell(ISell item){
        return item.getPriceToSell();
    }

    public void sellItemToCustomer(Customer customer, ISell item){
        if (customer.getMoney() >= item.getPriceToSell()) {
            removeItemFromStock(item);
            customer.addItemToPurchasedItems(item);
            setTill(till += item.getPriceToSell());
            double money = customer.getMoney();
            customer.setMoney(money -= item.getPriceToSell());
        }
    }

    public void buyItemFromCustomer(Customer customer, ISell item){
        if (till >= item.getPriceToSell())
        addItemToStock(item);
        customer.removeItemFromPurchasedItems(item);
        setTill(till -= item.getPriceToSell());
    }

}
