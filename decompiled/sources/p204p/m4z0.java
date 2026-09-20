package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m4z0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final m4z0 f140058a;
    private static final ktz0 descriptor;

    static {
        m4z0 m4z0Var = new m4z0();
        f140058a = m4z0Var;
        descriptor = new vwp0("com.spotify.yourupdates.domain.models.SecondaryAction.DeleteNotification", m4z0Var, 0);
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[0];
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
        if (iMo29816p != -1) {
            throw new UnknownFieldException(iMo29816p);
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new o4z0();
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        n4z0 n4z0Var = o4z0.Companion;
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
