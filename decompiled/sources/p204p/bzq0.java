package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bzq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final bzq0 f32557a;
    private static final ktz0 descriptor;

    static {
        bzq0 bzq0Var = new bzq0();
        f32557a = bzq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.listeningactivity.presence.impl.PresencePushActivity", bzq0Var, 4);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("isPlaying", false);
        vwp0Var.m86594k("timestamp", true);
        vwp0Var.m86594k("contextUri", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, l8a.f130828a, epv0.m39700t(h2s.f87054a), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        Double d = null;
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
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                d = (Double) frhVarMo29814b.mo39211B(ktz0Var, 2, h2s.f87054a, d);
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
        return new dzq0(i, strMo39226f, zMo39217M, d, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        dzq0 dzq0Var = (dzq0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, dzq0Var.f54707a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, dzq0Var.f54708b);
        Double d = dzq0Var.f54709c;
        if (d != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, h2s.f87054a, d);
        }
        String str = dzq0Var.f54710d;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
