package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f3z implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f3z f65615a;
    private static final ktz0 descriptor;

    static {
        f3z f3zVar = new f3z();
        f65615a = f3zVar;
        vwp0 vwp0Var = new vwp0("com.spotify.listuxplatformconsumers.blend.shared.api.FilterPillMetadata.FilterPillItem", f3zVar, 3);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("localized_text", false);
        vwp0Var.m86594k("applied", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h3z(strMo39226f, i, strMo39226f2, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h3z h3zVar = (h3z) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, h3zVar.f87360a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, h3zVar.f87361b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, h3zVar.f87362c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
