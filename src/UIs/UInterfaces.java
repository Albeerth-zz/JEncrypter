package UIs;

public class UInterfaces extends Important.InputScann {

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
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    public static void DecryptMenu() {

    }


}
