package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class du21 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bs21 f52953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du21(bs21 bs21Var, int i) {
        super(2);
        this.f52952a = i;
        this.f52953b = bs21Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52952a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f52953b.mo30346c(0, xq00Var);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f52953b.mo30346c(0, xq00Var2);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
            default:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.f52953b.mo30346c(0, xq00Var3);
                } else {
                    xq00Var3.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
