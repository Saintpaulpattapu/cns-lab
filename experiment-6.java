//experiment-6:Write a Java program to implement the AES algorithm logic
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESProgram {
    public static void main(String[] args) throws Exception {
        
        String key = "1234567890123456";   // 16 bytes key
        String text = "HelloWorld12345";

        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");

        // Encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(text.getBytes());
        System.out.println("Encrypted text: " + new String(encrypted));

        // Decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Decrypted text: " + new String(decrypted));
    }
}
