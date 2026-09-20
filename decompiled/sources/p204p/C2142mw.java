package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: p.mw */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C2142mw implements g210 {

    /* JADX INFO: renamed from: a */
    public static final C2142mw f147675a;
    private static final ktz0 descriptor;

    static {
        C2142mw c2142mw = new C2142mw();
        f147675a = c2142mw;
        vwp0 vwp0Var = new vwp0("com.spotify.accountswitching.switcherimpl.AccountSwitchingUserInfoJsonAdapter.AuthUserInfoJson", c2142mw, 9);
        vwp0Var.m86594k("userName", false);
        vwp0Var.m86594k("credentialString", false);
        vwp0Var.m86594k("tokenInfo", true);
        vwp0Var.m86594k("imageUrl", true);
        vwp0Var.m86594k("displayName", true);
        vwp0Var.m86594k("color", true);
        vwp0Var.m86594k("pinRequired", true);
        vwp0Var.m86594k("lastProfileInfoRefreshTimestampMs", true);
        vwp0Var.m86594k("lastAccessTimestampMs", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(C2030jw.f116549a);
        rr60 rr60VarM39700t2 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t3 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(e450.f55982a);
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{ql51Var, ql51Var, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4, l8a.f130828a, epv0.m39700t(u2b0Var), epv0.m39700t(u2b0Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        String strMo39226f2 = null;
        C2105lw c2105lw = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        int i = 0;
        boolean zMo39217M = false;
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
                    c2105lw = (C2105lw) frhVarMo29814b.mo39211B(ktz0Var, 2, C2030jw.f116549a, c2105lw);
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
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 5, e450.f55982a, num);
                    i |= 32;
                    break;
                case 6:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 7, u2b0.f226058a, l);
                    i |= 128;
                    break;
                case 8:
                    l2 = (Long) frhVarMo29814b.mo39211B(ktz0Var, 8, u2b0.f226058a, l2);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new C2230ow(i, strMo39226f, strMo39226f2, c2105lw, str, str2, num, zMo39217M, l, l2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        C2230ow c2230ow = (C2230ow) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = c2230ow.f170589a;
        boolean z = c2230ow.f170595g;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, c2230ow.f170590b);
        C2105lw c2105lw = c2230ow.f170591c;
        if (c2105lw != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, C2030jw.f116549a, c2105lw);
        }
        String str2 = c2230ow.f170592d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        String str3 = c2230ow.f170593e;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str3);
        }
        Integer num = c2230ow.f170594f;
        if (num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, e450.f55982a, num);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 6, z);
        }
        Long l = c2230ow.f170596h;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, u2b0.f226058a, l);
        }
        Long l2 = c2230ow.f170597i;
        if (l2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, u2b0.f226058a, l2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
