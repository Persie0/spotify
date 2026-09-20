package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lfr implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lfr f132998a;
    private static final ktz0 descriptor;

    static {
        lfr lfrVar = new lfr();
        f132998a = lfrVar;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.DeviceSuggestionRequest", lfrVar, 7);
        vwp0Var.m86594k("availableDevices", true);
        vwp0Var.m86594k("clientDatetime", false);
        vwp0Var.m86594k("lastActiveDeviceId", true);
        vwp0Var.m86594k("activeDeviceId", true);
        vwp0Var.m86594k("integrationType", true);
        vwp0Var.m86594k("clientPlaybackState", true);
        vwp0Var.m86594k("activeDeviceHistory", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = nfr.f153413h;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{fr70VarArr[0].getValue(), ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), ql51Var, epv0.m39700t(fme.f71033a), fr70VarArr[6].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = nfr.f153413h;
        frhVarMo29814b.getClass();
        int i = 0;
        List list = null;
        String strMo39226f = null;
        String str = null;
        String str2 = null;
        String strMo39226f2 = null;
        hme hmeVar = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    hmeVar = (hme) frhVarMo29814b.mo39211B(ktz0Var, 5, fme.f71033a, hmeVar);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new nfr(i, list, strMo39226f, str, str2, strMo39226f2, hmeVar, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        nfr nfrVar = (nfr) obj;
        List list = nfrVar.f153414a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = nfr.f153413h;
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        lau lauVar = lau.f131415a;
        if (zMo48399d0 || !wj50.m88271j(list, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        String str = nfrVar.f153415b;
        List list2 = nfrVar.f153420g;
        String str2 = nfrVar.f153418e;
        hrhVarMo35820b.mo44931G(ktz0Var, 1, str);
        String str3 = nfrVar.f153416c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = nfrVar.f153417d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "MOBILE_CLIENT")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 4, str2);
        }
        hme hmeVar = nfrVar.f153419f;
        if (hmeVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, fme.f71033a, hmeVar);
        }
        if (!wj50.m88271j(list2, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
