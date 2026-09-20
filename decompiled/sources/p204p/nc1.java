package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nc1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final nc1 f152392a;
    private static final ktz0 descriptor;

    static {
        nc1 nc1Var = new nc1();
        f152392a = nc1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.genalpha.datasourceimpl.requestentity.AddKidRequest", nc1Var, 3);
        vwp0Var.m86594k("profile", false);
        vwp0Var.m86594k("pin", true);
        vwp0Var.m86594k("parentalControls", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{xlr0.f263229a, epv0.m39700t(ql51.f189738a), f0n0.f64688a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        dmr0 dmr0Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        h0n0 h0n0Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                dmr0Var = (dmr0) frhVarMo29814b.mo39210A(ktz0Var, 0, xlr0.f263229a, dmr0Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                h0n0Var = (h0n0) frhVarMo29814b.mo39210A(ktz0Var, 2, f0n0.f64688a, h0n0Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new pc1(i, dmr0Var, str, h0n0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        pc1 pc1Var = (pc1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, xlr0.f263229a, pc1Var.f175928a);
        String str = pc1Var.f175929b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 2, f0n0.f64688a, pc1Var.f175930c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
