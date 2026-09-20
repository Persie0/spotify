package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ujn0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231071a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f231072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ akn0 f231073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujn0(gh00 gh00Var, akn0 akn0Var, int i) {
        super(0);
        this.f231071a = i;
        this.f231072b = gh00Var;
        this.f231073c = akn0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f231071a) {
            case 0:
                this.f231072b.invoke(((yjn0) this.f231073c).f273413c);
                break;
            default:
                this.f231072b.invoke(((zjn0) this.f231073c).f283478d);
                break;
        }
        return w2a1.f247311a;
    }
}
