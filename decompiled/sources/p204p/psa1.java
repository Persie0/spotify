package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class psa1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final psa1 f180796a;
    private static final ktz0 descriptor;

    static {
        psa1 psa1Var = new psa1();
        f180796a = psa1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.datalayermessages.UserInfoResponse", psa1Var, 4);
        vwp0Var.m86594k("name", true);
        vwp0Var.m86594k("pictureUrl", true);
        vwp0Var.m86594k("isSuccessful", false);
        vwp0Var.m86594k("errorMessage", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), l8a.f130828a, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else if (iMo29816p == 1) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                i |= 2;
            } else if (iMo29816p == 2) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new rsa1(i, str, str2, zMo39217M, str3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        rsa1 rsa1Var = (rsa1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = rsa1Var.f202243a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = rsa1Var.f202244b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 2, rsa1Var.f202245c);
        String str3 = rsa1Var.f202246d;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
