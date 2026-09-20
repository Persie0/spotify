package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f661 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f661 f66293a;
    private static final ktz0 descriptor;

    static {
        f661 f661Var = new f661();
        f66293a = f661Var;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.crossdevicesyncing.data.SupportedDevice", f661Var, 3);
        vwp0Var.m86594k("identifier", false);
        vwp0Var.m86594k("connectionType", false);
        vwp0Var.m86594k("specificEnabled", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, xx31.f266850a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        zx31 zx31Var = null;
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
                zx31Var = (zx31) frhVarMo29814b.mo39210A(ktz0Var, 2, xx31.f266850a, zx31Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h661(i, strMo39226f, strMo39226f2, zx31Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h661 h661Var = (h661) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, h661Var.f88014a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, h661Var.f88015b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, xx31.f266850a, h661Var.f88016c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
