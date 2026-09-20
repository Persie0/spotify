package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class tx4 implements dro {

    /* JADX INFO: renamed from: a */
    public final boolean f224557a;

    public tx4() {
        this.f224557a = Build.VERSION.SDK_INT < 34;
    }

    @Override // p204p.dro
    /* JADX INFO: renamed from: a */
    public final ero mo36737a(fu31 fu31Var, ivl0 ivl0Var) {
        gqa gqaVarMo34165C1 = fu31Var.f73394a.mo34165C1();
        if (!gqaVarMo34165C1.mo45430x0(0L, aro.f19106b) && !gqaVarMo34165C1.mo45430x0(0L, aro.f19105a) && (!gqaVarMo34165C1.mo45430x0(0L, aro.f19107c) || !gqaVarMo34165C1.mo45430x0(8L, aro.f19108d) || !gqaVarMo34165C1.mo45430x0(12L, aro.f19109e) || !gqaVarMo34165C1.request(21L) || ((byte) (gqaVarMo34165C1.mo42408l().m65309h(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !gqaVarMo34165C1.mo45430x0(4L, aro.f19110f)) {
                return null;
            }
            if (!gqaVarMo34165C1.mo45430x0(8L, aro.f19111g) && !gqaVarMo34165C1.mo45430x0(8L, aro.f19112h) && !gqaVarMo34165C1.mo45430x0(8L, aro.f19113i)) {
                return null;
            }
        }
        return new yx4(fu31Var.f73394a, ivl0Var, this.f224557a);
    }
}
