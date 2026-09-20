package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ve2 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ve2 f240553a;
    private static final ktz0 descriptor;

    static {
        ve2 ve2Var = new ve2();
        f240553a = ve2Var;
        vwp0 vwp0Var = new vwp0("com.spotify.ageverification.dialog.model.AgeVerificationDialogModel", ve2Var, 2);
        vwp0Var.m86594k("color", false);
        vwp0Var.m86594k("provider_url", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{e450.f55982a, ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new xe2(i, iMo39229o, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        xe2 xe2Var = (xe2) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44938e(0, xe2Var.f260617a, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, xe2Var.f260618b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
