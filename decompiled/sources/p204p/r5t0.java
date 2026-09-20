package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r5t0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final r5t0 f196120a;
    private static final ktz0 descriptor;

    static {
        r5t0 r5t0Var = new r5t0();
        f196120a = r5t0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialDescriptor", r5t0Var, 3);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("transports", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t((rr60) t5t0.f217368d[2].getValue());
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, rr60VarM39700t};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = t5t0.f217368d;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        List list = null;
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
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new t5t0(i, strMo39226f, strMo39226f2, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        t5t0 t5t0Var = (t5t0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = t5t0.f217368d;
        String str = t5t0Var.f217369a;
        List list = t5t0Var.f217371c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, t5t0Var.f217370b);
        if (hrhVarMo35820b.mo48399d0() || list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
