package p204p;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u3y implements g210 {

    /* JADX INFO: renamed from: a */
    public static final u3y f226484a;
    private static final ktz0 descriptor;

    static {
        u3y u3yVar = new u3y();
        f226484a = u3yVar;
        vwp0 vwp0Var = new vwp0("com.spotify.partneraccountlinking.common.samsung.ExternalUserAccountsStatusResponse", u3yVar, 1);
        vwp0Var.m86594k("partners", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t((rr60) w3y.f247660b[0].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = w3y.f247660b;
        frhVarMo29814b.getClass();
        Map map = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                map = (Map) frhVarMo29814b.mo39211B(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), map);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w3y(i, map);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        Map map = ((w3y) obj).f247661a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = w3y.f247660b;
        if (hrhVarMo35820b.mo48399d0() || map != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), map);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
