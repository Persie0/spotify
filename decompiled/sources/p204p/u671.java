package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u671 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f227238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ th00 f227239c;

    public /* synthetic */ u671(long j, th00 th00Var, int i) {
        this.f227237a = i;
        this.f227238b = j;
        this.f227239c = th00Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f227237a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a771.m24925c(this.f227238b, this.f227239c, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a771.m24925c(this.f227238b, this.f227239c, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
