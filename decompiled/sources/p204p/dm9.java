package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dm9 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final dm9 f50477a;
    private static final ktz0 descriptor;

    static {
        dm9 dm9Var = new dm9();
        f50477a = dm9Var;
        vwp0 vwp0Var = new vwp0("com.spotify.listplatform.contextmenuimpl.providers.items.blendleave.api.BlendLeaveRequest", dm9Var, 1);
        vwp0Var.m86594k("playlist_uri", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
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
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hm9(i, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, ((hm9) obj).f92861a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
