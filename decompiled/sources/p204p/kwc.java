package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kwc implements cz60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127073a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ai00 f127074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l971 f127075c;

    public kwc(gh00 gh00Var, l971 l971Var) {
        this.f127073a = 1;
        this.f127074b = gh00Var;
        this.f127075c = l971Var;
    }

    @Override // p204p.cz60
    /* JADX INFO: renamed from: a */
    public final void mo34410a() {
        switch (this.f127073a) {
            case 0:
                l971 l971Var = this.f127075c;
                if (!wl51.m88460J0(l971Var.m58500d().f226935c)) {
                    ((gh00) this.f127074b).invoke(l971Var.m58500d().f226935c.toString());
                }
                break;
            case 1:
                ((gh00) this.f127074b).invoke(new yuy0(this.f127075c.m58500d().f226935c.toString()));
                break;
            default:
                if (!wl51.m88460J0(this.f127075c.m58500d().f226935c)) {
                    ((eh00) this.f127074b).invoke();
                }
                break;
        }
    }

    public /* synthetic */ kwc(l971 l971Var, ai00 ai00Var, int i) {
        this.f127073a = i;
        this.f127075c = l971Var;
        this.f127074b = ai00Var;
    }
}
