package task3.items;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import task2.Stationery.Pencil;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class WoodenPencil extends Pencil {

    private String typeOfWood;
    private String softness;

    public WoodenPencil(final double price, final String color, final String typeOfWood, final String softness){
        super(price,color);
        this.typeOfWood = typeOfWood;
        this.softness = softness;
    }
}
