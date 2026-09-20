package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class fwt0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final fwt0 f74162a;
    private static final ktz0 descriptor;

    static {
        fwt0 fwt0Var = new fwt0();
        f74162a = fwt0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.quickstartpivot.playerimpl.endpoint.QuickstartPivotRecommendResponse", fwt0Var, 7);
        vwp0Var.m86594k("action", false);
        vwp0Var.m86594k("contextUri", false);
        vwp0Var.m86594k("contextUrl", true);
        vwp0Var.m86594k("itemUri", true);
        vwp0Var.m86594k("playbackPosition", true);
        vwp0Var.m86594k("playbackOptions", true);
        vwp0Var.m86594k("ttsLens", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(u2b0.f226058a), epv0.m39700t(e1p0.f55233a), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        String str2 = null;
        Long l = null;
        g1p0 g1p0Var = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 4, u2b0.f226058a, l);
                    i |= 16;
                    break;
                case 5:
                    g1p0Var = (g1p0) frhVarMo29814b.mo39211B(ktz0Var, 5, e1p0.f55233a, g1p0Var);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str3);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hwt0(i, strMo39226f, strMo39226f2, str, str2, l, g1p0Var, str3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hwt0 hwt0Var = (hwt0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, hwt0Var.f96043a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, hwt0Var.f96044b);
        String str = hwt0Var.f96045c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        String str2 = hwt0Var.f96046d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        Long l = hwt0Var.f96047e;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, u2b0.f226058a, l);
        }
        g1p0 g1p0Var = hwt0Var.f96048f;
        if (g1p0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, e1p0.f55233a, g1p0Var);
        }
        String str3 = hwt0Var.f96049g;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
