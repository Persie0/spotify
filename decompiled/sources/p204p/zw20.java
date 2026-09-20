package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class zw20 {

    /* JADX INFO: renamed from: a */
    public final nuu0 f286890a;

    /* JADX INFO: renamed from: b */
    public final nuu0 f286891b;

    /* JADX INFO: renamed from: c */
    public final nuu0 f286892c;

    /* JADX INFO: renamed from: d */
    public final nuu0 f286893d;

    public zw20(vmz vmzVar, li80 li80Var, luk lukVar) {
        c9k c9kVarM16o = AbstractC0000a.m16o(lukVar);
        fiz fizVarM86024a = vmzVar.m86024a("share-listening-activity", false);
        Boolean bool = Boolean.TRUE;
        iq3 iq3Var = hf11.f90581a;
        this.f286890a = bzf1.m31029u(fizVarM86024a, c9kVarM16o, iq3Var, bool);
        this.f286891b = bzf1.m31029u((fiz) ((wg61) li80Var.f133742d).getValue(), c9kVarM16o, iq3Var, bool);
        this.f286892c = bzf1.m31029u(vmzVar.m86024a("view-listening-activity", true), c9kVarM16o, iq3Var, bool);
        this.f286893d = bzf1.m31029u(new qp20(vmzVar.m86026c("campfire", "DISABLED_CANNOT_ENABLE"), 1), c9kVarM16o, iq3Var, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m97106a() {
        return ((Boolean) this.f286890a.f158717a.getValue()).booleanValue();
    }
}
