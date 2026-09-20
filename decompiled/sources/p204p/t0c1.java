package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0c1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final t0c1 f215842a;
    private static final ktz0 descriptor;

    static {
        t0c1 t0c1Var = new t0c1();
        f215842a = t0c1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsinternal.adscommon.video.VideoPlayerResponse", t0c1Var, 2);
        vwp0Var.m86594k("type", true);
        vwp0Var.m86594k("advance_reason", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new v0c1(i, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        v0c1 v0c1Var = (v0c1) obj;
        String str = v0c1Var.f235964b;
        String str2 = v0c1Var.f235963a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
