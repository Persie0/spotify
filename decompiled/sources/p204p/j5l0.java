package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j5l0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k5l0 f109001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5l0(k5l0 k5l0Var, int i) {
        super(1);
        this.f109000a = i;
        this.f109001b = k5l0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f109000a) {
            case 0:
                ((zvw0) obj).f286821g = dq60.m36607g((wy3) this.f109001b.f119541b);
                break;
            case 1:
                zvw0 zvw0Var = (zvw0) obj;
                zvw0Var.f286833s = this.f109001b.f119542c.f244896h;
                zvw0Var.f286822h = dq60.m36607g((wy3) this.f109001b.f119541b);
                break;
            default:
                ((zvw0) obj).f286824j = dq60.m36607g((wy3) this.f109001b.f119541b);
                break;
        }
        return w2a1.f247311a;
    }
}
