package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1j implements g210 {

    /* JADX INFO: renamed from: a */
    public static final y1j f268277a;
    private static final ktz0 descriptor;

    static {
        y1j y1jVar = new y1j();
        f268277a = y1jVar;
        vwp0 vwp0Var = new vwp0("com.spotify.bluejay.data.impl.network.ConnectorAppResponse", y1jVar, 8);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("description", true);
        vwp0Var.m86594k("icon_url", false);
        vwp0Var.m86594k("connected", false);
        vwp0Var.m86594k("connected_user", true);
        vwp0Var.m86594k("web_view_url", false);
        vwp0Var.m86594k("enabled_for_feature", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(ql51Var);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, ql51Var, rr60VarM39700t, ql51Var, l8aVar, rr60VarM39700t2, ql51Var, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        String strMo39226f3 = null;
        String str2 = null;
        String strMo39226f4 = null;
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
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str2);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new a2j(i, strMo39226f, strMo39226f2, str, strMo39226f3, zMo39217M, str2, strMo39226f4, zMo39217M2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        a2j a2jVar = (a2j) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = a2jVar.f11681a;
        String str2 = a2jVar.f11686f;
        String str3 = a2jVar.f11683c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, a2jVar.f11682b);
        if (hrhVarMo35820b.mo48399d0() || str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 3, a2jVar.f11684d);
        hrhVarMo35820b.mo44930E(ktz0Var, 4, a2jVar.f11685e);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 6, a2jVar.f11687g);
        hrhVarMo35820b.mo44930E(ktz0Var, 7, a2jVar.f11688h);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
