package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class kr7 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final kr7 f125568a;
    private static final ktz0 descriptor;

    static {
        kr7 kr7Var = new kr7();
        f125568a = kr7Var;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.wearabledatalayer.AuthorizeResponse", kr7Var, 1);
        vwp0Var.m86594k("auth_code", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        boolean z = true;
        int i = 0;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        if (1 != i) {
            edo.m38617p(i, 1, descriptor);
            throw null;
        }
        mr7 mr7Var = new mr7();
        mr7Var.f146438a = strMo39226f;
        return mr7Var;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, ((mr7) obj).f146438a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
