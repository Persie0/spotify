package p204p;

import java.util.Date;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n570 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final n570 f150499a;
    private static final ktz0 descriptor;

    static {
        n570 n570Var = new n570();
        f150499a = n570Var;
        vwp0 vwp0Var = new vwp0("com.spotify.genalphagraduation.graduationimpl.KidsGraduationInfoJsonAdapter.AccessTokenJson", n570Var, 3);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("token", false);
        vwp0Var.m86594k("expiresAt", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, rdx0.f198224a};
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
                date = (Date) frhVarMo29814b.mo39210A(ktz0Var, 2, rdx0.f198224a, date);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new p570(i, strMo39226f, strMo39226f2, date);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        p570 p570Var = (p570) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, p570Var.f174092a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, p570Var.f174093b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, rdx0.f198224a, p570Var.f174094c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
