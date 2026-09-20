package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r8v implements g210 {

    /* JADX INFO: renamed from: a */
    public static final r8v f196840a;
    private static final ktz0 descriptor;

    static {
        r8v r8vVar = new r8v();
        f196840a = r8vVar;
        vwp0 vwp0Var = new vwp0("com.spotify.contentaccess.gatedcontent.engagementoverlay.service.EngagementRequest", r8vVar, 2);
        vwp0Var.m86594k("book_id", false);
        vwp0Var.m86594k("action_type", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String str = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new t8v(i, strMo39226f, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        t8v t8vVar = (t8v) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, t8vVar.f218137a);
        String str = t8vVar.f218138b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
