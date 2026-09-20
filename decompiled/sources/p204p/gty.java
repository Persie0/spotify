package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gty implements g210 {

    /* JADX INFO: renamed from: a */
    public static final gty f84307a;
    private static final ktz0 descriptor;

    static {
        gty gtyVar = new gty();
        f84307a = gtyVar;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.data.FetchUserHasUnreadNotificationsResponse", gtyVar, 1);
        vwp0Var.m86594k("userHasUnreadNotification", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ity(i, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44930E(ktz0Var, 0, ((ity) obj).f105788a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
