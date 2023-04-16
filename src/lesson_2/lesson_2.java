package lesson_2;

public class lesson_2 {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 127;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000L;
        long l2 = 10000000000L; // всегда L в конце

        float f1 = 3.14F;
        float f2 = 20F;

        double d1 = 87.65F;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = 500; //10 сс
        char c5 = '\u0500'; //16 сс

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60;
        int a2 = 0b111100; //число 60 в 2 сс
        int a3 = 074; //число 60 в 8 сс
        int a4 = 0x3C; //число 60 в 16 сс

        int a5 = 1_000_000;

        //homework
        byte x1 = 12;
        byte x2 = 0b1100;
        byte x3 = 014;
        byte x4 = 0xC;

        short y1 = 1300;
        short y2 = 0b0101_0001_0100;
        short y3 = 0_2424;
        short y4 = 0x514;

        int j1 = 0;
        int j2 = 0b0;
        int j3 = 0_0;
        int j4 = 0x0;

        long p1 = 123456789L;
        long p2 = 0b0111_0101_1011_1100_1101_0001_0101L;
        long p3 = 0_726_746_425L;
        long p4 = 0x75B_CD15L;

        float g1 = 77.77F;
        float g2 = 88.88F;

        d1 = 777.777D;
        double d2 = 888.888D;

        boolean bb1 = true;
        boolean bb2 = false;

        char cc1 = 'Y';
        char cc2 = 507;
        char cc3 = '\u0505';

        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4);
        System.out.println(y1 + " " + y2 + " " + y3 + " " + y4);
        System.out.println(j1 + " " + j2 + " " + j3 + " " + j4);
        System.out.println(p1 + " " + p2 + " " + p3 + " " + p4);
        System.out.println(g1 + " " + g2);
        System.out.println(d1 + " " + d2);
        System.out.println(bb1 + " " + bb2);
        System.out.println(cc1 + " " + cc2 + " " + cc3);
    }
}