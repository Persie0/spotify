package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e1p0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final e1p0 f55233a;
    private static final ktz0 descriptor;

    static {
        e1p0 e1p0Var = new e1p0();
        f55233a = e1p0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.quickstartpivot.playerimpl.endpoint.PlaybackOptions", e1p0Var, 3);
        vwp0Var.m86594k("shufflingContext", true);
        vwp0Var.m86594k("repeatingContext", true);
        vwp0Var.m86594k("repeatingTrack", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{epv0.m39700t(l8aVar), epv0.m39700t(l8aVar), epv0.m39700t(l8aVar)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 0, l8a.f130828a, bool);
                i |= 1;
            } else if (iMo29816p == 1) {
                bool2 = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 1, l8a.f130828a, bool2);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                bool3 = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 2, l8a.f130828a, bool3);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new g1p0(i, bool, bool2, bool3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        g1p0 g1p0Var = (g1p0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        Boolean bool = g1p0Var.f75675a;
        Boolean bool2 = g1p0Var.f75677c;
        Boolean bool3 = g1p0Var.f75676b;
        Boolean bool4 = Boolean.FALSE;
        if (!wj50.m88271j(bool, bool4)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, l8a.f130828a, bool);
        }
        if (!wj50.m88271j(bool3, bool4)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, l8a.f130828a, bool3);
        }
        if (!wj50.m88271j(bool2, bool4)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, l8a.f130828a, bool2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
