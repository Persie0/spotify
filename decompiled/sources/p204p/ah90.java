package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ah90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ah90 f15644a;
    private static final ktz0 descriptor;

    static {
        ah90 ah90Var = new ah90();
        f15644a = ah90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.ListeningPartyCard", ah90Var, 4);
        vwp0Var.m86594k("party", false);
        vwp0Var.m86594k("status", false);
        vwp0Var.m86594k("organizer", false);
        vwp0Var.m86594k("observe_party", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{vg90.f241180a, hj90.f91997a, ji90.f112689a, gpk0.f83217a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        yg90 yg90Var = null;
        jj90 jj90Var = null;
        li90 li90Var = null;
        ipk0 ipk0Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                yg90Var = (yg90) frhVarMo29814b.mo39210A(ktz0Var, 0, vg90.f241180a, yg90Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                jj90Var = (jj90) frhVarMo29814b.mo39210A(ktz0Var, 1, hj90.f91997a, jj90Var);
                i |= 2;
            } else if (iMo29816p == 2) {
                li90Var = (li90) frhVarMo29814b.mo39210A(ktz0Var, 2, ji90.f112689a, li90Var);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                ipk0Var = (ipk0) frhVarMo29814b.mo39210A(ktz0Var, 3, gpk0.f83217a, ipk0Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ch90(i, yg90Var, jj90Var, li90Var, ipk0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ch90 ch90Var = (ch90) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, vg90.f241180a, ch90Var.f37964a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, hj90.f91997a, ch90Var.f37965b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, ji90.f112689a, ch90Var.f37966c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, gpk0.f83217a, ch90Var.f37967d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
