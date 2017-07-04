package task3;


import org.junit.jupiter.api.Test;
import task2.Stationery.Stationery;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StarterPackTest {

    @Test
    void getStarterPack() {
        List<Stationery> beginnerEmployeePack = StarterPack.getStarterPack();
        assertThat(beginnerEmployeePack.get(0).getPrice(), equalTo(10.5));
        assertThat(beginnerEmployeePack.get(1).getPrice(), equalTo(5.5));
        assertThat(beginnerEmployeePack.get(2).getPrice(), equalTo(8.0));
    }
}
