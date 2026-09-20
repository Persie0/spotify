package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p1u implements g210 {

    /* JADX INFO: renamed from: a */
    public static final p1u f173169a;
    private static final ktz0 descriptor;

    static {
        p1u p1uVar = new p1u();
        f173169a = p1uVar;
        vwp0 vwp0Var = new vwp0("com.spotify.email.models.EmailProfileResponseOptions", p1uVar, 2);
        vwp0Var.m86594k("editable_fields", false);
        vwp0Var.m86594k("is_password_required_on_email_change", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{r1u.f194921c[0].getValue(), l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = r1u.f194921c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new r1u(i, list, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        r1u r1uVar = (r1u) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) r1u.f194921c[0].getValue(), r1uVar.f194922a);
        hrhVarMo35820b.mo44930E(ktz0Var, 1, r1uVar.f194923b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
