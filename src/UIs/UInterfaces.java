package UIs;
import Important.InputScans;
import static Crypt.Encrypt.*;
import static Crypt.Decrypt.*;

public class UInterfaces extends InputScans {

    public static void PrincipalMenu(){
        System.out.println("J-ENCRYPTER MENU");
        System.out.println("[1] Encrypt a Message");
        System.out.println("[2] Decrypt a Message");
        System.out.println("[3] Exit");
        switch (ReadInt()){
            case 1:
                EncryptMenu();
                break;
            case 2:
                DecryptMenu();
                break;
            case 3:
                System.exit(1);
                break;
            default:
                System.out.println("That's not an option.");
        }
    }

    public static void EncryptMenu(){
        System.out.println("ENCRYPT MENU");
        System.out.println("[1] Encrypt a Message");
        System.out.println("[2] Go Back");
        switch (ReadInt()){
            case 1:
                StartEncrypt();
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    public static void DecryptMenu() {
        System.out.println("DECRYPT MENU");
        System.out.println("[1] Decrypt a Message");
        System.out.println("[2] Go Back");
        switch (ReadInt()){
            case 1:
                StartDecrypt();
                break;
            case 2:
                break;
            default:
                break;
        }
    }


}
