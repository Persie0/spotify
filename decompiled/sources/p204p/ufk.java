package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ufk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p22 f229828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufk(p22 p22Var, int i) {
        super(1);
        this.f229827a = i;
        this.f229828b = p22Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f229827a) {
            case 0:
                return new cdk((String) obj, (ro80) this.f229828b.f173216e);
            default:
                p22 p22Var = this.f229828b;
                return new cdk(p22Var.f173213b, (ro80) p22Var.f173216e);
        }
    }
}
