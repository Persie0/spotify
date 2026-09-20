package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s5c0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5c0 f205772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5c0(t5c0 t5c0Var, int i) {
        super(2);
        this.f205771a = i;
        this.f205772b = t5c0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f205771a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t5c0 t5c0Var = this.f205772b;
                    ydj.m93454m("ManagedAccountDetailsPage reached NotFound state for managedAccountId: ", t5c0Var.f217268c.f258374a);
                    t5c0Var.f217267b.mo47345e();
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t5c0 t5c0Var2 = this.f205772b;
                    ydj.m93454m("ManagedAccountDetailsPage reached NotFound state for managedAccountId: ", t5c0Var2.f217268c.f258374a);
                    t5c0Var2.f217267b.mo47345e();
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
