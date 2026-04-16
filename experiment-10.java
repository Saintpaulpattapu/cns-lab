//experiment-10:Calculate the message digest of a text using the SHA-1 algorithm in JAVA. 
import java.security.MessageDigest;

class Sha1Ex {
    public static void main(String args[]) {
        try {
            String msg = "Hello World";

            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] msgBytes = msg.getBytes();
            byte[] digestBytes = md.digest(msgBytes);

            StringBuilder hexString = new StringBuilder();

            for (byte b : digestBytes) {
                String hex = Integer.toHexString(0xff & b);

                if (hex.length() == 1) {
                    hexString.append('0');
                }

                hexString.append(hex);
            }

            System.out.println("Original message: " + msg);
            System.out.println("Message Digest: " + hexString.toString());

        } 
	catch (Exception e) {
           
        }
    }
}
