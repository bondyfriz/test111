package homework_14;

public class Time {
    static void showTime() {

        /*
        FOR1:
        for (int h = 0; h < 7; h++) {
            FOR2:
            for (int m = 0; m < 60; m++) {
                FOR3:
                for (int s = 0; s < 60; s++) {
                    /*
                    if (h > 1 && m % 10 == 0) {
                         break FOR1;
                    }
                    // if (h==3){
                    //   continue FOR1;
                    // }
                     if(s * h > m) {
                       continue FOR2;
                    }

                    if (String.valueOf(h).length() == 1) {
                        System.out.print("0" + h + ":");
                    }
                    else {System.out.print(h + ":");}

                    if (String.valueOf(m).length() == 1) {
                        System.out.print("0" + m + ":");
                    }
                    else {System.out.print(m + ":");}

                    if (String.valueOf(s).length() == 1) {
                        System.out.println("0" + s);
                    }
                    else {System.out.println(s);}






                    switch (String.valueOf(h).length()) {
                        case 1: System.out.print("0" + h + ":"); break;
                        default: System.out.print(h + ":");      break;
                    }
                    switch (String.valueOf(m).length()) {
                        case 1: System.out.print("0" + m + ":"); break;
                        default: System.out.print(m + ":");      break;
                    }
                    switch (String.valueOf(s).length()) {
                        case 1: System.out.println("0" + s);     break;
                        default: System.out.println(s);          break;
                    }

                }



            }
        }
        */
        int h = 0, m = 0, s = 0;
        WHILE1:
        while (h < 24) {
            m = 0;
            WHILE2:
            while (m < 60) {
                s = 0;
                WHILE3:
                while (s < 60) {
                    if (h > 1 && m % 10 == 0) {
                        break WHILE1;
                    }
                    switch (String.valueOf(h).length()) {
                        case 1: System.out.print("0" + h + ":"); break;
                        default: System.out.print(h + ":");      break;
                    }
                    switch (String.valueOf(m).length()) {
                        case 1: System.out.print("0" + m + ":"); break;
                        default: System.out.print(m + ":");      break;
                    }
                    switch (String.valueOf(s).length()) {
                        case 1: System.out.println("0" + s);     break;
                        default: System.out.println(s);          break;
                    }
                    s++;
                }
                m++;
            }
            h++;
        }
    }

    public static void main(String[] args) {
        showTime();
        //System.out.println(0%10);
        //System.out.println(10%10);
        //int v1 = 123;
        //int length = String.valueOf(v1).length();
        //System.out.println(length);
    }

}
