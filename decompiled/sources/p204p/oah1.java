package p204p;

import com.google.android.gms.internal.cast.zzxo;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class oah1 extends kxf1 {

    /* JADX INFO: renamed from: h */
    public static final Logger f163332h = Logger.getLogger(oah1.class.getName());

    /* JADX INFO: renamed from: i */
    public static final boolean f163333i = k7f1.f120085e;

    /* JADX INFO: renamed from: d */
    public bnd1 f163334d;

    /* JADX INFO: renamed from: e */
    public final byte[] f163335e;

    /* JADX INFO: renamed from: f */
    public final int f163336f;

    /* JADX INFO: renamed from: g */
    public int f163337g;

    public oah1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(s571.m77247f(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
        }
        this.f163335e = bArr;
        this.f163337g = 0;
        this.f163336f = i;
    }

    /* JADX INFO: renamed from: W */
    public static int m66551W(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: X */
    public static int m66552X(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: Y */
    public static int m66553Y(String str) {
        int length;
        try {
            length = n7f1.m63802a(str);
        } catch (m7f1 unused) {
            length = str.getBytes(rbh1.f197602a).length;
        }
        return m66551W(length) + length;
    }

    /* JADX INFO: renamed from: I */
    public final void m66554I(int i, int i2) throws zzxo {
        m66563R((i << 3) | i2);
    }

    /* JADX INFO: renamed from: J */
    public final void m66555J(int i, int i2) throws zzxo {
        m66563R(i << 3);
        m66562Q(i2);
    }

    /* JADX INFO: renamed from: K */
    public final void m66556K(int i, int i2) throws zzxo {
        m66563R(i << 3);
        m66563R(i2);
    }

    /* JADX INFO: renamed from: L */
    public final void m66557L(int i, int i2) throws zzxo {
        m66563R((i << 3) | 5);
        m66564S(i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m66558M(int i, long j) throws zzxo {
        m66563R(i << 3);
        m66565T(j);
    }

    /* JADX INFO: renamed from: N */
    public final void m66559N(int i, long j) throws zzxo {
        m66563R((i << 3) | 1);
        m66566U(j);
    }

    /* JADX INFO: renamed from: O */
    public final void m66560O(int i, String str) throws zzxo {
        m66563R((i << 3) | 2);
        int i2 = this.f163337g;
        try {
            int iM66551W = m66551W(str.length() * 3);
            int iM66551W2 = m66551W(str.length());
            int i3 = this.f163336f;
            byte[] bArr = this.f163335e;
            if (iM66551W2 != iM66551W) {
                m66563R(n7f1.m63802a(str));
                int i4 = this.f163337g;
                this.f163337g = n7f1.m63803b(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iM66551W2;
                this.f163337g = i5;
                int iM63803b = n7f1.m63803b(str, bArr, i5, i3 - i5);
                this.f163337g = i2;
                m66563R((iM63803b - i2) - iM66551W2);
                this.f163337g = iM63803b;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(e);
        } catch (m7f1 e2) {
            this.f163337g = i2;
            f163332h.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(rbh1.f197602a);
            try {
                int length = bytes.length;
                m66563R(length);
                m66567V(bytes, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzxo(e3);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m66561P(int i, jah1 jah1Var) throws zzxo {
        m66563R((i << 3) | 2);
        m66563R(jah1Var.mo41180d());
        m66567V(jah1Var.f110471b, jah1Var.mo41180d());
    }

    /* JADX INFO: renamed from: Q */
    public final void m66562Q(int i) throws zzxo {
        if (i >= 0) {
            m66563R(i);
        } else {
            m66565T(i);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m66563R(int i) throws zzxo {
        int i2;
        int i3 = this.f163337g;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f163335e;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f163337g = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzxo(i2, this.f163336f, 1, e);
                }
            }
            throw new zzxo(i2, this.f163336f, 1, e);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m66564S(int i) throws zzxo {
        int i2 = this.f163337g;
        try {
            byte[] bArr = this.f163335e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f163337g = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i2, this.f163336f, 4, e);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m66565T(long j) throws zzxo {
        int i;
        int i2 = this.f163337g;
        int i3 = this.f163336f;
        byte[] bArr = this.f163335e;
        if (!f163333i || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzxo(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzxo(i, i3, 1, e);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                k7f1.f120083c.mo43815b(bArr, k7f1.f120086f + ((long) i2), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            k7f1.f120083c.mo43815b(bArr, k7f1.f120086f + ((long) i2), (byte) j3);
        }
        this.f163337g = i;
    }

    /* JADX INFO: renamed from: U */
    public final void m66566U(long j) throws zzxo {
        int i = this.f163337g;
        try {
            byte[] bArr = this.f163335e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f163337g = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i, this.f163336f, 8, e);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m66567V(byte[] bArr, int i) throws zzxo {
        try {
            System.arraycopy(bArr, 0, this.f163335e, this.f163337g, i);
            this.f163337g += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(this.f163337g, this.f163336f, i, e);
        }
    }
}
