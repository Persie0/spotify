package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class abf1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f14107a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f14108b;

    static {
        byte[] bArr = new byte[0];
        f14107a = bArr;
        f14108b = ByteBuffer.wrap(bArr);
        v9f1.m84963e(0, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m25350a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX INFO: renamed from: b */
    public static int m25351b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
