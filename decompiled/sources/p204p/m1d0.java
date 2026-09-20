package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m1d0 implements xhd0, whd0 {

    /* JADX INFO: renamed from: a */
    public final vsd0 f138939a;

    /* JADX INFO: renamed from: b */
    public final long f138940b;

    /* JADX INFO: renamed from: c */
    public final mn3 f138941c;

    /* JADX INFO: renamed from: d */
    public wz8 f138942d;

    /* JADX INFO: renamed from: e */
    public xhd0 f138943e;

    /* JADX INFO: renamed from: f */
    public whd0 f138944f;

    /* JADX INFO: renamed from: g */
    public long f138945g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public boolean f138946h;

    public m1d0(vsd0 vsd0Var, mn3 mn3Var, long j) {
        this.f138939a = vsd0Var;
        this.f138941c = mn3Var;
        this.f138940b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m60536a(vsd0 vsd0Var) {
        long j = this.f138945g;
        if (j == -9223372036854775807L) {
            j = this.f138940b;
        }
        wz8 wz8Var = this.f138942d;
        wz8Var.getClass();
        xhd0 xhd0VarMo27867f = wz8Var.mo27867f(vsd0Var, this.f138941c, j);
        this.f138943e = xhd0VarMo27867f;
        if (this.f138946h) {
            xhd0VarMo27867f.mo26785p();
        }
        if (this.f138944f != null) {
            this.f138943e.mo26790w(this, j);
        }
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: b */
    public final long mo26774b() {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26774b();
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: c */
    public final boolean mo26775c() {
        xhd0 xhd0Var = this.f138943e;
        return xhd0Var != null && xhd0Var.mo26775c();
    }

    @Override // p204p.ysz0
    /* JADX INFO: renamed from: d */
    public final void mo26776d(zsz0 zsz0Var) {
        whd0 whd0Var = this.f138944f;
        String str = h0b1.f86200a;
        whd0Var.mo26776d(this);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: e */
    public final long mo26777e(long j) {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26777e(j);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: f */
    public final List mo26778f(ArrayList arrayList) {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26778f(arrayList);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: g */
    public final long mo26779g() {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26779g();
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: h */
    public final boolean mo26780h(m8a0 m8a0Var) {
        xhd0 xhd0Var = this.f138943e;
        return xhd0Var != null && xhd0Var.mo26780h(m8a0Var);
    }

    @Override // p204p.whd0
    /* JADX INFO: renamed from: i */
    public final void mo26781i(xhd0 xhd0Var) {
        whd0 whd0Var = this.f138944f;
        String str = h0b1.f86200a;
        whd0Var.mo26781i(this);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: k */
    public final long mo46188k(long j) {
        xhd0 xhd0Var = this.f138943e;
        if (xhd0Var != null) {
            return xhd0Var.mo46188k(j);
        }
        return Long.MIN_VALUE;
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: m */
    public final long mo26784m(xjx[] xjxVarArr, boolean[] zArr, p1y0[] p1y0VarArr, boolean[] zArr2, long j) {
        long j2 = this.f138945g;
        long j3 = (j2 == -9223372036854775807L || j != this.f138940b) ? j : j2;
        this.f138945g = -9223372036854775807L;
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26784m(xjxVarArr, zArr, p1y0VarArr, zArr2, j3);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: p */
    public final void mo26785p() {
        this.f138946h = true;
        xhd0 xhd0Var = this.f138943e;
        if (xhd0Var != null) {
            xhd0Var.mo26785p();
        }
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: q */
    public final void mo26786q() {
        xhd0 xhd0Var = this.f138943e;
        if (xhd0Var != null) {
            xhd0Var.mo26786q();
            return;
        }
        wz8 wz8Var = this.f138942d;
        if (wz8Var != null) {
            wz8Var.mo27869o();
        }
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: r */
    public final void mo26787r(long j) {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        xhd0Var.mo26787r(j);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: u */
    public final long mo26788u(long j, mdz0 mdz0Var) {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26788u(j, mdz0Var);
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: v */
    public final lf81 mo26789v() {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26789v();
    }

    @Override // p204p.xhd0
    /* JADX INFO: renamed from: w */
    public final void mo26790w(whd0 whd0Var, long j) {
        this.f138944f = whd0Var;
        xhd0 xhd0Var = this.f138943e;
        if (xhd0Var != null) {
            long j2 = this.f138945g;
            if (j2 == -9223372036854775807L) {
                j2 = this.f138940b;
            }
            xhd0Var.mo26790w(this, j2);
        }
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: y */
    public final long mo26791y() {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        return xhd0Var.mo26791y();
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: z */
    public final void mo26792z(long j) {
        xhd0 xhd0Var = this.f138943e;
        String str = h0b1.f86200a;
        xhd0Var.mo26792z(j);
    }
}
