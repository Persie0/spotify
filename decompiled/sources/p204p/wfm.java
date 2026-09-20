package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wfm implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wfm f250869a;
    private static final ktz0 descriptor;

    static {
        wfm wfmVar = new wfm();
        f250869a = wfmVar;
        vwp0 vwp0Var = new vwp0("com.spotify.dsa.settingmonitorimpl.DSARequestBody", wfmVar, 2);
        vwp0Var.m86594k("setting_identifier", false);
        vwp0Var.m86594k("new_value", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, dgm.f48833a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        fgm fgmVar = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                fgmVar = (fgm) frhVarMo29814b.mo39210A(ktz0Var, 1, dgm.f48833a, fgmVar);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yfm(i, strMo39226f, fgmVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yfm yfmVar = (yfm) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, yfmVar.f272284a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, dgm.f48833a, yfmVar.f272285b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
