package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qpn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qpn0 f191348a;
    private static final ktz0 descriptor;

    static {
        qpn0 qpn0Var = new qpn0();
        f191348a = qpn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.trendingnearyou.locationsearch.PersistedRecentSearch", qpn0Var, 3);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_SUBTITLE, true);
        vwp0Var.m86594k("geonameId", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(e450.f55982a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 2, e450.f55982a, num);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new spn0(i, strMo39226f, num, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        spn0 spn0Var = (spn0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = spn0Var.f212902a;
        Integer num = spn0Var.f212904c;
        String str2 = spn0Var.f212903b;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, e450.f55982a, num);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
