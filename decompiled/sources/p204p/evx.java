package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class evx extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ olv0 f63364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f63365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evx(olv0 olv0Var, eh00 eh00Var, int i) {
        super(0);
        this.f63363a = i;
        this.f63364b = olv0Var;
        this.f63365c = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f63363a) {
            case 0:
                if (this.f63364b.f166933a > 50.0f) {
                    this.f63365c.invoke();
                }
                break;
            default:
                this.f63364b.f166933a = 0.0f;
                this.f63365c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
