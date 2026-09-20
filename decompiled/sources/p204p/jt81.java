package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jt81 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jt81 f115763a;
    private static final ktz0 descriptor;

    static {
        jt81 jt81Var = new jt81();
        f115763a = jt81Var;
        vwp0 vwp0Var = new vwp0("com.spotify.leavebehindads.ctaimpl.model.TrackingEvents", jt81Var, 2);
        vwp0Var.m86594k("viewed", false);
        vwp0Var.m86594k("clicked", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = lt81.f136725c;
        return new rr60[]{fr70VarArr[0].getValue(), fr70VarArr[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = lt81.f136725c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
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
                list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new lt81(i, list, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        lt81 lt81Var = (lt81) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = lt81.f136725c;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), lt81Var.f136726a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), lt81Var.f136727b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
