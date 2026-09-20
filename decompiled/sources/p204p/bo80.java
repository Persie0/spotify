package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bo80 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final bo80 f29041a;
    private static final ktz0 descriptor;

    static {
        bo80 bo80Var = new bo80();
        f29041a = bo80Var;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorartist.model.LinksModel", bo80Var, 6);
        vwp0Var.m86594k("twitter", true);
        vwp0Var.m86594k("instagram", true);
        vwp0Var.m86594k("wikipedia", true);
        vwp0Var.m86594k("facebook", true);
        vwp0Var.m86594k("whatsapp", true);
        vwp0Var.m86594k("tiktok", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str6);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new do80(str, str2, str3, str4, i, str5, str6);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        do80 do80Var = (do80) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = do80Var.f50967a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = do80Var.f50968b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = do80Var.f50969c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = do80Var.f50970d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        String str5 = do80Var.f50971e;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str5);
        }
        String str6 = do80Var.f50972f;
        if (str6 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str6);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
