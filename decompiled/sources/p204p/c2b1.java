package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c2b1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final c2b1 f33340a;
    private static final ktz0 descriptor;

    static {
        c2b1 c2b1Var = new c2b1();
        f33340a = c2b1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.ValidInvitation", c2b1Var, 3);
        vwp0Var.m86594k("sender", false);
        vwp0Var.m86594k("recipient", false);
        vwp0Var.m86594k("playlist_uri", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t(ql51.f189738a);
        sm9 sm9Var = sm9.f210587a;
        return new rr60[]{sm9Var, sm9Var, rr60VarM39700t};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        wm9 wm9Var = null;
        boolean z = true;
        int i = 0;
        wm9 wm9Var2 = null;
        String str = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                wm9Var = (wm9) frhVarMo29814b.mo39210A(ktz0Var, 0, sm9.f210587a, wm9Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                wm9Var2 = (wm9) frhVarMo29814b.mo39210A(ktz0Var, 1, sm9.f210587a, wm9Var2);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new e2b1(i, wm9Var, wm9Var2, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        e2b1 e2b1Var = (e2b1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        d2b1 d2b1Var = e2b1.Companion;
        sm9 sm9Var = sm9.f210587a;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, sm9Var, e2b1Var.f55418b);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, sm9Var, e2b1Var.f55419c);
        String str = e2b1Var.f55420d;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
