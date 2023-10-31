package andreademasi.entities;

import lombok.Getter;

@Getter
public abstract class ElementiMenu {
    private String name;
    private int Kcal;
    private double price;

    public ElementiMenu(String nome, int kcal, double price) {
        this.name = name;
        Kcal = kcal;
        this.price = price;
    }
}
