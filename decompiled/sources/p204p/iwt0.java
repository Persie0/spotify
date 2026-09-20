package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class iwt0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final iwt0 f106509a;
    private static final ktz0 descriptor;

    static {
        iwt0 iwt0Var = new iwt0();
        f106509a = iwt0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.quickstartpivot.playerimpl.endpoint.QuickstartPivotRequest", iwt0Var, 2);
        vwp0Var.m86594k("requestContext", true);
        vwp0Var.m86594k("recommendationOptions", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(huw0.f95481a), epv0.m39700t(xbv0.f260019a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        juw0 juw0Var = null;
        boolean z = true;
        int i = 0;
        zbv0 zbv0Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                juw0Var = (juw0) frhVarMo29814b.mo39211B(ktz0Var, 0, huw0.f95481a, juw0Var);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zbv0Var = (zbv0) frhVarMo29814b.mo39211B(ktz0Var, 1, xbv0.f260019a, zbv0Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new kwt0(i, juw0Var, zbv0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        kwt0 kwt0Var = (kwt0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        juw0 juw0Var = kwt0Var.f127237a;
        if (juw0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, huw0.f95481a, juw0Var);
        }
        zbv0 zbv0Var = kwt0Var.f127238b;
        if (zbv0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, xbv0.f260019a, zbv0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
