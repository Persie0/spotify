package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xjp0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final xjp0 f262186a;
    private static final ktz0 descriptor;

    static {
        xjp0 xjp0Var = new xjp0();
        f262186a = xjp0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.PlaylistExtenderRecommendation", xjp0Var, 8);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("album", false);
        vwp0Var.m86594k("duration", true);
        vwp0Var.m86594k("artists", false);
        vwp0Var.m86594k("isExplicit", true);
        vwp0Var.m86594k("isTagged19plus", true);
        vwp0Var.m86594k("isCurrentlyPlayable", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = zjp0.f283514i;
        ql51 ql51Var = ql51.f189738a;
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, ql51Var, bq50.f29679a, e450.f55982a, fr70VarArr[4].getValue(), l8aVar, l8aVar, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = zjp0.f283514i;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        String strMo39226f2 = null;
        jr50 jr50Var = null;
        List list = null;
        int i = 0;
        int iMo39229o = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
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
                    jr50Var = (jr50) frhVarMo29814b.mo39210A(ktz0Var, 2, bq50.f29679a, jr50Var);
                    i |= 4;
                    break;
                case 3:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 3);
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
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new zjp0(i, strMo39226f, strMo39226f2, jr50Var, iMo39229o, list, zMo39217M, zMo39217M2, zMo39217M3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        zjp0 zjp0Var = (zjp0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = zjp0.f283514i;
        String str = zjp0Var.f283515a;
        boolean z = zjp0Var.f283522h;
        boolean z2 = zjp0Var.f283521g;
        boolean z3 = zjp0Var.f283520f;
        int i = zjp0Var.f283518d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, zjp0Var.f283516b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, bq50.f29679a, zjp0Var.f283517c);
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(3, i, ktz0Var);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), zjp0Var.f283519e);
        if (hrhVarMo35820b.mo48399d0() || z3) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z3);
        }
        if (hrhVarMo35820b.mo48399d0() || z2) {
            hrhVarMo35820b.mo44930E(ktz0Var, 6, z2);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 7, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
