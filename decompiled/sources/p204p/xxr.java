package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xxr extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vh00 f267052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ft70 f267053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxr(vh00 vh00Var, ft70 ft70Var, int i) {
        super(2);
        this.f267051a = i;
        this.f267052b = vh00Var;
        this.f267053c = ft70Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f267051a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f267052b.mo24510D0(this.f267053c, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f267052b.mo24510D0(this.f267053c, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
