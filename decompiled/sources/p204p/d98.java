package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class d98 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f46740a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t851 f46741b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f46742c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f46743d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f46744e;

    public d98(List list, t851 t851Var, boolean z, boolean z2, boolean z3) {
        this.f46740a = list;
        this.f46741b = t851Var;
        this.f46742c = z;
        this.f46743d = z2;
        this.f46744e = z3;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft70 ft70Var = (ft70) obj;
        int iIntValue = ((Number) obj2).intValue();
        xq00 xq00Var = (xq00) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (xq00Var.m91766g(ft70Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= xq00Var.m91762e(iIntValue) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
            v851 v851Var = (v851) this.f46740a.get(iIntValue);
            xq00Var.m91771i0(637443902);
            mif1.m61869b(this.f46741b, new s851(v851Var, iIntValue, this.f46742c, this.f46743d, this.f46744e), null, null, xq00Var, 0, 12);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }
}
