package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y301 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final y301 f268721a;
    private static final ktz0 descriptor;

    static {
        y301 y301Var = new y301();
        f268721a = y301Var;
        vwp0 vwp0Var = new vwp0("com.spotify.jam.integrations.messagingservice.SessionUserMessage", y301Var, 1);
        vwp0Var.m86594k("userMessage", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{a401.f12107b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = a401.f12107b;
        frhVarMo29814b.getClass();
        hta1 hta1Var = null;
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
                hta1Var = (hta1) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), hta1Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new a401(i, hta1Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) a401.f12107b[0].getValue(), ((a401) obj).f12108a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
