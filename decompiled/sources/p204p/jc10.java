package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class jc10 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jc10 f110938a;
    private static final ktz0 descriptor;

    static {
        jc10 jc10Var = new jc10();
        f110938a = jc10Var;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.crossdevicesyncing.data.GetUserFiltersResponse", jc10Var, 3);
        vwp0Var.m86594k("supportedDevices", false);
        vwp0Var.m86594k("unsupportedDevices", false);
        vwp0Var.m86594k("genericFilters", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = lc10.f131793d;
        return new rr60[]{fr70VarArr[0].getValue(), fr70VarArr[1].getValue(), t310.f216687a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = lc10.f131793d;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        v310 v310Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else if (iMo29816p == 1) {
                list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                v310Var = (v310) frhVarMo29814b.mo39210A(ktz0Var, 2, t310.f216687a, v310Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new lc10(i, list, list2, v310Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        lc10 lc10Var = (lc10) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = lc10.f131793d;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), lc10Var.f131794a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), lc10Var.f131795b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, t310.f216687a, lc10Var.f131796c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
