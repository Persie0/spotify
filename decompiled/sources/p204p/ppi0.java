package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ppi0 implements uam0 {

    /* JADX INFO: renamed from: a */
    public final ojp f180050a;

    /* JADX INFO: renamed from: b */
    public Boolean f180051b;

    public ppi0() {
        ojp ojpVar = new ojp();
        ojpVar.f166109c = new jpi0();
        this.f180050a = ojpVar;
        this.f180051b = null;
    }

    @Override // p204p.uam0
    /* JADX INFO: renamed from: a */
    public final Boolean mo70588a() {
        return this.f180051b;
    }

    @Override // p204p.uam0
    /* JADX INFO: renamed from: b */
    public final bwr mo70589b(ram0 ram0Var) {
        ojp ojpVar = this.f180050a;
        ojpVar.getClass();
        gqk0 gqk0Var = new gqk0(ojpVar, ram0Var);
        ((jpi0) ojpVar.f166109c).m53954a(gqk0Var);
        Boolean bool = this.f180051b;
        if (bool != null) {
            ram0Var.mo28197x(bool.booleanValue());
        }
        return gqk0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m70590c(boolean z) {
        if (wj50.m88271j(this.f180051b, Boolean.valueOf(z))) {
            return;
        }
        this.f180051b = Boolean.valueOf(z);
        ojp ojpVar = this.f180050a;
        int i = ((jpi0) ojpVar.f166109c).f114676b;
        ojpVar.f166108b++;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                gqk0 gqk0Var = (gqk0) ((jpi0) ojpVar.f166109c).m53959f(i2);
                if (gqk0Var.f83488b) {
                    gqk0Var.f83487a.mo28197x(z);
                }
            } finally {
                int i3 = ojpVar.f166108b - 1;
                ojpVar.f166108b = i3;
                if (i3 == 0 && ojpVar.f166107a) {
                    ojp.m67115b(ojpVar);
                }
            }
        }
    }
}
