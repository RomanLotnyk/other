package ip;


public class IPDiapason {


    public int convertToInt(char ip[]) {
        return ((ip[0] * 256 + ip[1]) * 256 + ip[2]) * 256 + ip[3];
    }

    public  String convertToString(long i) {
        return  ((i >> 24 ) & 0xFF) + "." +
                ((i >> 16 ) & 0xFF) + "." +
                ((i >>  8 ) & 0xFF) + "." +
                (i & 0xFF);
    }

}
