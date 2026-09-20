package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pfz extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ im91 f177162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pfz(im91 im91Var, int i) {
        super(3);
        this.f177161a = i;
        this.f177162b = im91Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f177161a) {
            case 0:
                xq00 xq00Var = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var.m91771i0(-2110915093);
                xq00Var.m91788r(false);
                break;
            case 1:
                xq00 xq00Var2 = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var2.m91771i0(1845574190);
                xq00Var2.m91788r(false);
                break;
            default:
                xq00 xq00Var3 = (xq00) obj2;
                ((Number) obj3).intValue();
                xq00Var3.m91771i0(-795568257);
                xq00Var3.m91788r(false);
                break;
        }
        return this.f177162b;
    }
}
