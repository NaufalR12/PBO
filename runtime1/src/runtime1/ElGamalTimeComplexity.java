package runtime1;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ElGamalTimeComplexity {

    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Program dimulai...");
        // Pilih ukuran bit untuk bilangan prima p
        int bitLength = 2048; // ukuran bit bilangan prima p
        System.out.println("Ukuran bit untuk bilangan prima p: " + bitLength);

        // Generate prime number p
        long startTime = System.nanoTime();
        BigInteger p = BigInteger.probablePrime(bitLength, random);
        long endTime = System.nanoTime();
        System.out.println("Waktu untuk menghasilkan p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        // Generate g
        BigInteger g = new BigInteger(bitLength - 1, random).mod(p);
        System.out.println("Nilai g dihasilkan.");
        System.out.flush();

        // Generate private key x
        BigInteger x = new BigInteger(bitLength - 1, random).mod(p.subtract(BigInteger.ONE)).add(BigInteger.ONE);
        System.out.println("Kunci privat x dihasilkan.");
        System.out.flush();

        // Generate public key y
        startTime = System.nanoTime();
        BigInteger y = g.modPow(x, p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung y = g^x mod p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        // Message m (should be smaller than p)
        BigInteger m = new BigInteger(bitLength - 1, random).mod(p);
        System.out.println("Pesan m dihasilkan.");
        System.out.flush();

        // Encryption
        BigInteger k = new BigInteger(bitLength - 1, random).mod(p.subtract(BigInteger.ONE)).add(BigInteger.ONE);
        System.out.println("Nilai k dihasilkan untuk enkripsi.");
        System.out.flush();

        startTime = System.nanoTime();
        BigInteger c1 = g.modPow(k, p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung c1 = g^k mod p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        startTime = System.nanoTime();
        BigInteger c2 = m.multiply(y.modPow(k, p)).mod(p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung c2 = m * y^k mod p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        // Decryption
        startTime = System.nanoTime();
        BigInteger s = c1.modPow(x, p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung s = c1^x mod p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        startTime = System.nanoTime();
        BigInteger sInverse = s.modInverse(p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung s^-1 mod p: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        startTime = System.nanoTime();
        BigInteger decryptedM = c2.multiply(sInverse).mod(p);
        endTime = System.nanoTime();
        System.out.println("Waktu untuk menghitung decrypted m: " + (endTime - startTime) + " nanoseconds");
        System.out.flush();

        // Verify decryption
        if (m.equals(decryptedM)) {
            System.out.println("Dekripsi berhasil!");
        } else {
            System.out.println("Dekripsi gagal.");
        }
        System.out.flush();
        
        System.out.println("Program selesai.");
    }
}
