package task3.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Scotch;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PaperScotch extends Scotch{

    private String brand;
    private String paperType;

    public PaperScotch(final double price, final int width, final String brand, final String paperType) {
        super(price, width);
        this.brand = brand;
        this.paperType = paperType;
    }
}
