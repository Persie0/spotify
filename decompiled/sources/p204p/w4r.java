package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w4r implements g210 {

    /* JADX INFO: renamed from: a */
    public static final w4r f247873a;
    private static final ktz0 descriptor;

    static {
        w4r w4rVar = new w4r();
        f247873a = w4rVar;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.legacy.impl.endpoint.Device", w4rVar, 7);
        vwp0Var.m86594k("deviceId", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("brand", false);
        vwp0Var.m86594k("model", false);
        vwp0Var.m86594k("is_on_local_network", false);
        vwp0Var.m86594k("last_transfer_at", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t(u2b0.f226058a);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, l8a.f130828a, rr60VarM39700t};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 6, u2b0.f226058a, l);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new e5r(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, zMo39217M, l);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        e5r e5rVar = (e5r) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, e5rVar.f56449a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, e5rVar.f56450b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, e5rVar.f56451c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, e5rVar.f56452d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, e5rVar.f56453e);
        hrhVarMo35820b.mo44930E(ktz0Var, 5, e5rVar.f56454f);
        Long l = e5rVar.f56455g;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, u2b0.f226058a, l);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
