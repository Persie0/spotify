package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aqp0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dqp0 f18755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qpp0 f18756c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f18757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqp0(dqp0 dqp0Var, qpp0 qpp0Var, gh00 gh00Var, int i) {
        super(3);
        this.f18754a = i;
        this.f18755b = dqp0Var;
        this.f18756c = qpp0Var;
        this.f18757d = gh00Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f18754a) {
            case 0:
                ((Number) obj3).intValue();
                gh00 gh00Var = this.f18757d;
                dqp0.m36664h(this.f18755b, this.f18756c, gh00Var, (xq00) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                gh00 gh00Var2 = this.f18757d;
                dqp0.m36665i(this.f18755b, this.f18756c, gh00Var2, (xq00) obj2, 0);
                break;
        }
        return w2a1.f247311a;
    }
}
