package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class td0 implements md0 {

    /* JADX INFO: renamed from: a */
    public final k7q0 f219197a;

    /* JADX INFO: renamed from: b */
    public final h7f f219198b;

    /* JADX INFO: renamed from: c */
    public final bsi f219199c;

    /* JADX INFO: renamed from: d */
    public final jv4 f219200d;

    /* JADX INFO: renamed from: e */
    public final dg10 f219201e;

    /* JADX INFO: renamed from: f */
    public final c810 f219202f;

    /* JADX INFO: renamed from: g */
    public final luk f219203g;

    /* JADX INFO: renamed from: h */
    public final cdv f219204h;

    /* JADX INFO: renamed from: i */
    public final wh51 f219205i;

    /* JADX INFO: renamed from: j */
    public final boolean f219206j;

    public td0(k7q0 k7q0Var, h7f h7fVar, bsi bsiVar, jv4 jv4Var, dg10 dg10Var, c810 c810Var, luk lukVar, cdv cdvVar, wh51 wh51Var, boolean z) {
        this.f219197a = k7q0Var;
        this.f219198b = h7fVar;
        this.f219199c = bsiVar;
        this.f219200d = jv4Var;
        this.f219201e = dg10Var;
        this.f219202f = c810Var;
        this.f219203g = lukVar;
        this.f219204h = cdvVar;
        this.f219205i = wh51Var;
        this.f219206j = z;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0170  */
    /* JADX WARN: Code duplicated, block: B:103:0x0175  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:111:0x0198  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0204 A[LOOP:0: B:124:0x01fe->B:126:0x0204, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x013e  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x0168  */
    /* JADX INFO: renamed from: a */
    public static final Object m80482a(td0 td0Var, String str, PlayerState playerState, mx81 mx81Var, String str2, String str3, t5m t5mVar, String str4, sr4 sr4Var, boolean z, ibk ibkVar) {
        pd0 pd0Var;
        String str5;
        PlayerState playerState2;
        mx81 mx81Var2;
        String str6;
        String str7;
        t5m t5mVar2;
        String str8;
        boolean z2;
        String str9;
        List<dev0> list;
        String str10;
        jv4 jv4Var;
        ContextTrack contextTrack;
        boolean z3;
        boolean z4;
        WidgetState.PlayPauseState playPauseState;
        boolean zIsEmpty;
        ContextTrack contextTrack2;
        boolean zM37981O;
        ContextTrack contextTrack3;
        boolean zIsEmpty2;
        WidgetState.LeftButtonConfiguration previous;
        WidgetState.ContentType contentType;
        ArrayList arrayList;
        bsi bsiVar = td0Var.f219199c;
        if (ibkVar instanceof pd0) {
            pd0Var = (pd0) ibkVar;
            int i = pd0Var.f176306X;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd0Var.f176306X = i - Integer.MIN_VALUE;
            } else {
                pd0Var = new pd0(td0Var, ibkVar);
            }
        } else {
            pd0Var = new pd0(td0Var, ibkVar);
        }
        Object objM80485d = pd0Var.f176315i;
        int i2 = pd0Var.f176306X;
        boolean z5 = false;
        if (i2 == 0) {
            bga.m29073P(objM80485d);
            str5 = str;
            try {
                pd0Var.f176307a = str5;
                playerState2 = playerState;
                try {
                    pd0Var.f176308b = playerState2;
                    mx81Var2 = mx81Var;
                    try {
                        pd0Var.f176309c = mx81Var2;
                        str6 = str2;
                        try {
                            pd0Var.f176310d = str6;
                            str7 = str3;
                            try {
                                pd0Var.f176311e = str7;
                                t5mVar2 = t5mVar;
                                try {
                                    pd0Var.f176312f = t5mVar2;
                                    str8 = str4;
                                    try {
                                        pd0Var.f176313g = str8;
                                        z2 = z;
                                        try {
                                            pd0Var.f176314h = z2;
                                            pd0Var.f176306X = 1;
                                            objM80485d = td0Var.m80485d(sr4Var, pd0Var);
                                            Object obj = yuk.f276404a;
                                            if (objM80485d == obj) {
                                                return obj;
                                            }
                                            str9 = str5;
                                        } catch (Throwable th) {
                                            th = th;
                                            Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                                            bsiVar.m30440e(str5, 1, th);
                                            list = lau.f131415a;
                                            str10 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = z;
                                        Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                                        bsiVar.m30440e(str5, 1, th);
                                        list = lau.f131415a;
                                        str10 = str5;
                                        String str11 = str8;
                                        boolean z6 = z2;
                                        t5m t5mVar3 = t5mVar2;
                                        if (list.isEmpty()) {
                                            bsiVar.m30439d(1, str10);
                                        }
                                        jv4Var = td0Var.f219200d;
                                        contextTrack = (ContextTrack) playerState2.track().mo49278b();
                                        wj50.m88279p(contextTrack);
                                        if (e72.m37986T(contextTrack)) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (playerState2.isPlaying()) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            if (!z4) {
                                                if (z4) {
                                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                                } else {
                                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                                }
                                            } else if (z4) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (!z4) {
                                            if (z4) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (z4) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                        if (z3) {
                                            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                        } else {
                                            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                        }
                                        contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                                        if (contextTrack2 != null) {
                                            zM37981O = e72.m37981O(contextTrack2);
                                        } else {
                                            zM37981O = false;
                                        }
                                        if (jv4Var.m54368h()) {
                                            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                        } else {
                                            contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                                            wj50.m88279p(contextTrack3);
                                            if (e72.m37986T(contextTrack3)) {
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            if (z5) {
                                                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                            } else {
                                                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                            }
                                            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                        }
                                        if (e72.m37976J(contextTrack)) {
                                            contentType = WidgetState.ContentType.AD;
                                        } else if (z3) {
                                            contentType = WidgetState.ContentType.TALK;
                                        } else {
                                            contentType = WidgetState.ContentType.MUSIC;
                                        }
                                        mev mevVarM32463d = td0Var.f219204h.m32463d(z6);
                                        CurrentTrackMetadata currentTrackMetadataM88092F = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                                        boolean z7 = !zIsEmpty;
                                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                                        for (dev0 dev0Var : list) {
                                            arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                                        }
                                        return new WidgetState.ActiveSession(currentTrackMetadataM88092F, arrayList, contentType, playPauseState, previous, t5mVar3, str10, z7, zM37981O, str11, mevVarM32463d.m61596b(), mevVarM32463d.m61595a(), z6, jv4Var.m54365e(), td0Var.f219206j);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str8 = str4;
                                    z2 = z;
                                    Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                                    bsiVar.m30440e(str5, 1, th);
                                    list = lau.f131415a;
                                    str10 = str5;
                                    String str12 = str8;
                                    boolean z8 = z2;
                                    t5m t5mVar4 = t5mVar2;
                                    if (list.isEmpty()) {
                                        bsiVar.m30439d(1, str10);
                                    }
                                    jv4Var = td0Var.f219200d;
                                    contextTrack = (ContextTrack) playerState2.track().mo49278b();
                                    wj50.m88279p(contextTrack);
                                    if (e72.m37986T(contextTrack)) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (playerState2.isPlaying()) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        if (!z4) {
                                            if (z4) {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            } else {
                                                playPauseState = WidgetState.PlayPauseState.PLAY;
                                            }
                                        } else if (z4) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (!z4) {
                                        if (z4) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (z4) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                    if (z3) {
                                        zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                    } else {
                                        zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                    }
                                    contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                                    if (contextTrack2 != null) {
                                        zM37981O = e72.m37981O(contextTrack2);
                                    } else {
                                        zM37981O = false;
                                    }
                                    if (jv4Var.m54368h()) {
                                        previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                    } else {
                                        contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                                        wj50.m88279p(contextTrack3);
                                        if (e72.m37986T(contextTrack3)) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                        } else {
                                            zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                        }
                                        previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                    }
                                    if (e72.m37976J(contextTrack)) {
                                        contentType = WidgetState.ContentType.AD;
                                    } else if (z3) {
                                        contentType = WidgetState.ContentType.TALK;
                                    } else {
                                        contentType = WidgetState.ContentType.MUSIC;
                                    }
                                    mev mevVarM32463d2 = td0Var.f219204h.m32463d(z8);
                                    CurrentTrackMetadata currentTrackMetadataM88092F2 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                                    boolean z9 = !zIsEmpty;
                                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                                    while (r0.hasNext()) {
                                        arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                                    }
                                    return new WidgetState.ActiveSession(currentTrackMetadataM88092F2, arrayList, contentType, playPauseState, previous, t5mVar4, str10, z9, zM37981O, str12, mevVarM32463d2.m61596b(), mevVarM32463d2.m61595a(), z8, jv4Var.m54365e(), td0Var.f219206j);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                t5mVar2 = t5mVar;
                                str8 = str4;
                                z2 = z;
                                Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                                bsiVar.m30440e(str5, 1, th);
                                list = lau.f131415a;
                                str10 = str5;
                                String str13 = str8;
                                boolean z10 = z2;
                                t5m t5mVar5 = t5mVar2;
                                if (list.isEmpty()) {
                                    bsiVar.m30439d(1, str10);
                                }
                                jv4Var = td0Var.f219200d;
                                contextTrack = (ContextTrack) playerState2.track().mo49278b();
                                wj50.m88279p(contextTrack);
                                if (e72.m37986T(contextTrack)) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (playerState2.isPlaying()) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (!z4) {
                                    if (!z4) {
                                        if (z4) {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        } else {
                                            playPauseState = WidgetState.PlayPauseState.PLAY;
                                        }
                                    } else if (z4) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (!z4) {
                                    if (z4) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (z4) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                                if (z3) {
                                    zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                } else {
                                    zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                                }
                                contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                                if (contextTrack2 != null) {
                                    zM37981O = e72.m37981O(contextTrack2);
                                } else {
                                    zM37981O = false;
                                }
                                if (jv4Var.m54368h()) {
                                    previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                                } else {
                                    contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                                    wj50.m88279p(contextTrack3);
                                    if (e72.m37986T(contextTrack3)) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                    } else {
                                        zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                    }
                                    previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                                }
                                if (e72.m37976J(contextTrack)) {
                                    contentType = WidgetState.ContentType.AD;
                                } else if (z3) {
                                    contentType = WidgetState.ContentType.TALK;
                                } else {
                                    contentType = WidgetState.ContentType.MUSIC;
                                }
                                mev mevVarM32463d3 = td0Var.f219204h.m32463d(z10);
                                CurrentTrackMetadata currentTrackMetadataM88092F3 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                                boolean z11 = !zIsEmpty;
                                arrayList = new ArrayList(i6f.m49804T(list, 10));
                                while (r0.hasNext()) {
                                    arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                                }
                                return new WidgetState.ActiveSession(currentTrackMetadataM88092F3, arrayList, contentType, playPauseState, previous, t5mVar5, str10, z11, zM37981O, str13, mevVarM32463d3.m61596b(), mevVarM32463d3.m61595a(), z10, jv4Var.m54365e(), td0Var.f219206j);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str7 = str3;
                            t5mVar2 = t5mVar;
                            str8 = str4;
                            z2 = z;
                            Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                            bsiVar.m30440e(str5, 1, th);
                            list = lau.f131415a;
                            str10 = str5;
                            String str14 = str8;
                            boolean z12 = z2;
                            t5m t5mVar6 = t5mVar2;
                            if (list.isEmpty()) {
                                bsiVar.m30439d(1, str10);
                            }
                            jv4Var = td0Var.f219200d;
                            contextTrack = (ContextTrack) playerState2.track().mo49278b();
                            wj50.m88279p(contextTrack);
                            if (e72.m37986T(contextTrack)) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (playerState2.isPlaying()) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (!z4) {
                                if (!z4) {
                                    if (z4) {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    } else {
                                        playPauseState = WidgetState.PlayPauseState.PLAY;
                                    }
                                } else if (z4) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (!z4) {
                                if (z4) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (z4) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                            if (z3) {
                                zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                            } else {
                                zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                            }
                            contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                            if (contextTrack2 != null) {
                                zM37981O = e72.m37981O(contextTrack2);
                            } else {
                                zM37981O = false;
                            }
                            if (jv4Var.m54368h()) {
                                previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                            } else {
                                contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                                wj50.m88279p(contextTrack3);
                                if (e72.m37986T(contextTrack3)) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                                } else {
                                    zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                                }
                                previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                            }
                            if (e72.m37976J(contextTrack)) {
                                contentType = WidgetState.ContentType.AD;
                            } else if (z3) {
                                contentType = WidgetState.ContentType.TALK;
                            } else {
                                contentType = WidgetState.ContentType.MUSIC;
                            }
                            mev mevVarM32463d4 = td0Var.f219204h.m32463d(z12);
                            CurrentTrackMetadata currentTrackMetadataM88092F4 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                            boolean z13 = !zIsEmpty;
                            arrayList = new ArrayList(i6f.m49804T(list, 10));
                            while (r0.hasNext()) {
                                arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                            }
                            return new WidgetState.ActiveSession(currentTrackMetadataM88092F4, arrayList, contentType, playPauseState, previous, t5mVar6, str10, z13, zM37981O, str14, mevVarM32463d4.m61596b(), mevVarM32463d4.m61595a(), z12, jv4Var.m54365e(), td0Var.f219206j);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str6 = str2;
                        str7 = str3;
                        t5mVar2 = t5mVar;
                        str8 = str4;
                        z2 = z;
                        Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                        bsiVar.m30440e(str5, 1, th);
                        list = lau.f131415a;
                        str10 = str5;
                        String str15 = str8;
                        boolean z14 = z2;
                        t5m t5mVar7 = t5mVar2;
                        if (list.isEmpty()) {
                            bsiVar.m30439d(1, str10);
                        }
                        jv4Var = td0Var.f219200d;
                        contextTrack = (ContextTrack) playerState2.track().mo49278b();
                        wj50.m88279p(contextTrack);
                        if (e72.m37986T(contextTrack)) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (playerState2.isPlaying()) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (!z4) {
                            if (!z4) {
                                if (z4) {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                } else {
                                    playPauseState = WidgetState.PlayPauseState.PLAY;
                                }
                            } else if (z4) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (!z4) {
                            if (z4) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (z4) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                        if (z3) {
                            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                        } else {
                            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                        }
                        contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                        if (contextTrack2 != null) {
                            zM37981O = e72.m37981O(contextTrack2);
                        } else {
                            zM37981O = false;
                        }
                        if (jv4Var.m54368h()) {
                            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                        } else {
                            contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                            wj50.m88279p(contextTrack3);
                            if (e72.m37986T(contextTrack3)) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                            } else {
                                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                            }
                            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                        }
                        if (e72.m37976J(contextTrack)) {
                            contentType = WidgetState.ContentType.AD;
                        } else if (z3) {
                            contentType = WidgetState.ContentType.TALK;
                        } else {
                            contentType = WidgetState.ContentType.MUSIC;
                        }
                        mev mevVarM32463d5 = td0Var.f219204h.m32463d(z14);
                        CurrentTrackMetadata currentTrackMetadataM88092F5 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                        boolean z15 = !zIsEmpty;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        while (r0.hasNext()) {
                            arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                        }
                        return new WidgetState.ActiveSession(currentTrackMetadataM88092F5, arrayList, contentType, playPauseState, previous, t5mVar7, str10, z15, zM37981O, str15, mevVarM32463d5.m61596b(), mevVarM32463d5.m61595a(), z14, jv4Var.m54365e(), td0Var.f219206j);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    mx81Var2 = mx81Var;
                    str6 = str2;
                    str7 = str3;
                    t5mVar2 = t5mVar;
                    str8 = str4;
                    z2 = z;
                    Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                    bsiVar.m30440e(str5, 1, th);
                    list = lau.f131415a;
                    str10 = str5;
                    String str16 = str8;
                    boolean z16 = z2;
                    t5m t5mVar8 = t5mVar2;
                    if (list.isEmpty()) {
                        bsiVar.m30439d(1, str10);
                    }
                    jv4Var = td0Var.f219200d;
                    contextTrack = (ContextTrack) playerState2.track().mo49278b();
                    wj50.m88279p(contextTrack);
                    if (e72.m37986T(contextTrack)) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (playerState2.isPlaying()) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        if (!z4) {
                            if (z4) {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            } else {
                                playPauseState = WidgetState.PlayPauseState.PLAY;
                            }
                        } else if (z4) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (!z4) {
                        if (z4) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (z4) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                    if (z3) {
                        zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                    } else {
                        zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                    }
                    contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                    if (contextTrack2 != null) {
                        zM37981O = e72.m37981O(contextTrack2);
                    } else {
                        zM37981O = false;
                    }
                    if (jv4Var.m54368h()) {
                        previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                    } else {
                        contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                        wj50.m88279p(contextTrack3);
                        if (e72.m37986T(contextTrack3)) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                        } else {
                            zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                        }
                        previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                    }
                    if (e72.m37976J(contextTrack)) {
                        contentType = WidgetState.ContentType.AD;
                    } else if (z3) {
                        contentType = WidgetState.ContentType.TALK;
                    } else {
                        contentType = WidgetState.ContentType.MUSIC;
                    }
                    mev mevVarM32463d6 = td0Var.f219204h.m32463d(z16);
                    CurrentTrackMetadata currentTrackMetadataM88092F6 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                    boolean z17 = !zIsEmpty;
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    while (r0.hasNext()) {
                        arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                    }
                    return new WidgetState.ActiveSession(currentTrackMetadataM88092F6, arrayList, contentType, playPauseState, previous, t5mVar8, str10, z17, zM37981O, str16, mevVarM32463d6.m61596b(), mevVarM32463d6.m61595a(), z16, jv4Var.m54365e(), td0Var.f219206j);
                }
            } catch (Throwable th8) {
                th = th8;
                playerState2 = playerState;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z18 = pd0Var.f176314h;
            String str17 = pd0Var.f176313g;
            t5m t5mVar9 = pd0Var.f176312f;
            String str18 = pd0Var.f176311e;
            String str19 = pd0Var.f176310d;
            mx81 mx81Var3 = pd0Var.f176309c;
            PlayerState playerState3 = pd0Var.f176308b;
            str9 = pd0Var.f176307a;
            try {
                bga.m29073P(objM80485d);
                str8 = str17;
                playerState2 = playerState3;
                t5mVar2 = t5mVar9;
                mx81Var2 = mx81Var3;
                str7 = str18;
                str6 = str19;
                z2 = z18;
            } catch (Throwable th9) {
                th = th9;
                str8 = str17;
                playerState2 = playerState3;
                t5mVar2 = t5mVar9;
                mx81Var2 = mx81Var3;
                str7 = str18;
                str6 = str19;
                z2 = z18;
                str5 = str9;
                Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
                bsiVar.m30440e(str5, 1, th);
                list = lau.f131415a;
                str10 = str5;
                String str110 = str8;
                boolean z19 = z2;
                t5m t5mVar10 = t5mVar2;
                if (list.isEmpty()) {
                    bsiVar.m30439d(1, str10);
                }
                jv4Var = td0Var.f219200d;
                contextTrack = (ContextTrack) playerState2.track().mo49278b();
                wj50.m88279p(contextTrack);
                if (e72.m37986T(contextTrack)) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (playerState2.isPlaying()) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    if (!z4) {
                        if (z4) {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        } else {
                            playPauseState = WidgetState.PlayPauseState.PLAY;
                        }
                    } else if (z4) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                } else if (!z4) {
                    if (z4) {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    } else {
                        playPauseState = WidgetState.PlayPauseState.PLAY;
                    }
                } else if (z4) {
                    playPauseState = WidgetState.PlayPauseState.PLAY;
                } else {
                    playPauseState = WidgetState.PlayPauseState.PLAY;
                }
                if (z3) {
                    zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                } else {
                    zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
                }
                contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                if (contextTrack2 != null) {
                    zM37981O = e72.m37981O(contextTrack2);
                } else {
                    zM37981O = false;
                }
                if (jv4Var.m54368h()) {
                    previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
                } else {
                    contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
                    wj50.m88279p(contextTrack3);
                    if (e72.m37986T(contextTrack3)) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
                    } else {
                        zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
                    }
                    previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
                }
                if (e72.m37976J(contextTrack)) {
                    contentType = WidgetState.ContentType.AD;
                } else if (z3) {
                    contentType = WidgetState.ContentType.TALK;
                } else {
                    contentType = WidgetState.ContentType.MUSIC;
                }
                mev mevVarM32463d7 = td0Var.f219204h.m32463d(z19);
                CurrentTrackMetadata currentTrackMetadataM88092F7 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
                boolean z110 = !zIsEmpty;
                arrayList = new ArrayList(i6f.m49804T(list, 10));
                while (r0.hasNext()) {
                    arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
                }
                return new WidgetState.ActiveSession(currentTrackMetadataM88092F7, arrayList, contentType, playPauseState, previous, t5mVar10, str10, z110, zM37981O, str110, mevVarM32463d7.m61596b(), mevVarM32463d7.m61595a(), z19, jv4Var.m54365e(), td0Var.f219206j);
            }
        }
        try {
            list = (List) objM80485d;
            str10 = str9;
        } catch (Throwable th10) {
            th = th10;
            str5 = str9;
            Logger.m3974j(th, "The widget couldn't load recommendations", new Object[0]);
            bsiVar.m30440e(str5, 1, th);
            list = lau.f131415a;
            str10 = str5;
        }
        String str111 = str8;
        boolean z111 = z2;
        t5m t5mVar11 = t5mVar2;
        if (list.isEmpty()) {
            bsiVar.m30439d(1, str10);
        }
        jv4Var = td0Var.f219200d;
        contextTrack = (ContextTrack) playerState2.track().mo49278b();
        wj50.m88279p(contextTrack);
        if (e72.m37986T(contextTrack) || e72.m37978L(contextTrack) || e72.m37987U(contextTrack)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (playerState2.isPlaying() || playerState2.isPaused()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && playerState2.restrictions().disallowPausingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PAUSE;
        } else if (!z4 && !playerState2.restrictions().disallowPausingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PAUSE_DISABLED;
        } else if (z4 || playerState2.restrictions().disallowResumingReasons().isEmpty()) {
            playPauseState = WidgetState.PlayPauseState.PLAY;
        } else {
            playPauseState = WidgetState.PlayPauseState.PLAY_DISABLED;
        }
        if (z3) {
            zIsEmpty = playerState2.restrictions().disallowSeekingReasons().isEmpty();
        } else {
            zIsEmpty = playerState2.restrictions().disallowSkippingNextReasons().isEmpty();
        }
        contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
        if (contextTrack2 != null) {
            zM37981O = e72.m37981O(contextTrack2);
        } else {
            zM37981O = false;
        }
        if (jv4Var.m54368h()) {
            previous = WidgetState.LeftButtonConfiguration.Save.INSTANCE;
        } else {
            contextTrack3 = (ContextTrack) playerState2.track().mo49278b();
            wj50.m88279p(contextTrack3);
            if (e72.m37986T(contextTrack3) || e72.m37978L(contextTrack3) || e72.m37987U(contextTrack3)) {
                z5 = true;
            }
            if (z5) {
                zIsEmpty2 = playerState2.restrictions().disallowSeekingReasons().isEmpty();
            } else {
                zIsEmpty2 = playerState2.restrictions().disallowSkippingPrevReasons().isEmpty();
            }
            previous = new WidgetState.LeftButtonConfiguration.Previous(!zIsEmpty2);
        }
        if (e72.m37976J(contextTrack)) {
            contentType = WidgetState.ContentType.AD;
        } else if (z3) {
            contentType = WidgetState.ContentType.TALK;
        } else {
            contentType = WidgetState.ContentType.MUSIC;
        }
        mev mevVarM32463d8 = td0Var.f219204h.m32463d(z111);
        CurrentTrackMetadata currentTrackMetadataM88092F8 = td0Var.f219205i.m88092F(contextTrack, mx81Var2, str6, str7, playerState2.contextUri());
        boolean z112 = !zIsEmpty;
        arrayList = new ArrayList(i6f.m49804T(list, 10));
        while (r0.hasNext()) {
            arrayList.add(dev0.m35834c(dev0Var, null, td0Var.f219201e.m35915e(dev0Var.m35835g()), 23));
        }
        return new WidgetState.ActiveSession(currentTrackMetadataM88092F8, arrayList, contentType, playPauseState, previous, t5mVar11, str10, z112, zM37981O, str111, mevVarM32463d8.m61596b(), mevVarM32463d8.m61595a(), z111, jv4Var.m54365e(), td0Var.f219206j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Enum m80483b(td0 td0Var, ContextTrack contextTrack, sr4 sr4Var, ibk ibkVar) {
        qd0 qd0Var;
        if (ibkVar instanceof qd0) {
            qd0Var = (qd0) ibkVar;
            int i = qd0Var.f187437d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qd0Var.f187437d = i - Integer.MIN_VALUE;
            } else {
                qd0Var = new qd0(td0Var, ibkVar);
            }
        } else {
            qd0Var = new qd0(td0Var, ibkVar);
        }
        Object objM31770b = qd0Var.f187435b;
        int i2 = qd0Var.f187437d;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM31770b);
                    sr4Var.getClass();
                    sr4Var.m79019k("curation_state_fetch_active", null, (4 & 4) != 0);
                    c810 c810Var = td0Var.f219202f;
                    qd0Var.f187434a = sr4Var;
                    qd0Var.f187437d = 1;
                    objM31770b = c810Var.m31770b(contextTrack, qd0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM31770b == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sr4Var = qd0Var.f187434a;
                    bga.m29073P(objM31770b);
                }
                t5m t5mVar = (t5m) objM31770b;
                sr4Var.m79016f("curation_state_fetch_active");
                return t5mVar;
            } catch (Throwable unused) {
                return t5m.f217318c;
            }
        } finally {
            sr4Var.m79016f("curation_state_fetch_active");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m80484c(td0 td0Var, String str, ContextTrack contextTrack, String str2, String str3, sr4 sr4Var, ibk ibkVar) {
        rd0 rd0Var;
        if (ibkVar instanceof rd0) {
            rd0Var = (rd0) ibkVar;
            int i = rd0Var.f197993f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd0Var.f197993f = i - Integer.MIN_VALUE;
            } else {
                rd0Var = new rd0(td0Var, ibkVar);
            }
        } else {
            rd0Var = new rd0(td0Var, ibkVar);
        }
        Object objMo46765a = rd0Var.f197991d;
        int i2 = rd0Var.f197993f;
        try {
            if (i2 == 0) {
                bga.m29073P(objMo46765a);
                sr4Var.getClass();
                sr4Var.m79019k("color_extraction_active", null, (4 & 4) != 0);
                h7f h7fVar = td0Var.f219198b;
                String strUri = contextTrack.uri();
                rd0Var.f197988a = str;
                rd0Var.f197989b = str2;
                rd0Var.f197990c = sr4Var;
                rd0Var.f197993f = 1;
                objMo46765a = h7fVar.mo46765a(str2, strUri, str3, rd0Var);
                yuk yukVar = yuk.f276404a;
                if (objMo46765a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sr4Var = rd0Var.f197990c;
                str2 = rd0Var.f197989b;
                str = rd0Var.f197988a;
                bga.m29073P(objMo46765a);
            }
            String str4 = (String) objMo46765a;
            sr4Var.m79016f("color_extraction_active");
            return str4;
        } catch (Throwable th) {
            try {
                td0Var.f219199c.m30436a(str, str2, th);
                return "";
            } finally {
                sr4Var.m79016f("color_extraction_active");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m80485d(sr4 sr4Var, ibk ibkVar) {
        sd0 sd0Var;
        if (ibkVar instanceof sd0) {
            sd0Var = (sd0) ibkVar;
            int i = sd0Var.f207832d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sd0Var.f207832d = i - Integer.MIN_VALUE;
            } else {
                sd0Var = new sd0(this, ibkVar);
            }
        } else {
            sd0Var = new sd0(this, ibkVar);
        }
        Object objM55707p = sd0Var.f207830b;
        int i2 = sd0Var.f207832d;
        if (i2 == 0) {
            bga.m29073P(objM55707p);
            sr4Var.getClass();
            sr4Var.m79019k("recommendations_loading_active", null, (4 & 4) != 0);
            sd0Var.f207829a = sr4Var;
            sd0Var.f207832d = 1;
            objM55707p = this.f219197a.m55707p(sd0Var);
            yuk yukVar = yuk.f276404a;
            if (objM55707p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sr4Var = sd0Var.f207829a;
            bga.m29073P(objM55707p);
        }
        yev0 yev0Var = (yev0) objM55707p;
        sr4Var.m79013a("recommendations_cached", pi9.m70080e(yev0Var.m93534a()));
        sr4Var.m79016f("recommendations_loading_active");
        return yev0Var.m93535b();
    }
}
