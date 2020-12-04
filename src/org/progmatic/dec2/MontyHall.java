package org.progmatic.dec2;

import java.util.Scanner;

public class MontyHall {

    private int moneyNotChange;
    private int moneyChange;

    public static void main(String[] args) {
        MontyHall montyHall = new MontyHall();
       // montyHall.play();
        for (int i = 0; i < 100000; i++) {
            montyHall.simulationNotChange();
            montyHall.simulationChange();
        }
        System.out.println("Ennyi pénzed van: " + montyHall.moneyNotChange);
        System.out.println("Ennyi pénzed van: " + montyHall.moneyChange);
    }

    public void play() {
        int random = (int)(Math.random()*3+1);
        int door1;
        int door2;
        int door3;
        if (random == 1) {
            door1 = 1000;
            door2 = 0;
            door3 = 0;
        } else if (random == 2) {
            door1 = 0;
            door2 = 1000;
            door3 = 0;
        } else {
            door1 = 0;
            door2 = 0;
            door3 = 1000;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Válasszz egy ajtót: ");
        int chosenDoor = sc.nextInt();
        int price = 0;
        if (chosenDoor == 1) {
            price = door1;
            if (door2 == 0) {
                System.out.println("Második ajtó üres");
            } else {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 2) {
            price = door2;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 3) {
            price = door3;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else {
                System.out.println("Második ajtó üres");
            }
        }
        System.out.println("Szeretnél ajtót cserélni?");
        sc = new Scanner(System.in);
        String change = sc.nextLine().toLowerCase();
        if (change.equals("nem")) {
            System.out.println("Ajtód mögött ennyi pénz van: " + price);
        } else {
            if (price == 0) {
                System.out.println("Ajtód mögött ennyi pénz van: 1000");
            } else {
                System.out.println("Ajtód mögött ennyi pénz van: 0");
            }
        }
        sc.close();
    }

    public void simulationNotChange() {
        int random = (int)(Math.random()*3+1);
        int door1;
        int door2;
        int door3;
        if (random == 1) {
            door1 = 1000;
            door2 = 0;
            door3 = 0;
        } else if (random == 2) {
            door1 = 0;
            door2 = 1000;
            door3 = 0;
        } else {
            door1 = 0;
            door2 = 0;
            door3 = 1000;
        }
        int chosenDoor = (int)(Math.random()*3+1);
        int price = 0;
        if (chosenDoor == 1) {
            price = door1;
            if (door2 == 0) {
                System.out.println("Második ajtó üres");
            } else if (door3 == 0) {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 2) {
            price = door2;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else if (door3 == 0) {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 3) {
            price = door3;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else if (door2 == 0) {
                System.out.println("Második ajtó üres");
            }
        }
        System.out.println("Ajtód mögött ennyi pénz van: " + price);
        moneyNotChange += price;
    }

    public void simulationChange() {
        int random = (int)(Math.random()*3+1);
        int door1;
        int door2;
        int door3;
        if (random == 1) {
            door1 = 1000;
            door2 = 0;
            door3 = 0;
        } else if (random == 2) {
            door1 = 0;
            door2 = 1000;
            door3 = 0;
        } else {
            door1 = 0;
            door2 = 0;
            door3 = 1000;
        }
        int chosenDoor = (int)(Math.random()*3+1);
        int price = 0;
        if (chosenDoor == 1) {
            price = door1;
            if (door2 == 0) {
                System.out.println("Második ajtó üres");
            } else if (door3 == 0) {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 2) {
            price = door2;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else if (door3 == 0) {
                System.out.println("Harmadik ajtó üres");
            }
        } else if (chosenDoor == 3) {
            price = door3;
            if (door1 == 0) {
                System.out.println("Első ajtó üres");
            } else if (door2 == 0) {
                System.out.println("Második ajtó üres");
            }
        }
        if (price == 0) {
            System.out.println("Ajtód mögött ennyi pénz van: 1000");
            moneyChange += 1000;
        } else {
            System.out.println("Ajtód mögött ennyi pénz van: 0");
        }
    }
}
