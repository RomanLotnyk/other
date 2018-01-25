package find.utilites;

import find.model.Contact;
import find.model.Number;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Find {

    private HashMap<Contact, List<Number>> data;

    public Find(HashMap<Contact, List<Number>> data) {
        this.data = data;
    }

    public List<Number> searchNumber(Contact contact) {
        List<Number> numbers = new ArrayList<>();
        if (this.data.containsKey(contact)) {
            for (Number number: this.data.get(contact)) {
                numbers.add(number);
            }
        } else {
            System.err.println("Contact Not Found!");
        }
        return numbers;
    }
}
