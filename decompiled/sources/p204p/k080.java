package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k080 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l080 f117931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k080(l080 l080Var, int i) {
        super(4);
        this.f117930a = i;
        this.f117931b = l080Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f117930a;
        l080 l080Var = this.f117931b;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                String strM62796c = mt60.m62796c(l080Var.f128314b);
                st91 st91Var = st91.f213865b;
                return new x8g0(strM62796c);
            default:
                ((Number) obj3).intValue();
                String strM62796c2 = mt60.m62796c(l080Var.f128314b);
                st91 st91Var2 = st91.f213865b;
                return new j5h0(strM62796c2);
        }
    }
}
