package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class grq implements g210 {

    /* JADX INFO: renamed from: a */
    public static final grq f83816a;
    private static final ktz0 descriptor;

    static {
        grq grqVar = new grq();
        f83816a = grqVar;
        vwp0 vwp0Var = new vwp0("com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.data.DenylistResponse", grqVar, 1);
        vwp0Var.m86594k("android", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{o14.f160614a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        q14 q14Var = null;
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
                q14Var = (q14) frhVarMo29814b.mo39210A(ktz0Var, 0, o14.f160614a, q14Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new irq(i, q14Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, o14.f160614a, ((irq) obj).f105039a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
