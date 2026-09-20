package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qai implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qai f186880a;
    private static final ktz0 descriptor;

    static {
        qai qaiVar = new qai();
        f186880a = qaiVar;
        vwp0 vwp0Var = new vwp0("com.spotify.ontour.concertfriendmatcherimpl.data.ConcertFriendMatch", qaiVar, 2);
        vwp0Var.m86594k("friendUsername", false);
        vwp0Var.m86594k("concert", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, tai.f218616a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        vai vaiVar = null;
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
                vaiVar = (vai) frhVarMo29814b.mo39210A(ktz0Var, 1, tai.f218616a, vaiVar);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new sai(i, strMo39226f, vaiVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sai saiVar = (sai) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, saiVar.f207215a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, tai.f218616a, saiVar.f207216b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
