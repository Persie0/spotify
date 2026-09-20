package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qv60 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rv60 f192918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv60(rv60 rv60Var, int i) {
        super(1);
        this.f192917a = i;
        this.f192918b = rv60Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f192917a) {
            case 0:
                this.f192918b.m76468b(((Number) ((gw4) obj).m45912e()).floatValue());
                break;
            case 1:
                this.f192918b.m76468b(((Number) ((gw4) obj).m45912e()).floatValue());
                break;
            default:
                this.f192918b.f203007c.m84032w((int) (((g450) obj).f76347a & 4294967295L));
                break;
        }
        return w2a1.f247311a;
    }
}
