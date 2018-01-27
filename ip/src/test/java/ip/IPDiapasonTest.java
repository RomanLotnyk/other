package ip;

import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IPDiapasonTest {

    @Test
    public void whenReturnAssertThatDiapason() {
        IP first = new IP("192.168.0.1");
        IP second = new IP("192.168.0.5");
        IPDiapason ip = new IPDiapason(first, second);
        ip.diapason();
        assertThat(ip.getAll()
                .toString(),
                is(Arrays.asList(
                "192.168.0.2",
                "192.168.0.3",
                "192.168.0.4")
                .toString()));

    }

}