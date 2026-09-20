package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nlh extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ olh f155095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nlh(olh olhVar, int i) {
        super(2);
        this.f155094a = i;
        this.f155095b = olhVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f155094a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    olh olhVar = this.f155095b;
                    mif1.m61869b(olhVar.f166845d, olhVar.f166844c, null, null, xq00Var, 0, 12);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y0v.m92603a(2, rkk.m75772x(703860993, new nlh(this.f155095b, 0), xq00Var2), xq00Var2, 390, 2);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
