package p204p;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a5g1 {

    /* JADX INFO: renamed from: a */
    public static final Charset f12516a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f12517b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12517b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m24800a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
