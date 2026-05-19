package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.MochaCoffee;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMaker starbuzz = new CoffeeMaker();

        starbuzz.prepareCoffee(new MochaCoffee());

        System.out.println("********************");

        starbuzz.prepareCoffee(new CapuccinoCoffee());

        System.out.println("********************");

        starbuzz.prepareCoffee(new AmericanoCoffee());
    }
}
