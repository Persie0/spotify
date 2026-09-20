package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ccb0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ccb0 f36370a;
    private static final ktz0 descriptor;

    static {
        ccb0 ccb0Var = new ccb0();
        f36370a = ccb0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Colors", ccb0Var, 3);
        vwp0Var.m86594k("background", false);
        vwp0Var.m86594k("text", false);
        vwp0Var.m86594k("highlightedText", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        return new rr60[]{e450Var, e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        int iMo39229o3 = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o3 = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ecb0(i, iMo39229o, iMo39229o2, iMo39229o3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ecb0 ecb0Var = (ecb0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44938e(0, ecb0Var.f58300a, ktz0Var);
        hrhVarMo35820b.mo44938e(1, ecb0Var.f58301b, ktz0Var);
        hrhVarMo35820b.mo44938e(2, ecb0Var.f58302c, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
