package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x4r implements g210 {

    /* JADX INFO: renamed from: a */
    public static final x4r f258187a;
    private static final ktz0 descriptor;

    static {
        x4r x4rVar = new x4r();
        f258187a = x4rVar;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.Device", x4rVar, 8);
        vwp0Var.m86594k("deviceId", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("brand", false);
        vwp0Var.m86594k("model", false);
        vwp0Var.m86594k("is_on_local_network", false);
        vwp0Var.m86594k("last_transfer_at", true);
        vwp0Var.m86594k("is_local_playback_device", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        rr60 rr60VarM39700t = epv0.m39700t(u2b0.f226058a);
        rr60 rr60VarM39700t2 = epv0.m39700t(l8aVar);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, l8aVar, rr60VarM39700t, rr60VarM39700t2};
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
        Boolean bool = null;
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
                case 7:
                    bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 7, l8a.f130828a, bool);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new d5r(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, zMo39217M, l, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        d5r d5rVar = (d5r) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, d5rVar.f45474a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, d5rVar.f45475b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, d5rVar.f45476c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, d5rVar.f45477d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, d5rVar.f45478e);
        hrhVarMo35820b.mo44930E(ktz0Var, 5, d5rVar.f45479f);
        Long l = d5rVar.f45480g;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, u2b0.f226058a, l);
        }
        Boolean bool = d5rVar.f45481h;
        if (bool != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, l8a.f130828a, bool);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
