package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class um7 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final um7 f231768a;
    private static final ktz0 descriptor;

    static {
        um7 um7Var = new um7();
        f231768a = um7Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.AuthenticatorSelectionCriteria", um7Var, 3);
        vwp0Var.m86594k("authenticatorAttachment", true);
        vwp0Var.m86594k("residentKey", true);
        vwp0Var.m86594k("userVerification", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new wm7(str, str2, i, str3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        wm7 wm7Var = (wm7) obj;
        String str = wm7Var.f252748c;
        String str2 = wm7Var.f252747b;
        String str3 = wm7Var.f252746a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
