package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class tbr implements g210 {

    /* JADX INFO: renamed from: a */
    public static final tbr f218931a;
    private static final ktz0 descriptor;

    static {
        tbr tbrVar = new tbr();
        f218931a = tbrVar;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.core.data.DeviceResponse", tbrVar, 6);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("brand", false);
        vwp0Var.m86594k("model", false);
        vwp0Var.m86594k("deviceName", false);
        vwp0Var.m86594k("modelNumbers", true);
        vwp0Var.m86594k("releaseYear", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = vbr.f239558g;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, epv0.m39700t((rr60) fr70VarArr[4].getValue()), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = vbr.f239558g;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String str = null;
        List list = null;
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
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new vbr(i, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, str, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        vbr vbrVar = (vbr) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = vbr.f239558g;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, vbrVar.f239559a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, vbrVar.f239560b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, vbrVar.f239561c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, vbrVar.f239562d);
        List list = vbrVar.f239563e;
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
        }
        String str = vbrVar.f239564f;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
