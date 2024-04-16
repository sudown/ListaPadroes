public class LayerDecorator extends CakeDecorator{

  public LayerDecorator(Cake cake) {
    super(cake);
  }

  @Override
  public String getDescription() {
    return "Multi-layered " + decoratedCake.getDescription();
  }

  @Override
  public int getCost() {
    return decoratedCake.getCost() + 5;
  }
}
