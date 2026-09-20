package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qta extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f192346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nqq f192347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qta(gh00 gh00Var, nqq nqqVar, int i) {
        super(0);
        this.f192345a = i;
        this.f192346b = gh00Var;
        this.f192347c = nqqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f192345a) {
            case 0:
                nqq nqqVar = this.f192347c;
                this.f192346b.invoke(new hqq(((mqq) nqqVar.f157309c.get(nqqVar.f157314h)).f146339e));
                break;
            default:
                this.f192346b.invoke(new iqq(this.f192347c.f157312f.f83515c));
                break;
        }
        return w2a1.f247311a;
    }
}
