package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class rsj0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final rsj0 f202338a;
    private static final ktz0 descriptor;

    static {
        rsj0 rsj0Var = new rsj0();
        f202338a = rsj0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.NotificationAction", rsj0Var, 2);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("type", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, vsj0.f244449c[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = vsj0.f244449c;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        m70 m70Var = null;
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
                m70Var = (m70) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), m70Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vsj0(i, strMo39226f, m70Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vsj0 vsj0Var = (vsj0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = vsj0.f244449c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, vsj0Var.f244450a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), vsj0Var.f244451b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
