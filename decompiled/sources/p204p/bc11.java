package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class bc11 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final bc11 f25750a;
    private static final ktz0 descriptor;

    static {
        bc11 bc11Var = new bc11();
        f25750a = bc11Var;
        vwp0 vwp0Var = new vwp0("com.spotify.previewcard.localstorage.impl.SharedPreferencesLocalProgressStorage.ProgressEntry", bc11Var, 2);
        vwp0Var.m86594k("position", false);
        vwp0Var.m86594k("createdAtTimestamp", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{u2b0Var, u2b0Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        long jMo39227i0 = 0;
        long jMo39227i1 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new dc11(i, jMo39227i0, jMo39227i1);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        dc11 dc11Var = (dc11) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44942l(ktz0Var, 0, dc11Var.f47401a);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, dc11Var.f47402b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
