package task3.items;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Scotch;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlasticScotch extends Scotch{
    private String brand;
    private String scotchColor;

    public PlasticScotch(final double price, final int width, final String brand, final String scotchColor) {
        super(price,width);
        this.brand = brand;
        this.scotchColor = scotchColor;
    }
}
