package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wm41 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ so3 f252737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm41(so3 so3Var, int i) {
        super(3);
        this.f252736a = i;
        this.f252737b = so3Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f252736a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f = 64;
                    so3.m78605i(this.f252737b, f, f, 0.0f, xq00Var, 54, 4);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    so3.m78605i(this.f252737b, 80, 16, 4, xq00Var2, 438, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
            default:
                xq00 xq00Var3 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    so3.m78605i(this.f252737b, 200, 20, 0.0f, xq00Var3, 54, 4);
                } else {
                    xq00Var3.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
