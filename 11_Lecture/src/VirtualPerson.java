package Exceptions;
public class VirtualPerson {
	
	private static final int tooCold = 65;
	private static final int tooHot = 85;

	public void serveCustomer(CoffeeCup cup){
		int temperature = cup.getTemperature();

		try {
			if (temperature < tooCold){
				throw new TooColdExceptions();
			}else if (temperature > tooHot){
				throw new TooHotExceptions();
			}
			drinkCoffee(cup);

		} catch (TooColdExceptions e){
			System.out.println(e.getMessage());
		} catch (TooHotExceptions e){
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Can I have another cup?");
		}
	}

	public void drinkCoffee(CoffeeCup cup){
		System.out.println("Hmm.. That was just nice. Thank you!");
	}
}
