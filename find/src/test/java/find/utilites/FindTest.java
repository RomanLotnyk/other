package find.utilites;

import find.model.Contact;
import find.model.Number;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindTest {

    @Test
    public void whenInitNumberContactAndAssertThatListToFindContact() {
        Number ivanov_one = new Number("+8 800 2000 500");
        Number ivanov_two = new Number("+8 800 200 600");
        List<Number> ivanov_list = new ArrayList<>();
        ivanov_list.add(ivanov_one);
        ivanov_list.add(ivanov_two);
        Number petrov_one = new Number("+8 800 2000 700");
        List<Number> petrov_list = new ArrayList<>();
        petrov_list.add(petrov_one);
        List<Number> sidorov_list = new ArrayList<>();
        Number sidorov_one = new Number("+8 800 2000 800");
        Number sidorov_two = new Number("+8 800 2000 900");
        Number sidorov_three = new Number("+8 800 2000 000");
        sidorov_list.add(sidorov_one);
        sidorov_list.add(sidorov_two);
        sidorov_list.add(sidorov_three);
        HashMap<Contact, List<Number>> data = new HashMap<>();
        data.put(new Contact("Иванов И.И."), ivanov_list);
        data.put(new Contact("Петоров П.П."), petrov_list);
        data.put(new Contact("Сидоров С.С."), sidorov_list);
        Find find = new Find(data);
        List<Number> fRes = find.searchNumber(new Contact("Иванов И.И."));
        List<Number> desirble = new ArrayList<>();
        desirble.add(new Number("+8 800 2000 500"));
        desirble.add(new Number("+8 800 200 600"));
        assertThat(fRes.get(0), is(desirble.get(0)));
        assertThat(fRes.get(1), is(desirble.get(1)));
    }

    @Test
    public void whenNotFoundContactAssertThatEqualText() {
        Number ivanov_one = new Number("+8 800 2000 500");
        Number ivanov_two = new Number("+8 800 200 600");
        List<Number> ivanov_list = new ArrayList<>();
        ivanov_list.add(ivanov_one);
        ivanov_list.add(ivanov_two);
        HashMap<Contact, List<Number>> data = new HashMap<>();
        data.put(new Contact("Иванов И.И."), ivanov_list);
        Find find = new Find(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setErr(new PrintStream(out));
        find.searchNumber(new Contact("Иванов А.А."));
        assertThat(out.toString(), is("Contact Not Found!\r\n"));

    }
}