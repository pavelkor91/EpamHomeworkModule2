package task2.Stationery;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Scotch extends Stationery{

    private int width;

    public Scotch(final double price, final int width){
        super(price);
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void gluedSmth(){
        System.out.println("I glued something");
    }
}
