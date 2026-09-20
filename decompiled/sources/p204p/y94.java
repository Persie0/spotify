package p204p;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class y94 implements a32 {

    /* JADX INFO: renamed from: a */
    public final SecretKey f270496a;

    public y94(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f270496a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(edb.m38564m("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: a */
    public final byte[] mo24592a(byte[] bArr, byte[] bArr2) {
        try {
            return m93143d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return m93143d(bArr, bArr2);
        }
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: b */
    public final byte[] mo24593b(byte[] bArr, byte[] bArr2) {
        try {
            return m93142c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return m93142c(bArr, bArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m93142c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f270496a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m93143d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f270496a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
