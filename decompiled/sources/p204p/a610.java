package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a610 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final a610 f12669a;
    private static final ktz0 descriptor;

    static {
        a610 a610Var = new a610();
        f12669a = a610Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.adsprivacycenter.GetAdCategoryAdPreferencesResponse", a610Var, 2);
        vwp0Var.m86594k("adCategoryAdPreferences", true);
        vwp0Var.m86594k("isOptedInToTailoredAds", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t((rr60) c610.f34331c[0].getValue()), epv0.m39700t(l8a.f130828a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = c610.f34331c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 1, l8a.f130828a, bool);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new c610(i, list, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        c610 c610Var = (c610) obj;
        Boolean bool = c610Var.f34333b;
        List list = c610Var.f34332a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = c610.f34331c;
        if (hrhVarMo35820b.mo48399d0() || list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || bool != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, l8a.f130828a, bool);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
