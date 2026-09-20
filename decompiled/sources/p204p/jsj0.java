package p204p;

import com.spotify.player.model.ContextTrack;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class jsj0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final jsj0 f115506a;
    private static final ktz0 descriptor;

    static {
        jsj0 jsj0Var = new jsj0();
        f115506a = jsj0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.domain.models.Notification", jsj0Var, 9);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("created_timestamp", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k("action", false);
        vwp0Var.m86594k("image", false);
        vwp0Var.m86594k("is_new", false);
        vwp0Var.m86594k("storage_id", false);
        vwp0Var.m86594k("messaging_metadata", false);
        vwp0Var.m86594k("requestId", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = qsj0.f192132t;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, fr70VarArr[1].getValue(), ql51Var, rsj0.f202338a, fr70VarArr[4].getValue(), l8a.f130828a, ql51Var, d0f0.f43859a, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = qsj0.f192132t;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        gw71 gw71Var = null;
        String strMo39226f2 = null;
        vsj0 vsj0Var = null;
        tvj0 tvj0Var = null;
        String strMo39226f3 = null;
        g0f0 g0f0Var = null;
        String strMo39226f4 = null;
        int i = 0;
        boolean zMo39217M = false;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    gw71Var = (gw71) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), gw71Var);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    vsj0Var = (vsj0) frhVarMo29814b.mo39210A(ktz0Var, 3, rsj0.f202338a, vsj0Var);
                    i |= 8;
                    break;
                case 4:
                    tvj0Var = (tvj0) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), tvj0Var);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    g0f0Var = (g0f0) frhVarMo29814b.mo39210A(ktz0Var, 7, d0f0.f43859a, g0f0Var);
                    i |= 128;
                    break;
                case 8:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qsj0(i, strMo39226f, gw71Var, strMo39226f2, vsj0Var, tvj0Var, zMo39217M, strMo39226f3, g0f0Var, strMo39226f4);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qsj0 qsj0Var = (qsj0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = qsj0.f192132t;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, qsj0Var.f192133a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), qsj0Var.f192134b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, qsj0Var.f192135c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, rsj0.f202338a, qsj0Var.f192136d);
        hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), qsj0Var.f192137e);
        hrhVarMo35820b.mo44930E(ktz0Var, 5, qsj0Var.f192138f);
        hrhVarMo35820b.mo44931G(ktz0Var, 6, qsj0Var.f192139g);
        hrhVarMo35820b.mo44941k(ktz0Var, 7, d0f0.f43859a, qsj0Var.f192140h);
        hrhVarMo35820b.mo44931G(ktz0Var, 8, qsj0Var.f192141i);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
