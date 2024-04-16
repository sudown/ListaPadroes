import Observer.Concrete.ObserverFullnumber;
import Observer.Concrete.ObserverLastDigit;
import Subject.Concrete.PhoneModel;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        model.addListener(new ObserverLastDigit("Last Digit Observer"));
        model.addListener(new ObserverFullnumber("Full Number Observer", model));
    }
}
