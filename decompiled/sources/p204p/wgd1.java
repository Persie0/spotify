package p204p;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class wgd1 implements vgd1 {

    /* JADX INFO: renamed from: a */
    public final e5y f251038a;

    /* JADX INFO: renamed from: b */
    public final ck81 f251039b;

    /* JADX INFO: renamed from: c */
    public final o7f f251040c;

    /* JADX INFO: renamed from: d */
    public final r300 f251041d;

    /* JADX INFO: renamed from: e */
    public final int f251042e;

    /* JADX INFO: renamed from: f */
    public long f251043f;

    /* JADX INFO: renamed from: g */
    public int f251044g;

    /* JADX INFO: renamed from: h */
    public long f251045h;

    public wgd1(e5y e5yVar, ck81 ck81Var, o7f o7fVar, String str, int i) throws ParserException {
        this.f251038a = e5yVar;
        this.f251039b = ck81Var;
        this.f251040c = o7fVar;
        int i2 = o7fVar.f162531a;
        int i3 = o7fVar.f162532b;
        int i4 = (o7fVar.f162534d * i2) / 8;
        int i5 = o7fVar.f162533c;
        if (i5 != i4) {
            throw ParserException.m752a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f251042e = iMax;
        p300 p300Var = new p300();
        p300Var.f173526n = def0.m35799p("audio/wav");
        p300Var.f173527o = def0.m35799p(str);
        p300Var.f173521i = i7;
        p300Var.f173522j = i7;
        p300Var.f173528p = iMax;
        p300Var.f173502I = i2;
        int i8 = o7fVar.f162536f;
        p300Var.f173503J = i8 == 0 ? -1 : i8 << 2;
        p300Var.f173504K = i3;
        p300Var.f173505L = i;
        this.f251041d = new r300(p300Var);
    }

    @Override // p204p.vgd1
    /* JADX INFO: renamed from: a */
    public final void mo83031a(int i, long j) {
        ygd1 ygd1Var = new ygd1(this.f251040c, 1, i, j);
        this.f251038a.mo37835d(ygd1Var);
        r300 r300Var = this.f251041d;
        ck81 ck81Var = this.f251039b;
        ck81Var.mo33087a(r300Var);
        ck81Var.mo33093g(ygd1Var.f272569e);
    }

    @Override // p204p.vgd1
    /* JADX INFO: renamed from: b */
    public final boolean mo83032b(d5y d5yVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f251044g) < (i2 = this.f251042e)) {
            int iMo33091e = this.f251039b.mo33091e(d5yVar, (int) Math.min(i2 - i, j2), true);
            if (iMo33091e == -1) {
                j2 = 0;
            } else {
                this.f251044g += iMo33091e;
                j2 -= (long) iMo33091e;
            }
        }
        o7f o7fVar = this.f251040c;
        int i3 = o7fVar.f162533c;
        int i4 = this.f251044g / i3;
        if (i4 > 0) {
            long j3 = this.f251043f;
            long j4 = this.f251045h;
            long j5 = o7fVar.f162532b;
            String str = h0b1.f86200a;
            long jM46312g0 = j3 + h0b1.m46312g0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f251044g - i5;
            this.f251039b.mo33088b(jM46312g0, 1, i5, i6, null);
            this.f251045h += (long) i4;
            this.f251044g = i6;
        }
        return j2 <= 0;
    }

    @Override // p204p.vgd1
    /* JADX INFO: renamed from: c */
    public final void mo83033c(long j) {
        this.f251043f = j;
        this.f251044g = 0;
        this.f251045h = 0L;
    }
}
