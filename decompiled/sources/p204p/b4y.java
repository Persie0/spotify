package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b4y implements g210 {

    /* JADX INFO: renamed from: a */
    public static final b4y f23430a;
    private static final ktz0 descriptor;

    static {
        b4y b4yVar = new b4y();
        f23430a = b4yVar;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.core.data.ExternalizationDisabledResponse", b4yVar, 4);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("filterFiles", false);
        vwp0Var.m86594k("revision", false);
        vwp0Var.m86594k("format", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = d4y.f45262e;
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51.f189738a, fr70VarArr[1].getValue(), e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = d4y.f45262e;
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
        return new d4y(i, iMo39229o, iMo39229o2, strMo39226f, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        d4y d4yVar = (d4y) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = d4y.f45262e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, d4yVar.f45263a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), d4yVar.f45264b);
        hrhVarMo35820b.mo44938e(2, d4yVar.f45265c, ktz0Var);
        hrhVarMo35820b.mo44938e(3, d4yVar.f45266d, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
