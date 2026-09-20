package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ln71 implements xhd0, whd0 {

    /* JADX INFO: renamed from: a */
    public final xhd0 f135109a;

    /* JADX INFO: renamed from: b */
    public final long f135110b;

    /* JADX INFO: renamed from: c */
    public whd0 f135111c;

    public ln71(xhd0 xhd0Var, long j) {
        this.f135109a = xhd0Var;
        this.f135110b = j;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: b */
    public final long mo26774b() {
        long jMo26774b = this.f135109a.mo26774b();
        if (jMo26774b == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo26774b + this.f135110b;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: c */
    public final boolean mo26775c() {
        return this.f135109a.mo26775c();
    }

    @Override // p204p.ysz0
    /* JADX INFO: renamed from: d */
    public final void mo26776d(zsz0 zsz0Var) {
        whd0 whd0Var = this.f135111c;
        whd0Var.getClass();
        whd0Var.mo26776d(this);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: e */
    public final long mo26777e(long j) {
        long j2 = this.f135110b;
        return this.f135109a.mo26777e(j - j2) + j2;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: f */
    public final List mo26778f(ArrayList arrayList) {
        return this.f135109a.mo26778f(arrayList);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: g */
    public final long mo26779g() {
        long jMo26779g = this.f135109a.mo26779g();
        if (jMo26779g == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo26779g + this.f135110b;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: h */
    public final boolean mo26780h(m8a0 m8a0Var) {
        kop kopVar = new kop();
        long j = m8a0Var.f140996a;
        kopVar.f124840b = m8a0Var.f140997b;
        kopVar.f124841c = m8a0Var.f140998c;
        kopVar.f124839a = j - this.f135110b;
        return this.f135109a.mo26780h(new m8a0(kopVar));
    }

    @Override // p204p.whd0
    /* JADX INFO: renamed from: i */
    public final void mo26781i(xhd0 xhd0Var) {
        whd0 whd0Var = this.f135111c;
        whd0Var.getClass();
        whd0Var.mo26781i(this);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: k */
    public final long mo46188k(long j) {
        long j2 = this.f135110b;
        long jMo46188k = this.f135109a.mo46188k(j == Long.MIN_VALUE ? Long.MIN_VALUE : j - j2);
        if (jMo46188k == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo46188k + j2;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: m */
    public final long mo26784m(xjx[] xjxVarArr, boolean[] zArr, p1y0[] p1y0VarArr, boolean[] zArr2, long j) {
        p1y0[] p1y0VarArr2 = new p1y0[p1y0VarArr.length];
        int i = 0;
        while (true) {
            p1y0 p1y0Var = null;
            if (i >= p1y0VarArr.length) {
                break;
            }
            kn71 kn71Var = (kn71) p1y0VarArr[i];
            if (kn71Var != null) {
                p1y0Var = kn71Var.f124324a;
            }
            p1y0VarArr2[i] = p1y0Var;
            i++;
        }
        xhd0 xhd0Var = this.f135109a;
        long j2 = this.f135110b;
        long jMo26784m = xhd0Var.mo26784m(xjxVarArr, zArr, p1y0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < p1y0VarArr.length; i2++) {
            p1y0 p1y0Var2 = p1y0VarArr2[i2];
            if (p1y0Var2 == null) {
                p1y0VarArr[i2] = null;
            } else {
                p1y0 p1y0Var3 = p1y0VarArr[i2];
                if (p1y0Var3 == null || ((kn71) p1y0Var3).f124324a != p1y0Var2) {
                    p1y0VarArr[i2] = new kn71(p1y0Var2, j2);
                }
            }
        }
        return jMo26784m + j2;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: p */
    public final void mo26785p() {
        String str = h0b1.f86200a;
        this.f135109a.mo26785p();
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: q */
    public final void mo26786q() {
        this.f135109a.mo26786q();
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: r */
    public final void mo26787r(long j) {
        this.f135109a.mo26787r(j - this.f135110b);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: u */
    public final long mo26788u(long j, mdz0 mdz0Var) {
        long j2 = this.f135110b;
        return this.f135109a.mo26788u(j - j2, mdz0Var) + j2;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: v */
    public final lf81 mo26789v() {
        return this.f135109a.mo26789v();
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: w */
    public final void mo26790w(whd0 whd0Var, long j) {
        this.f135111c = whd0Var;
        this.f135109a.mo26790w(this, j - this.f135110b);
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: y */
    public final long mo26791y() {
        long jMo26791y = this.f135109a.mo26791y();
        if (jMo26791y == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo26791y + this.f135110b;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: z */
    public final void mo26792z(long j) {
        this.f135109a.mo26792z(j - this.f135110b);
    }
}
