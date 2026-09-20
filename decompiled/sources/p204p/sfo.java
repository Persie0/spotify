package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class sfo implements g210 {

    /* JADX INFO: renamed from: a */
    public static final sfo f208621a;
    private static final ktz0 descriptor;

    static {
        sfo sfoVar = new sfo();
        f208621a = sfoVar;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.datalayermessages.DataLayerResponse", sfoVar, 2);
        vwp0Var.m86594k("isSuccessful", false);
        vwp0Var.m86594k("errorMessage", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{l8a.f130828a, epv0.m39700t(ql51.f189738a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ufo(str, i, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ufo ufoVar = (ufo) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, ufoVar.f229849a);
        String str = ufoVar.f229850b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
