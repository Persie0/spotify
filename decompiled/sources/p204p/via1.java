package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class via1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f241660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bja1 f241661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ via1(gh00 gh00Var, bja1 bja1Var, int i) {
        super(0);
        this.f241659a = i;
        this.f241660b = gh00Var;
        this.f241661c = bja1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f241659a) {
            case 0:
                this.f241660b.invoke(new xia1(this.f241661c.f27650c.f16209b));
                break;
            default:
                this.f241660b.invoke(new yia1(this.f241661c.f27651d.f16209b));
                break;
        }
        return w2a1.f247311a;
    }
}
