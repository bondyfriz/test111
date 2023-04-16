package homework_16;

public class Email {
    public static void main(String[] args) {

    String s1 = new String("fgdfg@gmail.com; dgf@mail.ru; +" +
            "ona@gmail.com; sd.fsf@yahoo.com; ");
    String s2 = new String("google, mail, yahoo");

    for (int i = 0; i < s1.length() - 1; i++) {
        if (s1.charAt(i) == '@') {
            int j = i + 1;
            while (s1.charAt(j) != '.'){
                System.out.print(s1.charAt(j));
                j++;
            }
            System.out.println(" ");
        }
    }
    }
}
