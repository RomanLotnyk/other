package find.utilites;

import find.model.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find {

    private HashMap<String, Contact> data;

    public Find(HashMap<String, Contact> data) {
       this.data = data;
    }

    /**
     * find.
     * @param name
     * @return
     */
    public List<String> find(String name) {
        List<String> numbers = new ArrayList<>();
        if (this.data.containsKey(name)) {
            for (String number: this.data.get(name).getNumbers()) {
                numbers.add(number);
            }
        } else {
            System.err.println("Contact Not Found!");
        }
        return numbers;
    }
}
