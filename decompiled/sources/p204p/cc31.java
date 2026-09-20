package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cc31 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dc31 f36301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc31(dc31 dc31Var, int i) {
        super(1);
        this.f36300a = i;
        this.f36301b = dc31Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f36300a) {
            case 0:
                dc31 dc31Var = this.f36301b;
                kv91 kv91Var = (kv91) ((i4t0) dc31Var.f47415b).get();
                nfg0 nfg0Var = (nfg0) ((wg61) dc31Var.f47418e).getValue();
                nfg0Var.getClass();
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), nfg0Var.f153376a, st91.f213865b, System.currentTimeMillis()), null);
                return w2a1.f247311a;
            default:
                ((Number) obj).intValue();
                return ((nfg0) ((wg61) this.f36301b.f47418e).getValue()).mo24361d();
        }
    }
}
