package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nt0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final nt0 f157942a;
    private static final ktz0 descriptor;

    static {
        nt0 nt0Var = new nt0();
        f157942a = nt0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.preview.model.AdPreview", nt0Var, 15);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("clickthrough", false);
        vwp0Var.m86594k("tracking_events", true);
        vwp0Var.m86594k("metadata", true);
        vwp0Var.m86594k("cover_art", true);
        vwp0Var.m86594k("audio", true);
        vwp0Var.m86594k("video", true);
        vwp0Var.m86594k("display", true);
        vwp0Var.m86594k("is_dsa_eligible", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ADVERTISER, true);
        vwp0Var.m86594k("creativeId", true);
        vwp0Var.m86594k("manifestId", true);
        vwp0Var.m86594k("productName", true);
        vwp0Var.m86594k("lineItemId", true);
        vwp0Var.m86594k("ctaText", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = bu0.f30961q;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, fr70VarArr[2].getValue(), fr70VarArr[3].getValue(), fr70VarArr[4].getValue(), fr70VarArr[5].getValue(), fr70VarArr[6].getValue(), fr70VarArr[7].getValue(), l8a.f130828a, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = bu0.f30961q;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        String strMo39226f2 = null;
        Map map = null;
        Map map2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        String strMo39226f6 = null;
        String strMo39226f7 = null;
        String strMo39226f8 = null;
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
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) frhVarMo29814b.mo39210A(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list4 = (List) frhVarMo29814b.mo39210A(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    strMo39226f6 = frhVarMo29814b.mo39226f(ktz0Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    strMo39226f7 = frhVarMo29814b.mo39226f(ktz0Var, 13);
                    i |= 8192;
                    break;
                case 14:
                    strMo39226f8 = frhVarMo29814b.mo39226f(ktz0Var, 14);
                    i |= 16384;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new bu0(i, strMo39226f, strMo39226f2, map, map2, list, list2, list3, list4, zMo39217M, strMo39226f3, strMo39226f4, strMo39226f5, strMo39226f6, strMo39226f7, strMo39226f8);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        String str;
        String str2;
        String str3;
        bu0 bu0Var = (bu0) obj;
        String str4 = bu0Var.f30977p;
        String str5 = bu0Var.f30976o;
        String str6 = bu0Var.f30975n;
        String str7 = bu0Var.f30974m;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = bu0.f30961q;
        String str8 = bu0Var.f30962a;
        String str9 = bu0Var.f30973l;
        String str10 = bu0Var.f30972k;
        boolean z = bu0Var.f30970i;
        List list = bu0Var.f30969h;
        List list2 = bu0Var.f30968g;
        List list3 = bu0Var.f30967f;
        List list4 = bu0Var.f30966e;
        Map map = bu0Var.f30964c;
        Map map2 = bu0Var.f30965d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str8);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, bu0Var.f30963b);
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        nau nauVar = nau.f152117a;
        if (zMo48399d0 || !wj50.m88271j(map, nauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), map);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(map2, nauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), map2);
        }
        boolean zMo48399d1 = hrhVarMo35820b.mo48399d0();
        lau lauVar = lau.f131415a;
        if (zMo48399d1 || !wj50.m88271j(list4, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list4);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list3, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list3);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list2, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 8, z);
        }
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44931G(ktz0Var, 9, str10);
        } else {
            String str11 = (String) map2.get(ContextTrack.Metadata.KEY_ADVERTISER);
            if (str11 == null) {
                str11 = "";
            }
            if (!wj50.m88271j(str10, str11)) {
                hrhVarMo35820b.mo44931G(ktz0Var, 9, str10);
            }
        }
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44931G(ktz0Var, 10, str9);
        } else {
            String str12 = (String) map2.get("creative_id");
            if (str12 == null) {
                str12 = "";
            }
            if (!wj50.m88271j(str9, str12)) {
                hrhVarMo35820b.mo44931G(ktz0Var, 10, str9);
            }
        }
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44931G(ktz0Var, 11, str7);
        } else {
            String str13 = (String) map2.get("manifestId");
            if (str13 == null) {
                str13 = "";
            }
            if (!wj50.m88271j(str7, str13)) {
                hrhVarMo35820b.mo44931G(ktz0Var, 11, str7);
            }
        }
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44931G(ktz0Var, 12, str6);
        } else {
            String str14 = (String) map2.get("product_name");
            if (str14 == null) {
                str14 = "";
            }
            if (!wj50.m88271j(str6, str14)) {
                hrhVarMo35820b.mo44931G(ktz0Var, 12, str6);
            }
        }
        if (!hrhVarMo35820b.mo48399d0()) {
            String str15 = (String) map2.get("lineitem_id");
            if (str15 == null) {
                str15 = "";
            }
            str = str5;
            if (!wj50.m88271j(str, str15)) {
            }
            if (hrhVarMo35820b.mo48399d0()) {
                String str16 = (String) map2.get("buttonMessage");
                str2 = str16 != null ? str16 : "";
                str3 = str4;
                if (!wj50.m88271j(str3, str2)) {
                }
                hrhVarMo35820b.mo44937a(ktz0Var);
            }
            str3 = str4;
            hrhVarMo35820b.mo44931G(ktz0Var, 14, str3);
            hrhVarMo35820b.mo44937a(ktz0Var);
        }
        str = str5;
        hrhVarMo35820b.mo44931G(ktz0Var, 13, str);
        if (hrhVarMo35820b.mo48399d0()) {
            String str17 = (String) map2.get("buttonMessage");
            if (str17 != null) {
            }
            str3 = str4;
            if (!wj50.m88271j(str3, str2)) {
            }
            hrhVarMo35820b.mo44937a(ktz0Var);
        }
        str3 = str4;
        hrhVarMo35820b.mo44931G(ktz0Var, 14, str3);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
