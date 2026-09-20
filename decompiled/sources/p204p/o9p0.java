package p204p;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o9p0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final o9p0 f163120a;
    private static final ktz0 descriptor;

    static {
        o9p0 o9p0Var = new o9p0();
        f163120a = o9p0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.contextplayercoordinatorimpl.model.PlayerError", o9p0Var, 2);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("data", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, q9p0.f186649c[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = q9p0.f186649c;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        Map map = null;
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
                map = (Map) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new q9p0(strMo39226f, i, map);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        q9p0 q9p0Var = (q9p0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = q9p0.f186649c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, q9p0Var.f186650a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), q9p0Var.f186651b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
