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
        this.second.setFour(this.second.getFour() - 1);
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
             if (this.first.getFour() < 255) {
                this.first.setFour(this.first.getFour() + 1);
            } else if (this.first.getThree() < 255) {
                this.first.setFour(0);
                this.first.setThree(this.first.getThree() + 1);
            } else if (this.first.getTwo() < 255) {
                this.first.setThree(0);
                this.first.setTwo(this.first.getTwo() + 1);
            } else if (this.first.getOne() < 255) {
                this.first.setTwo(0);
                this.first.setOne(this.first.getOne() + 1);
            }
                            ip = new IP(String.format("%s.%s.%s.%s",
                            this.first.getOne(),
                            this.first.getTwo(),
                            this.first.getThree(),
                            this.first.getFour()));
                            this.ipList.add(ip);

        } while (!ip.equals(this.ipList.get(0)));
        this.ipList.remove(0);
    }
}
