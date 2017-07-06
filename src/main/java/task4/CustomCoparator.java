package task4;


import java.util.Comparator;

import static task4.CustomCoparator.Order.Price;

public class CustomCoparator implements Comparator<ListForSort>{
    public enum Order{Price, Name}

    private Order sortBy = Price;
    @Override
    public int compare(ListForSort o1, ListForSort o2) {
        switch(sortBy) {
            case Name: return o1.getName().compareTo(o2.getName());
            case Price: return Double.compare(o1.getPrice(), o2.getPrice());
        }
        throw new RuntimeException("Practically unreachable code, can't be thrown");
    }

    public void setSortingBy(Order sortBy) {
        this.sortBy = sortBy;
    }

}
