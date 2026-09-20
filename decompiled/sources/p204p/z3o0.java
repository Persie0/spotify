package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z3o0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a4o0 f278989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3o0(a4o0 a4o0Var, int i) {
        super(0);
        this.f278988a = i;
        this.f278989b = a4o0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f278988a) {
            case 0:
                return (l4o0) this.f278989b.f12287a.get();
            default:
                l4o0 l4o0Var = (l4o0) this.f278989b.f12288b.getValue();
                lg21 lg21Var = l4o0Var.f129735c;
                if (lg21Var != null) {
                    lg21Var.m58929h();
                }
                l4o0Var.f129735c = null;
                return w2a1.f247311a;
        }
    }
}
