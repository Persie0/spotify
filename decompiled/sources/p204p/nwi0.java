package p204p;

import com.spotify.native_crypto.NativeCryptoProvider;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class nwi0 {
    /* JADX INFO: renamed from: a */
    public static final byte[] m65793a(nwi0 nwi0Var, byte[] bArr) {
        nwi0Var.getClass();
        if (bArr.length >= 32) {
            return bk5.m29639x0(bArr.length - 32, bArr, bArr.length);
        }
        throw new IllegalArgumentException(edb.m38563l("PKCS8 encoding too short: ", bArr.length, " bytes").toString());
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m65794b(nwi0 nwi0Var, byte[] bArr) {
        nwi0Var.getClass();
        if (bArr.length >= 32) {
            return bk5.m29639x0(bArr.length - 32, bArr, bArr.length);
        }
        throw new IllegalArgumentException(edb.m38563l("X509 encoding too short: ", bArr.length, " bytes").toString());
    }

    /* JADX INFO: renamed from: c */
    public static NativeCryptoProvider m65795c() {
        try {
            Cipher.getInstance("ChaCha20-Poly1305");
            KeyPairGenerator.getInstance("Ed25519");
            KeyFactory.getInstance("Ed25519");
            Signature.getInstance("Ed25519");
            KeyPairGenerator.getInstance("X25519");
            KeyFactory.getInstance("X25519");
            KeyAgreement.getInstance("X25519");
            Mac.getInstance("HmacSHA512");
            MessageDigest.getInstance("SHA-512");
            return new NativeCryptoProvider();
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
