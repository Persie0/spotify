package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class jo71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jo71 f114352a;
    private static final ktz0 descriptor;

    static {
        jo71 jo71Var = new jo71();
        f114352a = jo71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.TimeSyncedTextMetadata", jo71Var, 7);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("entityUri", false);
        vwp0Var.m86594k("mediaUri", false);
        vwp0Var.m86594k("language", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("generationType", false);
        vwp0Var.m86594k("wordTimestampAccuracy", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = lo71.f135325h;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, fr70VarArr[6].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = lo71.f135325h;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        String strMo39226f6 = null;
        no71 no71Var = null;
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
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f6 = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    no71Var = (no71) frhVarMo29814b.mo39210A(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), no71Var);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new lo71(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, strMo39226f6, no71Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        lo71 lo71Var = (lo71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = lo71.f135325h;
        String str = lo71Var.f135326a;
        no71 no71Var = lo71Var.f135332g;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, lo71Var.f135327b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, lo71Var.f135328c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, lo71Var.f135329d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, lo71Var.f135330e);
        hrhVarMo35820b.mo44931G(ktz0Var, 5, lo71Var.f135331f);
        if (hrhVarMo35820b.mo48399d0() || no71Var != no71.f156616b) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), no71Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
