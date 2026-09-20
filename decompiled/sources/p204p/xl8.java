package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xl8 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sl8 f263063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl8(sl8 sl8Var, int i) {
        super(3);
        this.f263062a = i;
        this.f263063b = sl8Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f263062a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                sl8 sl8Var = this.f263063b;
                if (sl8Var instanceof pl8) {
                    xq00Var.m91771i0(-84338486);
                    pl8 pl8Var = (pl8) sl8Var;
                    hkg1.m47825k(384, pl8Var.f178660a, pl8Var.f178661b, xq00Var, mi21.m61820d(1.0f, cxh0.f43038a));
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-84249113);
                    xq00Var.m91788r(false);
                }
                break;
            default:
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                sl8 sl8Var2 = this.f263063b;
                if (sl8Var2 instanceof ql8) {
                    xq00Var2.m91771i0(850917806);
                    ql8 ql8Var = (ql8) sl8Var2;
                    hkg1.m47831q(384, ql8Var.f189761a, ql8Var.f189762b, xq00Var2, mi21.m61820d(1.0f, cxh0.f43038a));
                    xq00Var2.m91788r(false);
                } else {
                    xq00Var2.m91771i0(851011984);
                    xq00Var2.m91788r(false);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
