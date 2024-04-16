package Subject.Concrete;
import java.util.ArrayList;
import java.util.List;

import Observer.IObserver;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<IObserver> listeners = new ArrayList<>();

    public void addListener(IObserver listener) {
      listeners.add(listener);
    }

    public void removeListener(IObserver listener) {
      listeners.remove(listener);
    }

    public void addDigit(int digit) {
        digits.add(digit);
        notifyListeners(digit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void notifyListeners(int digit){
      for(IObserver listener : listeners) {
        listener.update(digit);
      }
    }
}
