package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cud0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7x0 f42096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cud0(p7x0 p7x0Var, int i) {
        super(1);
        this.f42095a = i;
        this.f42096b = p7x0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f42095a) {
            case 0:
                return new vwt(this.f42096b, 18);
            default:
                this.f42096b.mo25060a(new o2j(((x1j) obj).f257212g), null);
                return w2a1.f247311a;
        }
    }
}
