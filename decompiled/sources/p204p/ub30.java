package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ub30 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ub30 f228628a;
    private static final ktz0 descriptor;

    static {
        ub30 ub30Var = new ub30();
        f228628a = ub30Var;
        vwp0 vwp0Var = new vwp0("com.spotify.aiplaylist.playlist4serviceimpl.HostResolverResponse", ub30Var, 1);
        vwp0Var.m86594k("spclient", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{wb30.f249682b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = wb30.f249682b;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new wb30(i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) wb30.f249682b[0].getValue(), ((wb30) obj).f249683a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
