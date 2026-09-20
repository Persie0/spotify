package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class etc extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtc f62678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ etc(jtc jtcVar, int i) {
        super(1);
        this.f62677a = i;
        this.f62678b = jtcVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f62677a) {
            case 0:
                ((Number) obj).intValue();
                return this.f62678b.f115812s.mo24361d();
            case 1:
                return new oq91(new etc(this.f62678b, 0));
            default:
                ((Number) obj).intValue();
                return this.f62678b.f115812s.mo24361d();
        }
    }
}
