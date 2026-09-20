package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i7a1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final i7a1 f99479a;
    private static final ktz0 descriptor;

    static {
        i7a1 i7a1Var = new i7a1();
        f99479a = i7a1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.adsprivacycenter.UpdateAdCategoryAdPreferenceResponse", i7a1Var, 1);
        vwp0Var.m86594k("successfullyUpdated", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(l8a.f130828a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        Boolean bool = null;
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
                bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 0, l8a.f130828a, bool);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new k7a1(i, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        Boolean bool = ((k7a1) obj).f120030a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || bool != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, l8a.f130828a, bool);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
