package ip;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IPDiapasonTest {

    @Test
    public void whenReturnAssertThatDiapason() {

        String first = "192.168.0.1";
        String second = "192.168.0.5";

        String[] fOne = first.split("[.]");
        String[] fTwo = second.split("[.]");

        char[] firstIp = new char[4];
        char[] secondIp = new char[4];

        firstIp[0] = (char) Integer.parseInt(fOne[0]);
        firstIp[1] = (char) Integer.parseInt(fOne[1]);
        firstIp[2] = (char) Integer.parseInt(fOne[2]);
        firstIp[3] = (char) Integer.parseInt(fOne[3]);

        secondIp[0] = (char) Integer.parseInt(fTwo[0]);
        secondIp[1] = (char) Integer.parseInt(fTwo[1]);
        secondIp[2] = (char) Integer.parseInt(fTwo[2]);
        secondIp[3] = (char) Integer.parseInt(fTwo[3]);



        IPDiapason ip = new IPDiapason();

        long one = ip.convertToInt(firstIp);
        long two = ip.convertToInt(secondIp);

        StringBuilder result = new StringBuilder();

        for (long i = one + 1; i < two; i++) {
            String res = ip.convertToString(i);
            result.append(res + "\n");
        }

        StringBuilder diapason = new StringBuilder();
        diapason.append("192.168.0.2\n");
        diapason.append("192.168.0.3\n");
        diapason.append("192.168.0.4\n");
        assertThat(result.toString(), is(diapason.toString()));
    }
}