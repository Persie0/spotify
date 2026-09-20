package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class zv71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zv71 f286654a;
    private static final ktz0 descriptor;

    static {
        zv71 zv71Var = new zv71();
        f286654a = zv71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.TimestampType.Months", zv71Var, 2);
        vwp0Var.m86594k("month_value", false);
        vwp0Var.m86594k("day", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{e450.f55982a, ql51.f189738a};
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
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
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
        return new bw71(i, iMo39229o, strMo39226f);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        bw71 bw71Var = (bw71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44938e(0, bw71Var.f31575b, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, bw71Var.f31576c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
