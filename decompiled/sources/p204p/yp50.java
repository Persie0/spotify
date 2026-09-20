package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yp50 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final yp50 f274825a;
    private static final ktz0 descriptor;

    static {
        yp50 yp50Var = new yp50();
        f274825a = yp50Var;
        vwp0 vwp0Var = new vwp0("com.spotify.inappuserfeedback.issuereporterimpl.IssueRequest", yp50Var, 4);
        vwp0Var.m86594k("summary", false);
        vwp0Var.m86594k("description", false);
        vwp0Var.m86594k("files", false);
        vwp0Var.m86594k("is_employee", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = aq50.f18083e;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, fr70VarArr[2].getValue(), l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = aq50.f18083e;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
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
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new aq50(i, strMo39226f, strMo39226f2, list, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        aq50 aq50Var = (aq50) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = aq50.f18083e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, aq50Var.f18084a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, aq50Var.f18085b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), aq50Var.f18086c);
        hrhVarMo35820b.mo44930E(ktz0Var, 3, aq50Var.f18087d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
