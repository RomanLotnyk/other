package ip;

import java.util.ArrayList;
import java.util.List;

public class IPDiapason {

    /**
     * first.
     */
    private IP first;

    /**
     * second.
     */
    private IP second;

    /**
     * ipList.
     */
    private List<IP> ipList = new ArrayList<>();

    /**
     * Constructor.
     * @param first first
     * @param second second
     */
    public IPDiapason(IP first, IP second) {
        this.first = first;
        this.second = second;
        this.second.four--;
        this.ipList.add(this.second);
    }


    /**
     * getAll.
     *
     * @return return
     */
    public List<IP> getAll() {
        return this.ipList;
    }

    /**
     * diapason.
     */
    public void diapason() {
        IP ip = null;

         do {
             if (this.first.four < 255) {
                this.first.four++;
            } else if (this.first.three < 255) {
                this.first.four = 0;
                this.first.three++;
            } else if (this.first.two < 255) {
                this.first.three = 0;
                this.first.two++;
            } else if (this.first.one < 255) {
                this.first.two = 0;
                this.first.one++;
            }
                            ip = new IP(String.format("%s.%s.%s.%s",
                            this.first.one,
                            this.first.two,
                            this.first.three,
                            this.first.four));
                            this.ipList.add(ip);

        } while (!ip.equals(this.ipList.get(0)));
        this.ipList.remove(0);
    }

}
