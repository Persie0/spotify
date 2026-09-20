package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class vg90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vg90 f241180a;
    private static final ktz0 descriptor;

    static {
        vg90 vg90Var = new vg90();
        f241180a = vg90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.ListeningParty", vg90Var, 5);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("organizer_uri", false);
        vwp0Var.m86594k("image_url", true);
        vwp0Var.m86594k("premium_only", false);
        vwp0Var.m86594k("scheduled_for", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), l8a.f130828a, ql51Var};
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
        String str = null;
        String strMo39226f3 = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            } else if (iMo29816p == 3) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yg90(strMo39226f, i, strMo39226f2, str, zMo39217M, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yg90 yg90Var = (yg90) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, yg90Var.f272517a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, yg90Var.f272518b);
        String str = yg90Var.f272519c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 3, yg90Var.f272520d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, yg90Var.f272521e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
