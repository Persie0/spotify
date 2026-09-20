package p204p;

import android.os.Bundle;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.AvailableConcepts;
import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemCurationStatePolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class tq80 implements kq80 {

    /* JADX INFO: renamed from: a */
    public final zxx0 f222750a;

    /* JADX INFO: renamed from: b */
    public final String f222751b;

    /* JADX INFO: renamed from: c */
    public final wt80 f222752c;

    /* JADX INFO: renamed from: d */
    public final ub80 f222753d;

    /* JADX INFO: renamed from: e */
    public final otx f222754e;

    /* JADX INFO: renamed from: f */
    public final rvp0 f222755f;

    /* JADX INFO: renamed from: g */
    public final lqi0 f222756g;

    /* JADX INFO: renamed from: h */
    public final u490 f222757h;

    /* JADX INFO: renamed from: i */
    public final d670 f222758i;

    /* JADX INFO: renamed from: j */
    public final Bundle f222759j;

    /* JADX INFO: renamed from: k */
    public final boolean f222760k;

    /* JADX INFO: renamed from: l */
    public final jq80 f222761l;

    /* JADX INFO: renamed from: m */
    public final fjo f222762m;

    /* JADX INFO: renamed from: n */
    public final qt80 f222763n;

    /* JADX INFO: renamed from: o */
    public final PlaylistTrackDecorationPolicy f222764o;

    /* JADX INFO: renamed from: p */
    public final PlaylistEpisodeDecorationPolicy f222765p;

    /* JADX INFO: renamed from: q */
    public final PlaylistRequestDecorationPolicy f222766q;

    /* JADX INFO: renamed from: r */
    public final PlaylistRequestDecorationPolicy f222767r;

    /* JADX INFO: renamed from: s */
    public final PlaylistRequestDecorationPolicy f222768s;

    /* JADX INFO: renamed from: t */
    public boolean f222769t;

    /* JADX INFO: renamed from: u */
    public nuu0 f222770u;

    /* JADX INFO: renamed from: v */
    public nuu0 f222771v;

    /* JADX INFO: renamed from: w */
    public nuu0 f222772w;

    /* JADX INFO: renamed from: x */
    public final fiz f222773x;

    /* JADX INFO: renamed from: y */
    public final qu80 f222774y;

    public tq80(zxx0 zxx0Var, String str, wt80 wt80Var, ub80 ub80Var, otx otxVar, rvp0 rvp0Var, lqi0 lqi0Var, u490 u490Var, d670 d670Var, Bundle bundle, boolean z, jq80 jq80Var, fjo fjoVar, qt80 qt80Var) {
        hn80 hn80Var;
        this.f222750a = zxx0Var;
        this.f222751b = str;
        this.f222752c = wt80Var;
        this.f222753d = ub80Var;
        this.f222754e = otxVar;
        this.f222755f = rvp0Var;
        this.f222756g = lqi0Var;
        this.f222757h = u490Var;
        this.f222758i = d670Var;
        this.f222759j = bundle;
        this.f222760k = z;
        this.f222761l = jq80Var;
        this.f222762m = fjoVar;
        this.f222763n = qt80Var;
        qoa1 qoa1VarM18451u = UserDecorationPolicy.m18451u();
        qoa1VarM18451u.m73381s();
        qoa1VarM18451u.m73380r();
        qoa1VarM18451u.m73378m();
        qoa1VarM18451u.m73379q();
        qoa1VarM18451u.m73383u();
        qoa1VarM18451u.m73382t();
        UserDecorationPolicy userDecorationPolicy = (UserDecorationPolicy) qoa1VarM18451u.build();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57356x();
        ktp0VarM18427E.m57357y();
        ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setPlayable(true).setPreviewId(true).setIs19PlusOnly(true).setIsPremiumOnly(true));
        oep0 oep0VarM18329q = PlaylistAlbumDecorationPolicy.m18329q();
        oep0VarM18329q.m66800m(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
        ktp0VarM18427E.m57351s(oep0VarM18329q);
        ktp0VarM18427E.m57352t(ArtistDecorationPolicy.newBuilder().setName(true));
        this.f222764o = (PlaylistTrackDecorationPolicy) ktp0VarM18427E.build();
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72944v();
        qjp0VarM18379C.m72945w(EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true).setTimeLeft(true).setIsPlayed(true).setPlayabilityRestriction(true));
        qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setCovers(true).setLength(true).setPreviewId(true).setPublishDate(true).setDescription(true).setIs19PlusOnly(true).setMediaTypeEnum(true).setIsMusicAndTalk(true));
        qjp0VarM18379C.m72948z(ShowDecorationPolicy.newBuilder().setName(true).setCovers(true).setPublisher(true));
        this.f222765p = (PlaylistEpisodeDecorationPolicy) qjp0VarM18379C.build();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        amp0VarM18396H.m26430A();
        amp0VarM18396H.m26436r();
        amp0VarM18396H.m26432C();
        amp0VarM18396H.m26431B();
        amp0VarM18396H.m26440v();
        amp0VarM18396H.m26437s(userDecorationPolicy);
        ju50 ju50VarM18321r = ItemMetadataPolicy.m18321r();
        ju50VarM18321r.m54329r(true);
        ju50VarM18321r.m54328q(true);
        amp0VarM18396H.m26441w(ju50VarM18321r);
        amp0VarM18396H.m26442x();
        sr50 sr50VarM18312q = ItemCurationStatePolicy.m18312q();
        sr50VarM18312q.m79020m(true);
        amp0VarM18396H.m26439u(sr50VarM18312q);
        ku50 ku50VarM18326r = ItemOfflineStateDecorationPolicy.m18326r();
        ku50VarM18326r.m57377q(true);
        ku50VarM18326r.m57378r(true);
        amp0VarM18396H.m26444z(ku50VarM18326r);
        List<hu50> listM43728j1 = g6f.m43728j1(jq80Var.f114845a);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM43728j1, 10));
        for (hu50 hu50Var : listM43728j1) {
            vr50 vr50VarM18316q = ItemExtensionPolicy.m18316q();
            switch (edb.m38547C(hu50Var.f95288a)) {
                case 0:
                    hn80Var = hn80.CLIP;
                    break;
                case 1:
                    hn80Var = hn80.SHOW;
                    break;
                case 2:
                    hn80Var = hn80.ALBUM;
                    break;
                case 3:
                    hn80Var = hn80.TRACK;
                    break;
                case 4:
                    hn80Var = hn80.ARTIST;
                    break;
                case 5:
                    hn80Var = hn80.EPISODE;
                    break;
                case 6:
                    hn80Var = hn80.PODCAST_CHAPTER;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            vr50VarM18316q.m86274r(hn80Var);
            vr50VarM18316q.m86273q(((Number) g6f.m43741q0(this.f222754e.m68068a(Collections.singleton(hu50Var.f95289b)))).intValue());
            arrayList.add((ItemExtensionPolicy) vr50VarM18316q.build());
        }
        amp0VarM18396H.m26434m(arrayList);
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        top0VarM18421v.m81214v(amp0VarM18396H);
        top0VarM18421v.m81217y(this.f222764o);
        top0VarM18421v.m81211s(this.f222765p);
        this.f222766q = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        top0 top0VarM18421v2 = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29502N();
        top0VarM18421v2.m81216x(bjp0VarM18365h0);
        ktp0 ktp0VarM18427E2 = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E2.m57356x();
        ktp0VarM18427E2.m57352t(ArtistDecorationPolicy.newBuilder().setName(true));
        top0VarM18421v2.m81218z(ktp0VarM18427E2);
        qjp0 qjp0VarM18379C2 = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C2.m72941s(EpisodeDecorationPolicy.newBuilder().setMediaTypeEnum(true));
        qjp0VarM18379C2.m72948z(ShowDecorationPolicy.newBuilder().setName(true));
        top0VarM18421v2.m81212t(qjp0VarM18379C2);
        amp0 amp0VarM18396H2 = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H2.m26433D(true);
        amp0VarM18396H2.m26430A();
        sr50 sr50VarM18312q2 = ItemCurationStatePolicy.m18312q();
        sr50VarM18312q2.m79020m(true);
        amp0VarM18396H2.m26439u(sr50VarM18312q2);
        ju50 ju50VarM18321r2 = ItemMetadataPolicy.m18321r();
        ju50VarM18321r2.m54329r(true);
        amp0VarM18396H2.m26441w(ju50VarM18321r2);
        top0VarM18421v2.m81214v(amp0VarM18396H2);
        this.f222767r = (PlaylistRequestDecorationPolicy) top0VarM18421v2.build();
        top0 top0VarM18421v3 = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h1 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h1.m29502N();
        bjp0VarM18365h1.m29506R();
        bjp0VarM18365h1.m29501M();
        bjp0VarM18365h1.m29503O();
        bjp0VarM18365h1.m29508T();
        bjp0VarM18365h1.m29514Z();
        bjp0VarM18365h1.m29493E();
        bjp0VarM18365h1.m29516b0();
        bjp0VarM18365h1.m29492D();
        bjp0VarM18365h1.m29489A();
        bjp0VarM18365h1.m29517c0();
        bjp0VarM18365h1.m29494F();
        bjp0VarM18365h1.m29491C();
        bjp0VarM18365h1.m29511W();
        bjp0VarM18365h1.m29522h0();
        bjp0VarM18365h1.m29525k0();
        bjp0VarM18365h1.m29520f0();
        bjp0VarM18365h1.m29496H();
        bjp0VarM18365h1.m29531u();
        bjp0VarM18365h1.m29523i0();
        bjp0VarM18365h1.m29490B();
        bjp0VarM18365h1.m29530t();
        bjp0VarM18365h1.m29524j0();
        bjp0VarM18365h1.m29498J();
        bjp0VarM18365h1.m29497I();
        bjp0VarM18365h1.m29536z();
        bjp0VarM18365h1.m29495G();
        bjp0VarM18365h1.m29519e0();
        bjp0VarM18365h1.m29521g0();
        bjp0VarM18365h1.m29510V();
        bjp0VarM18365h1.m29509U();
        bjp0VarM18365h1.m29528r();
        bjp0VarM18365h1.m29507S();
        bjp0VarM18365h1.m29532v();
        bjp0VarM18365h1.m29500L();
        qoa1 qoa1VarM18451u2 = UserDecorationPolicy.m18451u();
        qoa1VarM18451u2.m73381s();
        qoa1VarM18451u2.m73380r();
        qoa1VarM18451u2.m73378m();
        qoa1VarM18451u2.m73379q();
        qoa1VarM18451u2.m73383u();
        qoa1VarM18451u2.m73382t();
        bjp0VarM18365h1.m29513Y(qoa1VarM18451u2);
        if (this.f222762m.f70322a.f60259f != null) {
            p78 p78VarM18294q = AvailableConcepts.m18294q();
            p78VarM18294q.m69251q();
            p78VarM18294q.m69250m(0.7f);
            bjp0VarM18365h1.m29529s((AvailableConcepts) p78VarM18294q.build());
        }
        qoa1 qoa1VarM18451u3 = UserDecorationPolicy.m18451u();
        qoa1VarM18451u3.m73381s();
        qoa1VarM18451u3.m73383u();
        bjp0VarM18365h1.m29505Q(qoa1VarM18451u3);
        rxe rxeVarM18300s = CollaboratingUsersDecorationPolicy.m18300s();
        rxeVarM18300s.m76614q();
        rxeVarM18300s.m76615r(0);
        bjp0VarM18365h1.m29534x(rxeVarM18300s);
        Set set = this.f222761l.f114846b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(((omv) it.next()).f167099a);
        }
        bjp0VarM18365h1.m29526m(this.f222754e.m68068a(g6f.m43736n1(arrayList2)));
        top0VarM18421v3.m81216x(bjp0VarM18365h1);
        this.f222768s = (PlaylistRequestDecorationPolicy) top0VarM18421v3.build();
        this.f222773x = this.f222762m.f70324c ? this.f222757h.m82318c(this.f222751b) : new ysk(null, 27);
        this.f222774y = new qu80(0, 0, false, (List) null, new ybv(this.f222751b, -2), 0L, (Integer) null, false, (Map) null, 0L, (List) null, 0, 8175);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m81303a(tq80 tq80Var, j2x0 j2x0Var) {
        return (j2x0Var instanceof g2x0) || (j2x0Var instanceof c2x0) || (j2x0Var instanceof h2x0);
    }

    /* JADX INFO: renamed from: b */
    public final xv41 m81304b() {
        if (this.f222771v == null) {
            fbk fbkVar = null;
            this.f222771v = m81308f(xtm0.m92074U(new zux(this.f222758i.m35097u(this.f222751b), this.f222773x, new qq80(3, 0, fbkVar), 1), new lq80(fbkVar, this, 5)));
        }
        nuu0 nuu0Var = this.f222771v;
        wj50.m88279p(nuu0Var);
        return nuu0Var;
    }

    /* JADX INFO: renamed from: c */
    public final kmx m81305c() {
        if (this.f222772w == null) {
            this.f222772w = m81308f(xtm0.m92074U(new kmx(m81304b(), 8), new rq80(this.f222762m.f70327f, 0, this, null)));
        }
        nuu0 nuu0Var = this.f222772w;
        wj50.m88279p(nuu0Var);
        return new kmx(nuu0Var, 8);
    }

    /* JADX INFO: renamed from: d */
    public final kmx m81306d() {
        if (this.f222770u == null) {
            this.f222770u = m81308f(xtm0.m92074U(new kmx(m81304b(), 8), new lq80(null, this, 4)));
        }
        nuu0 nuu0Var = this.f222770u;
        wj50.m88279p(nuu0Var);
        return new kmx(nuu0Var, 8);
    }

    /* JADX INFO: renamed from: e */
    public final Observable m81307e() {
        return k0e1.m54988g(m81306d(), dau.f47107a);
    }

    /* JADX INFO: renamed from: f */
    public final nuu0 m81308f(nnc nncVar) {
        return bzf1.m31029u(nncVar, this.f222753d, new cs41(100L, 3000L), null);
    }
}
