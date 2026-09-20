package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g2d0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final g2d0 f75888a;
    private static final ktz0 descriptor;

    static {
        g2d0 g2d0Var = new g2d0();
        f75888a = g2d0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.deeplink.deferreddeeplink.MatchResultRequest", g2d0Var, 10);
        vwp0Var.m86594k("match_attempted", true);
        vwp0Var.m86594k("match_success", false);
        vwp0Var.m86594k("match_method", true);
        vwp0Var.m86594k("match_confidence", false);
        vwp0Var.m86594k("deep_link", true);
        vwp0Var.m86594k("time_to_match_ms", false);
        vwp0Var.m86594k("platform", true);
        vwp0Var.m86594k("install_referrer_available", false);
        vwp0Var.m86594k("click_id", true);
        vwp0Var.m86594k("match_id", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t3 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(ql51Var);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{l8aVar, l8aVar, rr60VarM39700t, h2s.f87054a, rr60VarM39700t2, u2b0.f226058a, ql51Var, l8aVar, rr60VarM39700t3, rr60VarM39700t4};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        String str2 = null;
        String strMo39226f = null;
        double dMo39213D = 0.0d;
        long jMo39227i0 = 0;
        boolean z = true;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                    i |= 4;
                    break;
                case 3:
                    dMo39213D = frhVarMo29814b.mo39213D(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 8, ql51.f189738a, str3);
                    i |= 256;
                    break;
                case 9:
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 9, ql51.f189738a, str4);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new i2d0(i, zMo39217M, zMo39217M2, str2, dMo39213D, str, jMo39227i0, strMo39226f, zMo39217M3, str3, str4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        i2d0 i2d0Var = (i2d0) obj;
        boolean z = i2d0Var.f97797a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || !z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 0, z);
        }
        boolean z2 = i2d0Var.f97798b;
        String str = i2d0Var.f97803g;
        hrhVarMo35820b.mo44930E(ktz0Var, 1, z2);
        String str2 = i2d0Var.f97799c;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44940g(ktz0Var, 3, i2d0Var.f97800d);
        String str3 = i2d0Var.f97801e;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44942l(ktz0Var, 5, i2d0Var.f97802f);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "ANDROID")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 6, str);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 7, i2d0Var.f97804h);
        String str4 = i2d0Var.f97805i;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, ql51.f189738a, str4);
        }
        String str5 = i2d0Var.f97806j;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, ql51.f189738a, str5);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
