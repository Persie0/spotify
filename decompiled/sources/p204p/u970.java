package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u970 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final u970 f228086a;
    private static final ktz0 descriptor;

    static {
        u970 u970Var = new u970();
        f228086a = u970Var;
        vwp0 vwp0Var = new vwp0("com.spotify.messaging.actionsimpl.kodak.KodakImageRequestBody", u970Var, 3);
        vwp0Var.m86594k("creative_id", false);
        vwp0Var.m86594k("width", false);
        vwp0Var.m86594k("height", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        return new rr60[]{u2b0.f226058a, e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        long jMo39227i0 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w970(jMo39227i0, i, iMo39229o, iMo39229o2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        w970 w970Var = (w970) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44942l(ktz0Var, 0, w970Var.f249103a);
        hrhVarMo35820b.mo44938e(1, w970Var.f249104b, ktz0Var);
        hrhVarMo35820b.mo44938e(2, w970Var.f249105c, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
