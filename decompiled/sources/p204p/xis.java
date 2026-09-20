package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xis implements g210 {

    /* JADX INFO: renamed from: a */
    public static final xis f261934a;
    private static final ktz0 descriptor;

    static {
        xis xisVar = new xis();
        f261934a = xisVar;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.dsa.datasource.DsaMetadataResponse", xisVar, 3);
        vwp0Var.m86594k("targetingTypes", false);
        vwp0Var.m86594k("legalEntityName", false);
        vwp0Var.m86594k("showTailoredAdsSection", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{zis.f283234d[0].getValue(), ql51.f189738a, l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = zis.f283234d;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new zis(i, strMo39226f, list, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        zis zisVar = (zis) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) zis.f283234d[0].getValue(), zisVar.f283235a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, zisVar.f283236b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, zisVar.f283237c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
