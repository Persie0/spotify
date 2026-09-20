package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g790 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ljp f77216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g790(ljp ljpVar, int i) {
        super(1);
        this.f77215a = i;
        this.f77216b = ljpVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f77215a) {
            case 0:
                ljp ljpVar = this.f77216b;
                return bmu0.m29895b(new e560(24, (ay7) ljpVar.f134122h, ljpVar));
            default:
                ((icp) obj).f100858d = new h790(this.f77216b, null);
                return w2a1.f247311a;
        }
    }
}
