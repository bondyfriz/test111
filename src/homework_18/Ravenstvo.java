package homework_18;

public class Ravenstvo {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    boolean ravenstvo ( StringBuilder sb1,  StringBuilder sb2) {
        this.sb1 = sb1;
        this.sb2 = sb2;
        int result;
        boolean b;
        switch ( result = sb1.compareTo(sb2)) {
            case 0: b = true; break;
            default: b = false; break;

        }

        return b;
    }
}

class RavenstvoTest {

    public static void main(String[] args) {
        Ravenstvo r1 = new Ravenstvo();
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder(" ");

        boolean result = r1.ravenstvo(sb1,sb2);
        System.out.println(result);

    }
}
