abstract class CakeDecorator extends Cake {
  protected Cake decoratedCake;

  public CakeDecorator(Cake cake) {
      this.decoratedCake = cake;
  }
}
