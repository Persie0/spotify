package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q900 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final q900 f186444a;
    private static final ktz0 descriptor;

    static {
        q900 q900Var = new q900();
        f186444a = q900Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.Frames", q900Var, 1);
        vwp0Var.m86594k("frame_deltas_in_seconds", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{jls.f113673a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        lls llsVar = null;
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
                llsVar = (lls) frhVarMo29814b.mo39210A(ktz0Var, 0, jls.f113673a, llsVar);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new s900(i, llsVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, jls.f113673a, ((s900) obj).f206813a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
