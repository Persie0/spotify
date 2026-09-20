package p204p;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class z94 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f280659b = 0;

    /* JADX INFO: renamed from: a */
    public KeyStore f280660a = (KeyStore) new ckx0(18).f39112b;

    /* JADX INFO: renamed from: a */
    public static void m95618a(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (new z94().m95620c(str)) {
            throw new IllegalArgumentException(s571.m77251j("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
        }
        String strM43478b = g3b1.m43478b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM43478b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized y94 m95619b(String str) {
        y94 y94Var;
        y94Var = new y94(g3b1.m43478b(str), this.f280660a);
        byte[] bArrM89907a = x4u0.m89907a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrM89907a, y94Var.mo24593b(y94Var.mo24592a(bArrM89907a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return y94Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m95620c(String str) {
        String strM43478b;
        strM43478b = g3b1.m43478b(str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f280660a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f280660a.containsAlias(strM43478b);
        }
        return this.f280660a.containsAlias(strM43478b);
    }
}
