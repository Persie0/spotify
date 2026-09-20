package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0e implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f0e f64615a;
    private static final ktz0 descriptor;

    static {
        f0e f0eVar = new f0e();
        f64615a = f0eVar;
        vwp0 vwp0Var = new vwp0("com.spotify.contentaccess.gatedcontent.service.CheckoutSessionRequest", f0eVar, 3);
        vwp0Var.m86594k("show_uri", false);
        vwp0Var.m86594k("currency", false);
        vwp0Var.m86594k("price", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, h2s.f87054a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        double dMo39213D = 0.0d;
        boolean z = true;
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
                dMo39213D = frhVarMo29814b.mo39213D(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h0e(i, strMo39226f, strMo39226f2, dMo39213D);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h0e h0eVar = (h0e) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, h0eVar.f86257a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, h0eVar.f86258b);
        hrhVarMo35820b.mo44940g(ktz0Var, 2, h0eVar.f86259c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
