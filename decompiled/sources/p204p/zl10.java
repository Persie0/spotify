package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zl10 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zl10 f283892a;
    private static final ktz0 descriptor;

    static {
        zl10 zl10Var = new zl10();
        f283892a = zl10Var;
        vwp0 vwp0Var = new vwp0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.Generic", zl10Var, 2);
        vwp0Var.m86594k("canRetry", false);
        vwp0Var.m86594k("errorMsg", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{l8a.f130828a, epv0.m39700t(ql51.f189738a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new bm10(str, i, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        bm10 bm10Var = (bm10) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        boolean z = bm10Var.f28347a;
        String str = bm10Var.f28348b;
        hrhVarMo35820b.mo44930E(ktz0Var, 0, z);
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
