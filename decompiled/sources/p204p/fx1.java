package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fx1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kx1 f74216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kvy f74217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx1(kx1 kx1Var, kvy kvyVar, int i) {
        super(1);
        this.f74215a = i;
        this.f74216b = kx1Var;
        this.f74217c = kvyVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f74215a) {
            case 0:
                this.f74216b.m57579i1().m15621f(new vuw(this.f74217c.f126977a, (String) obj));
                break;
            default:
                this.f74216b.m57579i1().m15621f(new tuw(this.f74217c.f126977a, (String) obj));
                break;
        }
        return w2a1.f247311a;
    }
}
