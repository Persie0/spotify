package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tbd0 implements hcd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jcd0 f218825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ufd0 f218826c;

    public /* synthetic */ tbd0(jcd0 jcd0Var, ufd0 ufd0Var, int i) {
        this.f218824a = i;
        this.f218825b = jcd0Var;
        this.f218826c = ufd0Var;
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public final void mo25456d(jv30 jv30Var, int i) {
        switch (this.f218824a) {
            case 0:
                jcd0 jcd0Var = this.f218825b;
                jv30Var.mo45803J(jcd0Var.f111081c, i, this.f218826c.m82985e(jcd0Var.m52957o(), true), true);
                break;
            default:
                jcd0 jcd0Var2 = this.f218825b;
                jv30Var.mo45811O(jcd0Var2.f111081c, i, this.f218826c.m82985e(jcd0Var2.m52957o(), true));
                break;
        }
    }
}
