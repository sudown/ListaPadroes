public class WithMessageDecorator extends CakeDecorator{
  private String message;

  public WithMessageDecorator(Cake cake, String message) {
    super(cake);
    this.message = message;
  }

  @Override
  public String getDescription() {
    return decoratedCake.getDescription() + " with saying " + "'" + message + "'";
  }
}
