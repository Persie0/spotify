package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class izc extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kzc f107195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izc(kzc kzcVar, int i) {
        super(2);
        this.f107194a = i;
        this.f107195b = kzcVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107194a) {
            case 0:
                this.f107195b.f128077l.m88718c(new rfj0((r4m0) obj, (obm0) obj2));
                break;
            default:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kzc.m57752c(this.f107195b, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
