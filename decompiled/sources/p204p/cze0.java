package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cze0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f43543b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eze0 f43544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cze0(gh00 gh00Var, eze0 eze0Var, int i) {
        super(0);
        this.f43542a = i;
        this.f43543b = gh00Var;
        this.f43544c = eze0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f43542a) {
            case 0:
                this.f43543b.invoke(this.f43544c.f64356a == 2 ? aze0.f21501d : aze0.f21499b);
                break;
            default:
                this.f43543b.invoke(this.f43544c.f64356a == 2 ? aze0.f21502e : aze0.f21500c);
                break;
        }
        return w2a1.f247311a;
    }
}
