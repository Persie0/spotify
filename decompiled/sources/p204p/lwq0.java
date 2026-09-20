package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lwq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lwq0 f137622a;
    private static final ktz0 descriptor;

    static {
        lwq0 lwq0Var = new lwq0();
        f137622a = lwq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.PrereleasePayload", lwq0Var, 13);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ALBUM_URI, true);
        vwp0Var.m86594k("watch_feed_header", true);
        vwp0Var.m86594k("track_list", true);
        vwp0Var.m86594k("watch_feed_carousel", true);
        vwp0Var.m86594k("featuring_items", true);
        vwp0Var.m86594k("copyright", true);
        vwp0Var.m86594k("courtesy_line", true);
        vwp0Var.m86594k("merch_items", true);
        vwp0Var.m86594k("redirect_to_album", true);
        vwp0Var.m86594k("album_type", true);
        vwp0Var.m86594k("listening_party_card", true);
        vwp0Var.m86594k("premium_early_access", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = owq0.f170758L0;
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(icd1.f100805a);
        rr60 rr60VarM39700t3 = epv0.m39700t((rr60) fr70VarArr[3].getValue());
        rr60 rr60VarM39700t4 = epv0.m39700t((rr60) fr70VarArr[4].getValue());
        rr60 rr60VarM39700t5 = epv0.m39700t((rr60) fr70VarArr[5].getValue());
        rr60 rr60VarM39700t6 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t7 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t8 = epv0.m39700t((rr60) fr70VarArr[8].getValue());
        rr60 rr60VarM39700t9 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t10 = epv0.m39700t(ah90.f15644a);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4, rr60VarM39700t5, rr60VarM39700t6, rr60VarM39700t7, rr60VarM39700t8, l8aVar, rr60VarM39700t9, rr60VarM39700t10, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        fr70[] fr70VarArr;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr2 = owq0.f170758L0;
        frhVarMo29814b.getClass();
        List list = null;
        String str = null;
        ch90 ch90Var = null;
        String strMo39226f = null;
        String str2 = null;
        kcd1 kcd1Var = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        boolean z = true;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    fr70VarArr = fr70VarArr2;
                    z = false;
                    break;
                case 0:
                    fr70VarArr = fr70VarArr2;
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    fr70VarArr = fr70VarArr2;
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str2);
                    i |= 2;
                    break;
                case 2:
                    fr70VarArr = fr70VarArr2;
                    kcd1Var = (kcd1) frhVarMo29814b.mo39211B(ktz0Var, 2, icd1.f100805a, kcd1Var);
                    i |= 4;
                    break;
                case 3:
                    fr70VarArr = fr70VarArr2;
                    list2 = (List) frhVarMo29814b.mo39211B(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    fr70VarArr = fr70VarArr2;
                    list3 = (List) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    fr70VarArr = fr70VarArr2;
                    list4 = (List) frhVarMo29814b.mo39211B(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list4);
                    i |= 32;
                    break;
                case 6:
                    fr70VarArr = fr70VarArr2;
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str3);
                    i |= 64;
                    break;
                case 7:
                    fr70VarArr = fr70VarArr2;
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 7, ql51.f189738a, str4);
                    i |= 128;
                    break;
                case 8:
                    fr70VarArr = fr70VarArr2;
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 8, (rr60) fr70VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    fr70VarArr = fr70VarArr2;
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    fr70VarArr = fr70VarArr2;
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 10, ql51.f189738a, str);
                    i |= 1024;
                    break;
                case 11:
                    fr70VarArr = fr70VarArr2;
                    ch90Var = (ch90) frhVarMo29814b.mo39211B(ktz0Var, 11, ah90.f15644a, ch90Var);
                    i |= 2048;
                    break;
                case 12:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 12);
                    i |= 4096;
                    continue;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            fr70VarArr2 = fr70VarArr;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new owq0(i, strMo39226f, str2, kcd1Var, list2, list3, list4, str3, str4, list, zMo39217M, str, ch90Var, zMo39217M2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        owq0 owq0Var = (owq0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = owq0.f170758L0;
        String str = owq0Var.f170762a;
        boolean z = owq0Var.f170761Z;
        boolean z2 = owq0Var.f170771t;
        List list = owq0Var.f170770i;
        List list2 = owq0Var.f170767f;
        List list3 = owq0Var.f170766e;
        List list4 = owq0Var.f170765d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        String str2 = owq0Var.f170763b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        kcd1 kcd1Var = owq0Var.f170764c;
        if (kcd1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, icd1.f100805a, kcd1Var);
        }
        if (list4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list4);
        }
        if (list3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list3);
        }
        if (list2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list2);
        }
        String str3 = owq0Var.f170768g;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str3);
        }
        String str4 = owq0Var.f170769h;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, ql51.f189738a, str4);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, (rr60) fr70VarArr[8].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || z2) {
            hrhVarMo35820b.mo44930E(ktz0Var, 9, z2);
        }
        String str5 = owq0Var.f170759X;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, ql51.f189738a, str5);
        }
        ch90 ch90Var = owq0Var.f170760Y;
        if (ch90Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 11, ah90.f15644a, ch90Var);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 12, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
