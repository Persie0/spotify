package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gx1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kx1 f85142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jvy f85143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx1(kx1 kx1Var, jvy jvyVar, int i) {
        super(1);
        this.f85141a = i;
        this.f85142b = kx1Var;
        this.f85143c = jvyVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f85141a) {
            case 0:
                this.f85142b.m57579i1().m15621f(new vuw(this.f85143c.f116541a, (String) obj));
                break;
            default:
                this.f85142b.m57579i1().m15621f(new tuw(this.f85143c.f116541a, (String) obj));
                break;
        }
        return w2a1.f247311a;
    }
}
