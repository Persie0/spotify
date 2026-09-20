package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class yqz implements v550 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275339a;

    /* JADX INFO: renamed from: b */
    public final era1 f275340b;

    /* JADX INFO: renamed from: c */
    public final b2s0 f275341c;

    public /* synthetic */ yqz(era1 era1Var, b2s0 b2s0Var, int i) {
        this.f275339a = i;
        this.f275340b = era1Var;
        this.f275341c = b2s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m94398b(yqz yqzVar, String str, String str2, String str3, ibk ibkVar) {
        xqz xqzVar;
        if (ibkVar instanceof xqz) {
            xqzVar = (xqz) ibkVar;
            int i = xqzVar.f265159d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqzVar.f265159d = i - Integer.MIN_VALUE;
            } else {
                xqzVar = new xqz(yqzVar, ibkVar);
            }
        } else {
            xqzVar = new xqz(yqzVar, ibkVar);
        }
        Object objM39772b = xqzVar.f265157b;
        int i2 = xqzVar.f265159d;
        if (i2 == 0) {
            bga.m29073P(objM39772b);
            era1 era1Var = yqzVar.f275340b;
            xqzVar.f265156a = str2;
            xqzVar.f265159d = 1;
            objM39772b = era1Var.m39772b(str, str3, xqzVar);
            yuk yukVar = yuk.f276404a;
            if (objM39772b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = xqzVar.f265156a;
            bga.m29073P(objM39772b);
        }
        String str4 = (String) objM39772b;
        if (str4 == null) {
            return p1j0.f173119a;
        }
        Set set = dd41.f47702f;
        return new r1j0(r46.m74726U("spotify:user:" + str4 + ":folder:" + str2));
    }

    @Override // p204p.v550
    /* JADX INFO: renamed from: a */
    public final void mo27509a(cxe cxeVar) {
        switch (this.f275339a) {
            case 0:
                if (this.f275341c.f22687a.m58268a()) {
                    q350.m72059n(cxeVar, new spr(pvp0.f181810g, 9), "Folder via account ID with social handle", new ju0(this, (fbk) null, 15));
                    break;
                }
                break;
            default:
                gn80 gn80Var = gn80.PROFILE_ARTISTS;
                hkr0 hkr0Var = hkr0.f92495c;
                Class<s0s0> cls = s0s0.class;
                cxeVar.m34278L(gn80Var, "Artist list in the profile feature", yam0.class, new fw7(24, cls, hkr0Var));
                cxeVar.m34280N(gn80.PROFILE_FOLLOWING, "Users following list", xjr0.f262212c);
                cxeVar.m34278L(gn80.PROFILE_BLOCKED_LIST, "Blocked list in the profile feature", yam0.class, new fw7(24, cls, hkr0Var));
                cxeVar.m34278L(gn80.PROFILE_FOLLOWERS, "Followers list in the profile feature", yam0.class, new fw7(24, cls, hkr0Var));
                cxeVar.m34280N(gn80.PROFILE_FRIENDS, "Friends list in the profile feature", fkr0.f70605c);
                cxeVar.m34278L(gn80.PROFILE_PLAYLIST_OVERVIEW, "Public playlist list in the profile feature", yam0.class, new fw7(24, cls, hkr0Var));
                if (this.f275341c.f22687a.m58268a()) {
                    m94399c(cxeVar, kya1.f127772f, "Playlist overview via account ID with social handle", "playlists", false, err0.f62173Q0);
                    m94399c(cxeVar, eya1.f63999f, "Artists via account ID with social handle", "artists", false, err0.f62174R0);
                    m94399c(cxeVar, fya1.f74669f, "Blocked list via account ID with social handle", "blocked", true, err0.f62175S0);
                    m94399c(cxeVar, gya1.f85531f, "Followers via account ID with social handle", "followers", false, err0.f62176T0);
                    m94399c(cxeVar, hya1.f96529f, "Following via account ID with social handle", "following", false, err0.f62177U0);
                    m94399c(cxeVar, iya1.f106916f, "Friends list via account ID with social handle", "friends", true, err0.f62178V0);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m94399c(cxe cxeVar, fka1 fka1Var, String str, String str2, boolean z, gh00 gh00Var) {
        q350.m72059n(cxeVar, new spr(fka1Var, 9), str, new w0s0(gh00Var, this, str2, z, null));
    }
}
