package p204p;

import java.util.Date;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: p.jw */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C2030jw implements g210 {

    /* JADX INFO: renamed from: a */
    public static final C2030jw f116549a;
    private static final ktz0 descriptor;

    static {
        C2030jw c2030jw = new C2030jw();
        f116549a = c2030jw;
        vwp0 vwp0Var = new vwp0("com.spotify.accountswitching.switcherimpl.AccountSwitchingUserInfoJsonAdapter.AccessTokenJson", c2030jw, 3);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("token", false);
        vwp0Var.m86594k("expiresAt", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, sdx0.f208108a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        Date date = null;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                date = (Date) frhVarMo29814b.mo39210A(ktz0Var, 2, sdx0.f208108a, date);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new C2105lw(i, strMo39226f, strMo39226f2, date);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        C2105lw c2105lw = (C2105lw) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, c2105lw.f137426a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, c2105lw.f137427b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, sdx0.f208108a, c2105lw.f137428c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
