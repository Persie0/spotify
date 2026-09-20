package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m1u implements g210 {

    /* JADX INFO: renamed from: a */
    public static final m1u f139095a;
    private static final ktz0 descriptor;

    static {
        m1u m1uVar = new m1u();
        f139095a = m1uVar;
        vwp0 vwp0Var = new vwp0("com.spotify.email.models.EmailProfileResponse", m1uVar, 2);
        vwp0Var.m86594k("email", true);
        vwp0Var.m86594k("options", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(ql51.f189738a), epv0.m39700t(p1u.f173169a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        r1u r1uVar = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                r1uVar = (r1u) frhVarMo29814b.mo39211B(ktz0Var, 1, p1u.f173169a, r1uVar);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new o1u(i, str, r1uVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        o1u o1uVar = (o1u) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = o1uVar.f160861a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        r1u r1uVar = o1uVar.f160862b;
        if (r1uVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, p1u.f173169a, r1uVar);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
