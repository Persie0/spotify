package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class zn71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zn71 f284430a;
    private static final ktz0 descriptor;

    static {
        zn71 zn71Var = new zn71();
        f284430a = zn71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.CacheControl", zn71Var, 3);
        vwp0Var.m86594k("etag", false);
        vwp0Var.m86594k("ttl", false);
        vwp0Var.m86594k("cachePolicy", false);
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
        return new bo71(strMo39226f, strMo39226f2, i, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        bo71 bo71Var = (bo71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, bo71Var.f29029a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, bo71Var.f29030b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, bo71Var.f29031c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
