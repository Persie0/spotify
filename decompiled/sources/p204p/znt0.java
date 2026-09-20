package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class znt0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lq0 f284554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znt0(lq0 lq0Var, int i) {
        super(1);
        this.f284553a = i;
        this.f284554b = lq0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f284553a) {
            case 0:
                return new ynt0(((lrt0) this.f284554b.f135884b).mo29774a().f180666a, new m7y(14, lau.f131415a, null), true);
            case 1:
                ((icp) obj).f100858d = new aot0(this.f284554b, null);
                return w2a1.f247311a;
            default:
                return (ovf) this.f284554b.f135887e;
        }
    }
}
