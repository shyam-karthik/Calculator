import Greeter.Greeter;

public class Hello {
  
  public static String GREETING = "Hello world!";
  
  public static void main(String []args) {
    Greeter greeting = new Greeter();
    greeting.greet();
  }  
}

