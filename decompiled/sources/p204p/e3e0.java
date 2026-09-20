package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e3e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vum0 f55758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vum0 f55759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3e0(vum0 vum0Var, vum0 vum0Var2, int i) {
        super(1);
        this.f55757a = i;
        this.f55758b = vum0Var;
        this.f55759c = vum0Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f55757a) {
            case 0:
                jo70 jo70Var = (jo70) obj;
                vum0 vum0Var = this.f55758b;
                int iM86437v = vum0Var.m86437v();
                int iMo30018b = (int) (jo70Var.mo30018b() & 4294967295L);
                vum0 vum0Var2 = this.f55759c;
                if (iM86437v < vum0Var2.m86437v() + iMo30018b) {
                    vum0Var.m86438w(vum0Var2.m86437v() + ((int) (jo70Var.mo30018b() & 4294967295L)));
                }
                break;
            default:
                jo70 jo70Var2 = (jo70) obj;
                this.f55758b.m86438w((int) (jo70Var2.mo30018b() & 4294967295L));
                this.f55759c.m86438w((int) (jo70Var2.mo30018b() >> 32));
                break;
        }
        return w2a1.f247311a;
    }
}
