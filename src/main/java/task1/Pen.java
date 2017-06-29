package task1;

import lombok.*;

import javax.sound.midi.Soundbank;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Setter
@Getter
public class Pen {

    private String color;
    private double price;
    private String brand;

    public String draw(final String message){
        return message + " was written with a " + color + " " + brand;
    }
}
