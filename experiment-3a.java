//exp-3a:Write a Java program to perform encryption and decryption using the following algorithms:
//a) Ceaser Cipher 
import java.util.*;
class CeaserCipher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text, ctext = "", dtext = "";
        int shift;
        System.out.println("Enter text:");
        text = sc.nextLine();
        System.out.println("Enter shift value:");
        shift = sc.nextInt();
        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ctext += (char) ((ch - 'A' + shift) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                ctext += (char) ((ch - 'a' + shift) % 26 + 'a');
            } else {
                ctext += ch;
            }
        }
        // Decryption
        for (int i = 0; i < ctext.length(); i++) {
            char ch = ctext.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                dtext += (char) ((ch - 'A' + 26 - shift) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                dtext += (char) ((ch - 'a' + 26 - shift) % 26 + 'a');
            } else {
                dtext += ch;
            }
        }
        System.out.println("Encrypted text: " + ctext);
        System.out.println("Decrypted text: " + dtext);
    }
}
