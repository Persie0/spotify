package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zp11 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zp11 f284900a;
    private static final ktz0 descriptor;

    static {
        zp11 zp11Var = new zp11();
        f284900a = zp11Var;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.policy.ShowPolicy", zp11Var, 1);
        vwp0Var.m86594k("policy", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(ml11.f144740a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        ql11 ql11Var = null;
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
                ql11Var = (ql11) frhVarMo29814b.mo39211B(ktz0Var, 0, ml11.f144740a, ql11Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new bq11(i, ql11Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        ql11 ql11Var = ((bq11) obj).f29644a;
        if (ql11Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ml11.f144740a, ql11Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
