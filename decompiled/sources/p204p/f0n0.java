package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0n0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f0n0 f64688a;
    private static final ktz0 descriptor;

    static {
        f0n0 f0n0Var = new f0n0();
        f64688a = f0n0Var;
        vwp0 vwp0Var = new vwp0("ParentalControls", f0n0Var, 2);
        vwp0Var.m86594k("explicitContent", false);
        vwp0Var.m86594k("video", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{l8aVar, l8aVar};
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
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h0n0(i, zMo39217M, zMo39217M2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h0n0 h0n0Var = (h0n0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, h0n0Var.f86316a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, h0n0Var.f86317b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
