package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zp9 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zp9 f285024a;
    private static final ktz0 descriptor;

    static {
        zp9 zp9Var = new zp9();
        f285024a = zp9Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.attribution.domain.BlendUserAttributionMetadata", zp9Var, 5);
        vwp0Var.m86594k("username", false);
        vwp0Var.m86594k("display_name", false);
        vwp0Var.m86594k("image_url", false);
        vwp0Var.m86594k("description", false);
        vwp0Var.m86594k("can_change_attribution", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        boolean z = true;
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
            } else if (iMo29816p == 2) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new bq9(strMo39226f, i, strMo39226f2, strMo39226f3, zMo39217M, strMo39226f4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        bq9 bq9Var = (bq9) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, bq9Var.f29745a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, bq9Var.f29746b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, bq9Var.f29747c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, bq9Var.f29748d);
        hrhVarMo35820b.mo44930E(ktz0Var, 4, bq9Var.f29749e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
