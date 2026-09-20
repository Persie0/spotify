package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class is70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fyf f105156b;

    public /* synthetic */ is70(fyf fyfVar, int i) {
        this.f105155a = i;
        this.f105156b = fyfVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f105155a) {
            case 0:
                ms70 ms70Var = (ms70) obj;
                ((Integer) obj2).getClass();
                xq00 xq00Var = (xq00) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= xq00Var.m91766g(ms70Var) ? 4 : 2;
                }
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                    this.f105156b.mo24510D0(ms70Var, xq00Var, Integer.valueOf(iIntValue & 14));
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                cy70 cy70Var = (cy70) obj;
                ((Integer) obj2).getClass();
                xq00 xq00Var2 = (xq00) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= xq00Var2.m91766g(cy70Var) ? 4 : 2;
                }
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    this.f105156b.mo24510D0(cy70Var, xq00Var2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
