package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hj90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final hj90 f91997a;
    private static final ktz0 descriptor;

    static {
        hj90 hj90Var = new hj90();
        f91997a = hj90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.ListeningPartyStatus", hj90Var, 3);
        vwp0Var.m86594k("status", false);
        vwp0Var.m86594k("live_at", true);
        vwp0Var.m86594k("closed_at", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new jj90(strMo39226f, str, i, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        jj90 jj90Var = (jj90) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, jj90Var.f112957a);
        String str = jj90Var.f112958b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        String str2 = jj90Var.f112959c;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
