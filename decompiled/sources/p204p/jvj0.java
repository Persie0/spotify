package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class jvj0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jvj0 f116361a;
    private static final ktz0 descriptor;

    static {
        jvj0 jvj0Var = new jvj0();
        f116361a = jvj0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.NotificationImage.EntityImage", jvj0Var, 2);
        vwp0Var.m86594k("image_url", false);
        vwp0Var.m86594k("entity_url", false);
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
        return new lvj0(i, strMo39226f, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        lvj0 lvj0Var = (lvj0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, lvj0Var.f137332b);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, lvj0Var.f137333c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
