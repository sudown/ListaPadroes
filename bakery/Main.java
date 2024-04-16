public class Main {
  public static void main(String[] args) {

    Order order = new Order();

    Cake chocolateCake = new ChocolateCake();
    Cake vanilla1 = new VanillaCake();
    Cake vanilla2 = new VanillaCake();
    Cake strawberryCake = new StrawberryCake();

    Cake vanillCakeMessage1 = new WithMessageDecorator(vanilla1, "PLAIN!");
    Cake vanillCakeMessage2 = new WithMessageDecorator(vanilla2, "FANCY!");

    //Cake strawberryCakeMessage = new LayerDecorator(new SprinklesDecorator(
    //    new WithMessageDecorator(new WithMessageDecorator(strawberryCake, "EVERYTHING"), "One of")));

    Cake strawberryCakeMessage = new WithMessageDecorator(new WithMessageDecorator(new SprinklesDecorator(new LayerDecorator(strawberryCake)), "One of"), "EVERYTHING");

    order.addCake(chocolateCake);
    order.addCake(vanillCakeMessage1);
    order.addCake(vanillCakeMessage2);
    order.addCake(strawberryCakeMessage);

    order.printOrder();
  }
}
