public class SprinklesDecorator extends CakeDecorator{

  public SprinklesDecorator(Cake cake) {
    super(cake);
  }

  @Override
  public String getDescription() {
    return decoratedCake.getDescription() + " with sprinkles";
  }

  @Override
  public int getCost() {
    return decoratedCake.getCost() + 2;
  }
  
}
