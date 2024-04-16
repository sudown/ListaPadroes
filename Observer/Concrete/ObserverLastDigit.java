package Observer.Concrete;
import Observer.IObserver;

public class ObserverLastDigit implements IObserver{
  @SuppressWarnings("unused")
  private String name;

  public ObserverLastDigit(String name) {
    this.name = name;
  }

  @Override
  public void update(int digit) {
    System.out.println("Pressionando: " + digit);
    System.out.println(digit);
  }
}
