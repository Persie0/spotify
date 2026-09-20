package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class dw71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final dw71 f53637a;
    private static final ktz0 descriptor;

    static {
        dw71 dw71Var = new dw71();
        f53637a = dw71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.TimestampType.Years", dw71Var, 3);
        vwp0Var.m86594k("month_value", false);
        vwp0Var.m86594k("day", false);
        vwp0Var.m86594k("year", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{e450.f55982a, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        String strMo39226f2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new fw71(i, strMo39226f, iMo39229o, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        fw71 fw71Var = (fw71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44938e(0, fw71Var.f74013b, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, fw71Var.f74014c);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, fw71Var.f74015d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
