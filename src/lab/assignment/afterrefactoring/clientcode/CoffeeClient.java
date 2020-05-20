package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.MochaCoffee;


public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new AmericanoCoffee();

        //using template method
        coffeeType.brewCoffee();
        System.out.println("************");

        coffeeType = new MochaCoffee();
        coffeeType.brewCoffee();

        System.out.println("************");

        coffeeType = new CapuccinoCoffee();
        coffeeType.brewCoffee();
    }

}
