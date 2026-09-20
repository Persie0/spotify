package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class exq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final exq0 f63836a;
    private static final ktz0 descriptor;

    static {
        exq0 exq0Var = new exq0();
        f63836a = exq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.PrereleaseTrack", exq0Var, 6);
        vwp0Var.m86594k("uri", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k("artist_names", false);
        vwp0Var.m86594k("interactivity_enabled", true);
        vwp0Var.m86594k("row_id", true);
        vwp0Var.m86594k("isAvailableInCatalogue", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = gxq0.f85318g;
        ql51 ql51Var = ql51.f189738a;
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{epv0.m39700t(ql51Var), ql51Var, fr70VarArr[2].getValue(), epv0.m39700t(l8aVar), epv0.m39700t(ql51Var), l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = gxq0.f85318g;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String str = null;
        String strMo39226f = null;
        List list = null;
        Boolean bool = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 3, l8a.f130828a, bool);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gxq0(i, str, strMo39226f, list, bool, str2, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gxq0 gxq0Var = (gxq0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = gxq0.f85318g;
        String str = gxq0Var.f85319a;
        Boolean bool = gxq0Var.f85322d;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 1, gxq0Var.f85320b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), gxq0Var.f85321c);
        if (!wj50.m88271j(bool, Boolean.FALSE)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, l8a.f130828a, bool);
        }
        String str2 = gxq0Var.f85323e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        boolean z = gxq0Var.f85324f;
        if (z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
