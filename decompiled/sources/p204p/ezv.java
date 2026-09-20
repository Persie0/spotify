package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ezv implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ezv f64472a;
    private static final ktz0 descriptor;

    static {
        ezv ezvVar = new ezv();
        f64472a = ezvVar;
        vwp0 vwp0Var = new vwp0("com.spotify.culturalmoments.culturalmomentsscrollcard.dataloader.EntrypointData", ezvVar, 5);
        vwp0Var.m86594k("header", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k("description", false);
        vwp0Var.m86594k("navigateUri", false);
        vwp0Var.m86594k("backgroundImageUri", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        boolean z = true;
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
            } else if (iMo29816p == 2) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gzv(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gzv gzvVar = (gzv) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, gzvVar.f86040a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, gzvVar.f86041b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, gzvVar.f86042c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, gzvVar.f86043d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, gzvVar.f86044e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
