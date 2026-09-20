package p204p;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class mso0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final mso0 f146838a;
    private static final ktz0 descriptor;

    static {
        mso0 mso0Var = new mso0();
        f146838a = mso0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.datalayermessages.PlayUriMessageRequest", mso0Var, 11);
        vwp0Var.m86594k("contextUri", false);
        vwp0Var.m86594k("skipToUri", true);
        vwp0Var.m86594k("skipToUid", true);
        vwp0Var.m86594k("shuffle", true);
        vwp0Var.m86594k("referrer", true);
        vwp0Var.m86594k("interactionId", true);
        vwp0Var.m86594k("seekToMs", true);
        vwp0Var.m86594k("contextMetadata", true);
        vwp0Var.m86594k("listConfiguration", true);
        vwp0Var.m86594k("pageInstanceId", true);
        vwp0Var.m86594k("smartShuffle", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = oso0.f168843l;
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(ql51Var);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, rr60VarM39700t, rr60VarM39700t2, epv0.m39700t(l8aVar), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(u2b0.f226058a), epv0.m39700t((rr60) fr70VarArr[7].getValue()), epv0.m39700t(fp80.f71769a), epv0.m39700t(ql51Var), epv0.m39700t(l8aVar)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        fr70[] fr70VarArr;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr2 = oso0.f168843l;
        frhVarMo29814b.getClass();
        hp80 hp80Var = null;
        String str = null;
        Boolean bool = null;
        String strMo39226f = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        Map map = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    fr70VarArr = fr70VarArr2;
                    z = false;
                    break;
                case 0:
                    fr70VarArr = fr70VarArr2;
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    fr70VarArr = fr70VarArr2;
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                    i |= 2;
                    break;
                case 2:
                    fr70VarArr = fr70VarArr2;
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                    i |= 4;
                    break;
                case 3:
                    fr70VarArr = fr70VarArr2;
                    bool2 = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 3, l8a.f130828a, bool2);
                    i |= 8;
                    break;
                case 4:
                    fr70VarArr = fr70VarArr2;
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str4);
                    i |= 16;
                    break;
                case 5:
                    fr70VarArr = fr70VarArr2;
                    str5 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str5);
                    i |= 32;
                    break;
                case 6:
                    fr70VarArr = fr70VarArr2;
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 6, u2b0.f226058a, l);
                    i |= 64;
                    break;
                case 7:
                    fr70VarArr = fr70VarArr2;
                    map = (Map) frhVarMo29814b.mo39211B(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), map);
                    i |= 128;
                    break;
                case 8:
                    fr70VarArr = fr70VarArr2;
                    hp80Var = (hp80) frhVarMo29814b.mo39211B(ktz0Var, 8, fp80.f71769a, hp80Var);
                    i |= 256;
                    break;
                case 9:
                    fr70VarArr = fr70VarArr2;
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 9, ql51.f189738a, str);
                    i |= 512;
                    break;
                case 10:
                    fr70VarArr = fr70VarArr2;
                    bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 10, l8a.f130828a, bool);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            fr70VarArr2 = fr70VarArr;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new oso0(i, strMo39226f, str2, str3, bool2, str4, str5, l, map, hp80Var, str, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        oso0 oso0Var = (oso0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = oso0.f168843l;
        String str = oso0Var.f168844a;
        Map map = oso0Var.f168851h;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        String str2 = oso0Var.f168845b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = oso0Var.f168846c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        Boolean bool = oso0Var.f168847d;
        if (bool != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, l8a.f130828a, bool);
        }
        String str4 = oso0Var.f168848e;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str4);
        }
        String str5 = oso0Var.f168849f;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str5);
        }
        Long l = oso0Var.f168850g;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, u2b0.f226058a, l);
        }
        if (map != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), map);
        }
        hp80 hp80Var = oso0Var.f168852i;
        if (hp80Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, fp80.f71769a, hp80Var);
        }
        String str6 = oso0Var.f168853j;
        if (str6 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, ql51.f189738a, str6);
        }
        Boolean bool2 = oso0Var.f168854k;
        if (bool2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, l8a.f130828a, bool2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
