package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gkq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ guf f80894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkq(guf gufVar, int i) {
        super(1);
        this.f80893a = i;
        this.f80894b = gufVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f80893a) {
            case 0:
                guf gufVar = this.f80894b;
                w2a1 w2a1Var = w2a1.f247311a;
                gufVar.m38797k0(w2a1Var);
                return w2a1Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f80894b.m38797k0(bool);
                return w2a1.f247311a;
        }
    }
}
