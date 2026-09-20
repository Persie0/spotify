package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hx1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kx1 f96110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hvy f96111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx1(kx1 kx1Var, hvy hvyVar, int i) {
        super(1);
        this.f96109a = i;
        this.f96110b = kx1Var;
        this.f96111c = hvyVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f96109a) {
            case 0:
                this.f96110b.m57579i1().m15621f(new vuw(this.f96111c.f95812a, (String) obj));
                break;
            case 1:
                this.f96110b.m57579i1().m15621f(new tuw(this.f96111c.f95812a, (String) obj));
                break;
            default:
                this.f96110b.m57579i1().m15621f(new gsw(this.f96111c.f95812a, ((gvy) obj).f84855b));
                break;
        }
        return w2a1.f247311a;
    }
}
