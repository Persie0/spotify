package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class lrw0 extends ijh {

    /* JADX INFO: renamed from: T1 */
    public final x4t0 f136365T1;

    /* JADX INFO: renamed from: U1 */
    public qe70 f136366U1 = gkw0.f80919L0;

    public lrw0(x4t0 x4t0Var) {
        this.f136365T1 = x4t0Var;
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f136365T1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: t1 */
    public final void mo38127t1(srk srkVar) {
        srkVar.m87626g().m1578L(3);
    }

    @Override // p204p.ijh
    /* JADX INFO: renamed from: w1 */
    public final void mo38128w1(fjh fjhVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1206448293);
        int i2 = (xq00Var.m91770i(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            y0v.m92603a(2, rkk.m75772x(-673493967, new jiv0(this, 24), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dos0(this, fjhVar, i, 29);
        }
    }
}
