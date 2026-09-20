package p204p;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nyl {
    /* JADX INFO: renamed from: a */
    public static KeyGenParameterSpec m65896a(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static KeyGenParameterSpec.Builder m65897b(String str, int i) {
        return new KeyGenParameterSpec.Builder(str, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m65898c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }

    /* JADX INFO: renamed from: d */
    public static void m65899d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    /* JADX INFO: renamed from: e */
    public static void m65900e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }
}
