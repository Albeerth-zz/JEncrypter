package Important;

import java.util.Scanner;

public abstract class InputScans {

    public static char[] arrayAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ',','.'};
    public static String[] arrayCode = {"2?", "'3", "¿'", "&¨", "{1", ".´", "{*", "´}", "5'", "^^", "¨7","-+", "_5", ".¡", "¡?","{#", "'!", "/¡", "=9", "')", "(9", "¡2", "`¨", "*", "~´", "&¡", "$%", "._" , "c_", "1,"};

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
