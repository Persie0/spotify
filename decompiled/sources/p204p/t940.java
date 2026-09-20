package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t940 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final t940 f218186a;
    private static final ktz0 descriptor;

    static {
        t940 t940Var = new t940();
        f218186a = t940Var;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorartist.model.ImageModel", t940Var, 4);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("width", true);
        vwp0Var.m86594k("height", true);
        vwp0Var.m86594k("moderationUri", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51Var, e450Var, e450Var, rr60VarM39700t};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String strMo39226f = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new v940(strMo39226f, i, iMo39229o, iMo39229o2, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        v940 v940Var = (v940) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = v940Var.f238837a;
        int i = v940Var.f238839c;
        int i2 = v940Var.f238838b;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        if (hrhVarMo35820b.mo48399d0() || i2 != 0) {
            hrhVarMo35820b.mo44938e(1, i2, ktz0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(2, i, ktz0Var);
        }
        String str2 = v940Var.f238840d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
