/*
C to F should take the temperature in celsius as a boolean input, and output a
boolean which is the value in farenheit.

F to C should take the temperature in farenheit as a boolean input, and output
a boolean which is the value in celcius.
*/
public class CtoFTester{

  public static double celsiusToFarenheit(double celsius){
    return (celsius - 32.0) / 9.0 * 5.0;
  }

  public static double fahrenheitToCelsius(double farenheit){
    return (farenheit - 32.0) / 9.0 * 5.0;

  }
  public static void main(String[] args){
     System.out.println("10c to f is: " + celsiusToFarenheit(10.0));
     System.out.println("75f to c is: " + fahrenheitToCelsius(75.0));
  }
}
