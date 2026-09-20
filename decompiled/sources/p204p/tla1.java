package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tla1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final tla1 f221430a;
    private static final ktz0 descriptor;

    static {
        tla1 tla1Var = new tla1();
        f221430a = tla1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.listeningactivity.data.impl.UserActivityPayload", tla1Var, 2);
        vwp0Var.m86594k("username", false);
        vwp0Var.m86594k("activity", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, epv0.m39700t(wd90.f250238a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        yd90 yd90Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                yd90Var = (yd90) frhVarMo29814b.mo39211B(ktz0Var, 1, wd90.f250238a, yd90Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vla1(i, strMo39226f, yd90Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vla1 vla1Var = (vla1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, vla1Var.f242413a);
        yd90 yd90Var = vla1Var.f242414b;
        if (yd90Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, wd90.f250238a, yd90Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
