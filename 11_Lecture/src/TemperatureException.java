package Exceptions;
public class TemperatureException extends Exception{
	String msg;
	public TemperatureException(String msg){
		super(msg);
	}
}
