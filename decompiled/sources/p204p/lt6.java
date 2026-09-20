package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lt6 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pt6 f136704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt6(pt6 pt6Var, int i) {
        super(3);
        this.f136703a = i;
        this.f136704b = pt6Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f136703a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f = 64;
                    pt6.m70901h(this.f136704b, f, f, 0.0f, xq00Var, 54, 4);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pt6.m70901h(this.f136704b, 200, 20, 0.0f, xq00Var2, 54, 4);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
            case 2:
                xq00 xq00Var3 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    pt6.m70901h(this.f136704b, 80, 16, 4, xq00Var3, 438, 0);
                } else {
                    xq00Var3.m91757b0();
                }
                break;
            case 3:
                xq00 xq00Var4 = (xq00) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pt6.m70901h(this.f136704b, 200, 40, 0.0f, xq00Var4, 54, 4);
                } else {
                    xq00Var4.m91757b0();
                }
                break;
            case 4:
                xq00 xq00Var5 = (xq00) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    pt6.m70901h(this.f136704b, 200, 40, 0.0f, xq00Var5, 54, 4);
                } else {
                    xq00Var5.m91757b0();
                }
                break;
            default:
                xq00 xq00Var6 = (xq00) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    pt6.m70901h(this.f136704b, 200, 20, 0.0f, xq00Var6, 54, 4);
                } else {
                    xq00Var6.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
