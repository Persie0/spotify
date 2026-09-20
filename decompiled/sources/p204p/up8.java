package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class up8 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final up8 f232594a;
    private static final ktz0 descriptor;

    static {
        up8 up8Var = new up8();
        f232594a = up8Var;
        vwp0 vwp0Var = new vwp0("com.spotify.premiumdestination.tabbadge.BadgeCampaign", up8Var, 2);
        vwp0Var.m86594k("start_date", true);
        vwp0Var.m86594k("end_date", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new wp8(i, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        wp8 wp8Var = (wp8) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = wp8Var.f253697a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = wp8Var.f253698b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
