package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class orh0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final orh0 f168568a;
    private static final ktz0 descriptor;

    static {
        orh0 orh0Var = new orh0();
        f168568a = orh0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ModOutgoingMessage.ChatNewMessage", orh0Var, 2);
        vwp0Var.m86594k("hierarchyId", false);
        vwp0Var.m86594k("message", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, bid.f27401a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        did didVar = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                didVar = (did) frhVarMo29814b.mo39210A(ktz0Var, 1, bid.f27401a, didVar);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qrh0(i, strMo39226f, didVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qrh0 qrh0Var = (qrh0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, qrh0Var.f191852a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, bid.f27401a, qrh0Var.f191853b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
