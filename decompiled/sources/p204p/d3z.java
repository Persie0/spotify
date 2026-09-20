package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d3z implements g210 {

    /* JADX INFO: renamed from: a */
    public static final d3z f45036a;
    private static final ktz0 descriptor;

    static {
        d3z d3zVar = new d3z();
        f45036a = d3zVar;
        vwp0 vwp0Var = new vwp0("com.spotify.listuxplatformconsumers.blend.shared.api.FilterPillMetadata", d3zVar, 2);
        vwp0Var.m86594k("filter_pills_enabled", false);
        vwp0Var.m86594k("filter_pill_info", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{l8a.f130828a, i3z.f98353c[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = i3z.f98353c;
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
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 0);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new i3z(i, zMo39217M, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        i3z i3zVar = (i3z) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = i3z.f98353c;
        hrhVarMo35820b.mo44930E(ktz0Var, 0, i3zVar.f98354a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), i3zVar.f98355b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
