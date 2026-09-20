package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lrh0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lrh0 f136316a;
    private static final ktz0 descriptor;

    static {
        lrh0 lrh0Var = new lrh0();
        f136316a = lrh0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ModOutgoingMessage.ChatInitialMessages", lrh0Var, 2);
        vwp0Var.m86594k("hierarchyId", false);
        vwp0Var.m86594k("messages", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, nrh0.f157562c[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = nrh0.f157562c;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
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
        return new nrh0(strMo39226f, i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        nrh0 nrh0Var = (nrh0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = nrh0.f157562c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, nrh0Var.f157563a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), nrh0Var.f157564b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
