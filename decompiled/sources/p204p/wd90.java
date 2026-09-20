package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wd90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wd90 f250238a;
    private static final ktz0 descriptor;

    static {
        wd90 wd90Var = new wd90();
        f250238a = wd90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.listeningactivity.data.impl.ListeningActivityPayload", wd90Var, 4);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("contextUri", true);
        vwp0Var.m86594k("isPlaying", false);
        vwp0Var.m86594k("timestamp", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var), l8a.f130828a, h2s.f87054a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String str = null;
        double dMo39213D = 0.0d;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else if (iMo29816p == 2) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                dMo39213D = frhVarMo29814b.mo39213D(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yd90(i, strMo39226f, str, zMo39217M, dMo39213D);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yd90 yd90Var = (yd90) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, yd90Var.f271722a);
        String str = yd90Var.f271723b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 2, yd90Var.f271724c);
        hrhVarMo35820b.mo44940g(ktz0Var, 3, yd90Var.f271725d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
