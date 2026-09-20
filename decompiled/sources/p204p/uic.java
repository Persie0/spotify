package p204p;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uic implements on40 {

    /* JADX INFO: renamed from: c */
    public static final int[] f230653c = m83189k(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a */
    public final int[] f230654a;

    /* JADX INFO: renamed from: b */
    public final int f230655b;

    public uic(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f230654a = m83189k(bArr);
        this.f230655b = i;
    }

    /* JADX INFO: renamed from: i */
    public static void m83187i(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* JADX INFO: renamed from: j */
    public static void m83188j(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m83187i(0, 4, 8, 12, iArr);
            m83187i(1, 5, 9, 13, iArr);
            m83187i(2, 6, 10, 14, iArr);
            m83187i(3, 7, 11, 15, iArr);
            m83187i(0, 5, 10, 15, iArr);
            m83187i(1, 6, 11, 12, iArr);
            m83187i(2, 7, 8, 13, iArr);
            m83187i(3, 4, 9, 14, iArr);
        }
    }

    /* JADX INFO: renamed from: k */
    public static int[] m83189k(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // p204p.on40
    /* JADX INFO: renamed from: a */
    public final byte[] mo67399a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Alert.DURATION_SHOW_INDEFINITELY - mo78003g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mo78003g() + bArr.length);
        m83192f(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    @Override // p204p.on40
    /* JADX INFO: renamed from: b */
    public final byte[] mo67400b(byte[] bArr) {
        return m83191e(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m83190c(byte[] bArr, int i) {
        int[] iArrMo78002d = mo78002d(m83189k(bArr), i);
        int[] iArr = (int[]) iArrMo78002d.clone();
        m83188j(iArr);
        for (int i2 = 0; i2 < iArrMo78002d.length; i2++) {
            iArrMo78002d[i2] = iArrMo78002d[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo78002d, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: d */
    public abstract int[] mo78002d(int[] iArr, int i);

    /* JADX INFO: renamed from: e */
    public final byte[] m83191e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < mo78003g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[mo78003g()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        m83193h(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: f */
    public final void m83192f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo78003g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM89907a = x4u0.m89907a(mo78003g());
        byteBuffer.put(bArrM89907a);
        m83193h(bArrM89907a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo78003g();

    /* JADX INFO: renamed from: h */
    public final void m83193h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferM83190c = m83190c(bArr, this.f230655b + i3);
            if (i3 == i) {
                vgg1.m85456L(byteBuffer, byteBuffer2, byteBufferM83190c, iRemaining % 64);
            } else {
                vgg1.m85456L(byteBuffer, byteBuffer2, byteBufferM83190c, 64);
            }
        }
    }
}
