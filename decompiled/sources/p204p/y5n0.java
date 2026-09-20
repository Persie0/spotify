package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y5n0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final y5n0 f269495a;
    private static final ktz0 descriptor;

    static {
        y5n0 y5n0Var = new y5n0();
        f269495a = y5n0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.partnerapps.domain.api.PartnerIntegrationsResponse", y5n0Var, 2);
        vwp0Var.m86594k("categoryId", false);
        vwp0Var.m86594k("partnerIntegrations", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, a6n0.f12826c[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = a6n0.f12826c;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new a6n0(strMo39226f, i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        a6n0 a6n0Var = (a6n0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = a6n0.f12826c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, a6n0Var.f12827a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), a6n0Var.f12828b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
