package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gx51 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final gx51 f85188a;
    private static final ktz0 descriptor;

    static {
        gx51 gx51Var = new gx51();
        f85188a = gx51Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.SubtitleVariant", gx51Var, 6);
        vwp0Var.m86594k("path", false);
        vwp0Var.m86594k("language_code", false);
        vwp0Var.m86594k("closed_caption", false);
        vwp0Var.m86594k("type", true);
        vwp0Var.m86594k("supplier", true);
        vwp0Var.m86594k("generation_type", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = ix51.f106599g;
        rr60 rr60VarM39700t = epv0.m39700t((rr60) fr70VarArr[3].getValue());
        rr60 rr60VarM39700t2 = epv0.m39700t((rr60) fr70VarArr[4].getValue());
        rr60 rr60VarM39700t3 = epv0.m39700t((rr60) fr70VarArr[5].getValue());
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, l8a.f130828a, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = ix51.f106599g;
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        ex51 ex51Var = null;
        sw51 sw51Var = null;
        wv51 wv51Var = null;
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
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    ex51Var = (ex51) frhVarMo29814b.mo39211B(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), ex51Var);
                    i |= 8;
                    break;
                case 4:
                    sw51Var = (sw51) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), sw51Var);
                    i |= 16;
                    break;
                case 5:
                    wv51Var = (wv51) frhVarMo29814b.mo39211B(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), wv51Var);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ix51(i, strMo39226f, strMo39226f2, zMo39217M, ex51Var, sw51Var, wv51Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ix51 ix51Var = (ix51) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = ix51.f106599g;
        String str = ix51Var.f106600a;
        wv51 wv51Var = ix51Var.f106605f;
        sw51 sw51Var = ix51Var.f106604e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, ix51Var.f106601b);
        hrhVarMo35820b.mo44930E(ktz0Var, 2, ix51Var.f106602c);
        ex51 ex51Var = ix51Var.f106603d;
        if (ex51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), ex51Var);
        }
        if (sw51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), sw51Var);
        }
        if (wv51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), wv51Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
