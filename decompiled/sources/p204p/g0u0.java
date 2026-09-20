package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g0u0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final g0u0 f75437a;
    private static final ktz0 descriptor;

    static {
        g0u0 g0u0Var = new g0u0();
        f75437a = g0u0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.audiobookpremium.cappingdatasource.models.dto.QuotaDto", g0u0Var, 6);
        vwp0Var.m86594k("quotaType", true);
        vwp0Var.m86594k("validFrom", true);
        vwp0Var.m86594k("validTo", true);
        vwp0Var.m86594k("totalQuota", true);
        vwp0Var.m86594k("usedQuota", true);
        vwp0Var.m86594k("consumptionOrder", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{i0u0.f97323g[0].getValue(), ql51Var, ql51Var, ql51Var, ql51Var, e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = i0u0.f97323g;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        l0u0 l0u0Var = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l0u0Var = (l0u0) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), l0u0Var);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new i0u0(i, l0u0Var, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, iMo39229o);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        i0u0 i0u0Var = (i0u0) obj;
        int i = i0u0Var.f97329f;
        String str = i0u0Var.f97328e;
        String str2 = i0u0Var.f97327d;
        String str3 = i0u0Var.f97326c;
        String str4 = i0u0Var.f97325b;
        l0u0 l0u0Var = i0u0Var.f97324a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = i0u0.f97323g;
        if (hrhVarMo35820b.mo48399d0() || l0u0Var != l0u0.f128514b) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), l0u0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str4, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 1, str4);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str3, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 2, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 3, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 4, str);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(5, i, ktz0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
