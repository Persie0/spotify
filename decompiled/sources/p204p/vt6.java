package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vt6 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pt50 f244560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vco f244561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt6(pt50 pt50Var, vco vcoVar, int i) {
        super(3);
        this.f244559a = i;
        this.f244560b = pt50Var;
        this.f244561c = vcoVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f244559a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    pt50 pt50Var = this.f244560b;
                    pt50Var.getClass();
                    pt50Var.m70896a(this.f244561c, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pt50 pt50Var2 = this.f244560b;
                    pt50Var2.getClass();
                    pt50Var2.m70896a(this.f244561c, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
            default:
                xq00 xq00Var3 = (xq00) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    pt50 pt50Var3 = this.f244560b;
                    pt50Var3.getClass();
                    pt50Var3.m70896a(this.f244561c, xq00Var3, 0);
                } else {
                    xq00Var3.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
