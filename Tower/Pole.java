package Tower;

import java.util.*;

import Tower.Hanoi.Disc;

public class Pole {
    protected List<Disc> content = new ArrayList<Disc>();
    protected int poleNumber;

    public Pole(int poleNumber){
        this.poleNumber = poleNumber;
    }

    void add(Disc disc){
        this.content.add(disc);
    }
}
