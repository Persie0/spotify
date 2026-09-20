package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public final class fgr0 implements i4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f69393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ggr0 f69394b;

    public fgr0(gh00 gh00Var, ggr0 ggr0Var) {
        this.f69393a = gh00Var;
        this.f69394b = ggr0Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        ggr0 ggr0Var = this.f69394b;
        k5m0 k5m0Var = (k5m0) ggr0Var.f79740f;
        yz80 yz80Var = (yz80) ggr0Var.f79741g;
        Resources resources = (Resources) ggr0Var.f79742h;
        luk lukVar = ggr0Var.f79736b;
        yer0 yer0Var = new yer0(this.f69393a, k5m0Var, yz80Var, resources, lukVar);
        hgr0 hgr0Var = (hgr0) ggr0Var.f79738d;
        vmz vmzVar = (vmz) ggr0Var.f79739e;
        luk lukVar2 = ggr0Var.f79737c;
        return new ofr0(yer0Var, new sfr0(hgr0Var, vmzVar, lukVar2), lukVar, lukVar2);
    }
}
