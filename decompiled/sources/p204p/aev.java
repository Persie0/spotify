package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aev extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iev f14964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aev(iev ievVar, int i) {
        super(3);
        this.f14963a = i;
        this.f14964b = ievVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f14963a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    usg1.m83892k(this.f14964b, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    usg1.m83893l(this.f14964b, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
