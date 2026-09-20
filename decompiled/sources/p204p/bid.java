package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bid implements g210 {

    /* JADX INFO: renamed from: a */
    public static final bid f27401a;
    private static final ktz0 descriptor;

    static {
        bid bidVar = new bid();
        f27401a = bidVar;
        vwp0 vwp0Var = new vwp0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ChatMessage", bidVar, 5);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("sender", false);
        vwp0Var.m86594k("timestamp", false);
        vwp0Var.m86594k("text", true);
        vwp0Var.m86594k("unsupported", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, krd.f125619a, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(r5a1.f196007a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        mrd mrdVar = null;
        String strMo39226f2 = null;
        String str = null;
        t5a1 t5a1Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                mrdVar = (mrd) frhVarMo29814b.mo39210A(ktz0Var, 1, krd.f125619a, mrdVar);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                t5a1Var = (t5a1) frhVarMo29814b.mo39211B(ktz0Var, 4, r5a1.f196007a, t5a1Var);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new did(i, strMo39226f, mrdVar, strMo39226f2, str, t5a1Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        did didVar = (did) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = didVar.f49317a;
        t5a1 t5a1Var = didVar.f49321e;
        String str2 = didVar.f49320d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, krd.f125619a, didVar.f49318b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, didVar.f49319c);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || t5a1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, r5a1.f196007a, t5a1Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
