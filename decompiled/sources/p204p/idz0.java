package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class idz0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final idz0 f101276a;
    private static final ktz0 descriptor;

    static {
        idz0 idz0Var = new idz0();
        f101276a = idz0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.SeekPanels", idz0Var, 3);
        vwp0Var.m86594k("base_urls", false);
        vwp0Var.m86594k("templates", false);
        vwp0Var.m86594k("variants", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = kdz0.f121752d;
        return new rr60[]{fr70VarArr[0].getValue(), fr70VarArr[1].getValue(), fr70VarArr[2].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = kdz0.f121752d;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        List list2 = null;
        List list3 = null;
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
                list3 = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list3);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new kdz0(i, list, list2, list3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        kdz0 kdz0Var = (kdz0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = kdz0.f121752d;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), kdz0Var.f121753a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), kdz0Var.f121754b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), kdz0Var.f121755c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
