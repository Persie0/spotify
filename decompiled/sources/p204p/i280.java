package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i280 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final i280 f97764a;
    private static final ktz0 descriptor;

    static {
        i280 i280Var = new i280();
        f97764a = i280Var;
        vwp0 vwp0Var = new vwp0("com.spotify.leavebehindads.ctaimpl.model.LeavebehindAdsResponse", i280Var, 2);
        vwp0Var.m86594k("leavebehindAds", false);
        vwp0Var.m86594k("requestId", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{k280.f118548c[0].getValue(), ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = k280.f118548c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        String strMo39226f = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new k280(strMo39226f, i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        k280 k280Var = (k280) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) k280.f118548c[0].getValue(), k280Var.f118549a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, k280Var.f118550b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
