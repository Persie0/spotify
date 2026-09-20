package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mw5 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final mw5 f147713a;
    private static final ktz0 descriptor;

    static {
        mw5 mw5Var = new mw5();
        f147713a = mw5Var;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorartist.model.ArtistFactResponse", mw5Var, 3);
        vwp0Var.m86594k("type", true);
        vwp0Var.m86594k("aiPersonaClassification", true);
        vwp0Var.m86594k("localizedFact", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
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
        String str3 = null;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str3);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ow5(str, str2, i, str3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ow5 ow5Var = (ow5) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = ow5Var.f170642a;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        String str2 = ow5Var.f170643b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = ow5Var.f170644c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
