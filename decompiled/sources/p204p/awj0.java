package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class awj0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final awj0 f20546a;
    private static final ktz0 descriptor;

    static {
        awj0 awj0Var = new awj0();
        f20546a = awj0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.notifications.models.preferences.NotificationLocale", awj0Var, 2);
        vwp0Var.m86594k("ulocale", false);
        vwp0Var.m86594k("displayName", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var};
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
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new cwj0(i, strMo39226f, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        cwj0 cwj0Var = (cwj0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, cwj0Var.f42776a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, cwj0Var.f42777b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
