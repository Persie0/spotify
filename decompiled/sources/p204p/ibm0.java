package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ibm0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ibm0 f100610a;
    private static final ktz0 descriptor;

    static {
        ibm0 ibm0Var = new ibm0();
        f100610a = ibm0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.ubi.model.PageInstanceId", ibm0Var, 1);
        vwp0Var.m86594k("value", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
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
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new kbm0(i, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, ((kbm0) obj).f121231a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
