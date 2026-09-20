package p204p;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oyl {
    /* JADX INFO: renamed from: a */
    public static BiometricPrompt.CryptoObject m68504a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
