package p204p;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class fp3 implements c5y {

    /* JADX INFO: renamed from: s */
    public static final int[] f71701s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t */
    public static final int[] f71702t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u */
    public static final byte[] f71703u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f71704v;

    /* JADX INFO: renamed from: b */
    public final int f71706b;

    /* JADX INFO: renamed from: c */
    public final nlr f71707c;

    /* JADX INFO: renamed from: d */
    public boolean f71708d;

    /* JADX INFO: renamed from: e */
    public long f71709e;

    /* JADX INFO: renamed from: f */
    public int f71710f;

    /* JADX INFO: renamed from: g */
    public int f71711g;

    /* JADX INFO: renamed from: h */
    public long f71712h;

    /* JADX INFO: renamed from: j */
    public int f71714j;

    /* JADX INFO: renamed from: k */
    public long f71715k;

    /* JADX INFO: renamed from: l */
    public e5y f71716l;

    /* JADX INFO: renamed from: m */
    public ck81 f71717m;

    /* JADX INFO: renamed from: n */
    public ck81 f71718n;

    /* JADX INFO: renamed from: o */
    public ddz0 f71719o;

    /* JADX INFO: renamed from: p */
    public boolean f71720p;

    /* JADX INFO: renamed from: q */
    public long f71721q;

    /* JADX INFO: renamed from: r */
    public boolean f71722r;

    /* JADX INFO: renamed from: a */
    public final byte[] f71705a = new byte[1];

    /* JADX INFO: renamed from: i */
    public int f71713i = -1;

    static {
        String str = h0b1.f86200a;
        Charset charset = StandardCharsets.UTF_8;
        f71703u = "#!AMR\n".getBytes(charset);
        f71704v = "#!AMR-WB\n".getBytes(charset);
    }

    public fp3(int i) {
        this.f71706b = i;
        nlr nlrVar = new nlr();
        this.f71707c = nlrVar;
        this.f71718n = nlrVar;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        this.f71709e = 0L;
        this.f71710f = 0;
        this.f71711g = 0;
        this.f71721q = j2;
        ddz0 ddz0Var = this.f71719o;
        if (!(ddz0Var instanceof vn40)) {
            if (j == 0 || !(ddz0Var instanceof f5j)) {
                this.f71715k = 0L;
                return;
            } else {
                f5j f5jVar = (f5j) ddz0Var;
                this.f71715k = (Math.max(0L, j - f5jVar.f66087b) * 8000000) / ((long) f5jVar.f66090e);
                return;
            }
        }
        vn40 vn40Var = (vn40) ddz0Var;
        w1b0 w1b0Var = vn40Var.f242994b;
        long jM86987e = w1b0Var.f247053b == 0 ? -9223372036854775807L : w1b0Var.m86987e(h0b1.m46305d(vn40Var.f242993a, j));
        this.f71715k = jM86987e;
        if (Math.abs(this.f71721q - jM86987e) < 20000) {
            return;
        }
        this.f71720p = true;
        this.f71718n = this.f71707c;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        this.f71716l = e5yVar;
        ck81 ck81VarMo37837x = e5yVar.mo37837x(0, 1);
        this.f71717m = ck81VarMo37837x;
        this.f71718n = ck81VarMo37837x;
        e5yVar.mo37836t();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[PHI: r4
      0x00ee: PHI (r4v1 p.d5y) = (r4v0 p.d5y), (r4v6 p.d5y) binds: [B:53:0x00ec, B:56:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) throws ParserException {
        d5y d5yVar2;
        int i;
        int iMo33091e;
        int i2;
        this.f71717m.getClass();
        String str = h0b1.f86200a;
        if (d5yVar.getPosition() == 0 && !m42322g(d5yVar)) {
            throw ParserException.m752a(null, "Could not find AMR header.");
        }
        if (!this.f71722r) {
            this.f71722r = true;
            boolean z = this.f71708d;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i3 = z ? pxb.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i4 = z ? f71702t[8] : f71701s[7];
            ck81 ck81Var = this.f71717m;
            p300 p300Var = new p300();
            p300Var.f173526n = def0.m35799p(str2);
            p300Var.f173527o = def0.m35799p(str3);
            p300Var.f173528p = i4;
            p300Var.f173502I = 1;
            p300Var.f173504K = i3;
            t3d1.m80000o(p300Var, ck81Var);
        }
        int i5 = 0;
        if (this.f71711g == 0) {
            try {
                int iM42321f = m42321f(d5yVar);
                this.f71710f = iM42321f;
                this.f71711g = iM42321f;
                if (this.f71713i == -1) {
                    this.f71712h = d5yVar.getPosition();
                    this.f71713i = this.f71710f;
                }
                if (this.f71713i == this.f71710f) {
                    this.f71714j++;
                }
                ddz0 ddz0Var = this.f71719o;
                if (ddz0Var instanceof vn40) {
                    vn40 vn40Var = (vn40) ddz0Var;
                    long j = this.f71715k + this.f71709e + 20000;
                    long position = d5yVar.getPosition() + ((long) this.f71710f);
                    w1b0 w1b0Var = vn40Var.f242994b;
                    int i6 = w1b0Var.f247053b;
                    if (i6 == 0 || j - w1b0Var.m86987e(i6 - 1) >= 100000) {
                        w1b0 w1b0Var2 = vn40Var.f242993a;
                        w1b0 w1b0Var3 = vn40Var.f242994b;
                        if (w1b0Var3.f247053b == 0 && j > 0) {
                            w1b0Var2.m86983a(0L);
                            w1b0Var3.m86983a(0L);
                        }
                        w1b0Var2.m86983a(position);
                        w1b0Var3.m86983a(j);
                    }
                    if (this.f71720p && Math.abs(this.f71721q - j) < 20000) {
                        this.f71720p = false;
                        this.f71718n = this.f71717m;
                    }
                }
                d5yVar2 = d5yVar;
                iMo33091e = this.f71718n.mo33091e(d5yVar2, this.f71711g, true);
                if (iMo33091e == -1) {
                    i5 = -1;
                } else {
                    i2 = this.f71711g - iMo33091e;
                    this.f71711g = i2;
                    if (i2 <= 0) {
                        this.f71718n.mo33088b(this.f71715k + this.f71709e, 1, this.f71710f, 0, null);
                        this.f71709e += 20000;
                    }
                }
            } catch (EOFException unused) {
                d5yVar2 = d5yVar;
            }
        } else {
            d5yVar2 = d5yVar;
            iMo33091e = this.f71718n.mo33091e(d5yVar2, this.f71711g, true);
            if (iMo33091e == -1) {
                i5 = -1;
            } else {
                i2 = this.f71711g - iMo33091e;
                this.f71711g = i2;
                if (i2 <= 0) {
                    this.f71718n.mo33088b(this.f71715k + this.f71709e, 1, this.f71710f, 0, null);
                    this.f71709e += 20000;
                }
            }
        }
        long length = d5yVar2.getLength();
        if (this.f71719o == null) {
            if ((this.f71706b & 1) == 0 || !((i = this.f71713i) == -1 || i == this.f71710f)) {
                this.f71719o = new ra8(-9223372036854775807L);
            } else if (this.f71714j >= 20 || i5 == -1) {
                f5j f5jVar = new f5j(length, this.f71712h, (int) ((((long) i) * 8000000) / 20000), i, false, true);
                this.f71719o = f5jVar;
                this.f71717m.mo33093g(f5jVar.f66091f);
            }
            ddz0 ddz0Var2 = this.f71719o;
            if (ddz0Var2 != null) {
                this.f71716l.mo37835d(ddz0Var2);
            }
        }
        if (i5 == -1) {
            ddz0 ddz0Var3 = this.f71719o;
            if (ddz0Var3 instanceof vn40) {
                long j2 = this.f71715k + this.f71709e;
                ((vn40) ddz0Var3).f242995c = j2;
                this.f71716l.mo37835d(ddz0Var3);
                this.f71717m.mo33093g(j2);
            }
        }
        return i5;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        return m42322g(d5yVar);
    }

    /* JADX INFO: renamed from: f */
    public final int m42321f(d5y d5yVar) throws ParserException {
        boolean z;
        d5yVar.mo35037g();
        byte[] bArr = this.f71705a;
        d5yVar.mo35039i(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.m752a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f71708d) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f71702t[i] : f71701s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f71708d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.m752a(null, sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m42322g(d5y d5yVar) {
        d5yVar.mo35037g();
        byte[] bArr = f71703u;
        byte[] bArr2 = new byte[bArr.length];
        d5yVar.mo35039i(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f71708d = false;
            d5yVar.mo35044v(bArr.length);
            return true;
        }
        d5yVar.mo35037g();
        byte[] bArr3 = f71704v;
        byte[] bArr4 = new byte[bArr3.length];
        d5yVar.mo35039i(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f71708d = true;
        d5yVar.mo35044v(bArr3.length);
        return true;
    }

    @Override // p204p.c5y
    public final void release() {
    }
}
