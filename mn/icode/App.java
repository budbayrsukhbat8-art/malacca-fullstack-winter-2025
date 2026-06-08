package mn.icode;

import javax.xml.transform.TransformerFactory;

/**
 * Hello world!
 *
 */

abstract class Vehicle {
    abstract void printInfo();
}
class BigVehicle {
    boolean isBig(){
        return false;
    }
}

class Motorrad extends Vehicle {
    @Override
    void printInfo(){
        System.out.println("I'm a Tractor");
    }
}

public class App {
    public static void main(String[] args) {
        Motorrad rad = new Motorrad();
        rad.printInfo();
        Tractor tractor = new Tractor();

        tractor.printInfo();
    }
}
