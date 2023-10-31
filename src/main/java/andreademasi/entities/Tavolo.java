package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Tavolo {
    private int tavoloId;
    private int maxCoperti;
    private TableStaus tableStaus;

    public Tavolo(int maxCoperti, TableStaus tableStaus) {
        Random rndm = new Random();
        this.tavoloId = rndm.nextInt(1, 100);
        this.maxCoperti = maxCoperti;
        this.tableStaus = tableStaus;
    }
}
