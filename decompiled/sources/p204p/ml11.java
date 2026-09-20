package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ml11 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ml11 f144740a;
    private static final ktz0 descriptor;

    static {
        ml11 ml11Var = new ml11();
        f144740a = ml11Var;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.policy.ShowDecorationPolicy", ml11Var, 3);
        vwp0Var.m86594k("list", true);
        vwp0Var.m86594k("header", true);
        vwp0Var.m86594k("sections", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(b2w.f22727a), epv0.m39700t(rj20.f199693a), epv0.m39700t(bv60.f31294a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        a2w a2wVar = null;
        boolean z = true;
        int i = 0;
        pl11 pl11Var = null;
        av60 av60Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                a2wVar = (a2w) frhVarMo29814b.mo39211B(ktz0Var, 0, b2w.f22727a, a2wVar);
                i |= 1;
            } else if (iMo29816p == 1) {
                pl11Var = (pl11) frhVarMo29814b.mo39211B(ktz0Var, 1, rj20.f199693a, pl11Var);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                av60Var = (av60) frhVarMo29814b.mo39211B(ktz0Var, 2, bv60.f31294a, av60Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ql11(i, a2wVar, pl11Var, av60Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ql11 ql11Var = (ql11) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        a2w a2wVar = ql11Var.f189697a;
        if (a2wVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, b2w.f22727a, a2wVar);
        }
        pl11 pl11Var = ql11Var.f189698b;
        if (pl11Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, rj20.f199693a, pl11Var);
        }
        av60 av60Var = ql11Var.f189699c;
        if (av60Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, bv60.f31294a, av60Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
