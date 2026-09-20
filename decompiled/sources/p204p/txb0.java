package p204p;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes8.dex */
public final class txb0 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nqc1 f224666b;

    public /* synthetic */ txb0(nqc1 nqc1Var, int i) {
        this.f224665a = i;
        this.f224666b = nqc1Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f224665a) {
            case 0:
                Insets insetsM90308f = xba0.m90308f(obj);
                vxb0 vxb0Var = (vxb0) this.f224666b;
                vxb0Var.f245706d.m39516c(vxb0.f245702f[1], vxb0Var, dx40.m37189b(insetsM90308f.left, insetsM90308f.top, insetsM90308f.right, insetsM90308f.bottom));
                break;
            default:
                Insets insetsM90308f2 = xba0.m90308f(obj);
                qqc1 qqc1Var = (qqc1) this.f224666b;
                qqc1Var.f191537e.m39516c(qqc1.f191532j[2], qqc1Var, dx40.m37189b(insetsM90308f2.left, insetsM90308f2.top, insetsM90308f2.right, insetsM90308f2.bottom));
                break;
        }
    }
}
