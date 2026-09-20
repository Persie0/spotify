package p204p;

import android.view.KeyEvent;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Episode;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Response;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.processors.ReplayProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class tf41 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f219851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf41(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f219851h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x042d  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Integer numM86102a;
        yt60 yt60VarM55356p;
        int i = this.f219851h;
        int i2 = 4;
        int i3 = 8;
        boolean z = true;
        int i4 = 3;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f78014b;
        switch (i) {
            case 0:
                ((tfo) obj2).getClass();
                return tfo.m80701a((String) obj);
            case 1:
                ((tfo) obj2).getClass();
                return tfo.m80701a((String) obj);
            case 2:
                int iIntValue = ((Number) obj).intValue();
                na51 na51Var = (na51) obj2;
                if (iIntValue < 0) {
                    na51Var.getClass();
                } else if (iIntValue < na51Var.f151955c.size()) {
                    return (be51) na51Var.f151955c.get(iIntValue);
                }
                return ae51.f14751a;
            case 3:
                ((MobiusLoopViewModel) ((fh51) obj2).f69585b.f283132c).m15621f((xg51) obj);
                return w2a1Var;
            case 4:
                ((ReplayProcessor) obj2).onNext((ezk) obj);
                return w2a1Var;
            case 5:
                return ix61.m51859a((ix61) obj2, (fbk) obj);
            case 6:
                long j = ((Offset) obj).f493a;
                t471 t471Var = (t471) obj2;
                t471Var.getClass();
                z471 z471Var = (z471) oqg1.m67639h(t471Var, a571.f12455a);
                if (z471Var != null) {
                    x0h1.m89578u(t471Var.m40262v1(), null, 0, new C2004j6(t471Var, j, z471Var, new s471(t471Var, j), (fbk) null, 16), 3);
                }
                return w2a1Var;
            case 7:
                ((m471) obj2).f139859b.m53954a((gh00) obj);
                return w2a1Var;
            case 8:
                KeyEvent keyEvent = ((eu60) obj).f62887a;
                c771 c771Var = (c771) obj2;
                ec71 ec71Var = c771Var.f34781f;
                boolean z2 = c771Var.f34779d;
                knf knfVar = (usg1.m83898q(keyEvent) && (numM86102a = c771Var.f34784i.m86102a(keyEvent)) != null) ? new knf(new StringBuilder().appendCodePoint(numM86102a.intValue()).toString(), 1) : null;
                if (knfVar != null) {
                    if (z2) {
                        c771Var.m31683a(Collections.singletonList(knfVar));
                        ec71Var.f58256a = null;
                    } else {
                        z = false;
                    }
                } else if (erg1.m39801t(keyEvent) != 2 || (yt60VarM55356p = c771Var.f34785j.m55356p(keyEvent)) == null || (yt60VarM55356p.f276021a && !z2)) {
                    z = false;
                } else {
                    nlv0 nlv0Var = new nlv0();
                    nlv0Var.f155174a = true;
                    C2611yf c2611yf = new C2611yf(yt60VarM55356p, c771Var, nlv0Var, 22);
                    o971 o971Var = c771Var.f34778c;
                    z771 z771Var = new z771(o971Var, c771Var.f34782g, c771Var.f34776a.m63660d(), ec71Var);
                    c2611yf.invoke(z771Var);
                    boolean zM50235c = ic71.m50235c(z771Var.f280120f, o971Var.f162954b);
                    j15 j15Var = z771Var.f280121g;
                    if (!zM50235c || !wj50.m88271j(j15Var, o971Var.f162953a)) {
                        c771Var.f34786k.invoke(o971.m66454b(o971Var, j15Var, z771Var.f280120f, 4));
                    }
                    m1a1 m1a1Var = c771Var.f34783h;
                    if (m1a1Var != null) {
                        m1a1Var.f138917e = true;
                    }
                    z = nlv0Var.f155174a;
                }
                return Boolean.valueOf(z);
            case 9:
                yk71 yk71Var = (yk71) obj2;
                spx spxVar = yk71Var.f273629f;
                String str = ((uk71) obj).f231253a;
                fiz fizVarM62953p = mvl0.m62953p(new xif0(i2, new rc10(new rv7(k0e1.m54985d(((jpx) spxVar.f212966a).m53978b(new C1668ai("time_cap_music_video_upsell_page", false, (gh00) new eve0(str, 12)))), str, i3), 27), spxVar));
                int i5 = 10;
                return cyf1.m34374j(new vjz(new hs01(new vjz(fizVarM62953p, new th80(i4, i5, fbkVar), 2), yk71Var, 29), new far0(i4, i5, fbkVar), 2), yk71Var.f273627d);
            case 10:
                return Boolean.valueOf(dt71.m36821m((et71) obj2, (uk91) obj));
            case 11:
                return Boolean.valueOf(dt71.m36821m((et71) obj2, (uk91) obj));
            case 12:
                return it71.m51611c((it71) obj2, (fbk) obj);
            case 13:
                return ((r881) obj2).f196736d.f259975d.format(Long.valueOf((((Date) obj).getTime() / 1000) * ((long) 1000)));
            case 14:
                return ((r881) obj2).f196736d.f259975d.format(Long.valueOf((((Date) obj).getTime() / 1000) * ((long) 1000)));
            case 15:
                xb81 xb81Var = (xb81) obj2;
                xb81Var.getClass();
                Set set = dd41.f47702f;
                String strM35694A = r46.m74732a0((String) obj, null).m35694A();
                if (strM35694A != null) {
                    yb81 yb81Var = xb81Var.f259862C1;
                    if (yb81Var == null) {
                        wj50.m88260d0("logger");
                        throw null;
                    }
                    kv91 kv91Var = (kv91) yb81Var.f271102b;
                    bbg0 bbg0Var = (bbg0) yb81Var.f271104d;
                    bbg0Var.getClass();
                    yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("member", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = strM35694A.toString();
                    if (string == null) {
                        string = "";
                    }
                    d850 d850VarMo57453r = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                    xi8 xi8Var = new xi8(xb81Var.m49720s0());
                    xi8Var.m91102m(xb81Var);
                    xi8Var.m91095f();
                    z9j0 z9j0Var = xb81Var.f259861B1;
                    if (z9j0Var == null) {
                        wj50.m88260d0("navigator");
                        throw null;
                    }
                    z9j0Var.mo47342b(strM35694A, d850VarMo57453r, null);
                }
                return w2a1Var;
            case 16:
                ((Consumer) obj2).accept((jc81) obj);
                return w2a1Var;
            case 17:
                ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response = (ShowUnfinishedEpisodesRequest$Response) obj;
                fe00 fe00Var = (fe00) obj2;
                fe00Var.getClass();
                ae50<ShowUnfinishedEpisodesRequest$Episode> ae50VarM15558o = showUnfinishedEpisodesRequest$Response.m15558o();
                ArrayList arrayList = new ArrayList();
                for (ShowUnfinishedEpisodesRequest$Episode showUnfinishedEpisodesRequest$Episode : ae50VarM15558o) {
                    EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadataM15549o = showUnfinishedEpisodesRequest$Episode.m15549o();
                    if (!showUnfinishedEpisodesRequest$Episode.m15553s()) {
                        episodeMetadata$ProtoEpisodeMetadataM15549o = null;
                    }
                    EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineStateM15550p = showUnfinishedEpisodesRequest$Episode.m15550p();
                    if (!showUnfinishedEpisodesRequest$Episode.m15554t()) {
                        episodeState$ProtoEpisodeOfflineStateM15550p = null;
                    }
                    EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayStateM15551q = showUnfinishedEpisodesRequest$Episode.m15551q();
                    if (!showUnfinishedEpisodesRequest$Episode.m15555u()) {
                        episodeState$ProtoEpisodePlayStateM15551q = null;
                    }
                    EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionStateM15548n = showUnfinishedEpisodesRequest$Episode.m15548n();
                    if (!showUnfinishedEpisodesRequest$Episode.m15552r()) {
                        episodeState$ProtoEpisodeCollectionStateM15548n = null;
                    }
                    d0w d0wVarM41401b = fe00Var.m41401b(episodeMetadata$ProtoEpisodeMetadataM15549o, episodeState$ProtoEpisodeOfflineStateM15550p, episodeState$ProtoEpisodePlayStateM15551q, episodeState$ProtoEpisodeCollectionStateM15548n, null);
                    if (d0wVarM41401b != null) {
                        arrayList.add(d0wVarM41401b);
                    }
                }
                return new ee00(arrayList, showUnfinishedEpisodesRequest$Response);
            case 18:
                return ((tz60) obj2).mo30071a((Set) obj);
            case 19:
                ((tz60) obj2).mo30072b((Set) obj);
                return w2a1Var;
            case 20:
                ((MobiusLoopViewModel) obj2).m15621f((wq71) obj);
                return w2a1Var;
            case 21:
                return new heb1((xam) obj, ((edi0) ((ieb1) obj2).f101370b).m38599e());
            case 22:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qob1 qob1Var = (qob1) obj2;
                vh21 vh21Var = qob1Var.f190899a;
                iq6 iq6Var = qob1Var.f190906h;
                dpb1 dpb1Var = qob1Var.f190903e;
                if (zBooleanValue) {
                    dpb1Var.f51259e.m1018m(iq6Var);
                    vh21Var.mo34629g(new e651(0, qob1Var, qob1.class, "onActive", "onActive()V", 0, 0, 19));
                } else {
                    dpb1Var.f51259e.m1026q0(iq6Var);
                    vh21Var.mo34627e();
                    qob1Var.m73388e(-1);
                }
                return w2a1Var;
            case 23:
                return ((uai0) obj2).m82696a((String) obj);
            case 24:
                ((ReplayProcessor) obj2).onNext((ezk) obj);
                return w2a1Var;
            case 25:
                ((ReplayProcessor) obj2).onNext((ezk) obj);
                return w2a1Var;
            case 26:
                ((pa9) obj2).m69446k((VideoSurfaceView) obj);
                return w2a1Var;
            case 27:
                ((pa9) obj2).m69439d((VideoSurfaceView) obj);
                return w2a1Var;
            case 28:
                ((pa9) obj2).m69446k((VideoSurfaceView) obj);
                return w2a1Var;
            default:
                wy90 wy90Var = (wy90) obj;
                qhc1 qhc1Var = (qhc1) obj2;
                kx90 kx90Var = qhc1Var.f188711b;
                if (wy90Var instanceof uy90) {
                    d850 d850VarM57588c = kx90Var.m57588c();
                    Consumer consumer = qhc1Var.f188713d;
                    if (consumer == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer.accept(new kw90(((uy90) wy90Var).f235217a, d850VarM57588c));
                } else if (wj50.m88271j(wy90Var, ny90.f159749a)) {
                    kx90Var.m57586a(ww90.f255734a);
                    Consumer consumer2 = qhc1Var.f188713d;
                    if (consumer2 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer2.accept(lv90.f137261a);
                } else if (wy90Var instanceof py90) {
                    Consumer consumer3 = qhc1Var.f188713d;
                    if (consumer3 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer3.accept(new ov90(((py90) wy90Var).f183377a));
                } else if (wy90Var instanceof sy90) {
                    sy90 sy90Var = (sy90) wy90Var;
                    String str2 = sy90Var.f215196c;
                    if (sy90Var.f215195b) {
                        String strM57586a = kx90Var.m57586a(new cx90(str2, false));
                        Consumer consumer4 = qhc1Var.f188713d;
                        if (consumer4 == null) {
                            wj50.m88260d0("output");
                            throw null;
                        }
                        consumer4.accept(new yv90(sy90Var.f215194a, str2, strM57586a));
                    } else {
                        kx90Var.m57586a(new hx90(3));
                        Consumer consumer5 = qhc1Var.f188713d;
                        if (consumer5 == null) {
                            wj50.m88260d0("output");
                            throw null;
                        }
                        consumer5.accept(new vv90(str2, null, false));
                    }
                } else if (wj50.m88271j(wy90Var, oy90.f171710a)) {
                    kx90Var.m57586a(yw90.f276925a);
                    Consumer consumer6 = qhc1Var.f188713d;
                    if (consumer6 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer6.accept(mv90.f147535a);
                } else if (wy90Var instanceof ty90) {
                    ty90 ty90Var = (ty90) wy90Var;
                    boolean z3 = ty90Var.f224884a;
                    if (z3) {
                        kx90Var.m57586a(new hx90(1));
                    } else {
                        kx90Var.m57586a(ex90.f63719a);
                    }
                    Consumer consumer7 = qhc1Var.f188713d;
                    if (consumer7 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer7.accept(new iw90(ty90Var.f224885b, null, z3));
                } else if (wy90Var instanceof vy90) {
                    String str3 = ((vy90) wy90Var).f246027a;
                    kx90Var.m57586a(new gx90(str3));
                    Consumer consumer8 = qhc1Var.f188713d;
                    if (consumer8 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer8.accept(new lw90(str3));
                } else if (wy90Var instanceof qy90) {
                    String str4 = ((qy90) wy90Var).f193855a;
                    kx90Var.m57586a(new ax90(str4));
                    Consumer consumer9 = qhc1Var.f188713d;
                    if (consumer9 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer9.accept(new rv90(str4));
                } else {
                    if (!(wy90Var instanceof ry90)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ry90 ry90Var = (ry90) wy90Var;
                    boolean z4 = ry90Var.f203861a;
                    if (z4) {
                        kx90Var.m57586a(new hx90(2));
                    } else {
                        kx90Var.m57586a(new bx90(false));
                    }
                    Consumer consumer10 = qhc1Var.f188713d;
                    if (consumer10 == null) {
                        wj50.m88260d0("output");
                        throw null;
                    }
                    consumer10.accept(new wv90(ry90Var.f203862b, i3, z4, ry90Var.f203863c));
                }
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf41(MobiusLoopViewModel mobiusLoopViewModel) {
        super(1, mobiusLoopViewModel, MobiusLoopViewModel.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0, 0);
        this.f219851h = 20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf41(tz60 tz60Var, int i) {
        super(1, tz60Var, tz60.class, "update", "update(Ljava/util/Set;)Ljava/util/Map;", 0, 0);
        this.f219851h = i;
        switch (i) {
            case 19:
                super(1, tz60Var, tz60.class, "invalidateCache", "invalidateCache(Ljava/util/Set;)V", 0, 0);
                break;
            default:
                break;
        }
    }
}
