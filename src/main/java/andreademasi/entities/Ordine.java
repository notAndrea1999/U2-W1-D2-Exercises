package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Ordine {
    private int orderId;
    private List<ElementiMenu> menuList;
    private OrderStatus orderStatus;
    private int numeroCoperti;
    private LocalTime orderTime;
    private double total;

    public Ordine(List<ElementiMenu> menuList, int numeroCoperti, LocalTime orderTime) {
        Random rndm = new Random();
        this.orderId = rndm.nextInt(1, 100);
        this.menuList = menuList;
        this.orderStatus = OrderStatus.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.orderTime = orderTime;
        menuList.forEach(elem -> this.total = this.total + elem.getPrice());
    }
}

