package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h2e implements g210 {

    /* JADX INFO: renamed from: a */
    public static final h2e f86956a;
    private static final ktz0 descriptor;

    static {
        h2e h2eVar = new h2e();
        f86956a = h2eVar;
        vwp0 vwp0Var = new vwp0("com.spotify.genalpha.entities.ChildAccount", h2eVar, 7);
        vwp0Var.m86594k("childId", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("avatar", false);
        vwp0Var.m86594k("popularMusicAllowed", false);
        vwp0Var.m86594k("dateOfBirth", false);
        vwp0Var.m86594k("color", true);
        vwp0Var.m86594k("isFree", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(e450.f55982a);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, l8aVar, rr60VarM39700t, rr60VarM39700t2, l8aVar};
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
        String strMo39226f3 = null;
        String str = null;
        Integer num = null;
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
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 5, e450.f55982a, num);
                    i |= 32;
                    break;
                case 6:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new j2e(i, strMo39226f, strMo39226f2, strMo39226f3, zMo39217M, str, num, zMo39217M2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        j2e j2eVar = (j2e) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = j2eVar.f108014a;
        boolean z = j2eVar.f108020g;
        Integer num = j2eVar.f108019f;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, j2eVar.f108015b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, j2eVar.f108016c);
        hrhVarMo35820b.mo44930E(ktz0Var, 3, j2eVar.f108017d);
        hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, j2eVar.f108018e);
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, e450.f55982a, num);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 6, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
