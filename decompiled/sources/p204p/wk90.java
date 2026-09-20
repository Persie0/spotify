package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wk90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wk90 f252162a;
    private static final ktz0 descriptor;

    static {
        wk90 wk90Var = new wk90();
        f252162a = wk90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.live.LiveEventMetadata", wk90Var, 2);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, true);
        vwp0Var.m86594k("urlTemplate", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yk90(i, strMo39226f, strMo39226f2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yk90 yk90Var = (yk90) obj;
        String str = yk90Var.f273649b;
        String str2 = yk90Var.f273648a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "Live event")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 0, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 1, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
