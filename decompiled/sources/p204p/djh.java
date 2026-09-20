package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class djh extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q3k f49693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ djh(q3k q3kVar, int i) {
        super(2);
        this.f49692a = i;
        this.f49693b = q3kVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49692a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vmg1.m86001i(this.f49693b.f184894b, xq00Var, 0);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vmg1.m86001i(this.f49693b.f184895c, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
