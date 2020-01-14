package Important;

import java.util.Scanner;

public abstract class InputScann {

    public char[] arrayAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
    public String[] arrayCode = {"?3", "'4", "¿5"};

    public static int ReadInt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type: ");
        return sc.nextInt();
    }

    public static String ReadString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type: ");
        return sc.nextLine();
    }

}
