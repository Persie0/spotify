package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n0u0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final n0u0 f149171a;
    private static final ktz0 descriptor;

    static {
        n0u0 n0u0Var = new n0u0();
        f149171a = n0u0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.audiobookpremium.cappingdatasource.models.dto.QuotasViewCopyDto", n0u0Var, 12);
        vwp0Var.m86594k("cappedInstruction", false);
        vwp0Var.m86594k("topUpExpiry", false);
        vwp0Var.m86594k("topUpsCard", true);
        vwp0Var.m86594k("topUpsIntroCard", true);
        vwp0Var.m86594k("paygListeningHoursCard", true);
        vwp0Var.m86594k("paygListeningHoursIntroCard", true);
        vwp0Var.m86594k("subscriptionUsageCard", true);
        vwp0Var.m86594k("subscriptionUsageCardWithCta", true);
        vwp0Var.m86594k("listeningHoursDetailsPageCard", true);
        vwp0Var.m86594k("addonHoursCard", true);
        vwp0Var.m86594k("listeningHoursTitle", true);
        vwp0Var.m86594k("isSubaccountAddOnExpiring", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, s881.f206601a, b981.f24801a, kr51.f125561a, or51.f168472a, lu51.f137004a, ou51.f170175a, hg90.f91093a, le1.f132423a, ql51Var, l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        ne1 ne1Var = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        u881 u881Var = null;
        d981 d981Var = null;
        mr51 mr51Var = null;
        qr51 qr51Var = null;
        nu51 nu51Var = null;
        qu51 qu51Var = null;
        jg90 jg90Var = null;
        String strMo39226f3 = null;
        boolean z = true;
        int i = 0;
        boolean zMo39217M = false;
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
                    u881Var = (u881) frhVarMo29814b.mo39210A(ktz0Var, 2, s881.f206601a, u881Var);
                    i |= 4;
                    break;
                case 3:
                    d981Var = (d981) frhVarMo29814b.mo39210A(ktz0Var, 3, b981.f24801a, d981Var);
                    i |= 8;
                    break;
                case 4:
                    mr51Var = (mr51) frhVarMo29814b.mo39210A(ktz0Var, 4, kr51.f125561a, mr51Var);
                    i |= 16;
                    break;
                case 5:
                    qr51Var = (qr51) frhVarMo29814b.mo39210A(ktz0Var, 5, or51.f168472a, qr51Var);
                    i |= 32;
                    break;
                case 6:
                    nu51Var = (nu51) frhVarMo29814b.mo39210A(ktz0Var, 6, lu51.f137004a, nu51Var);
                    i |= 64;
                    break;
                case 7:
                    qu51Var = (qu51) frhVarMo29814b.mo39210A(ktz0Var, 7, ou51.f170175a, qu51Var);
                    i |= 128;
                    break;
                case 8:
                    jg90Var = (jg90) frhVarMo29814b.mo39210A(ktz0Var, 8, hg90.f91093a, jg90Var);
                    i |= 256;
                    break;
                case 9:
                    ne1Var = (ne1) frhVarMo29814b.mo39210A(ktz0Var, 9, le1.f132423a, ne1Var);
                    i |= 512;
                    break;
                case 10:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new p0u0(i, strMo39226f, strMo39226f2, u881Var, d981Var, mr51Var, qr51Var, nu51Var, qu51Var, jg90Var, ne1Var, strMo39226f3, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        p0u0 p0u0Var = (p0u0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = p0u0Var.f172784a;
        boolean z = p0u0Var.f172795l;
        String str2 = p0u0Var.f172794k;
        ne1 ne1Var = p0u0Var.f172793j;
        jg90 jg90Var = p0u0Var.f172792i;
        qu51 qu51Var = p0u0Var.f172791h;
        nu51 nu51Var = p0u0Var.f172790g;
        qr51 qr51Var = p0u0Var.f172789f;
        mr51 mr51Var = p0u0Var.f172788e;
        d981 d981Var = p0u0Var.f172787d;
        u881 u881Var = p0u0Var.f172786c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, p0u0Var.f172785b);
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(u881Var, new u881())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 2, s881.f206601a, u881Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(d981Var, new d981())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 3, b981.f24801a, d981Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(mr51Var, new mr51())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, kr51.f125561a, mr51Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(qr51Var, new qr51())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 5, or51.f168472a, qr51Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(nu51Var, new nu51())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, lu51.f137004a, nu51Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(qu51Var, new qu51())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 7, ou51.f170175a, qu51Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(jg90Var, new jg90())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 8, hg90.f91093a, jg90Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(ne1Var, new ne1())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 9, le1.f132423a, ne1Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str2, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 10, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 11, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
