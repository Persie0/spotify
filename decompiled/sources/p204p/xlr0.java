package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xlr0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final xlr0 f263229a;
    private static final ktz0 descriptor;

    static {
        xlr0 xlr0Var = new xlr0();
        f263229a = xlr0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.genalpha.datasourceimpl.requestentity.Profile", xlr0Var, 3);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("allowedInMusicApp", false);
        vwp0Var.m86594k("dateOfBirth", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, l8a.f130828a, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new dmr0(strMo39226f, i, strMo39226f2, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        dmr0 dmr0Var = (dmr0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, dmr0Var.f50604a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, dmr0Var.f50605b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, dmr0Var.f50606c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
