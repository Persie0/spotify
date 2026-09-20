package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wc41 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wc41 f249953a;
    private static final ktz0 descriptor;

    static {
        wc41 wc41Var = new wc41();
        f249953a = wc41Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.SpotifyJsonManifest", wc41Var, 11);
        vwp0Var.m86594k("contents", false);
        vwp0Var.m86594k("start_time_millis", false);
        vwp0Var.m86594k("end_time_millis", false);
        vwp0Var.m86594k("initialization_template", false);
        vwp0Var.m86594k("segment_template", false);
        vwp0Var.m86594k("base_urls", false);
        vwp0Var.m86594k("subtitle_base_urls", true);
        vwp0Var.m86594k("subtitle_language_codes", true);
        vwp0Var.m86594k("subtitle_template", true);
        vwp0Var.m86594k("seekpanels", true);
        vwp0Var.m86594k("subtitles", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = yc41.f271378m;
        u2b0 u2b0Var = u2b0.f226058a;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{fr70VarArr[0].getValue(), u2b0Var, u2b0Var, ql51Var, ql51Var, fr70VarArr[5].getValue(), epv0.m39700t((rr60) fr70VarArr[6].getValue()), epv0.m39700t((rr60) fr70VarArr[7].getValue()), epv0.m39700t(ql51Var), epv0.m39700t(idz0.f101276a), epv0.m39700t(kx51.f127336a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        fr70[] fr70VarArr;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr2 = yc41.f271378m;
        frhVarMo29814b.getClass();
        List list = null;
        String str = null;
        kdz0 kdz0Var = null;
        List list2 = null;
        mx51 mx51Var = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        long jMo39227i0 = 0;
        long jMo39227i1 = 0;
        int i = 0;
        boolean z = true;
        List list3 = null;
        List list4 = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    fr70VarArr = fr70VarArr2;
                    z = false;
                    break;
                case 0:
                    fr70VarArr = fr70VarArr2;
                    list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    fr70VarArr = fr70VarArr2;
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    fr70VarArr = fr70VarArr2;
                    jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    fr70VarArr = fr70VarArr2;
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    fr70VarArr = fr70VarArr2;
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    fr70VarArr = fr70VarArr2;
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    fr70VarArr = fr70VarArr2;
                    list3 = (List) frhVarMo29814b.mo39211B(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    fr70VarArr = fr70VarArr2;
                    list4 = (List) frhVarMo29814b.mo39211B(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    fr70VarArr = fr70VarArr2;
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 8, ql51.f189738a, str);
                    i |= 256;
                    break;
                case 9:
                    fr70VarArr = fr70VarArr2;
                    kdz0Var = (kdz0) frhVarMo29814b.mo39211B(ktz0Var, 9, idz0.f101276a, kdz0Var);
                    i |= 512;
                    break;
                case 10:
                    fr70VarArr = fr70VarArr2;
                    mx51Var = (mx51) frhVarMo29814b.mo39211B(ktz0Var, 10, kx51.f127336a, mx51Var);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            fr70VarArr2 = fr70VarArr;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yc41(i, list2, jMo39227i0, jMo39227i1, strMo39226f, strMo39226f2, list, list3, list4, str, kdz0Var, mx51Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yc41 yc41Var = (yc41) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = yc41.f271378m;
        rr60 rr60Var = (rr60) fr70VarArr[0].getValue();
        List list = yc41Var.f271379a;
        List list2 = yc41Var.f271386h;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, rr60Var, list);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, yc41Var.f271380b);
        hrhVarMo35820b.mo44942l(ktz0Var, 2, yc41Var.f271381c);
        hrhVarMo35820b.mo44931G(ktz0Var, 3, yc41Var.f271382d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, yc41Var.f271383e);
        hrhVarMo35820b.mo44941k(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), yc41Var.f271384f);
        List list3 = yc41Var.f271385g;
        if (list3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list3);
        }
        if (list2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list2);
        }
        String str = yc41Var.f271387i;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, ql51.f189738a, str);
        }
        kdz0 kdz0Var = yc41Var.f271388j;
        if (kdz0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, idz0.f101276a, kdz0Var);
        }
        mx51 mx51Var = yc41Var.f271389k;
        if (mx51Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, kx51.f127336a, mx51Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
