package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rm9 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final rm9 f200479a;
    private static final ktz0 descriptor;

    static {
        rm9 rm9Var = new rm9();
        f200479a = rm9Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.group.BlendParticipant", rm9Var, 4);
        vwp0Var.m86594k("hash", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("username", false);
        vwp0Var.m86594k("image_url", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String str = null;
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
            } else if (iMo29816p == 2) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vm9(i, strMo39226f, strMo39226f2, strMo39226f3, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vm9 vm9Var = (vm9) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, vm9Var.f242732a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, vm9Var.f242733b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, vm9Var.f242734c);
        String str = vm9Var.f242735d;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
