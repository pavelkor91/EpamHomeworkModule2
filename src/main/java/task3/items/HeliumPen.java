package task3.items;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Pen;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HeliumPen extends Pen{
    private String brand;
    private String heliumType;

    public HeliumPen(final double price, final String color, final String brand, final String heliumType) {
        super(price, color);
        this.brand = brand;
        this.heliumType = heliumType;
    }
}
