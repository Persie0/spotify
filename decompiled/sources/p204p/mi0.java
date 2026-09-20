package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mi0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f143897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vum0 f143898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi0(gh00 gh00Var, vum0 vum0Var, int i) {
        super(1);
        this.f143896a = i;
        this.f143897b = gh00Var;
        this.f143898c = vum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f143896a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                vum0 vum0Var = this.f143898c;
                gh00 gh00Var = this.f143897b;
                if (iIntValue == 0) {
                    gh00Var.invoke(new lqc1(2));
                } else if (iIntValue == 100) {
                    gh00Var.invoke(new lqc1(5));
                } else if (iIntValue < 50 && vum0Var.m86437v() >= 50) {
                    gh00Var.invoke(new lqc1(4));
                } else if (iIntValue >= 50 && vum0Var.m86437v() < 50) {
                    gh00Var.invoke(new lqc1(3));
                }
                vum0Var.m86438w(iIntValue);
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                this.f143898c.m86438w(iIntValue2);
                this.f143897b.invoke(Integer.valueOf(iIntValue2));
                break;
        }
        return w2a1.f247311a;
    }
}
