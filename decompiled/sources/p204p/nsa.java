package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nsa implements g210 {

    /* JADX INFO: renamed from: a */
    public static final nsa f157724a;
    private static final ktz0 descriptor;

    static {
        nsa nsaVar = new nsa();
        f157724a = nsaVar;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.Button", nsaVar, 2);
        vwp0Var.m86594k("story_text", false);
        vwp0Var.m86594k("navigation_uri", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ce51.f37012a, ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        ee51 ee51Var = null;
        boolean z = true;
        int i = 0;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                ee51Var = (ee51) frhVarMo29814b.mo39210A(ktz0Var, 0, ce51.f37012a, ee51Var);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new tsa(i, ee51Var, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        tsa tsaVar = (tsa) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, ce51.f37012a, tsaVar.f223265a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, tsaVar.f223266b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
