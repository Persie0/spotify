package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public final class ggr0 implements ies0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79735a = 0;

    /* JADX INFO: renamed from: b */
    public final luk f79736b;

    /* JADX INFO: renamed from: c */
    public final luk f79737c;

    /* JADX INFO: renamed from: d */
    public final Object f79738d;

    /* JADX INFO: renamed from: e */
    public final Object f79739e;

    /* JADX INFO: renamed from: f */
    public final Object f79740f;

    /* JADX INFO: renamed from: g */
    public final Object f79741g;

    /* JADX INFO: renamed from: h */
    public final Object f79742h;

    public ggr0(mp6 mp6Var, da80 da80Var, m57 m57Var, ot9 ot9Var, luk lukVar, luk lukVar2, luk lukVar3) {
        this.f79738d = mp6Var;
        this.f79739e = da80Var;
        this.f79740f = m57Var;
        this.f79741g = ot9Var;
        this.f79736b = lukVar;
        this.f79737c = lukVar2;
        this.f79742h = lukVar3;
    }

    @Override // p204p.ies0
    /* JADX INFO: renamed from: a */
    public final ees0 mo31916a(xuk xukVar, jp5 jp5Var, gh00 gh00Var) {
        switch (this.f79735a) {
            case 0:
                return new egr0(jp5Var, new fgr0(gh00Var, this));
            default:
                suu0 suu0Var = new suu0(((mp6) this.f79738d).f145901a, xukVar);
                zv41 zv41VarM52819d = jag1.m52819d(d6e.f45678a);
                da80 da80Var = (da80) this.f79739e;
                luk lukVar = (luk) this.f79742h;
                luk lukVar2 = this.f79736b;
                qea1 qea1Var = new qea1(gh00Var, suu0Var, da80Var, zv41VarM52819d, lukVar, lukVar2);
                luk lukVar3 = this.f79737c;
                return new yfa1(jp5Var, new bmh(qea1Var, new kfa1(suu0Var, lukVar3), (m57) this.f79740f, lukVar2, lukVar3, lukVar), (ot9) this.f79741g, bzf1.m31021m(zv41VarM52819d));
        }
    }

    public ggr0(hgr0 hgr0Var, vmz vmzVar, k5m0 k5m0Var, yz80 yz80Var, Resources resources, luk lukVar, luk lukVar2) {
        this.f79738d = hgr0Var;
        this.f79739e = vmzVar;
        this.f79740f = k5m0Var;
        this.f79741g = yz80Var;
        this.f79742h = resources;
        this.f79736b = lukVar;
        this.f79737c = lukVar2;
    }
}
