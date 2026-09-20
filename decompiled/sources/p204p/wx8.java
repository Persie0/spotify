package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wx8 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wx8 f255964a;
    private static final ktz0 descriptor;

    static {
        wx8 wx8Var = new wx8();
        f255964a = wx8Var;
        vwp0 vwp0Var = new vwp0("com.spotify.inappuserfeedback.issuereporter.Base64File", wx8Var, 2);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("base64", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var};
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
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yx8(i, strMo39226f, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yx8 yx8Var = (yx8) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, yx8Var.f277173a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, yx8Var.f277174b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
