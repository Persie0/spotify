package p204p;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class o3t0 {

    /* JADX INFO: renamed from: a */
    public final i4b1 f161438a;

    /* JADX INFO: renamed from: b */
    public int f161439b = -1;

    /* JADX INFO: renamed from: c */
    public z2t0 f161440c = z2t0.INVALID;

    /* JADX INFO: renamed from: d */
    public boolean f161441d;

    /* JADX INFO: renamed from: e */
    public int f161442e;

    public o3t0(i4b1 i4b1Var) {
        this.f161438a = i4b1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m66193a(int i) {
        if (i < 0) {
            throw new ProtobufDecodingException(s571.m77246e(i, "Unexpected negative length: "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[LOOP:0: B:22:0x003c->B:29:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final int m66194b(l2t0 l2t0Var) {
        int i;
        int iM49669c;
        int iOrdinal = l2t0Var.ordinal();
        i4b1 i4b1Var = this.f161438a;
        if (iOrdinal == 0) {
            return (int) i4b1Var.m49671e(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m66208p();
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = i4b1Var.f98485c;
        int i3 = i4b1Var.f98484b;
        if (i2 == i3) {
            throw new SerializationException("Unexpected EOF");
        }
        byte[] bArr = i4b1Var.f98483a;
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 >= 0) {
            i4b1Var.f98485c = i4;
        } else {
            if (i3 - i2 <= 1) {
                i = 0;
                for (int i6 = 0; i6 < 32; i6 += 7) {
                    iM49669c = i4b1Var.m49669c();
                    i |= (iM49669c & 127) << i6;
                    if ((iM49669c & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new SerializationException("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            int i7 = i2 + 2;
            int i8 = (bArr[i4] << 7) ^ i5;
            if (i8 >= 0) {
                i = 0;
                while (i6 < 32) {
                    iM49669c = i4b1Var.m49669c();
                    i |= (iM49669c & 127) << i6;
                    if ((iM49669c & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new SerializationException("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            i4b1Var.f98485c = i7;
            i5 = (i8 == true ? 1 : 0) ^ (-128);
        }
        return (((((i5 << 31) >> 31) ^ i5) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i5);
    }

    /* JADX INFO: renamed from: c */
    public final long m66195c(l2t0 l2t0Var) {
        int iOrdinal = l2t0Var.ordinal();
        i4b1 i4b1Var = this.f161438a;
        if (iOrdinal == 0) {
            return i4b1Var.m49671e(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m66210r();
            }
            throw new NoWhenBranchMatchedException();
        }
        long jM49671e = i4b1Var.m49671e(false);
        return (jM49671e & Long.MIN_VALUE) ^ ((((jM49671e << 63) >> 63) ^ jM49671e) >> 1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m66196d() {
        if (this.f161441d) {
            return false;
        }
        i4b1 i4b1Var = this.f161438a;
        return i4b1Var.f98484b - i4b1Var.f98485c == 0;
    }

    /* JADX INFO: renamed from: e */
    public final i4b1 m66197e() {
        z2t0 z2t0Var = z2t0.SIZE_DELIMITED;
        if (this.f161440c == z2t0Var) {
            return m66198f();
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: f */
    public final i4b1 m66198f() {
        int iM66194b = m66194b(l2t0.f129074b);
        m66193a(iM66194b);
        i4b1 i4b1Var = this.f161438a;
        i4b1Var.m49668b(iM66194b);
        byte[] bArr = i4b1Var.f98483a;
        int i = i4b1Var.f98485c;
        i4b1 i4b1Var2 = new i4b1(bArr, i + iM66194b);
        i4b1Var2.f98485c = i;
        i4b1Var.f98485c += iM66194b;
        return i4b1Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m66199g() {
        this.f161441d = true;
        int i = (this.f161439b << 3) | this.f161440c.f278674a;
        m66216x(this.f161442e);
        this.f161442e = i;
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m66200h() {
        z2t0 z2t0Var = z2t0.SIZE_DELIMITED;
        if (this.f161440c == z2t0Var) {
            return m66201i();
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m66201i() {
        int iM66194b = m66194b(l2t0.f129074b);
        m66193a(iM66194b);
        i4b1 i4b1Var = this.f161438a;
        i4b1Var.m49668b(iM66194b);
        byte[] bArr = new byte[iM66194b];
        int i = i4b1Var.f98484b;
        int i2 = i4b1Var.f98485c;
        int i3 = i - i2;
        if (i3 < iM66194b) {
            iM66194b = i3;
        }
        bk5.m29625n0(0, i2, i2 + iM66194b, i4b1Var.f98483a, bArr);
        i4b1Var.f98485c += iM66194b;
        return bArr;
    }

    /* JADX INFO: renamed from: j */
    public final double m66202j() {
        z2t0 z2t0Var = z2t0.i64;
        if (this.f161440c == z2t0Var) {
            return Double.longBitsToDouble(m66210r());
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: k */
    public final double m66203k() {
        return Double.longBitsToDouble(m66210r());
    }

    /* JADX INFO: renamed from: l */
    public final float m66204l() {
        z2t0 z2t0Var = z2t0.i32;
        if (this.f161440c == z2t0Var) {
            return Float.intBitsToFloat(m66208p());
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: m */
    public final float m66205m() {
        return Float.intBitsToFloat(m66208p());
    }

    /* JADX INFO: renamed from: n */
    public final int m66206n(l2t0 l2t0Var) {
        z2t0 z2t0Var = l2t0Var == l2t0.f129076d ? z2t0.i32 : z2t0.VARINT;
        if (this.f161440c == z2t0Var) {
            return m66194b(l2t0Var);
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: o */
    public final int m66207o() {
        return m66194b(l2t0.f129074b);
    }

    /* JADX INFO: renamed from: p */
    public final int m66208p() {
        int iM49669c = 0;
        for (int i = 0; i < 4; i++) {
            iM49669c |= (this.f161438a.m49669c() & 255) << (i * 8);
        }
        return iM49669c;
    }

    /* JADX INFO: renamed from: q */
    public final long m66209q(l2t0 l2t0Var) {
        z2t0 z2t0Var = l2t0Var == l2t0.f129076d ? z2t0.i64 : z2t0.VARINT;
        if (this.f161440c == z2t0Var) {
            return m66195c(l2t0Var);
        }
        throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
    }

    /* JADX INFO: renamed from: r */
    public final long m66210r() {
        long jM49669c = 0;
        for (int i = 0; i < 8; i++) {
            jM49669c |= ((long) (this.f161438a.m49669c() & 255)) << (i * 8);
        }
        return jM49669c;
    }

    /* JADX INFO: renamed from: s */
    public final long m66211s() {
        return m66195c(l2t0.f129074b);
    }

    /* JADX INFO: renamed from: t */
    public final String m66212t() {
        z2t0 z2t0Var = z2t0.SIZE_DELIMITED;
        if (this.f161440c != z2t0Var) {
            throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
        }
        int iM66194b = m66194b(l2t0.f129074b);
        m66193a(iM66194b);
        i4b1 i4b1Var = this.f161438a;
        byte[] bArr = i4b1Var.f98483a;
        int i = i4b1Var.f98485c;
        String strM29795f0 = bm51.m29795f0(i, bArr, i + iM66194b, 4);
        i4b1Var.f98485c += iM66194b;
        return strM29795f0;
    }

    /* JADX INFO: renamed from: u */
    public final String m66213u() {
        int iM66194b = m66194b(l2t0.f129074b);
        m66193a(iM66194b);
        i4b1 i4b1Var = this.f161438a;
        byte[] bArr = i4b1Var.f98483a;
        int i = i4b1Var.f98485c;
        String strM29795f0 = bm51.m29795f0(i, bArr, i + iM66194b, 4);
        i4b1Var.f98485c += iM66194b;
        return strM29795f0;
    }

    /* JADX INFO: renamed from: v */
    public final int m66214v() {
        if (!this.f161441d) {
            this.f161442e = (this.f161439b << 3) | this.f161440c.f278674a;
            return m66216x((int) this.f161438a.m49671e(true));
        }
        this.f161441d = false;
        int i = (this.f161439b << 3) | this.f161440c.f278674a;
        int iM66216x = m66216x(this.f161442e);
        this.f161442e = i;
        return iM66216x;
    }

    /* JADX INFO: renamed from: w */
    public final void m66215w() {
        int iOrdinal = this.f161440c.ordinal();
        l2t0 l2t0Var = l2t0.f129074b;
        if (iOrdinal == 1) {
            m66206n(l2t0Var);
            return;
        }
        l2t0 l2t0Var2 = l2t0.f129076d;
        if (iOrdinal == 2) {
            m66209q(l2t0Var2);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                m66206n(l2t0Var2);
                return;
            } else {
                throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.f161440c, null);
            }
        }
        z2t0 z2t0Var = z2t0.SIZE_DELIMITED;
        if (this.f161440c != z2t0Var) {
            throw new ProtobufDecodingException("Expected wire type " + z2t0Var + ", but found " + this.f161440c, null);
        }
        int iM66194b = m66194b(l2t0Var);
        m66193a(iM66194b);
        i4b1 i4b1Var = this.f161438a;
        i4b1Var.m49668b(iM66194b);
        i4b1Var.f98485c += iM66194b;
    }

    /* JADX INFO: renamed from: x */
    public final int m66216x(int i) {
        if (i == -1) {
            this.f161439b = -1;
            this.f161440c = z2t0.INVALID;
            return -1;
        }
        int i2 = i >>> 3;
        this.f161439b = i2;
        z2t0[] z2t0VarArr = z2t0.f278666b;
        this.f161440c = z2t0.f278666b[i & 7];
        return i2;
    }
}
