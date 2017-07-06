package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

public class SortingTest {

    private List<ListForSort> unsorted;
    private List<ListForSort> sortByPrice;
    private List<ListForSort> sortByName;
    private List<ListForSort> sortByPriceAndName;


    @BeforeEach
    void install(){

        unsorted = new ArrayList<>();
        unsorted.add(new ListForSort(25,"abc"));
        unsorted.add(new ListForSort(65,"asc"));
        unsorted.add(new ListForSort(5, "aaa"));
        unsorted.add(new ListForSort(5, "aab"));

        sortByPrice = new ArrayList<>();
        sortByPrice.add(unsorted.get(2));
        sortByPrice.add(unsorted.get(3));
        sortByPrice.add(unsorted.get(0));
        sortByPrice.add(unsorted.get(1));

        sortByName = new ArrayList<>();
        sortByName.add(unsorted.get(2));
        sortByName.add(unsorted.get(3));
        sortByName.add(unsorted.get(0));
        sortByName.add(unsorted.get(1));

        sortByPriceAndName = new ArrayList<>();
        sortByPriceAndName.add(unsorted.get(2));
        sortByPriceAndName.add(unsorted.get(3));
        sortByPriceAndName.add(unsorted.get(0));
        sortByPriceAndName.add(unsorted.get(1));

    }

    @Test
    void testSortPrice(){
        CustomCoparator customCoparator = new CustomCoparator();
        customCoparator.setSortingBy(CustomCoparator.Order.Price);
        unsorted.sort(customCoparator);
        assertThat(unsorted.equals(sortByPrice), equalTo(true));
    }

    @Test
    void testSortName(){
        CustomCoparator customCoparator = new CustomCoparator();
        customCoparator.setSortingBy(CustomCoparator.Order.Name);
        unsorted.sort(customCoparator);
        assertThat(unsorted.equals(sortByName), equalTo(true));
    }

    @Test
    void testSortPriceAndName(){
        CustomCoparator customCoparator = new CustomCoparator();
        customCoparator.setSortingBy(CustomCoparator.Order.Price);
        CustomCoparator customCoparator1 = new CustomCoparator();
        customCoparator1.setSortingBy(CustomCoparator.Order.Name);
        unsorted.sort(customCoparator.thenComparing(customCoparator1));
        assertThat(unsorted.equals(sortByPrice), equalTo(true));
    }

}
