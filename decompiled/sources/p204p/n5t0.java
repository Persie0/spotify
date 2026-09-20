package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n5t0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final n5t0 f150615a;
    private static final ktz0 descriptor;

    static {
        n5t0 n5t0Var = new n5t0();
        f150615a = n5t0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialCreationOptions", n5t0Var, 8);
        vwp0Var.m86594k("rp", false);
        vwp0Var.m86594k("user", false);
        vwp0Var.m86594k("challenge", false);
        vwp0Var.m86594k("pubKeyCredParams", false);
        vwp0Var.m86594k("excludeCredentials", true);
        vwp0Var.m86594k("authenticatorSelection", true);
        vwp0Var.m86594k("attestation", true);
        vwp0Var.m86594k("timeout", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = q5t0.f185593i;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{a6t0.f12868a, e6t0.f56731a, ql51Var, fr70VarArr[3].getValue(), epv0.m39700t((rr60) fr70VarArr[4].getValue()), epv0.m39700t(um7.f231768a), epv0.m39700t(ql51Var), u2b0.f226058a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = q5t0.f185593i;
        frhVarMo29814b.getClass();
        String str = null;
        int i = 0;
        c6t0 c6t0Var = null;
        g6t0 g6t0Var = null;
        String strMo39226f = null;
        List list = null;
        List list2 = null;
        wm7 wm7Var = null;
        long jMo39227i0 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c6t0Var = (c6t0) frhVarMo29814b.mo39210A(ktz0Var, 0, a6t0.f12868a, c6t0Var);
                    i |= 1;
                    break;
                case 1:
                    g6t0Var = (g6t0) frhVarMo29814b.mo39210A(ktz0Var, 1, e6t0.f56731a, g6t0Var);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    wm7Var = (wm7) frhVarMo29814b.mo39211B(ktz0Var, 5, um7.f231768a, wm7Var);
                    i |= 32;
                    break;
                case 6:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str);
                    i |= 64;
                    break;
                case 7:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new q5t0(i, c6t0Var, g6t0Var, strMo39226f, list, list2, wm7Var, str, jMo39227i0);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        q5t0 q5t0Var = (q5t0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = q5t0.f185593i;
        a6t0 a6t0Var = a6t0.f12868a;
        c6t0 c6t0Var = q5t0Var.f185594a;
        String str = q5t0Var.f185600g;
        wm7 wm7Var = q5t0Var.f185599f;
        List list = q5t0Var.f185598e;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, a6t0Var, c6t0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, e6t0.f56731a, q5t0Var.f185595b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, q5t0Var.f185596c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), q5t0Var.f185597d);
        if (hrhVarMo35820b.mo48399d0() || list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || wm7Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, um7.f231768a, wm7Var);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44942l(ktz0Var, 7, q5t0Var.f185601h);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
