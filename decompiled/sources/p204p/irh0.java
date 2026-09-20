package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class irh0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final irh0 f104991a;
    private static final ktz0 descriptor;

    static {
        irh0 irh0Var = new irh0();
        f104991a = irh0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ModOutgoingMessage.AccessibilityState", irh0Var, 3);
        vwp0Var.m86594k("isScreenReaderActive", false);
        vwp0Var.m86594k("isReduceMotionEnabled", false);
        vwp0Var.m86594k("isSwitchControlActive", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{l8aVar, l8aVar, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new krh0(i, zMo39217M, zMo39217M2, zMo39217M3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        krh0 krh0Var = (krh0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, krh0Var.f125652a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, krh0Var.f125653b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, krh0Var.f125654c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
