package Crypt;

public class Decrypt extends Important.InputScans {
    private static String encryptedMessage = "";
    private static char[] encryptedArray;

    public static void StartDecrypt(){
        ReadMessage();
        PickChars();
        System.out.println(encryptedArray.length);
    }

    private static void ReadMessage(){
        System.out.print("Write your encrypted message: ");
        encryptedMessage = ReadString();

    }
    private static void PickChars(){
        encryptedArray = encryptedMessage.toCharArray();
    }
}
