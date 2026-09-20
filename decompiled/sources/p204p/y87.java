package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y87 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final y87 f270237a;
    private static final ktz0 descriptor;

    static {
        y87 y87Var = new y87();
        f270237a = y87Var;
        vwp0 vwp0Var = new vwp0("com.spotify.audiobook.ccbottomsheetimpl.data.AudiobookCappedExplanationResponse", y87Var, 7);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, true);
        vwp0Var.m86594k("body", true);
        vwp0Var.m86594k("cta", true);
        vwp0Var.m86594k("ctaUrl", true);
        vwp0Var.m86594k("dismiss", true);
        vwp0Var.m86594k("secondaryCta", true);
        vwp0Var.m86594k("secondaryCtaUrl", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
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
        String str7 = null;
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
                case 6:
                    str7 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str7);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new a97(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        a97 a97Var = (a97) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = a97Var.f13491a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = a97Var.f13492b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = a97Var.f13493c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = a97Var.f13494d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        String str5 = a97Var.f13495e;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str5);
        }
        String str6 = a97Var.f13496f;
        if (str6 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str6);
        }
        String str7 = a97Var.f13497g;
        if (str7 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str7);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
