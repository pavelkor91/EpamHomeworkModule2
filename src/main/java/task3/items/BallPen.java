package task3.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Pen;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BallPen extends Pen{

    private String brand;
    private int ballWidth;

    public BallPen(final double price, final String color, final String brand, final int ballWidth){
        super(price,color);
        this.brand = brand;
        this.ballWidth = ballWidth;
    }

}
