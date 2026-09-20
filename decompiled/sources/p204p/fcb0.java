package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fcb0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final fcb0 f68049a;
    private static final ktz0 descriptor;

    static {
        fcb0 fcb0Var = new fcb0();
        f68049a = fcb0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Line", fcb0Var, 3);
        vwp0Var.m86594k("startTimeInMs", false);
        vwp0Var.m86594k("words", false);
        vwp0Var.m86594k("syllables", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{u2b0.f226058a, ql51.f189738a, hcb0.f89745d[2].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = hcb0.f89745d;
        frhVarMo29814b.getClass();
        int i = 0;
        long jMo39227i0 = 0;
        String strMo39226f = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hcb0(i, jMo39227i0, strMo39226f, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hcb0 hcb0Var = (hcb0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = hcb0.f89745d;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, hcb0Var.f89746a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, hcb0Var.f89747b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), hcb0Var.f89748c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
