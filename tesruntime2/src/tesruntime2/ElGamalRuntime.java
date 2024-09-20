package tesruntime2;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ElGamalRuntime {

    public static void main(String[] args) {
        int bitLength = 1024; // Panjang kunci
        SecureRandom random = new SecureRandom();

        // Generate keys
        BigInteger p = BigInteger.probablePrime(bitLength, random);
        BigInteger g = new BigInteger(bitLength, random).mod(p);
        BigInteger x = new BigInteger(bitLength, random).mod(p); // Private key
        BigInteger y = g.modPow(x, p); // Public key

        // Generate a message
        BigInteger message = new BigInteger(bitLength - 1, random).mod(p);

        // Measure encryption time
        long startTime = System.nanoTime();
        BigInteger[] encryptedMessage = encrypt(message, p, g, y, bitLength);
        long endTime = System.nanoTime();
        long encryptionTime = endTime - startTime;

        // Measure decryption time
        startTime = System.nanoTime();
        BigInteger decryptedMessage = decrypt(encryptedMessage, p, x);
        endTime = System.nanoTime();
        long decryptionTime = endTime - startTime;

        System.out.println("Waktu enkripsi: " + encryptionTime + " nanodetik");
        System.out.println("Waktu dekripsi: " + decryptionTime + " nanodetik");
    }

    public static BigInteger[] encrypt(BigInteger message, BigInteger p, BigInteger g, BigInteger y, int bitLength) {
        SecureRandom random = new SecureRandom();
        BigInteger k = new BigInteger(bitLength, random).mod(p);
        BigInteger a = g.modPow(k, p);
        BigInteger b = y.modPow(k, p).multiply(message).mod(p);
        return new BigInteger[]{a, b};
    }

    public static BigInteger decrypt(BigInteger[] encryptedMessage, BigInteger p, BigInteger x) {
        BigInteger a = encryptedMessage[0];
        BigInteger b = encryptedMessage[1];
        BigInteger aX = a.modPow(x, p);
        BigInteger aXInverse = aX.modInverse(p);
        return b.multiply(aXInverse).mod(p);
    }
}
