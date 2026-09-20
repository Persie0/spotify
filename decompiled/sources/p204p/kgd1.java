package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class kgd1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final kgd1 f122375a;
    private static final ktz0 descriptor;

    static {
        kgd1 kgd1Var = new kgd1();
        f122375a = kgd1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.WatchFeedVideo", kgd1Var, 6);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("manifest_id", false);
        vwp0Var.m86594k("image_url", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_IS_EXPLICIT, true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_IS_19_PLUS, true);
        vwp0Var.m86594k("is_animated", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, l8aVar, l8aVar, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new mgd1(i, strMo39226f, strMo39226f2, strMo39226f3, zMo39217M, zMo39217M2, zMo39217M3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        mgd1 mgd1Var = (mgd1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = mgd1Var.f143444a;
        boolean z = mgd1Var.f143449f;
        boolean z2 = mgd1Var.f143448e;
        boolean z3 = mgd1Var.f143447d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, mgd1Var.f143445b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, mgd1Var.f143446c);
        if (hrhVarMo35820b.mo48399d0() || z3) {
            hrhVarMo35820b.mo44930E(ktz0Var, 3, z3);
        }
        if (hrhVarMo35820b.mo48399d0() || z2) {
            hrhVarMo35820b.mo44930E(ktz0Var, 4, z2);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
