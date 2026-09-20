package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a8o0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f13333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c8o0 f13334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8o0(gh00 gh00Var, c8o0 c8o0Var, int i) {
        super(0);
        this.f13332a = i;
        this.f13333b = gh00Var;
        this.f13334c = c8o0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f13332a) {
            case 0:
                this.f13333b.invoke(new w7o0(this.f13334c.f35290j));
                break;
            default:
                this.f13333b.invoke(new x7o0(this.f13334c.f35292l));
                break;
        }
        return w2a1.f247311a;
    }
}
