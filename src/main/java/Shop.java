import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
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


}
