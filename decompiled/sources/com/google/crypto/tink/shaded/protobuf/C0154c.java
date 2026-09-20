package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;
import p204p.AbstractC2205o8;
import p204p.a5a1;
import p204p.de50;
import p204p.fva;
import p204p.kgy0;
import p204p.n0e1;
import p204p.nt3;
import p204p.qza1;
import p204p.w9h1;
import p204p.xza1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0154c extends n0e1 {

    /* JADX INFO: renamed from: i */
    public static final Logger f2352i = Logger.getLogger(C0154c.class.getName());

    /* JADX INFO: renamed from: j */
    public static final boolean f2353j = a5a1.f12475f;

    /* JADX INFO: renamed from: e */
    public C0155d f2354e;

    /* JADX INFO: renamed from: f */
    public final byte[] f2355f;

    /* JADX INFO: renamed from: g */
    public final int f2356g;

    /* JADX INFO: renamed from: h */
    public int f2357h;

    public C0154c(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f2355f = bArr;
        this.f2357h = 0;
        this.f2356g = i;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m1735f0(int i, fva fvaVar) {
        return m1736g0(fvaVar) + m1742m0(i);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m1736g0(fva fvaVar) {
        int size = fvaVar.size();
        return m1743n0(size) + size;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m1737h0(int i) {
        return m1742m0(i) + 4;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m1738i0(int i) {
        return m1742m0(i) + 8;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m1739j0(int i, AbstractC2205o8 abstractC2205o8, kgy0 kgy0Var) {
        int iM1742m0 = m1742m0(i) * 2;
        abstractC2205o8.getClass();
        AbstractC0156e abstractC0156e = (AbstractC0156e) abstractC2205o8;
        int iMo1835g = abstractC0156e.memoizedSerializedSize;
        if (iMo1835g == -1) {
            iMo1835g = kgy0Var.mo1835g(abstractC2205o8);
            abstractC0156e.memoizedSerializedSize = iMo1835g;
        }
        return iMo1835g + iM1742m0;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m1740k0(int i) {
        if (i >= 0) {
            return m1743n0(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m1741l0(String str) {
        int length;
        try {
            length = xza1.m92443b(str);
        } catch (qza1 unused) {
            length = str.getBytes(de50.f47970a).length;
        }
        return m1743n0(length) + length;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m1742m0(int i) {
        return m1743n0(w9h1.m87514v(i, 0));
    }

    /* JADX INFO: renamed from: n0 */
    public static int m1743n0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: o0 */
    public static int m1744o0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1745p0(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f2355f;
            int i = this.f2357h;
            this.f2357h = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(this.f2356g), 1), e);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1746q0(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f2355f, this.f2357h, i2);
            this.f2357h += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(this.f2356g), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1747r0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m1752w0(i, 5);
        m1748s0(i2);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1748s0(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f2355f;
            int i2 = this.f2357h;
            int i3 = i2 + 1;
            this.f2357h = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f2357h = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f2357h = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f2357h = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(this.f2356g), 1), e);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1749t0(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m1752w0(i, 1);
        m1750u0(j);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1750u0(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f2355f;
            int i = this.f2357h;
            int i2 = i + 1;
            this.f2357h = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f2357h = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f2357h = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f2357h = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f2357h = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f2357h = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f2357h = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f2357h = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(this.f2356g), 1), e);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1751v0(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            m1753x0(i);
        } else {
            m1755z0(i);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m1752w0(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m1753x0(w9h1.m87514v(i, i2));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1753x0(int i) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f2353j;
        int i2 = this.f2356g;
        byte[] bArr = this.f2355f;
        if (z && !nt3.m65594a()) {
            int i3 = this.f2357h;
            if (i2 - i3 >= 5) {
                if ((i & (-128)) == 0) {
                    this.f2357h = i3 + 1;
                    a5a1.m24787j(bArr, i3, (byte) i);
                    return;
                }
                this.f2357h = i3 + 1;
                a5a1.m24787j(bArr, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    int i5 = this.f2357h;
                    this.f2357h = i5 + 1;
                    a5a1.m24787j(bArr, i5, (byte) i4);
                    return;
                }
                int i6 = this.f2357h;
                this.f2357h = i6 + 1;
                a5a1.m24787j(bArr, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    int i8 = this.f2357h;
                    this.f2357h = i8 + 1;
                    a5a1.m24787j(bArr, i8, (byte) i7);
                    return;
                }
                int i9 = this.f2357h;
                this.f2357h = i9 + 1;
                a5a1.m24787j(bArr, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    int i11 = this.f2357h;
                    this.f2357h = i11 + 1;
                    a5a1.m24787j(bArr, i11, (byte) i10);
                    return;
                } else {
                    int i12 = this.f2357h;
                    this.f2357h = i12 + 1;
                    a5a1.m24787j(bArr, i12, (byte) (i10 | 128));
                    int i13 = this.f2357h;
                    this.f2357h = i13 + 1;
                    a5a1.m24787j(bArr, i13, (byte) (i >>> 28));
                    return;
                }
            }
        }
        while ((i & (-128)) != 0) {
            try {
                int i14 = this.f2357h;
                this.f2357h = i14 + 1;
                bArr[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(i2), 1), e);
            }
        }
        int i15 = this.f2357h;
        this.f2357h = i15 + 1;
        bArr[i15] = (byte) i;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1754y0(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m1752w0(i, 0);
        m1755z0(j);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m1755z0(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f2353j;
        int i = this.f2356g;
        byte[] bArr = this.f2355f;
        if (z && i - this.f2357h >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f2357h;
                this.f2357h = i2 + 1;
                a5a1.m24787j(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f2357h;
            this.f2357h = i3 + 1;
            a5a1.m24787j(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f2357h;
                this.f2357h = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2357h), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f2357h;
        this.f2357h = i5 + 1;
        bArr[i5] = (byte) j;
    }
}
