package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q570 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final q570 f185448a;
    private static final ktz0 descriptor;

    static {
        q570 q570Var = new q570();
        f185448a = q570Var;
        vwp0 vwp0Var = new vwp0("com.spotify.genalphagraduation.graduationimpl.KidsGraduationInfoJsonAdapter.AuthUserInfoJson", q570Var, 8);
        vwp0Var.m86594k("userName", false);
        vwp0Var.m86594k("credentialString", false);
        vwp0Var.m86594k("tokenInfo", true);
        vwp0Var.m86594k("imageUrl", true);
        vwp0Var.m86594k("displayName", true);
        vwp0Var.m86594k("pinRequired", true);
        vwp0Var.m86594k("lastProfileInfoRefreshTimestampMs", true);
        vwp0Var.m86594k("lastAccessTimestampMs", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(n570.f150499a);
        rr60 rr60VarM39700t2 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t3 = epv0.m39700t(ql51Var);
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{ql51Var, ql51Var, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, l8a.f130828a, epv0.m39700t(u2b0Var), epv0.m39700t(u2b0Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        p570 p570Var = null;
        String str = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
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
                    p570Var = (p570) frhVarMo29814b.mo39211B(ktz0Var, 2, n570.f150499a, p570Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 6, u2b0.f226058a, l);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) frhVarMo29814b.mo39211B(ktz0Var, 7, u2b0.f226058a, l2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new s570(i, strMo39226f, strMo39226f2, p570Var, str, str2, zMo39217M, l, l2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        s570 s570Var = (s570) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = s570Var.f205739a;
        boolean z = s570Var.f205744f;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, s570Var.f205740b);
        p570 p570Var = s570Var.f205741c;
        if (p570Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, n570.f150499a, p570Var);
        }
        String str2 = s570Var.f205742d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        String str3 = s570Var.f205743e;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z);
        }
        Long l = s570Var.f205745g;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, u2b0.f226058a, l);
        }
        Long l2 = s570Var.f205746h;
        if (l2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, u2b0.f226058a, l2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
