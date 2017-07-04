package task2.Stationery;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Stationery {

    private double price;

    protected Stationery(final double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
