package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z941 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final z941 f280663a;
    private static final ktz0 descriptor;

    static {
        z941 z941Var = new z941();
        f280663a = z941Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.sponsorshipimpl.model.Sponsorship", z941Var, 5);
        vwp0Var.m86594k("startTime", true);
        vwp0Var.m86594k("endTime", true);
        vwp0Var.m86594k("spotifyUri", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ADVERTISER, true);
        vwp0Var.m86594k("version", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        u2b0 u2b0Var = u2b0.f226058a;
        rr60 rr60VarM39700t = epv0.m39700t(u2b0Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(u2b0Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, rr60VarM39700t2, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(e450.f55982a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        Long l = null;
        Long l2 = null;
        String strMo39226f = null;
        String str = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 0, u2b0.f226058a, l);
                i |= 1;
            } else if (iMo29816p == 1) {
                l2 = (Long) frhVarMo29814b.mo39211B(ktz0Var, 1, u2b0.f226058a, l2);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 4, e450.f55982a, num);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new fa41(i, l, l2, strMo39226f, str, num);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        fa41 fa41Var = (fa41) obj;
        Long l = fa41Var.f67427b;
        Long l2 = fa41Var.f67426a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || l2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, u2b0.f226058a, l2);
        }
        if (hrhVarMo35820b.mo48399d0() || l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, u2b0.f226058a, l);
        }
        String str = fa41Var.f67428c;
        Integer num = fa41Var.f67430e;
        String str2 = fa41Var.f67429d;
        hrhVarMo35820b.mo44931G(ktz0Var, 2, str);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, e450.f55982a, num);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
