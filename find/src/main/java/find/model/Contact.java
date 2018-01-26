package find.model;

import java.util.List;

public class Contact {

    private String name;

    private List<String> numbers;

    public Contact(String name, List<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
