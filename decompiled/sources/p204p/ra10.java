package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ra10 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ra10 f197163a;
    private static final ktz0 descriptor;

    static {
        ra10 ra10Var = new ra10();
        f197163a = ra10Var;
        vwp0 vwp0Var = new vwp0("com.spotify.audiobookpremium.cappingdatasource.models.dto.GetQuotaResponse", ra10Var, 4);
        vwp0Var.m86594k("topUps", true);
        vwp0Var.m86594k("monthly", true);
        vwp0Var.m86594k("recurringQuotas", false);
        vwp0Var.m86594k("copy", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = ta10.f218412e;
        return new rr60[]{epv0.m39700t((rr60) fr70VarArr[0].getValue()), g0u0.f75437a, fr70VarArr[2].getValue(), n0u0.f149171a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = ta10.f218412e;
        frhVarMo29814b.getClass();
        int i = 0;
        List list = null;
        i0u0 i0u0Var = null;
        List list2 = null;
        p0u0 p0u0Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else if (iMo29816p == 1) {
                i0u0Var = (i0u0) frhVarMo29814b.mo39210A(ktz0Var, 1, g0u0.f75437a, i0u0Var);
                i |= 2;
            } else if (iMo29816p == 2) {
                list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                p0u0Var = (p0u0) frhVarMo29814b.mo39210A(ktz0Var, 3, n0u0.f149171a, p0u0Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ta10(i, list, i0u0Var, list2, p0u0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ta10 ta10Var = (ta10) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = ta10.f218412e;
        List list = ta10Var.f218413a;
        i0u0 i0u0Var = ta10Var.f218414b;
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(i0u0Var, new i0u0())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 1, g0u0.f75437a, i0u0Var);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), ta10Var.f218415c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, n0u0.f149171a, ta10Var.f218416d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
