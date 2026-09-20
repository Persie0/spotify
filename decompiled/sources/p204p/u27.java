package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u27 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final u27 f226004a;
    private static final ktz0 descriptor;

    static {
        u27 u27Var = new u27();
        f226004a = u27Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.AudioProfile", u27Var, 10);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("bitrate", false);
        vwp0Var.m86594k("codec", false);
        vwp0Var.m86594k("mime_type", false);
        vwp0Var.m86594k("key_id", true);
        vwp0Var.m86594k("file_type", false);
        vwp0Var.m86594k("max_bitrate", false);
        vwp0Var.m86594k("encryption_indices", true);
        vwp0Var.m86594k("language", true);
        vwp0Var.m86594k("original_language", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = w27.f247248k;
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t((rr60) fr70VarArr[7].getValue());
        rr60 rr60VarM39700t3 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(l8a.f130828a);
        e450 e450Var = e450.f55982a;
        return new rr60[]{u2b0.f226058a, e450Var, ql51Var, ql51Var, rr60VarM39700t, ql51Var, e450Var, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = w27.f247248k;
        frhVarMo29814b.getClass();
        List list = null;
        long jMo39227i0 = 0;
        String str = null;
        Boolean bool = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str2 = null;
        String strMo39226f3 = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 8, ql51.f189738a, str);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 9, l8a.f130828a, bool);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w27(i, jMo39227i0, iMo39229o, strMo39226f, strMo39226f2, str2, strMo39226f3, iMo39229o2, list, str, bool);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        w27 w27Var = (w27) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = w27.f247248k;
        long j = w27Var.f247249a;
        Boolean bool = w27Var.f247258j;
        List list = w27Var.f247256h;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, j);
        hrhVarMo35820b.mo44938e(1, w27Var.f247250b, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, w27Var.f247251c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, w27Var.f247252d);
        String str = w27Var.f247253e;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 5, w27Var.f247254f);
        hrhVarMo35820b.mo44938e(6, w27Var.f247255g, ktz0Var);
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list);
        }
        String str2 = w27Var.f247257i;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, ql51.f189738a, str2);
        }
        if (!wj50.m88271j(bool, Boolean.FALSE)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, l8a.f130828a, bool);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
