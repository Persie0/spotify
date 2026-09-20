package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qje0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qje0 f189227a;
    private static final ktz0 descriptor;

    static {
        qje0 qje0Var = new qje0();
        f189227a = qje0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.merch.merchdataloader.MerchNPVResponse", qje0Var, 5);
        vwp0Var.m86594k("merchSectionTitle", false);
        vwp0Var.m86594k("merchItems", false);
        vwp0Var.m86594k("showAllText", true);
        vwp0Var.m86594k("showAllNavigationUrl", true);
        vwp0Var.m86594k("showSeeAllMerchButton", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = sje0.f209823f;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, fr70VarArr[1].getValue(), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = sje0.f209823f;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            } else if (iMo29816p == 2) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            } else if (iMo29816p == 3) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new sje0(i, strMo39226f, str, str2, list, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sje0 sje0Var = (sje0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = sje0.f209823f;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, sje0Var.f209824a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), sje0Var.f209825b);
        String str = sje0Var.f209826c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        String str2 = sje0Var.f209827d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 4, sje0Var.f209828e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
