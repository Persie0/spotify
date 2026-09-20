package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ot0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ot0 f168929a;
    private static final ktz0 descriptor;

    static {
        ot0 ot0Var = new ot0();
        f168929a = ot0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.preview.model.AdPreview.Audio", ot0Var, 4);
        vwp0Var.m86594k("bitrate", false);
        vwp0Var.m86594k("mimetype", false);
        vwp0Var.m86594k("duration_sec", false);
        vwp0Var.m86594k("media_file", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        rr60 rr60VarM39700t = epv0.m39700t(e450.f55982a);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, epv0.m39700t(ql51Var), epv0.m39700t(u2b0.f226058a), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        Integer num = null;
        String str = null;
        Long l = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else if (iMo29816p == 2) {
                l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 2, u2b0.f226058a, l);
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
        return new qt0(i, num, str, l, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qt0 qt0Var = (qt0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44943s(ktz0Var, 0, e450.f55982a, qt0Var.f192245a);
        ql51 ql51Var = ql51.f189738a;
        hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51Var, qt0Var.f192246b);
        hrhVarMo35820b.mo44943s(ktz0Var, 2, u2b0.f226058a, qt0Var.f192247c);
        hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51Var, qt0Var.f192248d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
