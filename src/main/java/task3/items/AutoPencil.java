package task3.items;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Pencil;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AutoPencil extends Pencil{

    private int leadLenght;
    private String softness;

    public AutoPencil(final double price, final String color, final int leadLenght, final String softness){
        super(price,color);
        this.leadLenght = leadLenght;
        this.softness = softness;
    }
}
