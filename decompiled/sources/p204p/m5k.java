package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class m5k extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ np0 f140245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5k(np0 np0Var, int i) {
        super(4);
        this.f140244a = i;
        this.f140245b = np0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f140244a) {
            case 0:
                ((Number) obj3).intValue();
                return new c7k((pv91) ((j5k) obj).f108991b.f56422c.f45458a.invoke((slg0) this.f140245b.f156833c));
            default:
                c7k c7kVar = (c7k) obj;
                j5k j5kVar = (j5k) obj2;
                if (!((i5k) obj4).equals(i5k.f98979a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d5k d5kVar = j5kVar.f108991b.f56422c;
                pv91 pv91Var = c7kVar.f34941a;
                this.f140245b.getClass();
                return (av91) d5kVar.f45459b.invoke(pv91Var);
        }
    }
}
