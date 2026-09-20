package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aed1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h4s0 f14851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aed1(h4s0 h4s0Var, int i) {
        super(1);
        this.f14850a = i;
        this.f14851b = h4s0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f14850a) {
            case 0:
                this.f14851b.f87640e.m84032w((int) (((g450) obj).f76347a >> 32));
                break;
            default:
                this.f14851b.f87639d.m86438w((int) (((g450) obj).f76347a >> 32));
                break;
        }
        return w2a1.f247311a;
    }
}
