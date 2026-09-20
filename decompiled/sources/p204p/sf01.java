package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sf01 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tf01 f208425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf01(tf01 tf01Var, int i) {
        super(3);
        this.f208424a = i;
        this.f208425b = tf01Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f208424a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    this.f208425b.m80598a(0, xq00Var);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    this.f208425b.m80598a(0, xq00Var2);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
