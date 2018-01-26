package find.utilites;

import find.model.Contact;
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
        List<String> res = find.find("Иванов И.И.");

        assertThat(res.get(0), is("+8 800 2000 500"));
        assertThat(res.get(1), is("+8 800 200 600"));
    }

    @Test
    public void whenNotFoundContactAssertThatEqualText() {
        List<String> ivanNumbers = new ArrayList<>();
        ivanNumbers.add("+8 800 2000 500");
        ivanNumbers.add("+8 800 200 600");

        Contact ivan = new Contact("Иванов И.И.", ivanNumbers);

        HashMap<String, Contact> data = new HashMap<>();
        data.put("Иванов И.И.", ivan);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setErr(new PrintStream(out));

        Find find = new Find(data);
        find.find("Петров П.П.");

        assertThat(out.toString(), is("Contact Not Found!\r\n"));
    }
}