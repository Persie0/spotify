package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x8e1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b9e1 f259136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8e1(b9e1 b9e1Var, int i) {
        super(1);
        this.f259135a = i;
        this.f259136b = b9e1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f259135a) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    b9e1 b9e1Var = this.f259136b;
                    b9e1Var.f24882g.m63782a(bda.f26062b);
                    b9e1Var.f24888m.m69810a(fda.m41363a(b9e1Var.f24887l, null, null, 0, false, false, 1919));
                }
                return w2a1.f247311a;
            case 1:
                String str = (String) obj;
                z9j0 z9j0Var = this.f259136b.f24878c;
                if (str == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo63651f(new p6j0(str, "", false, false, 0, 0, false, null, null, null));
                return w2a1.f247311a;
            default:
                this.f259136b.f24886k.m86438w(((Number) obj).intValue());
                return w2a1.f247311a;
        }
    }
}
