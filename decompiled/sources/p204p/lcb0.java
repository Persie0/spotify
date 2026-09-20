package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lcb0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lcb0 f131894a;
    private static final ktz0 descriptor;

    static {
        lcb0 lcb0Var = new lcb0();
        f131894a = lcb0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Syllable", lcb0Var, 2);
        vwp0Var.m86594k("startTimeInMs", false);
        vwp0Var.m86594k("characterCount", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        return new rr60[]{e450Var, e450Var};
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
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ncb0(i, iMo39229o, iMo39229o2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ncb0 ncb0Var = (ncb0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44938e(0, ncb0Var.f152487a, ktz0Var);
        hrhVarMo35820b.mo44938e(1, ncb0Var.f152488b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
