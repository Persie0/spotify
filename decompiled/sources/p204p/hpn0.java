package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hpn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final hpn0 f93818a;
    private static final ktz0 descriptor;

    static {
        hpn0 hpn0Var = new hpn0();
        f93818a = hpn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.PersistedHistoryEntry", hpn0Var, 2);
        vwp0Var.m86594k("deviceId", false);
        vwp0Var.m86594k("becameActiveAt", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, u2b0.f226058a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        long jMo39227i0 = 0;
        boolean z = true;
        int i = 0;
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
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new jpn0(jMo39227i0, i, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        jpn0 jpn0Var = (jpn0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, jpn0Var.f114696a);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, jpn0Var.f114697b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
