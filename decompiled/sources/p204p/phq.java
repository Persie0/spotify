package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class phq implements el11, fl11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177705a = 1;

    /* JADX INFO: renamed from: b */
    public final tjo f177706b;

    public phq(n541 n541Var) {
        this.f177706b = pag1.m69486v(new rko(wyx.f256380X, 1, m541.f140121e, new pko(new lp21(n541Var, 26)), m541.f140122f), new rko(a7j0.f13082i, 2, m541.f140118c, new pko(m541.f140116b), m541.f140120d), jc31.f110970b1);
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: a */
    public final tjo mo27669a() {
        switch (this.f177705a) {
            case 0:
                break;
        }
        return this.f177706b;
    }

    @Override // p204p.fl11
    /* JADX INFO: renamed from: d */
    public boolean mo25662d(km51 km51Var, Object obj) {
        l541 l541Var = (l541) obj;
        if (wj50.m88271j(l541Var.f129823b, "premium") && (km51Var instanceof im51)) {
            String str = (String) ((im51) km51Var).f103603i.get("item.speed");
            Float fM29806q0 = str != null ? bm51.m29806q0(str) : null;
            if (fM29806q0 != null) {
                if ((!(fM29806q0.floatValue() == 1.0f)) && !wrf0.m88858b(l541Var.f129822a.f96822X)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p204p.el11
    /* JADX INFO: renamed from: m */
    public boolean mo27680m(Object obj) {
        ohq ohqVar = (ohq) obj;
        pad1 pad1Var = ohqVar.f165525a;
        ved1 ved1Var = ohqVar.f165526b;
        if ((pad1Var != null ? pad1Var.f175509a : null) instanceof jad1) {
            return (ved1Var != null ? ved1Var.f240706d : null) != null;
        }
        return false;
    }

    public phq(shq shqVar) {
        this.f177706b = shqVar.f209248d;
    }
}
