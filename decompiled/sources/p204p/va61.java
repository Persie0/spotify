package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class va61 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xa61 f239130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va61(xa61 xa61Var, int i) {
        super(2);
        this.f239129a = i;
        this.f239130b = xa61Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f239129a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ka61 ka61Var = (ka61) this.f239130b.f259580Z0.getValue();
                    if (ka61Var == null) {
                        xq00Var.m91771i0(1426083433);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1426083434);
                        y961 y961Var = (y961) this.f239130b.f259579Y0.getValue();
                        k47 k47Var = eb61.f57840c;
                        eb61 eb61Var = eb61.f57841d;
                        if (eb61Var == null) {
                            synchronized (k47Var) {
                                eb61Var = eb61.f57841d;
                                if (eb61Var == null) {
                                    eb61Var = new eb61();
                                    eb61.f57841d = eb61Var;
                                }
                            }
                        }
                        mif1.m61869b(y961Var, ka61Var, mi21.m61820d(1.0f, cxh0.f43038a), eb61Var, xq00Var, 0, 0);
                        xq00Var.m91788r(false);
                    }
                    break;
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y0v.m92603a(2, rkk.m75772x(-1246157271, new va61(this.f239130b, 0), xq00Var2), xq00Var2, 390, 2);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xwt.m92300a(rkk.m75772x(967325493, new va61(this.f239130b, 1), xq00Var3), xq00Var3);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
