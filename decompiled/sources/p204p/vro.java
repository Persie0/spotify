package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class vro implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vro f244233a;
    private static final ktz0 descriptor;

    static {
        vro vroVar = new vro();
        f244233a = vroVar;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.policy.DecorationPolicy", vroVar, 1);
        vwp0Var.m86594k("episode", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(b2w.f22727a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        a2w a2wVar = null;
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
                a2wVar = (a2w) frhVarMo29814b.mo39211B(ktz0Var, 0, b2w.f22727a, a2wVar);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new dso(i, a2wVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        a2w a2wVar = ((dso) obj).f52608a;
        if (a2wVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, b2w.f22727a, a2wVar);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
