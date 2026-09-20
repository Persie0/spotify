package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n951 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final n951 f151723a;
    private static final ktz0 descriptor;

    static {
        n951 n951Var = new n951();
        f151723a = n951Var;
        vwp0 vwp0Var = new vwp0("com.spotify.remoteconfig.temporarypropertyoverrides.StoredOverride", n951Var, 2);
        vwp0Var.m86594k("value", false);
        vwp0Var.m86594k("expiresAtMillis", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{l8a.f130828a, u2b0.f226058a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        long jMo39227i0 = 0;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
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
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new p951(jMo39227i0, zMo39217M, i);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        p951 p951Var = (p951) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, p951Var.f175160a);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, p951Var.f175161b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
