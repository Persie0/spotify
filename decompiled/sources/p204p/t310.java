package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t310 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final t310 f216687a;
    private static final ktz0 descriptor;

    static {
        t310 t310Var = new t310();
        f216687a = t310Var;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.crossdevicesyncing.data.GenericFilters", t310Var, 3);
        vwp0Var.m86594k("specificDisabled", false);
        vwp0Var.m86594k("externalizationEnabled", false);
        vwp0Var.m86594k("externalizationDisabled", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        q310 q310Var = q310.f184775a;
        return new rr60[]{q310Var, q310Var, q310Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        s310 s310Var = null;
        boolean z = true;
        int i = 0;
        s310 s310Var2 = null;
        s310 s310Var3 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                s310Var = (s310) frhVarMo29814b.mo39210A(ktz0Var, 0, q310.f184775a, s310Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                s310Var2 = (s310) frhVarMo29814b.mo39210A(ktz0Var, 1, q310.f184775a, s310Var2);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                s310Var3 = (s310) frhVarMo29814b.mo39210A(ktz0Var, 2, q310.f184775a, s310Var3);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new v310(i, s310Var, s310Var2, s310Var3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        v310 v310Var = (v310) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        q310 q310Var = q310.f184775a;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, q310Var, v310Var.f236751a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, q310Var, v310Var.f236752b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, q310Var, v310Var.f236753c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
