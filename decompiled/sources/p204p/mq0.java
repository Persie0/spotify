package p204p;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final mq0 f146124a;
    private static final ktz0 descriptor;

    static {
        mq0 mq0Var = new mq0();
        f146124a = mq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adonappopen.repository.network.AdOnAppOpenAd", mq0Var, 6);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("clickthrough", false);
        vwp0Var.m86594k("trackingEvents", true);
        vwp0Var.m86594k("metadata", true);
        vwp0Var.m86594k("video", true);
        vwp0Var.m86594k("display", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = uq0.f232866n;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, fr70VarArr[2].getValue(), fr70VarArr[3].getValue(), fr70VarArr[4].getValue(), fr70VarArr[5].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = uq0.f232866n;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        Map map = null;
        Map map2 = null;
        List list = null;
        List list2 = null;
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
                    map = (Map) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new uq0(i, strMo39226f, strMo39226f2, map, map2, list, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        uq0 uq0Var = (uq0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = uq0.f232866n;
        String str = uq0Var.f232867a;
        List list = uq0Var.f232872f;
        List list2 = uq0Var.f232871e;
        Map map = uq0Var.f232870d;
        Map map2 = uq0Var.f232869c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, uq0Var.f232868b);
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        nau nauVar = nau.f152117a;
        if (zMo48399d0 || !wj50.m88271j(map2, nauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), map2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(map, nauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), map);
        }
        boolean zMo48399d1 = hrhVarMo35820b.mo48399d0();
        lau lauVar = lau.f131415a;
        if (zMo48399d1 || !wj50.m88271j(list2, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
