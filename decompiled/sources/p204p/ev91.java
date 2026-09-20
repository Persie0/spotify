package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ev91 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ev91 f63187a;
    private static final ktz0 descriptor;

    static {
        ev91 ev91Var = new ev91();
        f63187a = ev91Var;
        vwp0 vwp0Var = new vwp0("com.spotify.ubi.logger.UbiInteractionSource", ev91Var, 3);
        vwp0Var.m86594k("interactionId", false);
        vwp0Var.m86594k("pageInstanceId", false);
        vwp0Var.m86594k("location", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{x650.f258595a, epv0.m39700t(ibm0.f100610a), tt91.f223562a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        z650 z650Var = null;
        boolean z = true;
        int i = 0;
        kbm0 kbm0Var = null;
        st91 st91Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                z650Var = (z650) frhVarMo29814b.mo39210A(ktz0Var, 0, x650.f258595a, z650Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                kbm0Var = (kbm0) frhVarMo29814b.mo39211B(ktz0Var, 1, ibm0.f100610a, kbm0Var);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                st91Var = (st91) frhVarMo29814b.mo39210A(ktz0Var, 2, tt91.f223562a, st91Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gv91(i, z650Var, kbm0Var, st91Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gv91 gv91Var = (gv91) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, x650.f258595a, gv91Var.f84675a);
        hrhVarMo35820b.mo44943s(ktz0Var, 1, ibm0.f100610a, gv91Var.f84676b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, tt91.f223562a, gv91Var.f84677c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
