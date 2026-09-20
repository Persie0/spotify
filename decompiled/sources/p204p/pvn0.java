package p204p;

import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.ShowPlayState;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.SleepTimer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionEpisode;
import spotify.collection.esperanto.proto.CollectionShow;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class pvn0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f181801b;

    public /* synthetic */ pvn0(niz nizVar, int i) {
        this.f181800a = i;
        this.f181801b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:196:0x0341  */
    /* JADX WARN: Code duplicated, block: B:219:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:261:0x045a  */
    /* JADX WARN: Code duplicated, block: B:278:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:295:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:312:0x0535  */
    /* JADX WARN: Code duplicated, block: B:329:0x057c  */
    /* JADX WARN: Code duplicated, block: B:346:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:363:0x0620  */
    /* JADX WARN: Code duplicated, block: B:380:0x067a  */
    /* JADX WARN: Code duplicated, block: B:399:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:431:0x0786  */
    /* JADX WARN: Code duplicated, block: B:455:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:472:0x082e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0876  */
    /* JADX WARN: Code duplicated, block: B:512:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:529:0x0912  */
    /* JADX WARN: Code duplicated, block: B:546:0x095e  */
    /* JADX WARN: Code duplicated, block: B:567:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:586:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:609:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ovn0 ovn0Var;
        nwn0 nwn0Var;
        ContextTrack contextTrack;
        a1o0 a1o0Var;
        u4o0 u4o0Var;
        ico0 ico0Var;
        qfo0 qfo0Var;
        zio0 zio0Var;
        ajo0 ajo0Var;
        koo0 koo0Var;
        fto0 fto0Var;
        PlayabilityRestriction playabilityRestriction;
        EpisodePlayState episodePlayStateM97490s;
        xto0 xto0Var;
        yto0 yto0Var;
        auo0 auo0Var;
        duo0 duo0Var;
        euo0 euo0Var;
        juo0 juo0Var;
        ywo0 ywo0Var;
        zwo0 zwo0Var;
        u0p0 u0p0Var;
        j1p0 j1p0Var;
        m2p0 m2p0Var;
        c3p0 c3p0Var;
        o3p0 o3p0Var;
        i5p0 i5p0Var;
        u5p0 u5p0Var;
        uap0 uap0Var;
        wbp0 wbp0Var;
        dcp0 dcp0Var;
        ContextTrack contextTrack2;
        mcp0 mcp0Var;
        ddp0 ddp0Var;
        switch (this.f181800a) {
            case 0:
                if (fbkVar instanceof ovn0) {
                    ovn0Var = (ovn0) fbkVar;
                    int i = ovn0Var.f170535b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ovn0Var.f170535b = i - Integer.MIN_VALUE;
                    } else {
                        ovn0Var = new ovn0(this, fbkVar);
                    }
                } else {
                    ovn0Var = new ovn0(this, fbkVar);
                }
                Object obj2 = ovn0Var.f170534a;
                int i2 = ovn0Var.f170535b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    ovn0Var.f170535b = 1;
                    Object objEmit = this.f181801b.emit(boolValueOf, ovn0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof nwn0) {
                    nwn0Var = (nwn0) fbkVar;
                    int i3 = nwn0Var.f159242b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nwn0Var.f159242b = i3 - Integer.MIN_VALUE;
                    } else {
                        nwn0Var = new nwn0(this, fbkVar);
                    }
                } else {
                    nwn0Var = new nwn0(this, fbkVar);
                }
                Object obj3 = nwn0Var.f159241a;
                int i4 = nwn0Var.f159242b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState = (PlayerState) obj;
                    if (playerState.isPlaying() && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && bm51.m29803n0(contextTrack.uri(), "spotify:track:", false)) {
                        nwn0Var.f159242b = 1;
                        Object objEmit2 = this.f181801b.emit(obj, nwn0Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof a1o0) {
                    a1o0Var = (a1o0) fbkVar;
                    int i5 = a1o0Var.f11449b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a1o0Var.f11449b = i5 - Integer.MIN_VALUE;
                    } else {
                        a1o0Var = new a1o0(this, fbkVar);
                    }
                } else {
                    a1o0Var = new a1o0(this, fbkVar);
                }
                Object obj4 = a1o0Var.f11448a;
                int i6 = a1o0Var.f11449b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    if (((Number) obj).intValue() > 0) {
                        a1o0Var.f11449b = 1;
                        Object objEmit3 = this.f181801b.emit(obj, a1o0Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof u4o0) {
                    u4o0Var = (u4o0) fbkVar;
                    int i7 = u4o0Var.f226780b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        u4o0Var.f226780b = i7 - Integer.MIN_VALUE;
                    } else {
                        u4o0Var = new u4o0(this, fbkVar);
                    }
                } else {
                    u4o0Var = new u4o0(this, fbkVar);
                }
                Object obj5 = u4o0Var.f226779a;
                int i8 = u4o0Var.f226780b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    List<y4o0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (y4o0 y4o0Var : list) {
                        arrayList.add(new sec1(y4o0Var, y4o0Var.mo84655a()));
                    }
                    d320 d320Var = new d320(arrayList, null);
                    u4o0Var.f226780b = 1;
                    Object objEmit4 = this.f181801b.emit(d320Var, u4o0Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof ico0) {
                    ico0Var = (ico0) fbkVar;
                    int i9 = ico0Var.f100853b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ico0Var.f100853b = i9 - Integer.MIN_VALUE;
                    } else {
                        ico0Var = new ico0(this, fbkVar);
                    }
                } else {
                    ico0Var = new ico0(this, fbkVar);
                }
                Object obj6 = ico0Var.f100852a;
                int i10 = ico0Var.f100853b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf2 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                    ico0Var.f100853b = 1;
                    Object objEmit5 = this.f181801b.emit(boolValueOf2, ico0Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof qfo0) {
                    qfo0Var = (qfo0) fbkVar;
                    int i11 = qfo0Var.f188268b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qfo0Var.f188268b = i11 - Integer.MIN_VALUE;
                    } else {
                        qfo0Var = new qfo0(this, fbkVar);
                    }
                } else {
                    qfo0Var = new qfo0(this, fbkVar);
                }
                Object obj7 = qfo0Var.f188267a;
                int i12 = qfo0Var.f188268b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    ffo0 ffo0Var = new ffo0((s8k) obj);
                    qfo0Var.f188268b = 1;
                    Object objEmit6 = this.f181801b.emit(ffo0Var, qfo0Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof zio0) {
                    zio0Var = (zio0) fbkVar;
                    int i13 = zio0Var.f283213b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zio0Var.f283213b = i13 - Integer.MIN_VALUE;
                    } else {
                        zio0Var = new zio0(this, fbkVar);
                    }
                } else {
                    zio0Var = new zio0(this, fbkVar);
                }
                Object obj8 = zio0Var.f283212a;
                int i14 = zio0Var.f283213b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    PlayerState playerState2 = (PlayerState) obj;
                    Boolean boolValueOf3 = Boolean.valueOf(playerState2.isPlaying() && !playerState2.isPaused());
                    zio0Var.f283213b = 1;
                    Object objEmit7 = this.f181801b.emit(boolValueOf3, zio0Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ajo0) {
                    ajo0Var = (ajo0) fbkVar;
                    int i15 = ajo0Var.f16301b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ajo0Var.f16301b = i15 - Integer.MIN_VALUE;
                    } else {
                        ajo0Var = new ajo0(this, fbkVar);
                    }
                } else {
                    ajo0Var = new ajo0(this, fbkVar);
                }
                Object obj9 = ajo0Var.f16300a;
                int i16 = ajo0Var.f16301b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    Boolean boolValueOf4 = Boolean.valueOf(((b97) obj).f24786a);
                    ajo0Var.f16301b = 1;
                    Object objEmit8 = this.f181801b.emit(boolValueOf4, ajo0Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof koo0) {
                    koo0Var = (koo0) fbkVar;
                    int i17 = koo0Var.f124837b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        koo0Var.f124837b = i17 - Integer.MIN_VALUE;
                    } else {
                        koo0Var = new koo0(this, fbkVar);
                    }
                } else {
                    koo0Var = new koo0(this, fbkVar);
                }
                Object obj10 = koo0Var.f124836a;
                int i18 = koo0Var.f124837b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    joo0 joo0Var = new joo0((kts0) obj);
                    koo0Var.f124837b = 1;
                    Object objEmit9 = this.f181801b.emit(joo0Var, koo0Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof fto0) {
                    fto0Var = (fto0) fbkVar;
                    int i19 = fto0Var.f73253b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fto0Var.f73253b = i19 - Integer.MIN_VALUE;
                    } else {
                        fto0Var = new fto0(this, fbkVar);
                    }
                } else {
                    fto0Var = new fto0(this, fbkVar);
                }
                Object obj11 = fto0Var.f73252a;
                int i20 = fto0Var.f73253b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    CollectionEpisode collectionEpisode = (CollectionEpisode) g6f.m43745s0(((CollectionDecorateResponse) obj).m97480p());
                    if (collectionEpisode == null || (episodePlayStateM97490s = collectionEpisode.m97490s()) == null || (playabilityRestriction = episodePlayStateM97490s.getPlayabilityRestriction()) == null) {
                        playabilityRestriction = PlayabilityRestriction.UNKNOWN;
                    }
                    y6r0 y6r0Var = new y6r0(playabilityRestriction);
                    fto0Var.f73253b = 1;
                    Object objEmit10 = this.f181801b.emit(y6r0Var, fto0Var);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof xto0) {
                    xto0Var = (xto0) fbkVar;
                    int i21 = xto0Var.f265903b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        xto0Var.f265903b = i21 - Integer.MIN_VALUE;
                    } else {
                        xto0Var = new xto0(this, fbkVar);
                    }
                } else {
                    xto0Var = new xto0(this, fbkVar);
                }
                Object obj12 = xto0Var.f265902a;
                int i22 = xto0Var.f265903b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
                    ae50<CollectionTrack> ae50VarM97484t = collectionDecorateResponse.m97484t();
                    int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM97484t, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (CollectionTrack collectionTrack : ae50VarM97484t) {
                        linkedHashMap.put(collectionTrack.getLink(), new uto0(collectionTrack.m97536t().getPlayabilityRestriction(), null));
                    }
                    ae50<CollectionShow> ae50VarM97481q = collectionDecorateResponse.m97481q();
                    int iM31820L2 = c95.m31820L(i6f.m49804T(ae50VarM97481q, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
                    for (CollectionShow collectionShow : ae50VarM97481q) {
                        String link = collectionShow.getLink();
                        ShowPlayState showPlayStateM97523r = collectionShow.m97523r();
                        linkedHashMap2.put(link, new uto0(showPlayStateM97523r.getPlayabilityRestriction(), showPlayStateM97523r.getResumeEpisodeLink()));
                    }
                    LinkedHashMap linkedHashMapM56700m0 = kkc0.m56700m0(linkedHashMap, linkedHashMap2);
                    xto0Var.f265903b = 1;
                    Object objEmit11 = this.f181801b.emit(linkedHashMapM56700m0, xto0Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof yto0) {
                    yto0Var = (yto0) fbkVar;
                    int i23 = yto0Var.f276183b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        yto0Var.f276183b = i23 - Integer.MIN_VALUE;
                    } else {
                        yto0Var = new yto0(this, fbkVar);
                    }
                } else {
                    yto0Var = new yto0(this, fbkVar);
                }
                Object obj13 = yto0Var.f276182a;
                int i24 = yto0Var.f276183b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        yto0Var.f276183b = 1;
                        Object objEmit12 = this.f181801b.emit(obj, yto0Var);
                        yuk yukVar12 = yuk.f276404a;
                        if (objEmit12 == yukVar12) {
                            return yukVar12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof auo0) {
                    auo0Var = (auo0) fbkVar;
                    int i25 = auo0Var.f19991b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        auo0Var.f19991b = i25 - Integer.MIN_VALUE;
                    } else {
                        auo0Var = new auo0(this, fbkVar);
                    }
                } else {
                    auo0Var = new auo0(this, fbkVar);
                }
                Object obj14 = auo0Var.f19990a;
                int i26 = auo0Var.f19991b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    Map map = (Map) obj;
                    wj50.m88279p(map);
                    pqm0 pqm0Var = new pqm0(Boolean.valueOf(dxf1.m37217F(map)), Boolean.valueOf(dxf1.m37249y(map)));
                    auo0Var.f19991b = 1;
                    Object objEmit13 = this.f181801b.emit(pqm0Var, auo0Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof duo0) {
                    duo0Var = (duo0) fbkVar;
                    int i27 = duo0Var.f53245b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        duo0Var.f53245b = i27 - Integer.MIN_VALUE;
                    } else {
                        duo0Var = new duo0(this, fbkVar);
                    }
                } else {
                    duo0Var = new duo0(this, fbkVar);
                }
                Object obj15 = duo0Var.f53244a;
                int i28 = duo0Var.f53245b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    Boolean boolValueOf5 = Boolean.valueOf(g0b1.m43270l(((ty80) obj).f224881j, (in80[]) Arrays.copyOf(new in80[]{in80.f103921b}, 1)));
                    duo0Var.f53245b = 1;
                    Object objEmit14 = this.f181801b.emit(boolValueOf5, duo0Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof euo0) {
                    euo0Var = (euo0) fbkVar;
                    int i29 = euo0Var.f63029b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        euo0Var.f63029b = i29 - Integer.MIN_VALUE;
                    } else {
                        euo0Var = new euo0(this, fbkVar);
                    }
                } else {
                    euo0Var = new euo0(this, fbkVar);
                }
                Object obj16 = euo0Var.f63028a;
                int i30 = euo0Var.f63029b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    Boolean boolValueOf6 = Boolean.valueOf(wj50.m88271j((String) obj, "UNRESTRICTED"));
                    euo0Var.f63029b = 1;
                    Object objEmit15 = this.f181801b.emit(boolValueOf6, euo0Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof juo0) {
                    juo0Var = (juo0) fbkVar;
                    int i31 = juo0Var.f116127b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        juo0Var.f116127b = i31 - Integer.MIN_VALUE;
                    } else {
                        juo0Var = new juo0(this, fbkVar);
                    }
                } else {
                    juo0Var = new juo0(this, fbkVar);
                }
                Object obj17 = juo0Var.f116126a;
                int i32 = juo0Var.f116127b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    f4m f4mVar = new f4m((Map) obj);
                    juo0Var.f116127b = 1;
                    Object objEmit16 = this.f181801b.emit(f4mVar, juo0Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ywo0) {
                    ywo0Var = (ywo0) fbkVar;
                    int i33 = ywo0Var.f277018b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ywo0Var.f277018b = i33 - Integer.MIN_VALUE;
                    } else {
                        ywo0Var = new ywo0(this, fbkVar);
                    }
                } else {
                    ywo0Var = new ywo0(this, fbkVar);
                }
                Object obj18 = ywo0Var.f277017a;
                int i34 = ywo0Var.f277018b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    Boolean boolValueOf7 = Boolean.valueOf(e72.m37986T((ContextTrack) obj));
                    ywo0Var.f277018b = 1;
                    Object objEmit17 = this.f181801b.emit(boolValueOf7, ywo0Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof zwo0) {
                    zwo0Var = (zwo0) fbkVar;
                    int i35 = zwo0Var.f287016b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        zwo0Var.f287016b = i35 - Integer.MIN_VALUE;
                    } else {
                        zwo0Var = new zwo0(this, fbkVar);
                    }
                } else {
                    zwo0Var = new zwo0(this, fbkVar);
                }
                Object obj19 = zwo0Var.f287015a;
                int i36 = zwo0Var.f287016b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    String strM38002e0 = e72.m38002e0((ContextTrack) obj);
                    zwo0Var.f287016b = 1;
                    Object objEmit18 = this.f181801b.emit(strM38002e0, zwo0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof u0p0) {
                    u0p0Var = (u0p0) fbkVar;
                    int i37 = u0p0Var.f225573b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        u0p0Var.f225573b = i37 - Integer.MIN_VALUE;
                    } else {
                        u0p0Var = new u0p0(this, fbkVar);
                    }
                } else {
                    u0p0Var = new u0p0(this, fbkVar);
                }
                Object obj20 = u0p0Var.f225572a;
                int i38 = u0p0Var.f225573b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    Boolean boolValueOf8 = Boolean.valueOf(!((PlayerState) obj).isPaused());
                    u0p0Var.f225573b = 1;
                    Object objEmit19 = this.f181801b.emit(boolValueOf8, u0p0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof j1p0) {
                    j1p0Var = (j1p0) fbkVar;
                    int i39 = j1p0Var.f107813b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        j1p0Var.f107813b = i39 - Integer.MIN_VALUE;
                    } else {
                        j1p0Var = new j1p0(this, fbkVar);
                    }
                } else {
                    j1p0Var = new j1p0(this, fbkVar);
                }
                Object obj21 = j1p0Var.f107812a;
                int i40 = j1p0Var.f107813b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    i1p0 i1p0Var = (i1p0) obj;
                    if (i1p0Var == null) {
                        i1p0Var = new i1p0(false, 0L, 0L, 0L, 0L, 0.0f, (Integer) null, (Integer) null, 448);
                    }
                    j1p0Var.f107813b = 1;
                    Object objEmit20 = this.f181801b.emit(i1p0Var, j1p0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof m2p0) {
                    m2p0Var = (m2p0) fbkVar;
                    int i41 = m2p0Var.f139440b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        m2p0Var.f139440b = i41 - Integer.MIN_VALUE;
                    } else {
                        m2p0Var = new m2p0(this, fbkVar);
                    }
                } else {
                    m2p0Var = new m2p0(this, fbkVar);
                }
                Object obj22 = m2p0Var.f139439a;
                int i42 = m2p0Var.f139440b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChangeM17612q = PlaybackSettingsEsperantoService$StreamSettingChange.m17612q(bArr);
                        m2p0Var.f139440b = 1;
                        Object objEmit21 = this.f181801b.emit(playbackSettingsEsperantoService$StreamSettingChangeM17612q, m2p0Var);
                        yuk yukVar21 = yuk.f276404a;
                        if (objEmit21 == yukVar21) {
                            return yukVar21;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.StreamSettingChange: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof c3p0) {
                    c3p0Var = (c3p0) fbkVar;
                    int i43 = c3p0Var.f33725b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        c3p0Var.f33725b = i43 - Integer.MIN_VALUE;
                    } else {
                        c3p0Var = new c3p0(this, fbkVar);
                    }
                } else {
                    c3p0Var = new c3p0(this, fbkVar);
                }
                Object obj23 = c3p0Var.f33724a;
                int i44 = c3p0Var.f33725b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                    Boolean boolValueOf9 = (playbackSettingsEsperantoService$StreamSettingChange.m17615p() && playbackSettingsEsperantoService$StreamSettingChange.m17614o().m17627v()) ? Boolean.valueOf(playbackSettingsEsperantoService$StreamSettingChange.m17614o().m17623r()) : null;
                    c3p0Var.f33725b = 1;
                    Object objEmit22 = this.f181801b.emit(boolValueOf9, c3p0Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof o3p0) {
                    o3p0Var = (o3p0) fbkVar;
                    int i45 = o3p0Var.f161424b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        o3p0Var.f161424b = i45 - Integer.MIN_VALUE;
                    } else {
                        o3p0Var = new o3p0(this, fbkVar);
                    }
                } else {
                    o3p0Var = new o3p0(this, fbkVar);
                }
                Object obj24 = o3p0Var.f161423a;
                int i46 = o3p0Var.f161424b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    i3p0 i3p0Var = (i3p0) obj;
                    Boolean bool = i3p0Var.f98228h.f139803a;
                    Boolean boolValueOf10 = Boolean.valueOf(bool != null ? bool.booleanValue() : i3p0Var.f98225e == l190.f128655a);
                    o3p0Var.f161424b = 1;
                    Object objEmit23 = this.f181801b.emit(boolValueOf10, o3p0Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof i5p0) {
                    i5p0Var = (i5p0) fbkVar;
                    int i47 = i5p0Var.f99003b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        i5p0Var.f99003b = i47 - Integer.MIN_VALUE;
                    } else {
                        i5p0Var = new i5p0(this, fbkVar);
                    }
                } else {
                    i5p0Var = new i5p0(this, fbkVar);
                }
                Object obj25 = i5p0Var.f99002a;
                int i48 = i5p0Var.f99003b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    if (obj instanceof b5p0) {
                        i5p0Var.f99003b = 1;
                        Object objEmit24 = this.f181801b.emit(obj, i5p0Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof u5p0) {
                    u5p0Var = (u5p0) fbkVar;
                    int i49 = u5p0Var.f227080b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        u5p0Var.f227080b = i49 - Integer.MIN_VALUE;
                    } else {
                        u5p0Var = new u5p0(this, fbkVar);
                    }
                } else {
                    u5p0Var = new u5p0(this, fbkVar);
                }
                Object obj26 = u5p0Var.f227079a;
                int i50 = u5p0Var.f227080b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    PlayerState playerState3 = (PlayerState) obj;
                    Boolean boolValueOf11 = Boolean.valueOf(playerState3.isPlaying() && !playerState3.isPaused());
                    u5p0Var.f227080b = 1;
                    Object objEmit25 = this.f181801b.emit(boolValueOf11, u5p0Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof uap0) {
                    uap0Var = (uap0) fbkVar;
                    int i51 = uap0Var.f228526b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        uap0Var.f228526b = i51 - Integer.MIN_VALUE;
                    } else {
                        uap0Var = new uap0(this, fbkVar);
                    }
                } else {
                    uap0Var = new uap0(this, fbkVar);
                }
                Object obj27 = uap0Var.f228525a;
                int i52 = uap0Var.f228526b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    CharSequence charSequence = (CharSequence) ((PlayerState) obj).contextMetadata().get("player.arch");
                    Boolean boolValueOf12 = Boolean.valueOf(!(charSequence == null || wl51.m88460J0(charSequence)));
                    uap0Var.f228526b = 1;
                    Object objEmit26 = this.f181801b.emit(boolValueOf12, uap0Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit26 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof wbp0) {
                    wbp0Var = (wbp0) fbkVar;
                    int i53 = wbp0Var.f249837b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        wbp0Var.f249837b = i53 - Integer.MIN_VALUE;
                    } else {
                        wbp0Var = new wbp0(this, fbkVar);
                    }
                } else {
                    wbp0Var = new wbp0(this, fbkVar);
                }
                Object obj28 = wbp0Var.f249836a;
                int i54 = wbp0Var.f249837b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    PlayerState playerState4 = (PlayerState) obj;
                    pqm0 pqm0Var2 = new pqm0(Boolean.valueOf(playerState4.isPlaying() && !playerState4.isPaused()), playerState4.playOrigin().featureIdentifier());
                    wbp0Var.f249837b = 1;
                    Object objEmit27 = this.f181801b.emit(pqm0Var2, wbp0Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit27 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof dcp0) {
                    dcp0Var = (dcp0) fbkVar;
                    int i55 = dcp0Var.f47609b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        dcp0Var.f47609b = i55 - Integer.MIN_VALUE;
                    } else {
                        dcp0Var = new dcp0(this, fbkVar);
                    }
                } else {
                    dcp0Var = new dcp0(this, fbkVar);
                }
                Object obj29 = dcp0Var.f47608a;
                int i56 = dcp0Var.f47609b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    PlayerState playerState5 = (PlayerState) obj;
                    String strContextUri = playerState5.contextUri();
                    tck0 tck0Var = null;
                    if (strContextUri != null && strContextUri.length() != 0 && (contextTrack2 = (ContextTrack) playerState5.track().mo49283h()) != null) {
                        tck0Var = new tck0(playerState5.contextUri(), contextTrack2.uri(), wl51.m88485i1(contextTrack2.uid(), ':'));
                    }
                    dcp0Var.f47609b = 1;
                    Object objEmit28 = this.f181801b.emit(tck0Var, dcp0Var);
                    yuk yukVar28 = yuk.f276404a;
                    if (objEmit28 == yukVar28) {
                        return yukVar28;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof mcp0) {
                    mcp0Var = (mcp0) fbkVar;
                    int i57 = mcp0Var.f142223b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        mcp0Var.f142223b = i57 - Integer.MIN_VALUE;
                    } else {
                        mcp0Var = new mcp0(this, fbkVar);
                    }
                } else {
                    mcp0Var = new mcp0(this, fbkVar);
                }
                Object obj30 = mcp0Var.f142222a;
                int i58 = mcp0Var.f142223b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    pqm0 pqm0Var3 = (pqm0) obj;
                    PlayerState playerState6 = (PlayerState) pqm0Var3.f180350a;
                    t5m t5mVar = (t5m) pqm0Var3.f180351b;
                    ContextTrack contextTrack3 = (ContextTrack) playerState6.track().mo49283h();
                    boolean zM37981O = contextTrack3 != null ? e72.m37981O(contextTrack3) : false;
                    xul0 xul0VarTrack = playerState6.track();
                    icp0 icp0Var = new icp0(xul0VarTrack.mo49279c() ? ((ContextTrack) xul0VarTrack.mo49278b()).uri() : "", playerState6.isPlaying(), playerState6.isPaused(), zM37981O, !playerState6.restrictions().disallowSkippingNextReasons().isEmpty(), !playerState6.restrictions().disallowSkippingPrevReasons().isEmpty(), !playerState6.restrictions().disallowSeekingReasons().isEmpty(), t5mVar);
                    mcp0Var.f142223b = 1;
                    Object objEmit29 = this.f181801b.emit(icp0Var, mcp0Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof ddp0) {
                    ddp0Var = (ddp0) fbkVar;
                    int i59 = ddp0Var.f47848b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ddp0Var.f47848b = i59 - Integer.MIN_VALUE;
                    } else {
                        ddp0Var = new ddp0(this, fbkVar);
                    }
                } else {
                    ddp0Var = new ddp0(this, fbkVar);
                }
                Object obj31 = ddp0Var.f47847a;
                int i60 = ddp0Var.f47848b;
                if (i60 == 0) {
                    bga.m29073P(obj31);
                    Boolean boolValueOf13 = Boolean.valueOf(((SleepTimer) obj) != null);
                    ddp0Var.f47848b = 1;
                    Object objEmit30 = this.f181801b.emit(boolValueOf13, ddp0Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
        }
    }
}
