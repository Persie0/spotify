package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kpn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final kpn0 f125092a;
    private static final ktz0 descriptor;

    static {
        kpn0 kpn0Var = new kpn0();
        f125092a = kpn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.bluejay.onboarding.customization.steps.location.PersistedLocationSuggestion", kpn0Var, 3);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("country", false);
        vwp0Var.m86594k("geonameId", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, e450.f55982a};
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
        String strMo39226f2 = null;
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
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new mpn0(i, strMo39226f, iMo39229o, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        mpn0 mpn0Var = (mpn0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, mpn0Var.f146052a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, mpn0Var.f146053b);
        hrhVarMo35820b.mo44938e(2, mpn0Var.f146054c, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
