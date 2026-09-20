package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ey31 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ey31 f63933a;
    private static final ktz0 descriptor;

    static {
        ey31 ey31Var = new ey31();
        f63933a = ey31Var;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.core.data.SpecificEnabledResponse", ey31Var, 7);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("brand", false);
        vwp0Var.m86594k("model", false);
        vwp0Var.m86594k("deviceName", false);
        vwp0Var.m86594k("filterFiles", false);
        vwp0Var.m86594k("revision", false);
        vwp0Var.m86594k("format", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = gy31.f85417h;
        ql51 ql51Var = ql51.f189738a;
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, ql51Var, fr70VarArr[4].getValue(), e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = gy31.f85417h;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        List list = null;
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
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gy31(i, iMo39229o, iMo39229o2, strMo39226f, strMo39226f2, strMo39226f3, strMo39226f4, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gy31 gy31Var = (gy31) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = gy31.f85417h;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, gy31Var.f85418a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, gy31Var.f85419b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, gy31Var.f85420c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, gy31Var.f85421d);
        hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), gy31Var.f85422e);
        hrhVarMo35820b.mo44938e(5, gy31Var.f85423f, ktz0Var);
        hrhVarMo35820b.mo44938e(6, gy31Var.f85424g, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
