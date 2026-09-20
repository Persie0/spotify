package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qt00 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hzd0 f192250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hzd0 f192251c;

    public /* synthetic */ qt00(hzd0 hzd0Var, hzd0 hzd0Var2, int i) {
        this.f192249a = i;
        this.f192250b = hzd0Var;
        this.f192251c = hzd0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f192249a) {
            case 0:
                tu00 tu00Var = (tu00) obj;
                pt00 pt00Var = (pt00) this.f192251c.mo33098e();
                su00 su00Var = tu00Var != null ? (su00) g6f.m43745s0(tu00Var.f223736a) : null;
                String str = pt00Var != null ? pt00Var.f181017b : null;
                boolean z = false;
                if (pt00Var != null && pt00Var.f181016a) {
                    z = true;
                }
                this.f192250b.mo33104m(new rt00(su00Var, str, z));
                break;
            default:
                tu00 tu00Var2 = (tu00) this.f192251c.mo33098e();
                pt00 pt00Var2 = (pt00) obj;
                su00 su00Var2 = tu00Var2 != null ? (su00) g6f.m43745s0(tu00Var2.f223736a) : null;
                String str2 = pt00Var2 != null ? pt00Var2.f181017b : null;
                boolean z2 = false;
                if (pt00Var2 != null && pt00Var2.f181016a) {
                    z2 = true;
                }
                this.f192250b.mo33104m(new rt00(su00Var2, str2, z2));
                break;
        }
    }
}
