package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class wfn0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wfn0 f250877a;
    private static final ktz0 descriptor;

    static {
        wfn0 wfn0Var = new wfn0();
        f250877a = wfn0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.payment.paymentimpl.view.field.PciBridgeConfig", wfn0Var, 7);
        vwp0Var.m86594k("providers", false);
        vwp0Var.m86594k("translations", false);
        vwp0Var.m86594k("errorMessages", false);
        vwp0Var.m86594k("isRtl", true);
        vwp0Var.m86594k("enableKoreaFields", true);
        vwp0Var.m86594k("isCvcOnly", true);
        vwp0Var.m86594k("cvcLength", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{yfn0.f272294h[0].getValue(), ggn0.f79706a, zfn0.f282352a, l8aVar, l8aVar, l8aVar, e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = yfn0.f272294h;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        int iMo39229o = 0;
        List list = null;
        ign0 ign0Var = null;
        bgn0 bgn0Var = null;
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
                    ign0Var = (ign0) frhVarMo29814b.mo39210A(ktz0Var, 1, ggn0.f79706a, ign0Var);
                    i |= 2;
                    break;
                case 2:
                    bgn0Var = (bgn0) frhVarMo29814b.mo39210A(ktz0Var, 2, zfn0.f282352a, bgn0Var);
                    i |= 4;
                    break;
                case 3:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yfn0(i, list, ign0Var, bgn0Var, zMo39217M, zMo39217M2, zMo39217M3, iMo39229o);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yfn0 yfn0Var = (yfn0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        rr60 rr60Var = (rr60) yfn0.f272294h[0].getValue();
        List list = yfn0Var.f272295a;
        int i = yfn0Var.f272301g;
        boolean z = yfn0Var.f272300f;
        boolean z2 = yfn0Var.f272299e;
        boolean z3 = yfn0Var.f272298d;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, rr60Var, list);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, ggn0.f79706a, yfn0Var.f272296b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, zfn0.f282352a, yfn0Var.f272297c);
        if (hrhVarMo35820b.mo48399d0() || z3) {
            hrhVarMo35820b.mo44930E(ktz0Var, 3, z3);
        }
        if (hrhVarMo35820b.mo48399d0() || z2) {
            hrhVarMo35820b.mo44930E(ktz0Var, 4, z2);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 3) {
            hrhVarMo35820b.mo44938e(6, i, ktz0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
