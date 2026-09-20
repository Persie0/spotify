package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jq00 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f114761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qf40 f114762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq00(int i, gh00 gh00Var, qf40 qf40Var) {
        super(0);
        this.f114760a = i;
        this.f114761b = gh00Var;
        this.f114762c = qf40Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f114760a) {
            case 0:
                this.f114761b.invoke(this.f114762c.get(0));
                break;
            case 1:
                this.f114761b.invoke(this.f114762c.get(1));
                break;
            default:
                this.f114761b.invoke(this.f114762c.get(2));
                break;
        }
        return w2a1.f247311a;
    }
}
