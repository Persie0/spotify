package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gvz extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zam0 f84858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvz(zam0 zam0Var, int i) {
        super(4);
        this.f84857a = i;
        this.f84858b = zam0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f84857a) {
            case 0:
                ((Number) obj3).intValue();
                return new s5h0(this.f84858b.path(), (st91) obj4);
            case 1:
                ((Number) obj3).intValue();
                return new l5h0(new g4h0(new cag0(new o5h0(this.f84858b.path(), ((f1w0) obj).f64988a, (st91) obj4))));
            default:
                ((Number) obj3).intValue();
                return new z5h0(this.f84858b.path(), (st91) obj4);
        }
    }
}
