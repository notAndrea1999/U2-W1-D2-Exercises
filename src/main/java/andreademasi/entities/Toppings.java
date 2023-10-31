package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Toppings extends ElementiMenu {

    public Toppings(String name, int kcal, double price) {
        super(name, kcal, price);
    }

}
