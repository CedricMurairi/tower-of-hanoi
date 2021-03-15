package Tower;

// Authors: Cedric Murairi
// This code simulate the tower of Hanoi problem and solution

// Take an example for 2 disks :
// Let pole 1 = 'A', pole 2 = 'B', pole 3 = 'C'.

// Step 1 : Shift first disk from 'A' to 'B'.
// Step 2 : Shift second disk from 'A' to 'C'.
// Step 3 : Shift first disk from 'B' to 'C'.

// The pattern here is :
// Shift 'n-1' disks from 'A' to 'B'.
// Shift last disk from 'A' to 'C'.
// Shift 'n-1' disks from 'B' to 'C'.

// The logic below can be implemented in Java as follow

public class Hanoi {

  public enum Disc{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN
  }

  static void move(int discs, Pole from, Pole mid, Pole to){
    if (discs == 1){
        System.out.println("Moves " + from.content.get(from.content.size() - 1)+ " from pole " + from.poleNumber + " to pole" + to.poleNumber);
        to.content.add(from.content.remove(from.content.size() - 1));
        return;
    }
    else{
        move(discs - 1, from, to, mid);
        System.out.println("Moves " + from.content.get(from.content.size() - 1) + " from pole " + from.poleNumber + " to pole " + to.poleNumber);
        to.add(from.content.remove(from.content.size() - 1));
        move(discs -1, mid, from, to);
    }
  }

  public static void main(String[] args) {
    Pole poleOne = new Pole(1);
    Pole poleTwo = new Pole(2);
    Pole poleThree = new Pole(3);

    // poleOne.add(Disc.TEN);
    // poleOne.add(Disc.NINE);
    // poleOne.add(Disc.EIGHT);
    // poleOne.add(Disc.SEVEN);
    // poleOne.add(Disc.SIX);
    poleOne.add(Disc.FIVE);
    poleOne.add(Disc.FOUR);
    poleOne.add(Disc.THREE);
    poleOne.add(Disc.TWO);
    poleOne.add(Disc.ONE);

    System.out.println("Pole Three: " + poleThree.content);
    System.out.println("Pole Two: " + poleTwo.content);
    System.out.println("Pole One: " + poleOne.content);

    move(poleOne.content.size(), poleOne, poleTwo, poleThree);

    System.out.println("Pole Three: " + poleThree.content);
    System.out.println("Pole Two: " + poleTwo.content);
    System.out.println("Pole One: " + poleOne.content);
  }
}
