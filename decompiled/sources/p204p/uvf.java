package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uvf implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f234436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f234437c;

    public /* synthetic */ uvf(int i, Object obj, Object obj2) {
        this.f234435a = i;
        this.f234436b = obj;
        this.f234437c = obj2;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        switch (this.f234435a) {
            case 0:
                b7l0 b7l0Var = (b7l0) this.f234436b;
                cwf cwfVar = (cwf) this.f234437c;
                if (ta80Var == ta80.ON_CREATE) {
                    b7l0Var.f24312e = AbstractC2254pf.m69772o(cwfVar);
                    b7l0Var.m28389e(b7l0Var.f24314g);
                }
                break;
            case 1:
                u700 u700Var = (u700) this.f234436b;
                uxi0 uxi0Var = (uxi0) this.f234437c;
                if (ta80Var == ta80.ON_RESUME && ((List) u700Var.m25253b().f287331e.f158717a.getValue()).contains(uxi0Var)) {
                    if (u700.m82478n()) {
                        uxi0Var.toString();
                        hc80Var.toString();
                    }
                    u700Var.m25253b().m97201b(uxi0Var);
                }
                if (ta80Var == ta80.ON_DESTROY) {
                    if (u700.m82478n()) {
                        uxi0Var.toString();
                        hc80Var.toString();
                    }
                    u700Var.m25253b().m97201b(uxi0Var);
                }
                break;
            case 2:
                ta80 ta80Var2 = (ta80) this.f234436b;
                kqi0 kqi0Var = (kqi0) this.f234437c;
                if (ta80Var == ta80Var2) {
                    ((eh00) kqi0Var.getValue()).invoke();
                }
                break;
            default:
                li80 li80Var = (li80) this.f234436b;
                iie0 iie0Var = (iie0) this.f234437c;
                if (ta80Var != ta80.ON_DESTROY) {
                    li80Var.getClass();
                } else {
                    li80Var.m59036B(iie0Var);
                }
                break;
        }
    }
}
