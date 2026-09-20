package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class icd1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final icd1 f100805a;
    private static final ktz0 descriptor;

    static {
        icd1 icd1Var = new icd1();
        f100805a = icd1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.prerelease.prerelease.datasource.WatchFeedHeader", icd1Var, 10);
        vwp0Var.m86594k("watch_feed_videos", true);
        vwp0Var.m86594k("album_cover_url", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ALBUM_TITLE, false);
        vwp0Var.m86594k("artist_image_url", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ARTIST_NAME, false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ARTIST_URI, false);
        vwp0Var.m86594k("release_date", false);
        vwp0Var.m86594k("is_presaved", true);
        vwp0Var.m86594k("market_release_date", true);
        vwp0Var.m86594k("artists", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = kcd1.f121446X;
        rr60 rr60VarM39700t = epv0.m39700t((rr60) fr70VarArr[0].getValue());
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, ql51Var, ql51Var, epv0.m39700t(ql51Var), ql51Var, ql51Var, ql51Var, epv0.m39700t(l8a.f130828a), ql51Var, epv0.m39700t((rr60) fr70VarArr[9].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = kcd1.f121446X;
        frhVarMo29814b.getClass();
        List list = null;
        List list2 = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        String strMo39226f3 = null;
        String strMo39226f4 = null;
        String strMo39226f5 = null;
        Boolean bool = null;
        String strMo39226f6 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list2 = (List) frhVarMo29814b.mo39211B(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f5 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) frhVarMo29814b.mo39211B(ktz0Var, 7, l8a.f130828a, bool);
                    i |= 128;
                    break;
                case 8:
                    strMo39226f6 = frhVarMo29814b.mo39226f(ktz0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 9, (rr60) fr70VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new kcd1(i, list2, strMo39226f, strMo39226f2, str, strMo39226f3, strMo39226f4, strMo39226f5, bool, strMo39226f6, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        kcd1 kcd1Var = (kcd1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = kcd1.f121446X;
        List list = kcd1Var.f121447a;
        List list2 = kcd1Var.f121456t;
        String str = kcd1Var.f121455i;
        Boolean bool = kcd1Var.f121454h;
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 1, kcd1Var.f121448b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, kcd1Var.f121449c);
        String str2 = kcd1Var.f121450d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 4, kcd1Var.f121451e);
        hrhVarMo35820b.mo44931G(ktz0Var, 5, kcd1Var.f121452f);
        hrhVarMo35820b.mo44931G(ktz0Var, 6, kcd1Var.f121453g);
        if (!wj50.m88271j(bool, Boolean.FALSE)) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, l8a.f130828a, bool);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(str, "")) {
            hrhVarMo35820b.mo44931G(ktz0Var, 8, str);
        }
        if (list2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, (rr60) fr70VarArr[9].getValue(), list2);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
