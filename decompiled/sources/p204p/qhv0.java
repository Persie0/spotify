package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qhv0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qhv0 f188867a;
    private static final ktz0 descriptor;

    static {
        qhv0 qhv0Var = new qhv0();
        f188867a = qhv0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.assistedcuration.content.model.RecsItem", qhv0Var, 4);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("name", false);
        vwp0Var.m86594k("image_url", true);
        vwp0Var.m86594k("large_image_url", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        String str2 = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new shv0(i, strMo39226f, strMo39226f2, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        shv0 shv0Var = (shv0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, shv0Var.f209279a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, shv0Var.f209280b);
        String str = shv0Var.f209281c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        String str2 = shv0Var.f209282d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
