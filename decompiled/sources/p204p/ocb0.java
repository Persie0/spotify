package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ocb0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ocb0 f163892a;
    private static final ktz0 descriptor;

    static {
        ocb0 ocb0Var = new ocb0();
        f163892a = ocb0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity.Translation", ocb0Var, 3);
        vwp0Var.m86594k("language", false);
        vwp0Var.m86594k("translatedLines", false);
        vwp0Var.m86594k("isRTL", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, qcb0.f187293d[1].getValue(), l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = qcb0.f187293d;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
        List list = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qcb0(i, strMo39226f, list, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qcb0 qcb0Var = (qcb0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = qcb0.f187293d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, qcb0Var.f187294a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), qcb0Var.f187295b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, qcb0Var.f187296c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
