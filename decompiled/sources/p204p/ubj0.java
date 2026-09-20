package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ubj0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ldj0 f228805b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubj0(ldj0 ldj0Var, int i) {
        super(2);
        this.f228804a = i;
        this.f228805b = ldj0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f228804a) {
            case 0:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bjg1.m29414A(this.f228805b.f132184a, 0, xq00Var);
                } else {
                    xq00Var.m91757b0();
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ldj0 ldj0Var = this.f228805b;
                    bjg1.m29479x(ldj0Var.f132185b, ldj0Var.f132186c, xq00Var2, 64);
                } else {
                    xq00Var2.m91757b0();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
