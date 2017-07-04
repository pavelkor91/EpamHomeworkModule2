package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import task2.Stationery.Stationery;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Employee {

    private String name;
    private String lastName;
    private String position;
    private int age;
    private List<Stationery> stationeries;

    public void addStationery(final Stationery stationery) {
        stationeries.add(stationery);
    }
    public Double getFullPrice(){
        return stationeries.stream()
                .mapToDouble(o -> o.getPrice())
                .sum();
    }
}
