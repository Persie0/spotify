package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kx51 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final kx51 f127336a;
    private static final ktz0 descriptor;

    static {
        kx51 kx51Var = new kx51();
        f127336a = kx51Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.Subtitles", kx51Var, 2);
        vwp0Var.m86594k("base_urls", false);
        vwp0Var.m86594k("variants", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = mx51.f147966c;
        return new rr60[]{fr70VarArr[0].getValue(), fr70VarArr[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = mx51.f147966c;
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
        return new mx51(i, list, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        mx51 mx51Var = (mx51) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = mx51.f147966c;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), mx51Var.f147967a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), mx51Var.f147968b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
