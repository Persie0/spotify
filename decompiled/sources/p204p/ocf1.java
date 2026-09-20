package p204p;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ocf1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f163921a = 0;

    static {
        Charset charset = StandardCharsets.UTF_16;
    }

    /* JADX INFO: renamed from: a */
    public static int m66688a(int i, int i2) {
        if (i % 2 != 0) {
            return (i | i2) - (i & i2);
        }
        return ((~i) & i2) | ((~i2) & i);
    }

    /* JADX INFO: renamed from: b */
    public static final void m66689b(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iM66688a = m66688a(iArr[i3], i5);
        iArr[i3] = (iM66688a << i4) | (iM66688a >>> (32 - i4));
    }

    /* JADX INFO: renamed from: c */
    public static final void m66690c(int i, int i2, int i3, int i4, int[] iArr) {
        m66689b(i, i2, i4, 16, iArr);
        m66689b(i3, i4, i2, 12, iArr);
        m66689b(i, i2, i4, 8, iArr);
        m66689b(i3, i4, i2, 7, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static final int m66691d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
