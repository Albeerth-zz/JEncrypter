package Crypt;

import Important.InputScans;

public class Encrypt extends InputScans {

    private static String userMessage;
    private static int indexArray= 0;
    private static String encryptedMessage = "";

    public static void StartEncrypt(){
        ReadMessage();
        GetCharMessage(userMessage);
        ShowEncryptMessage();

    }

    public static void ReadMessage(){
        System.out.print("Write your Message: ");
        userMessage = ReadString().toUpperCase();
    }

    private static void GetCharMessage(String userMessage){
        char[] arrayMessage = userMessage.toCharArray();
            for (char myChar: arrayMessage){
                CompareWithAlphabet(myChar);
            }
    }

    private static void CompareWithAlphabet(char myChar){
        for (char charAlphabet: arrayAlphabet) {
            if (myChar != charAlphabet){
                indexArray+=1;
            }
            else{
                AppendNewMessage(indexArray);
                indexArray = 0;
                break;
            }
        }

    }

    private static void AppendNewMessage(int indexNumber){

        encryptedMessage+= arrayCode[indexNumber];
    }

    private static void ShowEncryptMessage(){
        System.out.println("Encrypt Message:");
        System.out.println(encryptedMessage);
    }


}
