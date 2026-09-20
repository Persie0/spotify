package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jls implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jls f113673a;
    private static final ktz0 descriptor;

    static {
        jls jlsVar = new jls();
        f113673a = jlsVar;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.Durations", jlsVar, 2);
        vwp0Var.m86594k("values", false);
        vwp0Var.m86594k("timescale", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{lls.f134692c[0].getValue(), e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = lls.f134692c;
        frhVarMo29814b.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
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
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new lls(i, iMo39229o, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        lls llsVar = (lls) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) lls.f134692c[0].getValue(), llsVar.f134693a);
        hrhVarMo35820b.mo44938e(1, llsVar.f134694b, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
