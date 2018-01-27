package find.utilites;

import find.model.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find {
    /**
     * data.
     */
    private HashMap<String, Contact> data;

    /**
     * Constructor.
     * @param data data
     */
    public Find(HashMap<String, Contact> data) {
       this.data = data;
    }

    /**
     * search.
     * @param name name
     * @return return
     */
    public List<String> search(String name) {
        List<String> numbers = new ArrayList<>();
        numbers.addAll(this.data.getOrDefault(name, new Contact(name, numbers)).getNumbers());
        if (numbers.isEmpty()) {
            System.err.println("Contact Not Found!");
        }
        return numbers;
    }
}
