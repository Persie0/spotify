package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jah extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b7l0 f110467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jah(b7l0 b7l0Var, int i) {
        super(0);
        this.f110466a = i;
        this.f110467b = b7l0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f110466a) {
            case 0:
                b7l0 b7l0Var = this.f110467b;
                if (b7l0Var != null) {
                    b7l0Var.m28388d();
                }
                break;
            case 1:
                this.f110467b.m28387c();
                break;
            default:
                this.f110467b.m28388d();
                break;
        }
        return w2a1.f247311a;
    }
}
