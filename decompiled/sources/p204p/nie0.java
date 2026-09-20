package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class nie0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final nie0 f154250a;
    private static final ktz0 descriptor;

    static {
        nie0 nie0Var = new nie0();
        f154250a = nie0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.Merch", nie0Var, 5);
        vwp0Var.m86594k("id", true);
        vwp0Var.m86594k("url", true);
        vwp0Var.m86594k("image_uri", true);
        vwp0Var.m86594k("name", true);
        vwp0Var.m86594k("description", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
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
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else if (iMo29816p == 1) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                i |= 2;
            } else if (iMo29816p == 2) {
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                i |= 4;
            } else if (iMo29816p == 3) {
                str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str4);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str5 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str5);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new sie0(i, str, str2, str3, str4, str5);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sie0 sie0Var = (sie0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = sie0Var.f209470a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = sie0Var.f209471b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = sie0Var.f209472c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = sie0Var.f209473d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        String str5 = sie0Var.f209474e;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str5);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
