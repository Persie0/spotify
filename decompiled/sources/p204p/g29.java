package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g29 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final g29 f75870a;
    private static final ktz0 descriptor;

    static {
        g29 g29Var = new g29();
        f75870a = g29Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.BasicStory", g29Var, 9);
        vwp0Var.m86594k("story_type", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_SUBTITLE, true);
        vwp0Var.m86594k("body", true);
        vwp0Var.m86594k("image", true);
        vwp0Var.m86594k("button", true);
        vwp0Var.m86594k("audio_uri", true);
        vwp0Var.m86594k("background_color", false);
        vwp0Var.m86594k("share_metadata", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        ce51 ce51Var = ce51.f37012a;
        return new rr60[]{rr60VarM39700t, ce51Var, epv0.m39700t(ce51Var), epv0.m39700t(ce51Var), epv0.m39700t(ql51Var), epv0.m39700t(nsa.f157724a), epv0.m39700t(ql51Var), ql51Var, epv0.m39700t(vu01.f244805a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String str = null;
        ee51 ee51Var = null;
        ee51 ee51Var2 = null;
        ee51 ee51Var3 = null;
        String str2 = null;
        tsa tsaVar = null;
        String str3 = null;
        String strMo39226f = null;
        sv01 sv01Var = null;
        int i = 0;
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
                    ee51Var = (ee51) frhVarMo29814b.mo39210A(ktz0Var, 1, ce51.f37012a, ee51Var);
                    i |= 2;
                    break;
                case 2:
                    ee51Var2 = (ee51) frhVarMo29814b.mo39211B(ktz0Var, 2, ce51.f37012a, ee51Var2);
                    i |= 4;
                    break;
                case 3:
                    ee51Var3 = (ee51) frhVarMo29814b.mo39211B(ktz0Var, 3, ce51.f37012a, ee51Var3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    tsaVar = (tsa) frhVarMo29814b.mo39211B(ktz0Var, 5, nsa.f157724a, tsaVar);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str3);
                    i |= 64;
                    break;
                case 7:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    sv01Var = (sv01) frhVarMo29814b.mo39211B(ktz0Var, 8, vu01.f244805a, sv01Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new i29(i, str, ee51Var, ee51Var2, ee51Var3, str2, tsaVar, str3, strMo39226f, sv01Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        i29 i29Var = (i29) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = i29Var.f97768a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        ce51 ce51Var = ce51.f37012a;
        hrhVarMo35820b.mo44941k(ktz0Var, 1, ce51Var, i29Var.f97769b);
        ee51 ee51Var = i29Var.f97770c;
        if (ee51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ce51Var, ee51Var);
        }
        ee51 ee51Var2 = i29Var.f97771d;
        if (ee51Var2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ce51Var, ee51Var2);
        }
        String str2 = i29Var.f97772e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        tsa tsaVar = i29Var.f97773f;
        if (tsaVar != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, nsa.f157724a, tsaVar);
        }
        String str3 = i29Var.f97774g;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 7, i29Var.f97775h);
        sv01 sv01Var = i29Var.f97776i;
        if (sv01Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, vu01.f244805a, sv01Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
