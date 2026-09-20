package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n180 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final n180 f149336a;
    private static final ktz0 descriptor;

    static {
        n180 n180Var = new n180();
        f149336a = n180Var;
        vwp0 vwp0Var = new vwp0("com.spotify.leavebehindads.ctaimpl.model.LeavebehindAd", n180Var, 12);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ADVERTISER, true);
        vwp0Var.m86594k("clickthroughUrl", true);
        vwp0Var.m86594k("buttonMessage", true);
        vwp0Var.m86594k("tagline", true);
        vwp0Var.m86594k("displayImage", true);
        vwp0Var.m86594k("logoImage", true);
        vwp0Var.m86594k("lineitemId", true);
        vwp0Var.m86594k("creativeId", true);
        vwp0Var.m86594k("trackingEvents", true);
        vwp0Var.m86594k("adId", true);
        vwp0Var.m86594k("crossPromo", true);
        vwp0Var.m86594k("product_name", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t(jt81.f115763a);
        rr60 rr60VarM39700t2 = epv0.m39700t(sul.f214145a);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, rr60VarM39700t, ql51Var, rr60VarM39700t2, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        uul uulVar = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        String strMo39226f6 = null;
        String strMo39226f7 = null;
        String strMo39226f8 = null;
        lt81 lt81Var = null;
        String strMo39226f9 = null;
        String strMo39226f10 = null;
        boolean z = true;
        int i = 0;
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
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f6 = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f7 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strMo39226f8 = frhVarMo29814b.mo39226f(ktz0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    lt81Var = (lt81) frhVarMo29814b.mo39211B(ktz0Var, 8, jt81.f115763a, lt81Var);
                    i |= 256;
                    break;
                case 9:
                    strMo39226f9 = frhVarMo29814b.mo39226f(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    uulVar = (uul) frhVarMo29814b.mo39211B(ktz0Var, 10, sul.f214145a, uulVar);
                    i |= 1024;
                    break;
                case 11:
                    strMo39226f10 = frhVarMo29814b.mo39226f(ktz0Var, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new p180(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, strMo39226f6, strMo39226f7, strMo39226f8, lt81Var, strMo39226f9, uulVar, strMo39226f10);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        p180 p180Var = (p180) obj;
        String str = p180Var.f172984l;
        uul uulVar = p180Var.f172983k;
        String str2 = p180Var.f172982j;
        lt81 lt81Var = p180Var.f172981i;
        String str3 = p180Var.f172980h;
        String str4 = p180Var.f172979g;
        String str5 = p180Var.f172978f;
        String str6 = p180Var.f172977e;
        String str7 = p180Var.f172976d;
        String str8 = p180Var.f172975c;
        String str9 = p180Var.f172974b;
        String str10 = p180Var.f172973a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str10, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 0, str10);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str9, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 1, str9);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str8, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 2, str8);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str7, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 3, str7);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str6, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 4, str6);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str5, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 5, str5);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str4, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 6, str4);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str3, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 7, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || lt81Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, jt81.f115763a, lt81Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 9, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || uulVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, sul.f214145a, uulVar);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 11, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
