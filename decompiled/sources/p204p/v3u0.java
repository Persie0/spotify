package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v3u0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final v3u0 f236937a;
    private static final ktz0 descriptor;

    static {
        v3u0 v3u0Var = new v3u0();
        f236937a = v3u0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.radio.radio.formatlist.RadioFormatListSourceModel", v3u0Var, 2);
        vwp0Var.m86594k("total", true);
        vwp0Var.m86594k("mediaItems", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(e450.f55982a), epv0.m39700t((rr60) x3u0.f257880c[1].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = x3u0.f257880c;
        frhVarMo29814b.getClass();
        Integer num = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 0, e450.f55982a, num);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new x3u0(i, num, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        x3u0 x3u0Var = (x3u0) obj;
        List list = x3u0Var.f257882b;
        Integer num = x3u0Var.f257881a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = x3u0.f257880c;
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, e450.f55982a, num);
        }
        if (hrhVarMo35820b.mo48399d0() || list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
