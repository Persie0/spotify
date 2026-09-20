package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tet0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final tet0 f219791a;
    private static final ktz0 descriptor;

    static {
        tet0 tet0Var = new tet0();
        f219791a = tet0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.musicappplatform.state.processor.PushNotificationPendingIntentRegistryImpl.CachedIntentInfo", tet0Var, 5);
        vwp0Var.m86594k("action", false);
        vwp0Var.m86594k(kyx.f127932c, false);
        vwp0Var.m86594k("className", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("data", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String str = null;
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
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vet0(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vet0 vet0Var = (vet0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = vet0Var.f240809a;
        String str2 = vet0Var.f240813e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, vet0Var.f240810b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, vet0Var.f240811c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, vet0Var.f240812d);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
