package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zku extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f283844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ peu f283845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zku(String str, peu peuVar, int i) {
        super(1);
        this.f283843a = i;
        this.f283844b = str;
        this.f283845c = peuVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f283843a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                peu peuVar = this.f283845c;
                String str = this.f283844b;
                if ((str == null || str.length() == 0) && peuVar == null) {
                    jpz0.m53992f(mpz0Var);
                } else {
                    if (str == null) {
                        str = "";
                    }
                    jpz0.m54000n(mpz0Var, str);
                    if (peuVar != null) {
                        jpz0.m54007u(mpz0Var, 0);
                    }
                }
                break;
            default:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54000n(mpz0Var2, this.f283844b);
                jpz0.m54007u(mpz0Var2, 0);
                peu peuVar2 = this.f283845c;
                jpz0.m53993g(mpz0Var2, peuVar2.f176850c, new k60(peuVar2, 5));
                break;
        }
        return w2a1.f247311a;
    }
}
