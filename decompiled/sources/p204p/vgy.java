package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class vgy implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vgy f241338a;
    private static final ktz0 descriptor;

    static {
        vgy vgyVar = new vgy();
        f241338a = vgyVar;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.FeaturingItem", vgyVar, 3);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("image_url", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
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
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new xgy(strMo39226f, strMo39226f2, i, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        xgy xgyVar = (xgy) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, xgyVar.f261392a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, xgyVar.f261393b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, xgyVar.f261394c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
