public class StrawberryCake extends Cake{
  private final int CAKE_COST = 20;

  @Override
  public String getDescription() {
    return "Strawberry cake";
  }
  
  @Override
  public int getCost() {
      return CAKE_COST;
  }
}
