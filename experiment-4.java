//experiment-4:Write a Java program to implement the DES algorithm logic
public class SimpleDES {
    static int[] xor(int[] a, int[] b) {
        int[] result = new int[a.length];
          for (int i = 0; i < a.length; i++) {
            result[i] = a[i] ^ b[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] plaintext = new int[64];
        	for (int i = 0; i < 64; i++) {
            		plaintext[i] = i % 2;
        }
        int[] L = new int[32];
        int[] R = new int[32];
        	System.arraycopy(plaintext, 0, L, 0, 32);
        	System.arraycopy(plaintext, 32, R, 0, 32);
        int[] key = new int[32];
        	for (int i = 0; i < 32; i++) {
            	key[i] = 1;
        }
        for (int round = 0; round < 16; round++) {
            int[] temp = R;
            	R = xor(L, xor(R, key));
            	L = temp;
        }
        int[] cipher = new int[64];
      		 System.arraycopy(R, 0, cipher, 0, 32);
        	 System.arraycopy(L, 0, cipher, 32, 32);
        	 System.out.println("Plain Text:");
        for (int bit : plaintext) {
            	 System.out.print(bit);
        }
                 System.out.println("\n\nEncrypted Text:");
        for (int bit : cipher) {
            System.out.print(bit);
        }
    }
}
