// experiment-3b:Substitution Cipher
import java.util.*;

class SubstitutionCipher {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String text, ctext = "", dtext = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.println("Enter plain text:");
        text = sc.nextLine().toUpperCase();

        // ENCRYPTION
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                ctext += " ";
                continue;
            }

            for (int j = 0; j < 26; j++) {
                if (ch == alphabet.charAt(j)) {
                    ctext += key.charAt(j);
                    break;
                }
            }
        }

        System.out.println("Cipher text: " + ctext);

        // DECRYPTION
        for (int i = 0; i < ctext.length(); i++) {
            char ch = ctext.charAt(i);

            if (ch == ' ') {
                dtext += " ";
                continue;
            }

            for (int j = 0; j < 26; j++) {
                if (ch == key.charAt(j)) {
                    dtext += alphabet.charAt(j);
                    break;
                }
            }
        }

        System.out.println("Decrypted text: " + dtext);
        sc.close();
    }
}
