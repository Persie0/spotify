package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ccd0 implements hcd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jcd0 f36385b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f36386c;

    public /* synthetic */ ccd0(jcd0 jcd0Var, float f, int i) {
        this.f36384a = i;
        this.f36385b = jcd0Var;
        this.f36386c = f;
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public final void mo25456d(jv30 jv30Var, int i) {
        switch (this.f36384a) {
            case 0:
                jv30Var.mo45815Q1(this.f36385b.f111081c, i, this.f36386c);
                break;
            case 1:
                jv30Var.mo45829i(this.f36385b.f111081c, i, this.f36386c);
                break;
            default:
                jcd0 jcd0Var = this.f36385b;
                pcd0 pcd0Var = jcd0Var.f111081c;
                if (jcd0Var.m52957o() < 6) {
                    jv30Var.mo45829i(pcd0Var, i, this.f36386c);
                } else {
                    jv30Var.mo45831j0(pcd0Var, i);
                }
                break;
        }
    }
}
