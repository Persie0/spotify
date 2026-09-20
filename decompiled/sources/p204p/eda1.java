package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class eda1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final eda1 f58491a;
    private static final ktz0 descriptor;

    static {
        eda1 eda1Var = new eda1();
        f58491a = eda1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.promptedplaylists.suggestedpromptsimpl.UpdatePromptSignalPayload", eda1Var, 5);
        vwp0Var.m86594k("prompt", false);
        vwp0Var.m86594k("prompt_id", true);
        vwp0Var.m86594k("type", true);
        vwp0Var.m86594k("cadence", true);
        vwp0Var.m86594k("weekly_day", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else if (iMo29816p == 2) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                i |= 4;
            } else if (iMo29816p == 3) {
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gda1(i, strMo39226f, str, str2, str3, str4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gda1 gda1Var = (gda1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, gda1Var.f78785a);
        String str = gda1Var.f78786b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        String str2 = gda1Var.f78787c;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str2);
        }
        String str3 = gda1Var.f78788d;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str3);
        }
        String str4 = gda1Var.f78789e;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str4);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
