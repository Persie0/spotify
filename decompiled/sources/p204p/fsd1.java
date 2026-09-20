package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fsd1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final fsd1 f72835a;
    private static final ktz0 descriptor;

    static {
        fsd1 fsd1Var = new fsd1();
        f72835a = fsd1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.legacy.impl.endpoint.WhereToPlayRequest", fsd1Var, 3);
        vwp0Var.m86594k("availableDevices", true);
        vwp0Var.m86594k("clientDatetime", false);
        vwp0Var.m86594k("lastActiveDeviceId", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{hsd1.f94678d[0].getValue(), ql51Var, epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = hsd1.f94678d;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        String strMo39226f = null;
        String str = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hsd1(i, strMo39226f, str, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hsd1 hsd1Var = (hsd1) obj;
        List list = hsd1Var.f94679a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = hsd1.f94678d;
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lau.f131415a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 1, hsd1Var.f94680b);
        String str = hsd1Var.f94681c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
