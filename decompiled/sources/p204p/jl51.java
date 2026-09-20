package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jl51 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jl51 f113490a;
    private static final ktz0 descriptor;

    static {
        jl51 jl51Var = new jl51();
        f113490a = jl51Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adonappopen.repository.network.StringList", jl51Var, 1);
        vwp0Var.m86594k("list", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ll51.f134532b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = ll51.f134532b;
        frhVarMo29814b.getClass();
        List list = null;
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
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ll51(i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        List list = ((ll51) obj).f134533a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = ll51.f134532b;
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lau.f131415a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
