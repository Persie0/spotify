package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yt0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final yt0 f275917a;
    private static final ktz0 descriptor;

    static {
        yt0 yt0Var = new yt0();
        f275917a = yt0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.preview.model.AdPreview.Video", yt0Var, 6);
        vwp0Var.m86594k("bitrate", false);
        vwp0Var.m86594k("duration_sec", false);
        vwp0Var.m86594k("height", false);
        vwp0Var.m86594k("width", false);
        vwp0Var.m86594k("media_file", false);
        vwp0Var.m86594k("mimetype", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        rr60 rr60VarM39700t = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(u2b0.f226058a);
        rr60 rr60VarM39700t3 = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(e450Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 0, e450.f55982a, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 1, u2b0.f226058a, l);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 2, e450.f55982a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 3, e450.f55982a, num3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new au0(i, num, l, num2, num3, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        au0 au0Var = (au0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        e450 e450Var = e450.f55982a;
        hrhVarMo35820b.mo44943s(ktz0Var, 0, e450Var, au0Var.f19774a);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, u2b0.f226058a, au0Var.f19775b);
        hrhVarMo35820b.mo44943s(ktz0Var, 2, e450Var, au0Var.f19776c);
        hrhVarMo35820b.mo44943s(ktz0Var, 3, e450Var, au0Var.f19777d);
        ql51 ql51Var = ql51.f189738a;
        hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51Var, au0Var.f19778e);
        hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51Var, au0Var.f19779f);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
