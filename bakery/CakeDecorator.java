abstract class CakeDecorator extends Cake {
  protected Cake decoratedCake;

  public CakeDecorator(Cake cake) {
      this.decoratedCake = cake;
  }

  @Override
  public int getCost() {
      return decoratedCake.getCost();
  }

  @Override
  public String getDescription() {
      return decoratedCake.getDescription();
  }
}
