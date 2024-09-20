package comparison;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class PerbandinganWaktuElGamal {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int panjangBit1 = 512; // Panjang bit pertama untuk p
        int panjangBit2 = 1024; // Panjang bit kedua untuk p

        // Waktu eksekusi untuk panjangBit1
        long waktuMulai1 = System.currentTimeMillis();
        generateElGamalKeyPair(panjangBit1);
        long waktuSelesai1 = System.currentTimeMillis();
        long waktuEks1 = waktuSelesai1 - waktuMulai1;
        System.out.println("Waktu eksekusi untuk panjang bit " + panjangBit1 + ": " + waktuEks1 + " ms");

        // Waktu eksekusi untuk panjangBit2
        long waktuMulai2 = System.currentTimeMillis();
        generateElGamalKeyPair(panjangBit2);
        long waktuSelesai2 = System.currentTimeMillis();
        long waktuEks2 = waktuSelesai2 - waktuMulai2;
        System.out.println("Waktu eksekusi untuk panjang bit " + panjangBit2 + ": " + waktuEks2 + " ms");
    }

    public static KeyPair generateElGamalKeyPair(int panjangBit) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ElGamal");
        keyPairGenerator.initialize(panjangBit, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }
}
