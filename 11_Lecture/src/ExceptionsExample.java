package Exceptions;
public class ExceptionsExample {

    public static void main(String[] args) throws Exception {
        int temperature = 67;
        CoffeeCup cup = new CoffeeCup();
        cup.setTemperature(temperature); 

        //App human = new App();
        //human.drinkCoffee(cup);

        VirtualPerson june = new VirtualPerson();
        june.serveCustomer(cup);

    }
}
