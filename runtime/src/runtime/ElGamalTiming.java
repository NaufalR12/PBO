package runtime;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class ElGamalTiming {

    public static BigInteger modExp(BigInteger base, BigInteger exp, BigInteger mod) {
        BigInteger result = BigInteger.ONE;
        while (exp.compareTo(BigInteger.ZERO) > 0) {
            if (exp.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                result = result.multiply(base).mod(mod);
            }
            exp = exp.shiftRight(1);
            base = base.multiply(base).mod(mod);
        }
        return result;
    }

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        // Inisialisasi bilangan prima besar p, g, kunci privat x
        BigInteger p = new BigInteger("104729"); // bilangan prima
        BigInteger g = new BigInteger("2");
        BigInteger x = new BigInteger("12345"); // kunci privat
        BigInteger y = modExp(g, x, p); // kunci publik

        // Pesan yang akan dienkripsi
        BigInteger m = new BigInteger("123"); // pesan dalam bentuk bilangan

        // Pilih bilangan acak k
        BigInteger k = new BigInteger("67890");

        // Mulai pengukuran waktu
        long startTime = System.nanoTime();

        // Enkripsi
        BigInteger c1 = modExp(g, k, p);
        BigInteger c2 = m.multiply(modExp(y, k, p)).mod(p);

        // Dekripsi
        BigInteger s = modExp(c1, x, p);
        BigInteger sInv = s.modInverse(p); // invers modular
        BigInteger mDecrypted = c2.multiply(sInv).mod(p);

        // Akhiri pengukuran waktu
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // Output hasil
        System.out.println("Waktu eksekusi: " + (elapsedTime / 1e9) + " detik");
        System.out.println("Pesan asli: " + m);
        System.out.println("Pesan setelah dekripsi: " + mDecrypted);
    }
}
