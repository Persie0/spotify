package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lgc extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f133200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgc(nlv0 nlv0Var, int i) {
        super(0);
        this.f133199a = i;
        this.f133200b = nlv0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f133199a) {
            case 0:
                this.f133200b.f155174a = true;
                return w2a1.f247311a;
            case 1:
                this.f133200b.f155174a = true;
                return w2a1.f247311a;
            case 2:
                return Boolean.valueOf(this.f133200b.f155174a);
            case 3:
                this.f133200b.f155174a = true;
                return w2a1.f247311a;
            case 4:
                return Boolean.valueOf(!this.f133200b.f155174a);
            default:
                this.f133200b.f155174a = true;
                return w2a1.f247311a;
        }
    }
}
