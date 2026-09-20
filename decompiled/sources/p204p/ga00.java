package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ga00 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ga00 f77937a;
    private static final ktz0 descriptor;

    static {
        ga00 ga00Var = new ga00();
        f77937a = ga00Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.commercesafetyimpl.endpoint.FraudDataCollectionEndpoint.CollectedData", ga00Var, 1);
        vwp0Var.m86594k("deviceId", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(ql51.f189738a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ia00(i, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, ((ia00) obj).f100117a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
