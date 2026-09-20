package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lje0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lje0 f134074a;
    private static final ktz0 descriptor;

    static {
        lje0 lje0Var = new lje0();
        f134074a = lje0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.merch.merchdataloader.MerchItem", lje0Var, 5);
        vwp0Var.m86594k("merchId", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_SUBTITLE, true);
        vwp0Var.m86594k("imageUrl", false);
        vwp0Var.m86594k("navigationUrl", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            } else if (iMo29816p == 3) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new nje0(i, strMo39226f, strMo39226f2, str, strMo39226f3, strMo39226f4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        nje0 nje0Var = (nje0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, nje0Var.f154578a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, nje0Var.f154579b);
        String str = nje0Var.f154580c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 3, nje0Var.f154581d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, nje0Var.f154582e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
