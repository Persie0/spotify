package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f7a1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f7a1 f66634a;
    private static final ktz0 descriptor;

    static {
        f7a1 f7a1Var = new f7a1();
        f66634a = f7a1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.adsprivacycenter.UpdateAdCategoryAdPreferenceRequest", f7a1Var, 1);
        vwp0Var.m86594k("adCategoryAdPreference", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{sj0.f209703a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        uj0 uj0Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                uj0Var = (uj0) frhVarMo29814b.mo39210A(ktz0Var, 0, sj0.f209703a, uj0Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h7a1(i, uj0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, sj0.f209703a, ((h7a1) obj).f88396a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
