package p204p;

import android.os.Bundle;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.music.R;
import com.spotify.pam.p118v2.GetInviteMembersViewRequest;
import com.spotify.party.mobile.p121v2.GetListeningPartyMarketingCardsRequest;
import com.spotify.party.mobile.p121v2.GetListeningPartyMarketingCardsResponse;
import com.spotify.party.mobile.p121v2.ListeningPartyMarketingCard;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionEpisode;

/* JADX INFO: loaded from: classes8.dex */
public final class ia70 implements Function, vr51, ry71, InterfaceC2207oa, ezy, Predicate, BiFunction, lh41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100165a;

    /* JADX INFO: renamed from: b */
    public final Object f100166b;

    /* JADX INFO: renamed from: c */
    public final Object f100167c;

    public /* synthetic */ ia70(int i, Object obj, Object obj2) {
        this.f100165a = i;
        this.f100166b = obj;
        this.f100167c = obj2;
    }

    /* JADX INFO: renamed from: q */
    public static Object m50032q(u7x0 u7x0Var, z7r z7rVar, String str, String str2, String str3, ibk ibkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
        hqbVar.m48222q();
        p7x0 p7x0VarMo27151a = u7x0Var.mo27151a(uh1.f230327q, new wh1(hqbVar, 21));
        if (hqbVar.isActive()) {
            p7x0VarMo27151a.mo25060a(new y7r(z7rVar, str != null ? new o86(str, null, null) : null, str2, str3), null);
        }
        return hqbVar.m48221p();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r0 == r15) goto L45;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m50033a(u7x0 u7x0Var, String str, String str2, String str3, ibk ibkVar) {
        yga0 yga0Var;
        u7x0 u7x0Var2;
        String str4;
        String str5;
        String str6;
        hga0 hga0Var;
        u7x0 u7x0Var3;
        c8r c8rVar;
        Object objM50040l;
        ia70 ia70Var = this;
        bga0 bga0Var = (bga0) ia70Var.f100166b;
        if (ibkVar instanceof yga0) {
            yga0Var = (yga0) ibkVar;
            int i = yga0Var.f272530g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yga0Var.f272530g = i - Integer.MIN_VALUE;
            } else {
                yga0Var = new yga0(ia70Var, ibkVar);
            }
        } else {
            yga0Var = new yga0(ia70Var, ibkVar);
        }
        yga0 yga0Var2 = yga0Var;
        Object objM29105a = yga0Var2.f272528e;
        int i2 = yga0Var2.f272530g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM29105a);
            yga0Var2.f272524a = u7x0Var;
            yga0Var2.f272525b = str;
            yga0Var2.f272526c = str2;
            yga0Var2.f272527d = str3;
            yga0Var2.f272530g = 1;
            objM29105a = bga0Var.m29105a("bluejay_onboarding", new nm0((c8r) null, ia70Var, u7x0Var, str, str2, str3, (fbk) null), yga0Var2);
            if (objM29105a != yukVar) {
                u7x0Var2 = u7x0Var;
                str4 = str;
                str5 = str2;
                str6 = str3;
            }
            return yukVar;
        }
        if (i2 == 1) {
            String str7 = yga0Var2.f272527d;
            String str8 = yga0Var2.f272526c;
            str4 = yga0Var2.f272525b;
            u7x0 u7x0Var4 = yga0Var2.f272524a;
            bga.m29073P(objM29105a);
            str6 = str7;
            u7x0Var2 = u7x0Var4;
            str5 = str8;
        } else {
            if (i2 == 2) {
                String str9 = yga0Var2.f272527d;
                String str10 = yga0Var2.f272526c;
                str4 = yga0Var2.f272525b;
                u7x0 u7x0Var5 = yga0Var2.f272524a;
                bga.m29073P(objM29105a);
                str5 = str10;
                u7x0Var3 = u7x0Var5;
                str6 = str9;
                c8rVar = (c8r) objM29105a;
                if (c8rVar != c8r.f35305a) {
                    yga0Var2.f272524a = null;
                    yga0Var2.f272525b = null;
                    yga0Var2.f272526c = null;
                    yga0Var2.f272527d = null;
                    yga0Var2.f272530g = 3;
                    ia70Var = this;
                    objM29105a = bga0Var.m29105a("bluejay_onboarding", new nm0(c8rVar, ia70Var, u7x0Var3, str4, str5, str6, (fbk) null), yga0Var2);
                }
                return null;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM29105a);
                return objM29105a;
            }
            bga.m29073P(objM29105a);
        }
        hga0Var = (hga0) objM29105a;
        if (wj50.m88271j(hga0Var, fga0.f69262a)) {
            yga0Var2.f272524a = null;
            yga0Var2.f272525b = null;
            yga0Var2.f272526c = null;
            yga0Var2.f272527d = null;
            yga0Var2.f272530g = 4;
            objM50040l = ia70Var.m50040l(yga0Var2);
            if (objM50040l == yukVar) {
                return yukVar;
            }
            return objM50040l;
        }
        return null;
        hga0Var = (hga0) objM29105a;
        if (wj50.m88271j(hga0Var, dga0.f48762a)) {
            yga0Var2.f272524a = u7x0Var2;
            yga0Var2.f272525b = str4;
            yga0Var2.f272526c = str5;
            yga0Var2.f272527d = str6;
            yga0Var2.f272530g = 2;
            objM29105a = m50032q(u7x0Var2, z7r.f280273b, str4, str5, str6, yga0Var2);
            if (objM29105a != yukVar) {
                u7x0Var3 = u7x0Var2;
                c8rVar = (c8r) objM29105a;
                if (c8rVar != c8r.f35305a) {
                    yga0Var2.f272524a = null;
                    yga0Var2.f272525b = null;
                    yga0Var2.f272526c = null;
                    yga0Var2.f272527d = null;
                    yga0Var2.f272530g = 3;
                    ia70Var = this;
                    objM29105a = bga0Var.m29105a("bluejay_onboarding", new nm0(c8rVar, ia70Var, u7x0Var3, str4, str5, str6, (fbk) null), yga0Var2);
                }
                return null;
            }
            return yukVar;
        }
        ia70Var = this;
        if (wj50.m88271j(hga0Var, fga0.f69262a)) {
            yga0Var2.f272524a = null;
            yga0Var2.f272525b = null;
            yga0Var2.f272526c = null;
            yga0Var2.f272527d = null;
            yga0Var2.f272530g = 4;
            objM50040l = ia70Var.m50040l(yga0Var2);
            if (objM50040l == yukVar) {
                return yukVar;
            }
            return objM50040l;
        }
        return null;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        if (((be4) this.f100167c).m28871c()) {
            if (ihiVar.f102296c == u300.LIKED_SONGS) {
                return true;
            }
            mi80 mi80Var = (mi80) this.f100166b;
            String str = ihiVar.f102294a;
            mi80Var.getClass();
            if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
                return true;
            }
            if (bm51.m29803n0(str, "spotify:user:", false) && bm51.m29796g0(str, ":collection", false)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        gnm0 gnm0VarM45308e;
        int i = this.f100165a;
        boolean z = false;
        SingleDelayWithCompletable singleDelayWithCompletableM23294e = null;
        Object obj2 = this.f100167c;
        Object obj3 = this.f100166b;
        switch (i) {
            case 1:
                Map map = (Map) obj;
                String str = (String) obj2;
                if (((pu4) ((o310) obj3).f161231f).m71064g()) {
                    y5f y5fVar = (y5f) map.get(str);
                    if (y5fVar != null) {
                        z = y5fVar.f269417a;
                    }
                } else {
                    y5f y5fVar2 = (y5f) map.get(str);
                    if (y5fVar2 != null) {
                        z = y5fVar2.f269419c;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                Boolean bool = (Boolean) obj;
                ContextTrack contextTrack = (ContextTrack) obj3;
                if (!e72.m37996b0(contextTrack)) {
                    String strUri = contextTrack.uri();
                    Set set = dd41.f47702f;
                    if (r46.m74726U(strUri).f47709c == gn80.SHOW_EPISODE || (r46.m74726U(contextTrack.uri()).f47709c == gn80.TRACK && ((hc4) obj2).m47094a() && !bool.booleanValue())) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                qam0 qam0Var = (qam0) obj;
                BehaviorSubject behaviorSubject = (BehaviorSubject) obj2;
                if (!(qam0Var instanceof d7a1)) {
                    Single singleJust = Single.just(qam0Var);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                rlv0 rlv0Var = new rlv0();
                rlv0Var.f200373a = qam0Var;
                if (((d7a1) qam0Var).mo35193d() == null) {
                    rlv0Var.f200373a = ((d7a1) rlv0Var.f200373a).mo35191b(new fnm0((String) obj3));
                }
                Object obj4 = rlv0Var.f200373a;
                if (!(obj4 instanceof gnm0) || !((gnm0) obj4).f82745i) {
                    Single map2 = behaviorSubject.firstOrError().timeout(250L, TimeUnit.MILLISECONDS).onErrorReturn(haz.f89324Z).map(new mj70(rlv0Var, 15));
                    wj50.m88279p(map2);
                    return map2;
                }
                Optional optional = (Optional) behaviorSubject.m23798h();
                fnm0 fnm0Var = optional != null ? (fnm0) optional.orElse(null) : null;
                if (fnm0Var != null) {
                    gnm0 gnm0Var = (gnm0) rlv0Var.f200373a;
                    gnm0Var.getClass();
                    gnm0VarM45308e = gnm0.m45308e(gnm0Var, null, fnm0Var, 495);
                } else {
                    gnm0VarM45308e = (gnm0) rlv0Var.f200373a;
                }
                return Single.just(gnm0VarM45308e);
            case 22:
                sgd0.m78048a((sgd0) obj3, (Throwable) obj, (String) obj2);
                return new r201(-1);
            default:
                r0f0 r0f0Var = (r0f0) obj;
                Set set2 = (Set) obj3;
                avp avpVar = (avp) obj2;
                CompletablePeek completablePeekM89554a = x0f0.m89554a(set2, avpVar, r0f0Var.f194482d, r0f0Var.f194483e);
                if (completablePeekM89554a != null) {
                    Single singleM89555b = x0f0.m89555b(set2, avpVar, r0f0Var.f194481c);
                    if (singleM89555b == null) {
                        singleM89555b = Single.error(new Exception("There is no handler for this message"));
                    }
                    singleDelayWithCompletableM23294e = completablePeekM89554a.m23294e(singleM89555b);
                }
                return singleDelayWithCompletableM23294e != null ? singleDelayWithCompletableM23294e.toObservable().concatMap(jey.f111721P0) : Observable.empty();
        }
    }

    @Override // p204p.ry71
    /* JADX INFO: renamed from: b */
    public Object mo50034b(int i) {
        wa81 wa81Var = (wa81) this.f100166b;
        sme smeVar = (sme) this.f100167c;
        try {
            wa81Var.mo53785e(2, "ClientTokenRefresh", "qss");
            return smeVar.m78522b(i);
        } finally {
            wa81Var.mo53786f("ClientTokenRefresh", "qss");
        }
    }

    @Override // p204p.vr51
    /* JADX INFO: renamed from: c */
    public boolean mo50035c(us30 us30Var) {
        return true;
    }

    @Override // p204p.vr51, p204p.ry71
    public void cancel() {
        switch (this.f100165a) {
            case 2:
                break;
            default:
                ((sme) this.f100167c).f210641d.onNext(x2a1.f257409a);
                break;
        }
    }

    @Override // p204p.ezy
    /* JADX INFO: renamed from: d */
    public void mo40434d(d850 d850Var) {
        gh00 gh00Var = (gh00) ((rlv0) this.f100167c).f200373a;
        if (gh00Var != null) {
            gh00Var.invoke(d850Var);
        }
    }

    @Override // p204p.vr51
    /* JADX INFO: renamed from: e */
    public boolean mo50036e() {
        return true;
    }

    @Override // p204p.ezy
    public fiz getTitle() {
        return (zux) this.f100166b;
    }

    /* JADX INFO: renamed from: h */
    public f5k m50037h(String str, boolean z) {
        return new f5k("your_updates_mark_all_as_read", hou.f93607c, (c5k) null, Integer.valueOf(R.string.your_updates_mark_all_as_read_item_title), (String) null, (!z || str == null || str.length() == 0) ? false : true, (p221) null, new e5k(new v4k(2), 1, new d5k(new b6b0(this, 19), xfc0.f260925t), new abc0(2, str, this)), 180);
    }

    @Override // p204p.lh41
    /* JADX INFO: renamed from: i */
    public StackTraceElement[] mo44656i(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        lh41[] lh41VarArr = (lh41[]) this.f100166b;
        StackTraceElement[] stackTraceElementArrMo44656i = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            lh41 lh41Var = lh41VarArr[i];
            if (stackTraceElementArrMo44656i.length <= 1024) {
                break;
            }
            stackTraceElementArrMo44656i = lh41Var.mo44656i(stackTraceElementArr);
        }
        return stackTraceElementArrMo44656i.length > 1024 ? ((gg5) this.f100167c).mo44656i(stackTraceElementArrMo44656i) : stackTraceElementArrMo44656i;
    }

    /* JADX INFO: renamed from: j */
    public long m50038j(PlayerState playerState) {
        Long lM70677q = pqo0.m70677q(playerState);
        if (lM70677q == null) {
            return 0L;
        }
        long jM42463g = fr0.m42463g((wy3) ((xre) this.f100166b), lM70677q.longValue()) - ((Number) ((i4t0) this.f100167c).get()).longValue();
        if (jM42463g < 0) {
            return 0L;
        }
        return jM42463g;
    }

    /* JADX INFO: renamed from: k */
    public Single m50039k() {
        return ((xbe0) this.f100166b).m90317a().map(yyx.f277600M0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    public Object m50040l(ibk ibkVar) {
        zga0 zga0Var;
        e9r e9rVar = (e9r) this.f100167c;
        if (ibkVar instanceof zga0) {
            zga0Var = (zga0) ibkVar;
            int i = zga0Var.f282561c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zga0Var.f282561c = i - Integer.MIN_VALUE;
            } else {
                zga0Var = new zga0(this, ibkVar);
            }
        } else {
            zga0Var = new zga0(this, ibkVar);
        }
        Object objM38260c = zga0Var.f282559a;
        int i2 = zga0Var.f282561c;
        if (i2 == 0) {
            bga.m29073P(objM38260c);
            zga0Var.f282561c = 1;
            objM38260c = e9rVar.m38260c(30000L, "bluejay_onboarding", zga0Var);
            yuk yukVar = yuk.f276404a;
            if (objM38260c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM38260c);
        }
        b9r b9rVar = (b9r) objM38260c;
        if (wj50.m88271j(b9rVar, a9r.f13625a) || (b9rVar instanceof z8r)) {
            return e9rVar.m38258a();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Single m50041m() {
        gce0 gce0Var = (gce0) this.f100167c;
        n910 n910VarM16485o = GetInviteMembersViewRequest.m16485o();
        n910VarM16485o.m63877m();
        return gce0Var.m44318a((GetInviteMembersViewRequest) n910VarM16485o.build()).map(zyx.f287695N0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public Object m50042n(List list, ibk ibkVar) {
        rnc0 rnc0Var;
        Object c6x0Var;
        ia70 ia70Var;
        if (ibkVar instanceof rnc0) {
            rnc0Var = (rnc0) ibkVar;
            int i = rnc0Var.f200890d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnc0Var.f200890d = i - Integer.MIN_VALUE;
            } else {
                rnc0Var = new rnc0(this, ibkVar);
            }
        } else {
            rnc0Var = new rnc0(this, ibkVar);
        }
        Object objM70440a = rnc0Var.f200888b;
        int i2 = rnc0Var.f200890d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM70440a);
                cz90 cz90Var = (cz90) this.f100166b;
                rnc0Var.f200887a = this;
                rnc0Var.f200890d = 1;
                pnc0 pnc0Var = (pnc0) cz90Var.f43498b;
                q910 q910VarM16618o = GetListeningPartyMarketingCardsRequest.m16618o();
                q910VarM16618o.m72352m(list);
                objM70440a = pnc0Var.m70440a((GetListeningPartyMarketingCardsRequest) q910VarM16618o.build(), rnc0Var);
                yuk yukVar = yuk.f276404a;
                if (objM70440a == yukVar) {
                    return yukVar;
                }
                ia70Var = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ia70Var = rnc0Var.f200887a;
                bga.m29073P(objM70440a);
            }
            ListeningPartyMarketingCard listeningPartyMarketingCard = (ListeningPartyMarketingCard) g6f.m43745s0(((GetListeningPartyMarketingCardsResponse) objM70440a).m16619n());
            c6x0Var = listeningPartyMarketingCard != null ? ((k47) ia70Var.f100167c).m55357q(listeningPartyMarketingCard) : null;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) == null) {
            return c6x0Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m50043o(Map map) {
        if (((ii4) this.f100166b).m50685h()) {
            return true;
        }
        ((bvb1) this.f100167c).getClass();
        return !Boolean.parseBoolean((String) map.get("is_video_first"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: p */
    public Object m50044p(String str, ibk ibkVar) {
        io80 io80Var;
        String str2;
        m340 m340Var;
        List list;
        z240 z240Var;
        List list2;
        x34 x34Var = (x34) this.f100167c;
        if (ibkVar instanceof io80) {
            io80Var = (io80) ibkVar;
            int i = io80Var.f104156c;
            if ((i & Integer.MIN_VALUE) != 0) {
                io80Var.f104156c = i - Integer.MIN_VALUE;
            } else {
                io80Var = new io80(this, ibkVar);
            }
        } else {
            io80Var = new io80(this, ibkVar);
        }
        Object objM62841f = io80Var.f104154a;
        int i2 = io80Var.f104156c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            wt80 wt80Var = (wt80) this.f100166b;
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
            bjp0VarM18365h0.m29502N();
            bjp0VarM18365h0.m29506R();
            bjp0VarM18365h0.m29514Z();
            bjp0VarM18365h0.m29493E();
            bjp0VarM18365h0.m29508T();
            bjp0VarM18365h0.m29520f0();
            bjp0VarM18365h0.m29516b0();
            bjp0VarM18365h0.m29527q(ntx.IDENTITY_TRAIT);
            if (x34Var.m89773a()) {
                bjp0VarM18365h0.m29527q(ntx.VISUAL_IDENTITY_TRAIT);
            }
            top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
            st80 st80Var = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, c5u0.f34291a, null, 0, null, 478);
            io80Var.f104156c = 1;
            objM62841f = ((mu80) wt80Var).m62841f(str, st80Var, io80Var);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        ybv ybvVar = ((qu80) ((p2x0) objM62841f).m68971d()).f192599e;
        v140 v140Var = (v140) ybvVar.f271279x.mo30169a(v140.class);
        String str3 = null;
        t140 t140Var = (v140Var == null || (list2 = v140Var.f236246d) == null) ? null : (t140) g6f.m43745s0(list2);
        String str4 = t140Var != null ? t140Var.f216154b : null;
        String strM84311c = "";
        String str5 = str4 == null ? "" : str4;
        String str6 = t140Var != null ? t140Var.f216153a : null;
        String str7 = str6 == null ? "" : str6;
        boolean z = ybvVar.f271262g;
        if (x34Var.m89773a()) {
            erc1 erc1Var = (erc1) ybvVar.f271279x.mo30169a(erc1.class);
            if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (list = m340Var.f139524a) != null && (z240Var = (z240) g6f.m43745s0(list)) != null) {
                str3 = z240Var.f278475a.f198763a;
            }
            if (str3 != null) {
                str2 = str3;
            }
            return new ty2(ybvVar, str5, str7, z, str2);
        }
        strM84311c = ybvVar.f271259d.m84311c(1);
        str2 = strM84311c;
        return new ty2(ybvVar, str5, str7, z, str2);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        String str = (String) this.f100166b;
        if (str != null) {
            return wj50.m88271j(playerState.playbackId().mo49283h(), str);
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        return wj50.m88271j(contextTrack != null ? contextTrack.uri() : null, ((ContextTrack) this.f100167c).uri());
    }

    public ia70(String str, a7n a7nVar) {
        this.f100165a = 27;
        this.f100166b = a7nVar;
        st91 st91Var = st91.f213865b;
        this.f100167c = new xxg0(str, 14);
    }

    public ia70(lh41[] lh41VarArr) {
        this.f100165a = 26;
        this.f100166b = lh41VarArr;
        this.f100167c = new gg5(17);
    }

    public ia70(z690 z690Var, rlv0 rlv0Var) {
        this.f100165a = 8;
        this.f100167c = rlv0Var;
        this.f100166b = z690Var.f279776n;
    }

    public ia70(wsv0 wsv0Var, int[] iArr) {
        this.f100165a = 29;
        this.f100166b = pf40.m69791p(wsv0Var);
        this.f100167c = iArr;
    }

    public ia70(String str, Bundle bundle) {
        this.f100165a = 21;
        if (str != null) {
            this.f100166b = str;
            this.f100167c = bundle;
            return;
        }
        throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }

    /* JADX INFO: renamed from: g */
    private final void m50031g() {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
        Boolean bool = (Boolean) obj2;
        if (collectionDecorateResponse.m97480p().isEmpty()) {
            return new b9a0(new IllegalStateException(edb.m38564m("No episode metadata found for uri: ", (String) this.f100166b)));
        }
        EpisodeMetadata episodeMetadataM97488q = ((CollectionEpisode) g6f.m43741q0(collectionDecorateResponse.m97480p())).m97488q();
        return new j9a0(new lmv(episodeMetadataM97488q.getLength(), episodeMetadataM97488q.getName(), ((u7f0) this.f100167c).f227596a.getString(R.string.content_type_podcast), bool.booleanValue(), episodeMetadataM97488q.getShow().getName()));
    }

    @Override // p204p.vr51
    public wr51 apply() {
        return ((zp70) this.f100166b).m96668g(this.f100167c);
    }
}
