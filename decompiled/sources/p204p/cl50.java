package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cl50 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final cl50 f39189a;
    private static final ktz0 descriptor;

    static {
        cl50 cl50Var = new cl50();
        f39189a = cl50Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.IntroStory", cl50Var, 7);
        vwp0Var.m86594k("title1", false);
        vwp0Var.m86594k("subtitle1", true);
        vwp0Var.m86594k("title2", false);
        vwp0Var.m86594k("subtitle2", true);
        vwp0Var.m86594k("audio_uri", true);
        vwp0Var.m86594k("background_color", false);
        vwp0Var.m86594k("share_metadata", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ce51 ce51Var = ce51.f37012a;
        rr60 rr60VarM39700t = epv0.m39700t(ce51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(ce51Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ce51Var, rr60VarM39700t, ce51Var, rr60VarM39700t2, epv0.m39700t(ql51Var), ql51Var, epv0.m39700t(vu01.f244805a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        ee51 ee51Var = null;
        ee51 ee51Var2 = null;
        ee51 ee51Var3 = null;
        ee51 ee51Var4 = null;
        String str = null;
        String strMo39226f = null;
        sv01 sv01Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ee51Var = (ee51) frhVarMo29814b.mo39210A(ktz0Var, 0, ce51.f37012a, ee51Var);
                    i |= 1;
                    break;
                case 1:
                    ee51Var2 = (ee51) frhVarMo29814b.mo39211B(ktz0Var, 1, ce51.f37012a, ee51Var2);
                    i |= 2;
                    break;
                case 2:
                    ee51Var3 = (ee51) frhVarMo29814b.mo39210A(ktz0Var, 2, ce51.f37012a, ee51Var3);
                    i |= 4;
                    break;
                case 3:
                    ee51Var4 = (ee51) frhVarMo29814b.mo39211B(ktz0Var, 3, ce51.f37012a, ee51Var4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    sv01Var = (sv01) frhVarMo29814b.mo39211B(ktz0Var, 6, vu01.f244805a, sv01Var);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new el50(i, ee51Var, ee51Var2, ee51Var3, ee51Var4, str, strMo39226f, sv01Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        el50 el50Var = (el50) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        ce51 ce51Var = ce51.f37012a;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, ce51Var, el50Var.f60588a);
        ee51 ee51Var = el50Var.f60589b;
        if (ee51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ce51Var, ee51Var);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 2, ce51Var, el50Var.f60590c);
        ee51 ee51Var2 = el50Var.f60591d;
        if (ee51Var2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ce51Var, ee51Var2);
        }
        String str = el50Var.f60592e;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 5, el50Var.f60593f);
        sv01 sv01Var = el50Var.f60594g;
        if (sv01Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, vu01.f244805a, sv01Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
