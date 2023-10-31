package andreademasi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class Pizze {
    private String name;
    private List<String> toppings;
    private int Kcal;
    private double price;

    @Override
    public String toString() {
        return "{" + name + toppings + ", " + Kcal + " Kcal" + ", " + price + "$" + "}\n";
    }
}

