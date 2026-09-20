package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u3g extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f226375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u79 f226376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3g(gh00 gh00Var, u79 u79Var, int i) {
        super(0);
        this.f226374a = i;
        this.f226375b = gh00Var;
        this.f226376c = u79Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f226374a) {
            case 0:
                this.f226375b.invoke(new rte1(this.f226376c.f227535b.f87686e));
                break;
            default:
                h50 h50Var = this.f226376c.f227535b;
                this.f226375b.invoke(new m79(h50Var.f87692k, h50Var.f87686e));
                break;
        }
        return w2a1.f247311a;
    }
}
