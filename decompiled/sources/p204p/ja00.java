package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ja00 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ja00 f110294a;
    private static final ktz0 descriptor;

    static {
        ja00 ja00Var = new ja00();
        f110294a = ja00Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.commercesafetyimpl.endpoint.FraudDataCollectionEndpoint.Event", ja00Var, 5);
        vwp0Var.m86594k("eventType", false);
        vwp0Var.m86594k("uuid", false);
        vwp0Var.m86594k("client", false);
        vwp0Var.m86594k("context", false);
        vwp0Var.m86594k("data", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{la00.f131208f[0].getValue(), ql51Var, ql51Var, ql51Var, ga00.f77937a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = la00.f131208f;
        frhVarMo29814b.getClass();
        int i = 0;
        na00 na00Var = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        ia00 ia00Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                na00Var = (na00) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), na00Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                ia00Var = (ia00) frhVarMo29814b.mo39210A(ktz0Var, 4, ga00.f77937a, ia00Var);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new la00(i, na00Var, strMo39226f, strMo39226f2, strMo39226f3, ia00Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        la00 la00Var = (la00) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) la00.f131208f[0].getValue(), la00Var.f131209a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, la00Var.f131210b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, la00Var.f131211c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, la00Var.f131212d);
        hrhVarMo35820b.mo44941k(ktz0Var, 4, ga00.f77937a, la00Var.f131213e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
