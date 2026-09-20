package p204p;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class r32 implements on40 {

    /* JADX INFO: renamed from: d */
    public static final q32 f195403d = new q32(0);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f195404a;

    /* JADX INFO: renamed from: b */
    public final int f195405b;

    /* JADX INFO: renamed from: c */
    public final int f195406c;

    public r32(byte[] bArr, int i) throws GeneralSecurityException {
        g3b1.m43477a(bArr.length);
        this.f195404a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f195403d.get()).getBlockSize();
        this.f195406c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f195405b = i;
    }

    @Override // p204p.on40
    /* JADX INFO: renamed from: a */
    public final byte[] mo67399a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f195405b;
        if (length > Alert.DURATION_SHOW_INDEFINITELY - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Alert.DURATION_SHOW_INDEFINITELY - i));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrM89907a = x4u0.m89907a(i);
        System.arraycopy(bArrM89907a, 0, bArr2, 0, i);
        m74569c(bArr, 0, bArr.length, bArr2, this.f195405b, bArrM89907a, true);
        return bArr2;
    }

    @Override // p204p.on40
    /* JADX INFO: renamed from: b */
    public final byte[] mo67400b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f195405b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.f195405b;
        byte[] bArr3 = new byte[length2 - i2];
        m74569c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    /* JADX INFO: renamed from: c */
    public final void m74569c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f195403d.get();
        byte[] bArr4 = new byte[this.f195406c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f195405b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f195404a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
