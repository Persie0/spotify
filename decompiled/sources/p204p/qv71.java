package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class qv71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qv71 f192933a;
    private static final ktz0 descriptor;

    static {
        qv71 qv71Var = new qv71();
        f192933a = qv71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.TimestampType.Days", qv71Var, 3);
        vwp0Var.m86594k("days", false);
        vwp0Var.m86594k("timestamp_seconds", true);
        vwp0Var.m86594k("timestamp_nanos", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, u2b0.f226058a, e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        String strMo39226f = null;
        long jMo39227i0 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new sv71(i, jMo39227i0, strMo39226f, iMo39229o);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sv71 sv71Var = (sv71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = sv71Var.f214355b;
        int i = sv71Var.f214357d;
        long j = sv71Var.f214356c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        if (hrhVarMo35820b.mo48399d0() || j != 0) {
            hrhVarMo35820b.mo44942l(ktz0Var, 1, j);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(2, i, ktz0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
