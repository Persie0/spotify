package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class qvj0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final qvj0 f193031a;
    private static final ktz0 descriptor;

    static {
        qvj0 qvj0Var = new qvj0();
        f193031a = qvj0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.NotificationImage.UserAndEntityImage", qvj0Var, 2);
        vwp0Var.m86594k("user_image", false);
        vwp0Var.m86594k("entity_image", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{fra1.f72391a, jvj0.f116361a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        ira1 ira1Var = null;
        boolean z = true;
        int i = 0;
        lvj0 lvj0Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                ira1Var = (ira1) frhVarMo29814b.mo39210A(ktz0Var, 0, fra1.f72391a, ira1Var);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                lvj0Var = (lvj0) frhVarMo29814b.mo39210A(ktz0Var, 1, jvj0.f116361a, lvj0Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new svj0(i, ira1Var, lvj0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        svj0 svj0Var = (svj0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        rvj0 rvj0Var = svj0.Companion;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, fra1.f72391a, svj0Var.f214452b);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, jvj0.f116361a, svj0Var.f214453c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
