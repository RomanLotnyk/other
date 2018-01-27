package ip;


public class IP {

    /**
     * one.
     */
    private int one;
    /**
     * two.
     */
    private int two;
    /**
     * three.
     */
    private int three;

    /**
     * four.
     */
    private int four;


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
     * getter.
     * @return return
     */
    public int getOne() {
        return this.one;
    }

    /**
     * setter.
     * @param one one
     */
    public void setOne(int one) {
        this.one = one;
    }

    /**
     * getter.
     * @return return
     */
    public int getTwo() {
        return this.two;
    }

    /**
     * setter.
     * @param two two
     */
    public void setTwo(int two) {
        this.two = two;
    }

    /**
     * getter.
     * @return return
     */
    public int getThree() {
        return this.three;
    }

    /**
     * setter.
     * @param three three
     */
    public void setThree(int three) {
        this.three = three;
    }

    /**
     * getter.
     * @return return
     */
    public int getFour() {
        return this.four;
    }

    /**
     * setter.
     * @param four four
     */
    public void setFour(int four) {
        this.four = four;
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
