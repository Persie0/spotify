package p204p;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h721 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final h721 f88322a;
    private static final ktz0 descriptor;

    static {
        h721 h721Var = new h721();
        f88322a = h721Var;
        vwp0 vwp0Var = new vwp0("com.spotify.notifications.notifications.robin.SilentPushReceivedEventRequest", h721Var, 7);
        vwp0Var.m86594k("push_request_id", false);
        vwp0Var.m86594k("timestamp_ms", false);
        vwp0Var.m86594k("app_device_id", false);
        vwp0Var.m86594k("os_name", false);
        vwp0Var.m86594k("os_version", false);
        vwp0Var.m86594k("feature", true);
        vwp0Var.m86594k("feature_data", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = j721.f109469h;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t((rr60) fr70VarArr[6].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = j721.f109469h;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        String str = null;
        Map map = null;
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
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) frhVarMo29814b.mo39211B(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), map);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new j721(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, strMo39226f5, str, map);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        j721 j721Var = (j721) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = j721.f109469h;
        String str = j721Var.f109470a;
        Map map = j721Var.f109476g;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, j721Var.f109471b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, j721Var.f109472c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, j721Var.f109473d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, j721Var.f109474e);
        String str2 = j721Var.f109475f;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str2);
        }
        if (map != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), map);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
