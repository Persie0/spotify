package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class et91 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final et91 f62670a;
    private static final ktz0 descriptor;

    static {
        et91 et91Var = new et91();
        f62670a = et91Var;
        vwp0 vwp0Var = new vwp0("com.spotify.ubi.logger.UbiContextualSources", et91Var, 2);
        vwp0Var.m86594k("sources", false);
        vwp0Var.m86594k("sourcePathsUnavailableReason", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = gt91.f84113c;
        return new rr60[]{fr70VarArr[0].getValue(), epv0.m39700t((rr60) fr70VarArr[1].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = gt91.f84113c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        wu31 wu31Var = null;
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
                wu31Var = (wu31) frhVarMo29814b.mo39211B(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), wu31Var);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gt91(i, list, wu31Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gt91 gt91Var = (gt91) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = gt91.f84113c;
        rr60 rr60Var = (rr60) fr70VarArr[0].getValue();
        List list = gt91Var.f84116a;
        wu31 wu31Var = gt91Var.f84117b;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, rr60Var, list);
        if (hrhVarMo35820b.mo48399d0() || wu31Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), wu31Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
