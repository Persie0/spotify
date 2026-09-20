package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class teb1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final teb1 f219639a;
    private static final ktz0 descriptor;

    static {
        teb1 teb1Var = new teb1();
        f219639a = teb1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.versionsunsetting.datasource.VersionSunsettingDataSourceModel.Versions", teb1Var, 2);
        vwp0Var.m86594k("recommended", true);
        vwp0Var.m86594k("allowed", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        reb1 reb1Var = reb1.f198334a;
        return new rr60[]{epv0.m39700t(reb1Var), epv0.m39700t(reb1Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        seb1 seb1Var = null;
        boolean z = true;
        int i = 0;
        seb1 seb1Var2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                seb1Var = (seb1) frhVarMo29814b.mo39211B(ktz0Var, 0, reb1.f198334a, seb1Var);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                seb1Var2 = (seb1) frhVarMo29814b.mo39211B(ktz0Var, 1, reb1.f198334a, seb1Var2);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new veb1(i, seb1Var, seb1Var2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        veb1 veb1Var = (veb1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        seb1 seb1Var = veb1Var.f240666a;
        if (seb1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, reb1.f198334a, seb1Var);
        }
        seb1 seb1Var2 = veb1Var.f240667b;
        if (seb1Var2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, reb1.f198334a, seb1Var2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
