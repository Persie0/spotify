package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class wo2 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wo2 f253358a;
    private static final ktz0 descriptor;

    static {
        wo2 wo2Var = new wo2();
        f253358a = wo2Var;
        vwp0 vwp0Var = new vwp0("com.spotify.superconnect.agentonlinestate.impl.AgentResponse", wo2Var, 1);
        vwp0Var.m86594k("agent", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(ek2.f60339a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        gk2 gk2Var = null;
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
                gk2Var = (gk2) frhVarMo29814b.mo39211B(ktz0Var, 0, ek2.f60339a, gk2Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yo2(i, gk2Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gk2 gk2Var = ((yo2) obj).f274538a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || gk2Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ek2.f60339a, gk2Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
