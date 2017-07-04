package task2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.Stationery.Pen;
import task2.Stationery.Pencil;
import task2.Stationery.Scotch;


import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void install(){
        Pen pen = new Pen(10.5, "blue");
        Pencil pencil = new Pencil(2.5, "black");
        Scotch scotch = new Scotch(12.5, 15);
        employee = new Employee("Ivan", "Ivanov", "manager", 25, new ArrayList<>());
        employee.addStationery(pen);
        employee.addStationery(pencil);
        employee.addStationery(scotch);
    }

    @Test
    void getFullPriceTest() throws Exception{
        assertThat(employee.getFullPrice(), equalTo(25.5));
    }

}
