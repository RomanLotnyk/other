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

    public List<String> search(String name) {
        List<String> numbers = new ArrayList<>();
        numbers.addAll(this.data.getOrDefault(name, new Contact(name, numbers)).getNumbers());
        if (numbers.isEmpty()) {
            System.err.println("Contact Not Found!");
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<String> ivanNumbers = new ArrayList<>();
        ivanNumbers.add("+8 800 2000 500");
        ivanNumbers.add("+8 800 200 600");

        List<String> sidNumbers = new ArrayList<>();
        sidNumbers.add("+8 800 2000 800");
        sidNumbers.add("+8 800 2000 900");
        sidNumbers.add("+8 800 2000 000");

        List<String> petNumbers = new ArrayList<>();
        petNumbers.add("+8 800 2000 700");


        Contact ivan = new Contact("Иванов И.И.", ivanNumbers);
        Contact sid = new Contact("Сидоров С.С.", sidNumbers);
        Contact pet = new Contact("Петров П.П.", petNumbers);
        HashMap<String, Contact> data = new HashMap<>();
        data.put("Иванов И.И.", ivan);
        data.put("Сидоров С.С.", sid);
        data.put("Петров П.П.", pet);

        Find find = new Find(data);
        List<String> res = find.search("Петров П.П.");

        for (String numbers : res) {
            System.out.println(numbers);
        }

    }
}
