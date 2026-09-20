package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lr0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wr0 f136181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr0(wr0 wr0Var, int i) {
        super(1);
        this.f136180a = i;
        this.f136181b = wr0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f136180a) {
            case 0:
                this.f136181b.f254232v = (String) obj;
                return w2a1.f247311a;
            default:
                return new C1865fm(this.f136181b, 2);
        }
    }
}
