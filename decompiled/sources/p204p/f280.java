package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f280 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f280 f65130a;
    private static final ktz0 descriptor;

    static {
        f280 f280Var = new f280();
        f65130a = f280Var;
        vwp0 vwp0Var = new vwp0("com.spotify.leavebehindads.ctaimpl.model.LeavebehindAdsRequest", f280Var, 4);
        vwp0Var.m86594k("surface", false);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("maxAds", false);
        vwp0Var.m86594k("playlistTitle", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, e450.f55982a, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h280(i, iMo39229o, strMo39226f, strMo39226f2, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h280 h280Var = (h280) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = h280Var.f86930a;
        String str2 = h280Var.f86933d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, h280Var.f86931b);
        hrhVarMo35820b.mo44938e(2, h280Var.f86932c, ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 3, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
