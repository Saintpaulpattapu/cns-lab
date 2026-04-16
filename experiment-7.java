//experiment-7: Using Java Cryptography, encrypt the text “Hello world” using BlowFish. Create your own key using Java key tool. 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class BlowfishEncryption {

    public static void main(String[] args) {

        try {
            String plaintext = "Hello World";

            // Secret key
            String keyString = "MySecretKey";

            // Create Blowfish key
            SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "Blowfish");

            // Create cipher instance
            Cipher cipher = Cipher.getInstance("Blowfish");

            // Initialize cipher for encryption
            cipher.init(Cipher.ENCRYPT_MODE, key);

            // Perform encryption
            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());

            // Convert encrypted data to Base64 format
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

            // Display output
            System.out.println("Original Text  : " + plaintext);
            System.out.println("Encrypted Text : " + encryptedText);

        } catch (Exception e) {

            // Handle errors
            System.out.println("Error occurred during encryption");
            e.printStackTrace();
        }
    }
}
