package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bup0 implements xja1 {

    /* JADX INFO: renamed from: a */
    public static final bup0 f31192a = new bup0();

    /* JADX INFO: renamed from: b */
    public static final List f31193b = h6f.m46715L(new wja1("internal/playlist/{playlist_id as Base62}/invite/{permission_token as text}", kaz.f120998Z0), new wja1("new/playlist", a0y.f11202b1), new wja1("playlist-format/{primary_id as text}", tky.f221261b1), new wja1("playlist-format/{primary_id as text}/{secondary_id as text}", uty.f234022Y0), new wja1("playlist-participants/{playlist_id as Base62}", q2z.f184747a1), new wja1("playlist/{playlist_id as Base62}/recommended", r2z.f195280b1), new wja1("playlist-edit/{playlist_id as Base62}", s2z.f205119b1), new wja1("internal/playlist-edit-coverart/{playlist_id as Base62}", t2z.f216662b1), new wja1("internal/playlist-edit-items/{playlist_id as Base62}", y3z.f269027b1), new wja1("internal/playlist-edit-metadata/{playlist_id as Base62}", s2z.f205117a1), new wja1("internal/playlists/edit-privacy", t2z.f216660a1), new wja1("internal/playlists/edit-profile-visibility", y3z.f269025a1), new wja1("playlist-all-songs/{playlist_id as Base62}", r4z.f195895a1), new wja1("internal/playlist-overlap-sheet/{playlist_id as Base62}", j5z.f109156Y0), new wja1("internal/playlist-overlap-messaging", y8z.f270436a1), new wja1("internal/playlist-mixing-reorder-overview/{playlist_id as Base62}", gaz.f78143a1), new wja1("internal/playlist-speedcontrol/{playlist_id as Base62}/{row_id as text}", haz.f89323Y0), new wja1("internal/playlist-speedcontrol-messaging", iaz.f100389Z0), new wja1("internal/playlist-mixing-extended-versions/{playlist_id as Base62}", jaz.f110588Z0), new wja1("internal/playlist-mixing-later-in-playlist/{playlist_id as Base62}", laz.f131461Z0), new wja1("playlist-tuner/{playlist_id as Base62}", maz.f141736Y0), new wja1("internal/playlist/{playlist_id as Base62}/playlist-tuner-edit-menu", cyx.f43389Y0), new wja1("list/{namespace as text}/{list_id as text}", gyx.f85776a1), new wja1("internal/list-creation-menu", wyx.f256388b1), new wja1("internal/playlist-sorting", yyx.f277616Z0), new wja1("cover-art-snake/{playlist_id as Base62}", zyx.f287713b1), new wja1("playlist-history/{playlist_id as Base62}", dzx.f54784a1), new wja1("playlist-history-preview/{playlist_id as Base62}", mzx.f148822a1), new wja1("folder-rename/{folder_uri as text}", zzx.f288141Z0), new wja1("user/{user_name as Username}/folder/{folder_id as text}", b0y.f22142b1), new wja1("id/{account_id as AccountId}/username/{social_handle as text}/folder/{folder_id as text}", m1y.f139151a1), new wja1("add-to-playlist", y4y.f269264a1), new wja1("internal/playlist-editors-picker/{playlist_id as Base62}", fby.f67937a1), new wja1("internal/playlist/{playlist_id as Base62}/video-download-selection", lby.f131768b1), new wja1("user/{user_name as Username}/playlist/{playlist_id as Base62}", qby.f187201a1), new wja1("playlist/{playlist_id as Base62}", wby.f249897a1), new wja1("playlist/{playlist_id as Base62}/play", yby.f271305b1), new wja1("playlist/{playlist_id as Base62}/play/{track_id as Base62}", ddy.f47902a1), new wja1("playlist/{playlist_id as Base62}/play/track/{track_id as Base62}", jey.f111741d1), new wja1("playlist/{playlist_id as Base62}/play/episode/{episode_id as Base62}", ily.f103540a1), new wja1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play", mly.f144966b1), new wja1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/{track_id as Base62}", hsy.f94847b1), new wja1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/track/{track_id as Base62}", isy.f105350a1), new wja1("user/{user_name as Username}/playlist/{playlist_id as Base62}/play/episode/{episode_id as Base62}", jsy.f115620b1));

    /* JADX INFO: renamed from: c */
    public static final List f31194c = h6f.m46715L(oup0.f170333f, ztp0.f286233d, lup0.f137127e, aup0.f19998f, uup0.f234232e, kup0.f126651e, eup0.f63044e, fup0.f73543e, gup0.f84525e, hup0.f95444e, gvp0.f84797d, hvp0.f95763d, dup0.f53252e, sup0.f214173e, tup0.f223904d, rup0.f202887e, wup0.f255246f, xup0.f266153d, pup0.f181515e, qup0.f192758e, yup0.f276431e, zup0.f286496e, xtp0.f265906f, ytp0.f276191d, vup0.f245057d, utp0.f233962e, mup0.f147401e, nup0.f158691e, vtp0.f244745e, nvp0.f158938f, pvp0.f181810g, ttp0.f223657d, jup0.f116134e, fvp0.f73833e, ivp0.f106258f, avp0.f20242e, bvp0.f31412e, dvp0.f53500f, evp0.f63295f, cvp0.f42505f, jvp0.f116441f, lvp0.f137370g, mvp0.f147627g, kvp0.f126919g);

    /* JADX INFO: renamed from: d */
    public static final wg61 f31195d = new wg61(lin0.f133837V0);

    @Override // p204p.xja1
    /* JADX INFO: renamed from: a */
    public final List mo27071a() {
        return f31194c;
    }

    @Override // p204p.xja1
    /* JADX INFO: renamed from: b */
    public final List mo27072b() {
        return f31193b;
    }

    /* JADX INFO: renamed from: c */
    public final he41 m30579c(String str) {
        eka1 eka1Var = (eka1) f31195d.getValue();
        Set set = ff41.f68906e;
        ff41 ff41VarM44796g = gif1.m44796g(str);
        if (ff41VarM44796g == null) {
            return null;
        }
        return eka1Var.m39275a(ff41VarM44796g);
    }
}
