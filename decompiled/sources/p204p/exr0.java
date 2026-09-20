package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class exr0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nmr0 f63839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exr0(nmr0 nmr0Var, int i) {
        super(1);
        this.f63838a = i;
        this.f63839b = nmr0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f63838a) {
            case 0:
                int i = (int) (((g450) obj).f76347a & 4294967295L);
                nmr0 nmr0Var = this.f63839b;
                nmr0Var.m65157b(i, nmr0Var.f156253b.m86437v());
                break;
            case 1:
                ((fdx0) obj).m41397w(this.f63839b.f156254c.m84031v());
                break;
            default:
                int i2 = (int) (((g450) obj).f76347a & 4294967295L);
                nmr0 nmr0Var2 = this.f63839b;
                nmr0Var2.m65157b(nmr0Var2.f156252a.m86437v(), i2);
                break;
        }
        return w2a1.f247311a;
    }
}
