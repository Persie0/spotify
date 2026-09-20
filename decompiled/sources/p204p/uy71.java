package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final uy71 f235204a;
    private static final ktz0 descriptor;

    static {
        uy71 uy71Var = new uy71();
        f235204a = uy71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.connectivity.httpmonorepo.TokenResponse", uy71Var, 7);
        vwp0Var.m86594k("refreshToken", true);
        vwp0Var.m86594k("accessToken", true);
        vwp0Var.m86594k("expiresIn", true);
        vwp0Var.m86594k("tokenType", true);
        vwp0Var.m86594k("scope", true);
        vwp0Var.m86594k("errorCode", true);
        vwp0Var.m86594k("errorDescription", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = az71.f21446h;
        ql51 ql51Var = ql51.f189738a;
        e450 e450Var = e450.f55982a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), e450Var, epv0.m39700t(ql51Var), fr70VarArr[4].getValue(), e450Var, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = az71.f21446h;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                    i |= 2;
                    break;
                case 2:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str4);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new az71(i, iMo39229o, iMo39229o2, str, str2, str3, str4, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        az71 az71Var = (az71) obj;
        String str = az71Var.f21453g;
        int i = az71Var.f21452f;
        List list = az71Var.f21451e;
        String str2 = az71Var.f21450d;
        int i2 = az71Var.f21449c;
        String str3 = az71Var.f21448b;
        String str4 = az71Var.f21447a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = az71.f21446h;
        if (hrhVarMo35820b.mo48399d0() || str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str4);
        }
        if (hrhVarMo35820b.mo48399d0() || str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str3);
        }
        if (hrhVarMo35820b.mo48399d0() || i2 != 0) {
            hrhVarMo35820b.mo44938e(2, i2, ktz0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lau.f131415a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(5, i, ktz0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
