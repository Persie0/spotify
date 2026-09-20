package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q240 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final q240 f184478a;
    private static final ktz0 descriptor;

    static {
        q240 q240Var = new q240();
        f184478a = q240Var;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorcommon.model.Image", q240Var, 3);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("width", false);
        vwp0Var.m86594k("height", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51.f189738a, e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new i340(i, iMo39229o, iMo39229o2, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        i340 i340Var = (i340) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, i340Var.f98012a);
        hrhVarMo35820b.mo44938e(1, i340Var.f98013b, ktz0Var);
        hrhVarMo35820b.mo44938e(2, i340Var.f98014c, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
