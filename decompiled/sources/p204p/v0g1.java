package p204p;

import com.google.android.gms.internal.play_billing.zzfa;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class v0g1 extends ihf1 {

    /* JADX INFO: renamed from: g */
    public static final boolean f235992g = adg1.f14624e;

    /* JADX INFO: renamed from: c */
    public use1 f235993c;

    /* JADX INFO: renamed from: d */
    public final byte[] f235994d;

    /* JADX INFO: renamed from: e */
    public final int f235995e;

    /* JADX INFO: renamed from: f */
    public int f235996f;

    public v0g1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(s571.m77247f(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
        }
        this.f235994d = bArr;
        this.f235996f = 0;
        this.f235995e = i;
    }

    /* JADX INFO: renamed from: P */
    public static int m84377P(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: Q */
    public static int m84378Q(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: C */
    public final void m84379C(byte b) throws zzfa {
        int i = this.f235996f;
        try {
            int i2 = i + 1;
            try {
                this.f235994d[i] = b;
                this.f235996f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzfa(i, this.f235995e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m84380D(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f235994d, this.f235996f, i2);
            this.f235996f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(this.f235996f, this.f235995e, i2, e);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m84381E(int i, int i2) throws zzfa {
        m84389M((i << 3) | 5);
        m84382F(i2);
    }

    /* JADX INFO: renamed from: F */
    public final void m84382F(int i) throws zzfa {
        int i2 = this.f235996f;
        try {
            byte[] bArr = this.f235994d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f235996f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i2, this.f235995e, 4, e);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m84383G(int i, long j) throws zzfa {
        m84389M((i << 3) | 1);
        m84384H(j);
    }

    /* JADX INFO: renamed from: H */
    public final void m84384H(long j) throws zzfa {
        int i = this.f235996f;
        try {
            byte[] bArr = this.f235994d;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f235996f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i, this.f235995e, 8, e);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m84385I(int i, int i2) throws zzfa {
        m84389M(i << 3);
        m84386J(i2);
    }

    /* JADX INFO: renamed from: J */
    public final void m84386J(int i) throws zzfa {
        if (i >= 0) {
            m84389M(i);
        } else {
            m84391O(i);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m84387K(int i, int i2) throws zzfa {
        m84389M((i << 3) | i2);
    }

    /* JADX INFO: renamed from: L */
    public final void m84388L(int i, int i2) throws zzfa {
        m84389M(i << 3);
        m84389M(i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m84389M(int i) throws zzfa {
        int i2;
        int i3 = this.f235996f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f235994d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f235996f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzfa(i2, this.f235995e, 1, e);
                }
            }
            throw new zzfa(i2, this.f235995e, 1, e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m84390N(int i, long j) throws zzfa {
        m84389M(i << 3);
        m84391O(j);
    }

    /* JADX INFO: renamed from: O */
    public final void m84391O(long j) throws zzfa {
        int i;
        int i2 = this.f235996f;
        boolean z = f235992g;
        int i3 = this.f235995e;
        byte[] bArr = this.f235994d;
        if (!z || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzfa(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j2;
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                adg1.f14622c.mo52620j(bArr, adg1.f14625f + ((long) i2), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            adg1.f14622c.mo52620j(bArr, adg1.f14625f + ((long) i2), (byte) j3);
        }
        this.f235996f = i;
    }
}
