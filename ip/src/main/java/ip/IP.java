package ip;


public class IP {

    /**
     * one.
     */
    public int one;
    /**
     * two.
     */
    public int two;
    /**
     * three.
     */
    public int three;

    /**
     * four.
     */
    public int four;

    /**
     * Constructor.
     * @param value value
     */
    public IP(String value) {
        String[] data = value.split("[.]");
        this.one = Integer.parseInt(data[0]);
        this.two = Integer.parseInt(data[1]);
        this.three = Integer.parseInt(data[2]);
        this.four = Integer.parseInt(data[3]);
    }

    /**
     * equals.
     * @param o o
     * @return return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IP ip = (IP) o;
        if (one != ip.one) return false;
        if (two != ip.two) return false;
        if (three != ip.three) return false;
        return four == ip.four;
    }

    /**
     * hashCode.
     * @return return
     */
    @Override
    public int hashCode() {
        int result = one;
        result = 31 * result + two;
        result = 31 * result + three;
        result = 31 * result + four;
        return result;
    }

    /**
     * toString.
     * @return return
     */
    @Override
    public String toString() {
        return String.format("%s.%s.%s.%s", this.one, this.two, this.three, this.four);
    }
}
