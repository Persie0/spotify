package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class huw0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final huw0 f95481a;
    private static final ktz0 descriptor;

    static {
        huw0 huw0Var = new huw0();
        f95481a = huw0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.quickstartpivot.playerimpl.endpoint.RequestContext", huw0Var, 5);
        vwp0Var.m86594k("userContext", true);
        vwp0Var.m86594k("clientDatetime", true);
        vwp0Var.m86594k("featureIdentifier", true);
        vwp0Var.m86594k("interactionId", true);
        vwp0Var.m86594k("supportsQuickstartUri", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), l8a.f130828a};
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
        String str4 = null;
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
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                i |= 4;
            } else if (iMo29816p == 3) {
                str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str4);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new juw0(str, i, str2, str3, zMo39217M, str4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        juw0 juw0Var = (juw0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = juw0Var.f116184a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = juw0Var.f116185b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = juw0Var.f116186c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = juw0Var.f116187d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 4, juw0Var.f116188e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
