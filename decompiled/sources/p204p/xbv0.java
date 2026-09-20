package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class xbv0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final xbv0 f260019a;
    private static final ktz0 descriptor;

    static {
        xbv0 xbv0Var = new xbv0();
        f260019a = xbv0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.quickstartpivot.playerimpl.endpoint.RecommendationOptions", xbv0Var, 3);
        vwp0Var.m86594k("contentType", true);
        vwp0Var.m86594k("targetDeviceId", true);
        vwp0Var.m86594k("withTts", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(l8a.f130828a)};
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
        Boolean bool = null;
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
                bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 2, l8a.f130828a, bool);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new zbv0(i, str, str2, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        zbv0 zbv0Var = (zbv0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = zbv0Var.f281404a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = zbv0Var.f281405b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        Boolean bool = zbv0Var.f281406c;
        if (bool != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, l8a.f130828a, bool);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
