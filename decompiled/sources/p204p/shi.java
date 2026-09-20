package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class shi extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f209217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ th00 f209218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shi(kqi0 kqi0Var, th00 th00Var, int i) {
        super(0);
        this.f209216a = i;
        this.f209217b = kqi0Var;
        this.f209218c = th00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f209216a) {
            case 0:
                pqm0 pqm0Var = (pqm0) this.f209217b.getValue();
                if (pqm0Var != null) {
                    int iIntValue = ((Number) pqm0Var.f180350a).intValue();
                    d9g0 d9g0Var = (d9g0) pqm0Var.f180351b;
                    this.f209218c.invoke(Integer.valueOf(iIntValue), d9g0Var);
                }
                break;
            default:
                pqm0 pqm0Var2 = (pqm0) this.f209217b.getValue();
                if (pqm0Var2 != null) {
                    int iIntValue2 = ((Number) pqm0Var2.f180350a).intValue();
                    d9g0 d9g0Var2 = (d9g0) pqm0Var2.f180351b;
                    this.f209218c.invoke(Integer.valueOf(iIntValue2), d9g0Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
