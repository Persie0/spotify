package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h4y implements g210 {

    /* JADX INFO: renamed from: a */
    public static final h4y f87673a;
    private static final ktz0 descriptor;

    static {
        h4y h4yVar = new h4y();
        f87673a = h4yVar;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.core.data.ExternalizationEnabledResponse", h4yVar, 4);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("filterFiles", false);
        vwp0Var.m86594k("revision", false);
        vwp0Var.m86594k("format", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = k4y.f119366e;
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51.f189738a, fr70VarArr[1].getValue(), e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = k4y.f119366e;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String strMo39226f = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            } else if (iMo29816p == 2) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new k4y(i, iMo39229o, iMo39229o2, strMo39226f, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        k4y k4yVar = (k4y) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = k4y.f119366e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, k4yVar.f119367a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), k4yVar.f119368b);
        hrhVarMo35820b.mo44938e(2, k4yVar.f119369c, ktz0Var);
        hrhVarMo35820b.mo44938e(3, k4yVar.f119370d, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
