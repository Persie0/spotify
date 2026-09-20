package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class biv0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final biv0 f27557a;
    private static final ktz0 descriptor;

    static {
        biv0 biv0Var = new biv0();
        f27557a = biv0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.assistedcuration.content.model.RecsTrack", biv0Var, 7);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("preview_id", true);
        vwp0Var.m86594k("album", true);
        vwp0Var.m86594k("artists", true);
        vwp0Var.m86594k("explicit", false);
        vwp0Var.m86594k("content_rating", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = div0.f49492h;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(qhv0.f188867a), fr70VarArr[4].getValue(), l8a.f130828a, fr70VarArr[6].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = div0.f49492h;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        shv0 shv0Var = null;
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
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                    i |= 4;
                    break;
                case 3:
                    shv0Var = (shv0) frhVarMo29814b.mo39211B(ktz0Var, 3, qhv0.f188867a, shv0Var);
                    i |= 8;
                    break;
                case 4:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
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
        return new div0(i, strMo39226f, strMo39226f2, str, shv0Var, list, zMo39217M, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        div0 div0Var = (div0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = div0.f49492h;
        String str = div0Var.f49493a;
        List list = div0Var.f49499g;
        List list2 = div0Var.f49497e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, div0Var.f49494b);
        String str2 = div0Var.f49495c;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str2);
        }
        shv0 shv0Var = div0Var.f49496d;
        if (shv0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, qhv0.f188867a, shv0Var);
        }
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        lau lauVar = lau.f131415a;
        if (zMo48399d0 || !wj50.m88271j(list2, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list2);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 5, div0Var.f49498f);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
