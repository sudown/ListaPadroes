package Observer.Concrete;
import Observer.IObserver;
import Subject.Concrete.PhoneModel;

public class ObserverFullnumber implements IObserver{
  @SuppressWarnings("unused")
  private String name;
  private PhoneModel model;

  public ObserverFullnumber(String name, PhoneModel model) {
    this.name = name;
    this.model = model;
  }

  @Override
  public void update(int digit) {
    if (model.getDigits().size() == 12) {
      String number = "";
      for (Integer i : model.getDigits()) {
          number += i.toString();
      }
      System.out.println("Agora discando: " + number + "...");
  }
  }
  
}
