package task2.Stationery;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Pen extends Stationery{

    private String color;

    public Pen(final double price, final String color){
        super(price);
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public String draw(final String message){
        return "You draw message: " + message;
    }
}
