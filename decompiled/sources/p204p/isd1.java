package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class isd1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final isd1 f105230a;
    private static final ktz0 descriptor;

    static {
        isd1 isd1Var = new isd1();
        f105230a = isd1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.legacy.impl.endpoint.WhereToPlayResponse", isd1Var, 2);
        vwp0Var.m86594k("data", true);
        vwp0Var.m86594k("metadata", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(lsd1.f136508a), epv0.m39700t(osd1.f168805a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        nsd1 nsd1Var = null;
        boolean z = true;
        int i = 0;
        qsd1 qsd1Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                nsd1Var = (nsd1) frhVarMo29814b.mo39211B(ktz0Var, 0, lsd1.f136508a, nsd1Var);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                qsd1Var = (qsd1) frhVarMo29814b.mo39211B(ktz0Var, 1, osd1.f168805a, qsd1Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ksd1(i, nsd1Var, qsd1Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ksd1 ksd1Var = (ksd1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        nsd1 nsd1Var = ksd1Var.f125932a;
        if (nsd1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, lsd1.f136508a, nsd1Var);
        }
        qsd1 qsd1Var = ksd1Var.f125933b;
        if (qsd1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, osd1.f168805a, qsd1Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
