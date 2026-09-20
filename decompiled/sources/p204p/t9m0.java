package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t9m0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vum0 f218334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9m0(vum0 vum0Var, int i) {
        super(1);
        this.f218333a = i;
        this.f218334b = vum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f218333a) {
            case 0:
                this.f218334b.m86438w(((Number) obj).intValue());
                break;
            case 1:
                this.f218334b.m86438w(((Number) obj).intValue());
                break;
            case 2:
                this.f218334b.m86438w((int) (((g450) obj).f76347a & 4294967295L));
                break;
            default:
                this.f218334b.m86438w((int) (((jo70) obj).mo30018b() & 4294967295L));
                break;
        }
        return w2a1.f247311a;
    }
}
