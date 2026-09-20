package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ek2 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ek2 f60339a;
    private static final ktz0 descriptor;

    static {
        ek2 ek2Var = new ek2();
        f60339a = ek2Var;
        vwp0 vwp0Var = new vwp0("com.spotify.superconnect.agentonlinestate.impl.AgentData", ek2Var, 3);
        vwp0Var.m86594k("online_state", true);
        vwp0Var.m86594k("last_online_at", true);
        vwp0Var.m86594k("chat_uri", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gk2(strMo39226f, strMo39226f2, i, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gk2 gk2Var = (gk2) obj;
        String str = gk2Var.f80683c;
        String str2 = gk2Var.f80682b;
        String str3 = gk2Var.f80681a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str3, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 0, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 1, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 2, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
