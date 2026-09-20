package p204p;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class w32 implements a32 {

    /* JADX INFO: renamed from: e */
    public static final q32 f247459e = new q32(1);

    /* JADX INFO: renamed from: f */
    public static final q32 f247460f = new q32(2);

    /* JADX INFO: renamed from: a */
    public final byte[] f247461a;

    /* JADX INFO: renamed from: b */
    public final byte[] f247462b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f247463c;

    /* JADX INFO: renamed from: d */
    public final int f247464d;

    public w32(byte[] bArr, int i) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f247464d = i;
        g3b1.m43477a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f247463c = secretKeySpec;
        Cipher cipher = (Cipher) f247459e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM87095c = m87095c(cipher.doFinal(new byte[16]));
        this.f247461a = bArrM87095c;
        this.f247462b = m87095c(bArrM87095c);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m87095c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m87096e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: a */
    public final byte[] mo24592a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f247464d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrM89907a = x4u0.m89907a(i);
        System.arraycopy(bArrM89907a, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f247459e.get();
        SecretKeySpec secretKeySpec = this.f247463c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM87097d = m87097d(cipher, 0, bArrM89907a, 0, bArrM89907a.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM87097d2 = m87097d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f247460f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM87097d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f247464d);
        byte[] bArrM87097d3 = m87097d(cipher, 2, bArr3, this.f247464d, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrM87097d2[i2] ^ bArrM87097d[i2]) ^ bArrM87097d3[i2]);
        }
        return bArr3;
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: b */
    public final byte[] mo24593b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f247464d;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f247459e.get();
        SecretKeySpec secretKeySpec = this.f247463c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM87097d = m87097d(cipher, 0, bArr, 0, this.f247464d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM87097d2 = m87097d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM87097d3 = m87097d(cipher, 2, bArr, this.f247464d, i2);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length2 + i3] ^ bArrM87097d2[i3]) ^ bArrM87097d[i3]) ^ bArrM87097d3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f247460f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM87097d));
        return cipher2.doFinal(bArr, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m87097d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f247461a;
        if (i3 == 0) {
            return cipher.doFinal(m87096e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m87096e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f247462b, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m87096e(bArrDoFinal, bArrCopyOf));
    }
}
