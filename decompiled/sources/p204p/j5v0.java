package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDataSourceErrorEvent;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j5v0 implements w4v0 {

    /* JADX INFO: renamed from: a */
    public final wt80 f109104a;

    /* JADX INFO: renamed from: b */
    public final tw80 f109105b;

    /* JADX INFO: renamed from: c */
    public final vxx f109106c;

    /* JADX INFO: renamed from: d */
    public final yz80 f109107d;

    /* JADX INFO: renamed from: e */
    public final brq f109108e;

    /* JADX INFO: renamed from: f */
    public final luk f109109f;

    /* JADX INFO: renamed from: g */
    public final d5a0 f109110g;

    /* JADX INFO: renamed from: h */
    public final ycm0 f109111h;

    /* JADX INFO: renamed from: i */
    public final bwt0 f109112i;

    /* JADX INFO: renamed from: j */
    public final ay21 f109113j;

    /* JADX INFO: renamed from: k */
    public final abs0 f109114k;

    /* JADX INFO: renamed from: l */
    public final ze90 f109115l;

    /* JADX INFO: renamed from: m */
    public final Flowable f109116m;

    /* JADX INFO: renamed from: n */
    public final am71 f109117n;

    /* JADX INFO: renamed from: o */
    public final String f109118o;

    /* JADX INFO: renamed from: p */
    public final o64 f109119p;

    /* JADX INFO: renamed from: q */
    public final qre0 f109120q;

    /* JADX INFO: renamed from: r */
    public final PlaylistRequestDecorationPolicy f109121r;

    /* JADX INFO: renamed from: s */
    public final PlaylistRequestDecorationPolicy f109122s;

    /* JADX INFO: renamed from: t */
    public final fiz f109123t;

    /* JADX WARN: Multi-variable type inference failed */
    public j5v0(Flowable flowable, wt80 wt80Var, tw80 tw80Var, vxx vxxVar, yz80 yz80Var, brq brqVar, luk lukVar, d5a0 d5a0Var, ycm0 ycm0Var, bwt0 bwt0Var, ay21 ay21Var, abs0 abs0Var, ze90 ze90Var, Flowable flowable2, am71 am71Var, String str, o64 o64Var, qre0 qre0Var) {
        this.f109104a = wt80Var;
        this.f109105b = tw80Var;
        this.f109106c = vxxVar;
        this.f109107d = yz80Var;
        this.f109108e = brqVar;
        this.f109109f = lukVar;
        this.f109110g = d5a0Var;
        this.f109111h = ycm0Var;
        this.f109112i = bwt0Var;
        this.f109113j = ay21Var;
        this.f109114k = abs0Var;
        this.f109115l = ze90Var;
        this.f109116m = flowable2;
        this.f109117n = am71Var;
        this.f109118o = str;
        this.f109119p = o64Var;
        this.f109120q = qre0Var;
        bjp0 bjp0Var = (bjp0) PlaylistDecorationPolicy.m18364g0().toBuilder();
        bjp0Var.m29523i0();
        bjp0Var.m29495G();
        PlaylistDecorationPolicy playlistDecorationPolicy = (PlaylistDecorationPolicy) bjp0Var.build();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        amp0VarM18396H.m26442x();
        vr50 vr50VarM18316q = ItemExtensionPolicy.m18316q();
        hn80 hn80Var = hn80.ARTIST;
        vr50VarM18316q.m86274r(hn80Var);
        ntx ntxVar = ntx.IDENTITY_TRAIT;
        vr50VarM18316q.m86272m(ntxVar);
        AbstractC0269h abstractC0269hBuild = vr50VarM18316q.build();
        vr50 vr50VarM18316q2 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q2.m86274r(hn80Var);
        ntx ntxVar2 = ntx.VISUAL_IDENTITY_TRAIT;
        vr50VarM18316q2.m86272m(ntxVar2);
        AbstractC0269h abstractC0269hBuild2 = vr50VarM18316q2.build();
        vr50 vr50VarM18316q3 = ItemExtensionPolicy.m18316q();
        hn80 hn80Var2 = hn80.SHOW;
        vr50VarM18316q3.m86274r(hn80Var2);
        vr50VarM18316q3.m86272m(ntxVar);
        AbstractC0269h abstractC0269hBuild3 = vr50VarM18316q3.build();
        vr50 vr50VarM18316q4 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q4.m86274r(hn80Var2);
        vr50VarM18316q4.m86272m(ntxVar2);
        AbstractC0269h abstractC0269hBuild4 = vr50VarM18316q4.build();
        vr50 vr50VarM18316q5 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q5.m86274r(hn80.EPISODE);
        vr50VarM18316q5.m86272m(ntxVar2);
        AbstractC0269h abstractC0269hBuild5 = vr50VarM18316q5.build();
        vr50 vr50VarM18316q6 = ItemExtensionPolicy.m18316q();
        hn80 hn80Var3 = hn80.ALBUM;
        vr50VarM18316q6.m86274r(hn80Var3);
        vr50VarM18316q6.m86272m(ntxVar);
        AbstractC0269h abstractC0269hBuild6 = vr50VarM18316q6.build();
        vr50 vr50VarM18316q7 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q7.m86274r(hn80Var3);
        vr50VarM18316q7.m86272m(ntxVar2);
        vr50 vr50VarM18316q8 = ItemExtensionPolicy.m18316q();
        hn80 hn80Var4 = hn80.KALLAX;
        vr50VarM18316q8.m86274r(hn80Var4);
        vr50VarM18316q8.m86272m(ntxVar);
        vr50 vr50VarM18316q9 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q9.m86274r(hn80Var4);
        vr50VarM18316q9.m86272m(ntxVar2);
        vr50 vr50VarM18316q10 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q10.m86274r(hn80.TRACK);
        vr50VarM18316q10.m86272m(ntxVar2);
        vr50 vr50VarM18316q11 = ItemExtensionPolicy.m18316q();
        hn80 hn80Var5 = hn80.LISTENING_STATS;
        vr50VarM18316q11.m86274r(hn80Var5);
        vr50VarM18316q11.m86272m(ntxVar);
        vr50 vr50VarM18316q12 = ItemExtensionPolicy.m18316q();
        vr50VarM18316q12.m86274r(hn80Var5);
        vr50VarM18316q12.m86272m(ntxVar2);
        amp0VarM18396H.m26434m(hg40.m47412x(abstractC0269hBuild, abstractC0269hBuild2, abstractC0269hBuild3, abstractC0269hBuild4, abstractC0269hBuild5, abstractC0269hBuild6, vr50VarM18316q7.build(), vr50VarM18316q8.build(), vr50VarM18316q9.build(), vr50VarM18316q10.build(), vr50VarM18316q11.build(), vr50VarM18316q12.build()));
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) amp0VarM18396H.build();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57354v(true);
        ktp0VarM18427E.m57348m();
        ktp0VarM18427E.m57344B();
        ktp0VarM18427E.m57347E((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true).setIsExplicit(true).setIs19PlusOnly(true).build());
        oep0 oep0VarM18329q = PlaylistAlbumDecorationPolicy.m18329q();
        oep0VarM18329q.m66800m(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
        ktp0VarM18427E.m57350r((PlaylistAlbumDecorationPolicy) oep0VarM18329q.build());
        ktp0VarM18427E.m57352t(ArtistDecorationPolicy.newBuilder().setName(true));
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) ktp0VarM18427E.build();
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72947y();
        qjp0VarM18379C.m72938m();
        qjp0VarM18379C.m72942t((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).setIsExplicit(true).setIsBookChapter(true).setPublishDate(true).setDescription(true).setIs19PlusOnly(true).build());
        qjp0VarM18379C.m72946x((EpisodePlayedStateDecorationPolicy) EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true).build());
        qjp0VarM18379C.m72935A((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).setDescription(true).setIsBook(true).build());
        qjp0VarM18379C.m72943u();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) qjp0VarM18379C.build();
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        top0VarM18421v.m81215w(playlistDecorationPolicy);
        top0VarM18421v.m81213u(playlistItemDecorationPolicy);
        top0VarM18421v.m81217y(playlistTrackDecorationPolicy);
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        this.f109121r = playlistRequestDecorationPolicy;
        top0 top0Var = (top0) playlistRequestDecorationPolicy.toBuilder();
        top0Var.m81211s(playlistEpisodeDecorationPolicy);
        this.f109122s = (PlaylistRequestDecorationPolicy) top0Var.build();
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f109123t = mvl0.m62953p(new qux(new onc(flowable), 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m52476a(j5v0 j5v0Var, qu80 qu80Var, a8v0 a8v0Var, ibk ibkVar) {
        c5v0 c5v0Var;
        j5v0 j5v0Var2;
        a8v0 a8v0Var2;
        o64 o64Var = j5v0Var.f109119p;
        if (ibkVar instanceof c5v0) {
            c5v0Var = (c5v0) ibkVar;
            int i = c5v0Var.f34297e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5v0Var.f34297e = i - Integer.MIN_VALUE;
            } else {
                c5v0Var = new c5v0(j5v0Var, ibkVar);
            }
        } else {
            c5v0Var = new c5v0(j5v0Var, ibkVar);
        }
        Object objM86696x = c5v0Var.f34295c;
        int i2 = c5v0Var.f34297e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM86696x);
            List list = qu80Var.f192598d;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((nw80) it.next()).f159049c);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                Set set = dd41.f47702f;
                he41 he41Var = r46.m74726U((String) obj).f47710d;
                if (wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e)) {
                    arrayList2.add(obj);
                }
            }
            vxx vxxVar = j5v0Var.f109106c;
            boolean zM66327e = o64Var.m66327e();
            long jM66325c = o64Var.m66325c();
            c5v0Var.f34293a = a8v0Var;
            c5v0Var.f34294b = j5v0Var;
            c5v0Var.f34297e = 1;
            objM86696x = vxxVar.m86696x(arrayList2, a8v0Var, zM66327e, jM66325c);
            Object obj2 = yuk.f276404a;
            if (objM86696x == obj2) {
                return obj2;
            }
            j5v0Var2 = j5v0Var;
            a8v0Var2 = a8v0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5v0Var2 = c5v0Var.f34294b;
            a8v0Var2 = c5v0Var.f34293a;
            bga.m29073P(objM86696x);
        }
        return twg1.m81732A(mvl0.m62953p(oyf1.m68486s(m52480f(j5v0Var2, (fiz) objM86696x), new wg4(j5v0Var, fbkVar, 8))), new lvm0(a8v0Var2, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m52477b(j5v0 j5v0Var, List list, a8v0 a8v0Var, ibk ibkVar) {
        g5v0 g5v0Var;
        if (ibkVar instanceof g5v0) {
            g5v0Var = (g5v0) ibkVar;
            int i = g5v0Var.f76777e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g5v0Var.f76777e = i - Integer.MIN_VALUE;
            } else {
                g5v0Var = new g5v0(j5v0Var, ibkVar);
            }
        } else {
            g5v0Var = new g5v0(j5v0Var, ibkVar);
        }
        Object objM93365n = g5v0Var.f76775c;
        int i2 = g5v0Var.f76777e;
        if (i2 == 0) {
            ArrayList arrayListM93485o = yds.m93485o(objM93365n);
            for (Object obj : list) {
                Set set = dd41.f47702f;
                gn80 gn80Var = r46.m74726U(((nw80) obj).f159049c).f47709c;
                if (gn80Var == gn80.SHOW_SHOW || gn80Var == gn80.SHOW_EPISODE) {
                    arrayListM93485o.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM93485o, 10));
            Iterator it = arrayListM93485o.iterator();
            while (it.hasNext()) {
                arrayList.add(((nw80) it.next()).f159049c);
            }
            Set setM43736n1 = g6f.m43736n1(arrayList);
            ycm0 ycm0Var = j5v0Var.f109111h;
            boolean zM66327e = j5v0Var.f109119p.m66327e();
            g5v0Var.f76773a = a8v0Var;
            g5v0Var.f76774b = j5v0Var;
            g5v0Var.f76777e = 1;
            objM93365n = ycm0Var.m93365n(setM43736n1, a8v0Var, zM66327e);
            Object obj2 = yuk.f276404a;
            if (objM93365n == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5v0Var = g5v0Var.f76774b;
            a8v0Var = g5v0Var.f76773a;
            bga.m29073P(objM93365n);
        }
        return twg1.m81732A(mvl0.m62953p(oyf1.m68486s(m52480f(j5v0Var, (fiz) objM93365n), new far0(4))), new lvm0(a8v0Var, 8));
    }

    /* JADX INFO: renamed from: c */
    public static final void m52478c(j5v0 j5v0Var, String str) {
        j5v0Var.getClass();
        Logger.m3966b(str, new Object[0]);
        qre0 qre0Var = j5v0Var.f109120q;
        x4v0 x4v0VarM20344p = RecentsDataSourceErrorEvent.m20344p();
        x4v0VarM20344p.m89908m(str);
        x4v0VarM20344p.m89909q(j5v0Var.f109118o);
        qre0Var.m73616a(x4v0VarM20344p.build());
    }

    /* JADX INFO: renamed from: d */
    public static st80 m52479d(t8v0 t8v0Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        List list = t8v0Var.f218140b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("group_id_" + ((String) it.next()));
        }
        if (t8v0Var.f218144f) {
            arrayList = g6f.m43700N0(arrayList, geg1.m44518y("group_id_0"));
        }
        ArrayList arrayList2 = new ArrayList(t8v0Var.f218143e ? lau.f131415a : geg1.m44518y(arrayList));
        pxj pxjVar = t8v0Var.f218141c;
        if (pxjVar != null) {
            arrayList2.add(geg1.m44518y("content_type_".concat(pxjVar.name().toLowerCase(Locale.ROOT))));
        }
        s4v0 s4v0Var = t8v0Var.f218142d;
        if (s4v0Var != null) {
            arrayList2.add(geg1.m44518y("recent_type_".concat(s4v0Var.name().toLowerCase(Locale.ROOT))));
        }
        return new st80(playlistRequestDecorationPolicy, null, Collections.singleton(new dt80(arrayList2)), false, pt80.f181071a, new b5u0(0, t8v0Var.f218139a + 1), null, 0, null, 458);
    }

    /* JADX INFO: renamed from: f */
    public static fiz m52480f(j5v0 j5v0Var, fiz fizVar) {
        return !j5v0Var.f109119p.m66323a() ? fizVar : b0g1.m27776L(fizVar, new a7s0(new t2b0(2000L, 5000L), (fbk) null, 12));
    }

    /* JADX INFO: renamed from: h */
    public static s4v0 m52481h(a2v0 a2v0Var) {
        int iOrdinal = a2v0Var.ordinal();
        if (iOrdinal == 1) {
            return s4v0.SAVED;
        }
        if (iOrdinal == 2) {
            return s4v0.PLAYED;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return s4v0.AUTO_GENERATED;
    }

    /* JADX INFO: renamed from: e */
    public final tjz m52482e(t8v0 t8v0Var) {
        a8v0 a8v0Var = new a8v0(this.f109117n, t8v0Var.f218139a);
        st80 st80VarM52479d = m52479d(t8v0Var, this.f109122s);
        pxj pxjVar = t8v0Var.f218141c;
        mu80 mu80Var = (mu80) this.f109104a;
        String str = this.f109118o;
        fbk fbkVar = null;
        nnc nncVarM92074U = xtm0.m92074U(xtm0.m92093n(mu80Var.m62846k(str, st80VarM52479d), new rgp0(a8v0Var, this, fbkVar, 15)), new b5v0(null, this, a8v0Var, pxjVar));
        luk lukVar = this.f109109f;
        fiz fizVarM34374j = cyf1.m34374j(nncVarM92074U, lukVar);
        if (!t8v0Var.f218145g) {
            fizVarM34374j = nxf1.m65833l(new nxs0(ryf1.m76722t(cyf1.m34374j(xtm0.m92074U(xtm0.m92093n(ryf1.m76722t(mu80Var.m62846k(str, m52479d(t8v0Var, this.f109121r)), 1), new rgp0(a8v0Var, this, fbkVar, 15)), new b5v0(null, this, a8v0Var, pxjVar)), lukVar), 1), fizVarM34374j, fbkVar, 9));
        }
        return kyf1.m57708m(b0g1.m27776L(fizVarM34374j, new h5v0(a8v0Var, fbkVar, 0)), new utt(a8v0Var, this, null));
    }

    /* JADX INFO: renamed from: g */
    public final yab m52483g() {
        String strM30326a = this.f109108e.m30326a();
        fbk fbkVar = null;
        vjf1.m85770t(xsr.f265652b, new l7t0(this, strM30326a, fbkVar, 26)).doOnError(new kwr0(3, this, strM30326a)).onErrorComplete().subscribe();
        return k0e1.m54985d(vjf1.m85770t(dau.f47107a, new cj40(this, fbkVar, 22)).map(new tpn0(this, 26)).toObservable());
    }
}
