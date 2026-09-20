package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y290 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tp80 f268512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y290(tp80 tp80Var, int i) {
        super(1);
        this.f268511a = i;
        this.f268512b = tp80Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f268511a) {
            case 0:
                return new x290(this.f268512b, 0);
            default:
                return new x290(this.f268512b, 1);
        }
    }
}
