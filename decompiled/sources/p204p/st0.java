package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class st0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final st0 f213750a;
    private static final ktz0 descriptor;

    static {
        st0 st0Var = new st0();
        f213750a = st0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.preview.model.AdPreview.CoverArt", st0Var, 4);
        vwp0Var.m86594k("height", false);
        vwp0Var.m86594k("width", false);
        vwp0Var.m86594k("mimetype", false);
        vwp0Var.m86594k("media_file", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        rr60 rr60VarM39700t = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(e450Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, rr60VarM39700t2, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 0, e450.f55982a, num);
                i |= 1;
            } else if (iMo29816p == 1) {
                num2 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 1, e450.f55982a, num2);
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
        return new ut0(i, num, num2, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ut0 ut0Var = (ut0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        e450 e450Var = e450.f55982a;
        hrhVarMo35820b.mo44943s(ktz0Var, 0, e450Var, ut0Var.f233732a);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, e450Var, ut0Var.f233733b);
        ql51 ql51Var = ql51.f189738a;
        hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51Var, ut0Var.f233734c);
        hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51Var, ut0Var.f233735d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
