package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class twe extends q0f1 {

    /* JADX INFO: renamed from: P0 */
    public static final Logger f224425P0 = Logger.getLogger(twe.class.getName());

    /* JADX INFO: renamed from: Q0 */
    public static final boolean f224426Q0 = c5a1.f34127f;

    /* JADX INFO: renamed from: L0 */
    public final byte[] f224427L0;

    /* JADX INFO: renamed from: M0 */
    public final int f224428M0;

    /* JADX INFO: renamed from: N0 */
    public int f224429N0;

    /* JADX INFO: renamed from: O0 */
    public final pg21 f224430O0;

    /* JADX INFO: renamed from: Z */
    public rc9 f224431Z;

    public twe(pg21 pg21Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f224427L0 = new byte[iMax];
        this.f224428M0 = iMax;
        this.f224430O0 = pg21Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m81668A0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* JADX INFO: renamed from: B0 */
    public static int m81669B0(int i) {
        return m81677J0(i) + 4;
    }

    /* JADX INFO: renamed from: C0 */
    public static int m81670C0(int i) {
        return m81677J0(i) + 8;
    }

    /* JADX INFO: renamed from: D0 */
    public static int m81671D0(int i, int i2) {
        return m81672E0(i2) + m81677J0(i);
    }

    /* JADX INFO: renamed from: E0 */
    public static int m81672E0(int i) {
        return m81679L0((i >> 31) ^ (i << 1));
    }

    /* JADX INFO: renamed from: F0 */
    public static int m81673F0(int i, long j) {
        return m81674G0(j) + m81677J0(i);
    }

    /* JADX INFO: renamed from: G0 */
    public static int m81674G0(long j) {
        return m81681N0((j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: H0 */
    public static int m81675H0(int i, String str) {
        return m81676I0(str) + m81677J0(i);
    }

    /* JADX INFO: renamed from: I0 */
    public static int m81676I0(String str) {
        int length;
        try {
            length = zza1.m97288b(str);
        } catch (sza1 unused) {
            length = str.getBytes(ge50.f79023a).length;
        }
        return m81679L0(length) + length;
    }

    /* JADX INFO: renamed from: J0 */
    public static int m81677J0(int i) {
        return m81679L0(i << 3);
    }

    /* JADX INFO: renamed from: K0 */
    public static int m81678K0(int i, int i2) {
        return m81679L0(i2) + m81677J0(i);
    }

    /* JADX INFO: renamed from: L0 */
    public static int m81679L0(int i) {
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

    /* JADX INFO: renamed from: M0 */
    public static int m81680M0(int i, long j) {
        return m81681N0(j) + m81677J0(i);
    }

    /* JADX INFO: renamed from: N0 */
    public static int m81681N0(long j) {
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

    /* JADX INFO: renamed from: h0 */
    public static int m81683h0(int i) {
        return m81677J0(i) + 1;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m81684i0(byte[] bArr) {
        int length = bArr.length;
        return m81679L0(length) + length;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m81685j0(int i, dva dvaVar) {
        return m81686k0(dvaVar) + m81677J0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public static int m81686k0(dva dvaVar) {
        int size = dvaVar.size();
        return m81679L0(size) + size;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m81687l0(int i) {
        return m81677J0(i) + 8;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m81688m0(int i, int i2) {
        return m81696u0(i2) + m81677J0(i);
    }

    /* JADX INFO: renamed from: n0 */
    public static int m81689n0(int i) {
        return m81696u0(i);
    }

    /* JADX INFO: renamed from: o0 */
    public static int m81690o0(int i) {
        return m81677J0(i) + 4;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m81691p0(int i) {
        return m81677J0(i) + 8;
    }

    /* JADX INFO: renamed from: q0 */
    public static int m81692q0(int i) {
        return m81677J0(i) + 4;
    }

    /* JADX INFO: renamed from: r0 */
    public static int m81693r0(int i, AbstractC0044a abstractC0044a, mgy0 mgy0Var) {
        return abstractC0044a.m427b(mgy0Var) + (m81677J0(i) * 2);
    }

    /* JADX INFO: renamed from: s0 */
    public static int m81694s0(AbstractC0044a abstractC0044a) {
        return abstractC0044a.mo426a();
    }

    /* JADX INFO: renamed from: t0 */
    public static int m81695t0(int i, int i2) {
        return m81696u0(i2) + m81677J0(i);
    }

    /* JADX INFO: renamed from: u0 */
    public static int m81696u0(int i) {
        if (i >= 0) {
            return m81679L0(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: v0 */
    public static int m81697v0(int i, long j) {
        return m81681N0(j) + m81677J0(i);
    }

    /* JADX INFO: renamed from: w0 */
    public static int m81698w0(long j) {
        return m81681N0(j);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m81699x0(int i, AbstractC0044a abstractC0044a, mgy0 mgy0Var) {
        return m81701z0(abstractC0044a, mgy0Var) + m81677J0(i);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m81700y0(AbstractC0044a abstractC0044a) {
        int iMo426a = abstractC0044a.mo426a();
        return m81679L0(iMo426a) + iMo426a;
    }

    /* JADX INFO: renamed from: z0 */
    public static int m81701z0(AbstractC0044a abstractC0044a, mgy0 mgy0Var) {
        int iM427b = abstractC0044a.m427b(mgy0Var);
        return m81679L0(iM427b) + iM427b;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m81702O0() throws IOException {
        this.f224430O0.write(this.f224427L0, 0, this.f224429N0);
        this.f224429N0 = 0;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m81703P0(int i) throws IOException {
        if (this.f224428M0 - this.f224429N0 < i) {
            m81702O0();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m81704Q0(byte b) {
        if (this.f224429N0 == this.f224428M0) {
            m81702O0();
        }
        int i = this.f224429N0;
        this.f224429N0 = i + 1;
        this.f224427L0[i] = b;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m81705R0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f224429N0;
        int i4 = this.f224428M0;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f224427L0;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f224429N0 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f224429N0 = i4;
        m81702O0();
        if (i7 > i4) {
            this.f224430O0.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f224429N0 = i7;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m81706S0(int i, boolean z) {
        m81703P0(11);
        m81720e0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f224429N0;
        this.f224429N0 = i2 + 1;
        this.f224427L0[i2] = b;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m81707T0(int i, dva dvaVar) {
        m81726h1(i, 2);
        m81708U0(dvaVar);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m81708U0(dva dvaVar) {
        m81728j1(dvaVar.size());
        mo71847V(dvaVar.m37079b(), dvaVar.f53405b, dvaVar.size());
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: V */
    public final void mo71847V(int i, byte[] bArr, int i2) throws IOException {
        m81705R0(bArr, i, i2);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m81709V0(double d) {
        m81714Z0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: W0 */
    public final void m81710W0(int i, int i2) {
        m81703P0(14);
        m81720e0(i, 5);
        m81713Z(i2);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m81711X0(int i) {
        m81703P0(4);
        m81713Z(i);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m81712Y0(int i, long j) {
        m81703P0(18);
        m81720e0(i, 1);
        m81718d0(j);
    }

    /* JADX INFO: renamed from: Z */
    public final void m81713Z(int i) {
        int i2 = this.f224429N0;
        int i3 = i2 + 1;
        this.f224429N0 = i3;
        byte[] bArr = this.f224427L0;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f224429N0 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f224429N0 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f224429N0 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m81714Z0(long j) {
        m81703P0(8);
        m81718d0(j);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m81715a1(float f) {
        m81711X0(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: b1 */
    public final void m81716b1(int i, int i2) {
        m81703P0(20);
        m81720e0(i, 0);
        if (i2 >= 0) {
            m81722f0(i2);
        } else {
            m81724g0(i2);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m81717c1(int i) {
        if (i >= 0) {
            m81728j1(i);
        } else {
            m81730l1(i);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m81718d0(long j) {
        int i = this.f224429N0;
        int i2 = i + 1;
        this.f224429N0 = i2;
        byte[] bArr = this.f224427L0;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f224429N0 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f224429N0 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f224429N0 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f224429N0 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f224429N0 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f224429N0 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f224429N0 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m81719d1(int i) {
        m81728j1((i >> 31) ^ (i << 1));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m81720e0(int i, int i2) {
        m81722f0(dul.m37017t(i, i2));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m81721e1(long j) {
        m81730l1((j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m81722f0(int i) {
        boolean z = f224426Q0;
        byte[] bArr = this.f224427L0;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f224429N0;
                this.f224429N0 = i2 + 1;
                c5a1.m31474j(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.f224429N0;
            this.f224429N0 = i3 + 1;
            c5a1.m31474j(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.f224429N0;
            this.f224429N0 = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.f224429N0;
        this.f224429N0 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m81723f1(int i, String str) {
        m81726h1(i, 2);
        m81725g1(str);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m81724g0(long j) {
        boolean z = f224426Q0;
        byte[] bArr = this.f224427L0;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f224429N0;
                this.f224429N0 = i + 1;
                c5a1.m31474j(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.f224429N0;
            this.f224429N0 = i2 + 1;
            c5a1.m31474j(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f224429N0;
            this.f224429N0 = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.f224429N0;
        this.f224429N0 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m81725g1(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM81679L0 = m81679L0(length);
            int i = iM81679L0 + length;
            int i2 = this.f224428M0;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo68636h = zza1.f287933a.mo68636h(str, bArr, 0, length);
                m81728j1(iMo68636h);
                m81705R0(bArr, 0, iMo68636h);
                return;
            }
            if (i > i2 - this.f224429N0) {
                m81702O0();
            }
            int iM81679L1 = m81679L0(str.length());
            int i3 = this.f224429N0;
            byte[] bArr2 = this.f224427L0;
            try {
                if (iM81679L1 == iM81679L0) {
                    int i4 = i3 + iM81679L1;
                    this.f224429N0 = i4;
                    int iMo68636h2 = zza1.f287933a.mo68636h(str, bArr2, i4, i2 - i4);
                    this.f224429N0 = i3;
                    m81722f0((iMo68636h2 - i3) - iM81679L1);
                    this.f224429N0 = iMo68636h2;
                } else {
                    int iM97288b = zza1.m97288b(str);
                    m81722f0(iM97288b);
                    this.f224429N0 = zza1.f287933a.mo68636h(str, bArr2, this.f224429N0, iM97288b);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(e);
            } catch (sza1 e2) {
                this.f224429N0 = i3;
                throw e2;
            }
        } catch (sza1 e3) {
            f224425P0.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(ge50.f79023a);
            try {
                m81728j1(bytes.length);
                mo71847V(0, bytes, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(e5);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m81726h1(int i, int i2) {
        m81728j1(dul.m37017t(i, i2));
    }

    /* JADX INFO: renamed from: i1 */
    public final void m81727i1(int i, int i2) {
        m81703P0(20);
        m81720e0(i, 0);
        m81722f0(i2);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m81728j1(int i) {
        m81703P0(5);
        m81722f0(i);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m81729k1(int i, long j) {
        m81703P0(20);
        m81720e0(i, 0);
        m81724g0(j);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m81730l1(long j) {
        m81703P0(10);
        m81724g0(j);
    }
}
