package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mis implements g210 {

    /* JADX INFO: renamed from: a */
    public static final mis f144090a;
    private static final ktz0 descriptor;

    static {
        mis misVar = new mis();
        f144090a = misVar;
        vwp0 vwp0Var = new vwp0("com.spotify.eventsender.droppedevents.DroppedCounts", misVar, 2);
        vwp0Var.m86594k("s", true);
        vwp0Var.m86594k("r", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{u2b0Var, u2b0Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        boolean z = true;
        int i = 0;
        long jMo39227i0 = 0;
        long jMo39227i1 = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        ois oisVar = new ois();
        if ((i & 1) == 0) {
            oisVar.f165879a = 0L;
        } else {
            oisVar.f165879a = jMo39227i0;
        }
        if ((i & 2) == 0) {
            oisVar.f165880b = 0L;
            return oisVar;
        }
        oisVar.f165880b = jMo39227i1;
        return oisVar;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ois oisVar = (ois) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || oisVar.f165879a != 0) {
            hrhVarMo35820b.mo44942l(ktz0Var, 0, oisVar.f165879a);
        }
        if (hrhVarMo35820b.mo48399d0() || oisVar.f165880b != 0) {
            hrhVarMo35820b.mo44942l(ktz0Var, 1, oisVar.f165880b);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
