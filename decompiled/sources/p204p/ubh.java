package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ubh extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f228756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ au51 f228757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubh(gh00 gh00Var, au51 au51Var, int i) {
        super(0);
        this.f228755a = i;
        this.f228756b = gh00Var;
        this.f228757c = au51Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f228755a) {
            case 0:
                this.f228756b.invoke(new ste1(this.f228757c.f19855g.f87686e));
                break;
            default:
                h50 h50Var = this.f228757c.f19855g;
                this.f228756b.invoke(new st51(h50Var.f87692k, h50Var.f87686e));
                break;
        }
        return w2a1.f247311a;
    }
}
