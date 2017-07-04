package task3;

import task2.Stationery.Stationery;
import task3.items.BallPen;
import task3.items.PaperScotch;
import task3.items.WoodenPencil;

import java.util.ArrayList;
import java.util.List;

public class StarterPack {

    public static List<Stationery> getStarterPack(){
        List<Stationery> starterPack = new ArrayList<>();
        starterPack.add(new BallPen(10.5,"blue","parker",1));
        starterPack.add(new WoodenPencil(5.5,"black","oak","M"));
        starterPack.add(new PaperScotch(8.0, 25,"staples","paper"));
        return starterPack;
    }
}
