package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import p204p.a8p0;
import p204p.av91;
import p204p.aw7;
import p204p.bga;
import p204p.bsi;
import p204p.bu91;
import p204p.bv91;
import p204p.c8p0;
import p204p.d2n0;
import p204p.d850;
import p204p.dv91;
import p204p.f8p0;
import p204p.fbk;
import p204p.g6f;
import p204p.hcf;
import p204p.hj1;
import p204p.hrw;
import p204p.ibk;
import p204p.ihf1;
import p204p.jwx;
import p204p.kk40;
import p204p.kkc0;
import p204p.kv91;
import p204p.lcf;
import p204p.luk;
import p204p.pqm0;
import p204p.qgy0;
import p204p.sag0;
import p204p.st91;
import p204p.u7p0;
import p204p.upf;
import p204p.vzx;
import p204p.w2a1;
import p204p.wj50;
import p204p.wl51;
import p204p.x0h1;
import p204p.ydi;
import p204p.yt91;
import p204p.yuk;
import p204p.zn91;
import p204p.zt91;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.k */
/* JADX INFO: loaded from: classes11.dex */
public final class C1371k {

    /* JADX INFO: renamed from: a */
    public final vzx f7037a;

    /* JADX INFO: renamed from: b */
    public final hrw f7038b;

    /* JADX INFO: renamed from: c */
    public final C1372l f7039c;

    /* JADX INFO: renamed from: d */
    public final jwx f7040d;

    /* JADX INFO: renamed from: e */
    public final Context f7041e;

    /* JADX INFO: renamed from: f */
    public final aw7 f7042f;

    /* JADX INFO: renamed from: g */
    public final bsi f7043g;

    /* JADX INFO: renamed from: h */
    public final ydi f7044h;

    /* JADX INFO: renamed from: i */
    public final qgy0 f7045i;

    /* JADX INFO: renamed from: j */
    public final luk f7046j;

    public C1371k(vzx vzxVar, hrw hrwVar, C1372l c1372l, jwx jwxVar, Context context, aw7 aw7Var, bsi bsiVar, ydi ydiVar, qgy0 qgy0Var, luk lukVar) {
        this.f7037a = vzxVar;
        this.f7038b = hrwVar;
        this.f7039c = c1372l;
        this.f7040d = jwxVar;
        this.f7041e = context;
        this.f7042f = aw7Var;
        this.f7043g = bsiVar;
        this.f7044h = ydiVar;
        this.f7045i = qgy0Var;
        this.f7046j = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m23081a(Bundle bundle, d2n0 d2n0Var) throws Throwable {
        Object objM89557A;
        av91 av91Var;
        C1372l c1372l = this.f7039c;
        kv91 kv91Var = c1372l.f7047a;
        WidgetInteraction widgetInteraction = Build.VERSION.SDK_INT >= 33 ? (WidgetInteraction) bundle.getParcelable("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", WidgetInteraction.class) : (WidgetInteraction) bundle.getParcelable("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
        String string = bundle.getString("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY");
        if (string == null) {
            string = "";
        }
        boolean z = widgetInteraction instanceof WidgetInteraction.ItemClick;
        qgy0 qgy0Var = this.f7045i;
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            WidgetInteraction.ItemClick itemClick = (WidgetInteraction.ItemClick) widgetInteraction;
            if (itemClick instanceof WidgetInteraction.ItemClick.GridItemClick) {
                WidgetInteraction.ItemClick.GridItemClick gridItemClick = (WidgetInteraction.ItemClick.GridItemClick) itemClick;
                sag0 sag0VarM23088a = C1372l.m23088a(gridItemClick);
                String string2 = gridItemClick.getItemUri().toString();
                dv91 dv91Var = new dv91("hit", 1);
                String string3 = string2 != null ? string2.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                av91Var = new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string3)), sag0VarM23088a.f207208b, st91.f213865b, System.currentTimeMillis());
            } else {
                if (!(itemClick instanceof WidgetInteraction.ItemClick.HeroItemClick)) {
                    throw new NoWhenBranchMatchedException();
                }
                WidgetInteraction.ItemClick.HeroItemClick heroItemClick = (WidgetInteraction.ItemClick.HeroItemClick) itemClick;
                String pageIdentifier = heroItemClick.getPageIdentifier();
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
                yt91VarM50626j.f276052f = "7.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = pageIdentifier;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                String string4 = heroItemClick.getHeroItemUri().toString();
                yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("hero_item", null, null, string4, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c.m94607a();
                String string5 = heroItemClick.getHeroItemUri().toString();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string6 = string5 != null ? string5.toString() : null;
                if (string6 == null) {
                    string6 = "";
                }
                av91Var = new av91("", "", dv91Var2, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string6)), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            }
            c1372l.m23089b(itemClick.getPageIdentifier());
            d850 d850VarMo57453r = kv91Var.mo57453r(av91Var, null);
            upf.m83659C(qgy0Var, new C1365e(d850VarMo57453r, itemClick, string));
            Object objM56684z = kk40.m56684z(new C1367g(this, itemClick, d850VarMo57453r, string, null), d2n0Var);
            if (objM56684z != yukVar) {
                objM56684z = w2a1Var;
            }
            if (objM56684z == yukVar) {
                return objM56684z;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.PlayCommand) {
            WidgetInteraction.PlayCommand playCommand = (WidgetInteraction.PlayCommand) widgetInteraction;
            String pageIdentifier2 = playCommand.getPageIdentifier();
            zt91 zt91Var2 = zt91.f286105i;
            yt91 yt91VarM50626j2 = ihf1.m50626j();
            yt91VarM50626j2.f276054h = "music";
            yt91VarM50626j2.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j2.f276052f = "7.1.0";
            yt91VarM50626j2.f276053g = "20.0.5";
            yt91VarM50626j2.f276048b = pageIdentifier2;
            yt91 yt91VarM96903c2 = yt91VarM50626j2.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("play_pause_button", null, null, null, null));
            yt91VarM96903c4.f276056j = false;
            av91 av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("play", 1, Collections.singletonMap("item_to_be_played", "")), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis());
            c1372l.m23089b(playCommand.getPageIdentifier());
            d850 d850VarMo57453r2 = kv91Var.mo57453r(av91Var2, null);
            if (playCommand.getContextUri().length() > 0) {
                upf.m83659C(qgy0Var, new C1363c(d850VarMo57453r2, playCommand, string));
            }
            Object objM56684z2 = kk40.m56684z(new C1364d(this, d850VarMo57453r2, string, null), d2n0Var);
            if (objM56684z2 != yukVar) {
                objM56684z2 = w2a1Var;
            }
            if (objM56684z2 == yukVar) {
                return objM56684z2;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.PauseCommand) {
            Object objM23083c = m23083c((WidgetInteraction.PauseCommand) widgetInteraction, string, d2n0Var);
            if (objM23083c == yukVar) {
                return objM23083c;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.NextCommand) {
            Object objM23082b = m23082b((WidgetInteraction.NextCommand) widgetInteraction, string, d2n0Var);
            if (objM23082b == yukVar) {
                return objM23082b;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.PreviousCommand) {
            Object objM23084d = m23084d((WidgetInteraction.PreviousCommand) widgetInteraction, string, d2n0Var);
            if (objM23084d == yukVar) {
                return objM23084d;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.SeekBackwardCommand) {
            Object objM23085e = m23085e((WidgetInteraction.SeekBackwardCommand) widgetInteraction, string, d2n0Var);
            if (objM23085e == yukVar) {
                return objM23085e;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.SeekForwardCommand) {
            Object objM23086f = m23086f((WidgetInteraction.SeekForwardCommand) widgetInteraction, string, d2n0Var);
            if (objM23086f == yukVar) {
                return objM23086f;
            }
        } else if (widgetInteraction instanceof WidgetInteraction.CurateCommand) {
            WidgetInteraction.CurateCommand curateCommand = (WidgetInteraction.CurateCommand) widgetInteraction;
            String albumUri = curateCommand.getTrackMetadata().getAlbumUri();
            if (albumUri == null) {
                albumUri = curateCommand.getTrackMetadata().getUri();
            }
            int iOrdinal = curateCommand.getCurrentCurationState().ordinal();
            luk lukVar = this.f7046j;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    String pageIdentifier3 = curateCommand.getPageIdentifier();
                    zt91 zt91Var3 = zt91.f286105i;
                    yt91 yt91VarM50626j3 = ihf1.m50626j();
                    yt91VarM50626j3.f276054h = "music";
                    yt91VarM50626j3.f276047a = "mobile-widget-npv-recommendations";
                    yt91VarM50626j3.f276052f = "7.1.0";
                    yt91VarM50626j3.f276053g = "20.0.5";
                    yt91VarM50626j3.f276048b = pageIdentifier3;
                    yt91 yt91VarM96903c5 = yt91VarM50626j3.m94607a().m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("npv", null, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("playback_controls", null, null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    yt91 yt91VarM96903c7 = yt91VarM96903c6.m94607a().m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("save_button", null, null, null, null));
                    boolean z2 = false;
                    yt91VarM96903c7.f276056j = false;
                    zt91 zt91VarM94607a3 = yt91VarM96903c7.m94607a();
                    dv91 dv91Var3 = new dv91("hit", 1);
                    String string7 = albumUri.toString();
                    if (string7 == null) {
                        string7 = "";
                    }
                    av91 av91Var3 = new av91("", "", dv91Var3, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string7)), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                    c1372l.m23089b(pageIdentifier3);
                    kv91Var.mo57453r(av91Var3, null);
                    objM89557A = x0h1.m89557A(lukVar, new hj1(this, curateCommand.getTrackMetadata(), z2, (fbk) null, 4), d2n0Var);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    if (objM89557A != yukVar) {
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m23087g(this.f7042f.f20416a.getString(R.string.npv_widget_curation_not_unavailable));
                }
                objM89557A = w2a1Var;
            } else {
                fbk fbkVar = null;
                String pageIdentifier4 = curateCommand.getPageIdentifier();
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-widget-npv-recommendations";
                yt91VarM50626j4.f276052f = "7.1.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276048b = pageIdentifier4;
                yt91 yt91VarM96903c8 = yt91VarM50626j4.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("npv", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                yt91 yt91VarM96903c9 = yt91VarM96903c8.m94607a().m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("playback_controls", null, null, null, null));
                yt91VarM96903c9.f276056j = false;
                yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                yt91VarM96903c10.f276055i.add(new bu91("save_button", null, null, null, null));
                yt91VarM96903c10.f276056j = false;
                zt91 zt91VarM94607a4 = yt91VarM96903c10.m94607a();
                boolean z3 = true;
                dv91 dv91Var4 = new dv91("hit", 1);
                String string8 = albumUri.toString();
                if (string8 == null) {
                    string8 = "";
                }
                av91 av91Var4 = new av91("", "", dv91Var4, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string8)), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                c1372l.m23089b(pageIdentifier4);
                kv91Var.mo57453r(av91Var4, null);
                objM89557A = x0h1.m89557A(lukVar, new hj1(this, curateCommand.getTrackMetadata(), z3, fbkVar, 4), d2n0Var);
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
            }
            if (objM89557A == yukVar) {
                return objM89557A;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m23082b(WidgetInteraction.NextCommand nextCommand, String str, ibk ibkVar) {
        C1361a c1361a;
        String str2;
        if (ibkVar instanceof C1361a) {
            c1361a = (C1361a) ibkVar;
            int i = c1361a.f6996d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1361a.f6996d = i - Integer.MIN_VALUE;
            } else {
                c1361a = new C1361a(this, ibkVar);
            }
        } else {
            c1361a = new C1361a(this, ibkVar);
        }
        Object objM96567o = c1361a.f6994b;
        int i2 = c1361a.f6996d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            String pageIdentifier = nextCommand.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("skip_next", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            av91 av91Var = new av91("", "", new dv91("hit", 1), new bv91("skip_to_next", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", ""), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
            String pageIdentifier2 = nextCommand.getPageIdentifier();
            C1372l c1372l = this.f7039c;
            c1372l.m23089b(pageIdentifier2);
            c1372l.f7047a.mo57453r(av91Var, null);
            Single singleMo48412a = this.f7038b.mo48412a(new c8p0());
            c1361a.f6993a = str;
            c1361a.f6996d = 1;
            objM96567o = zn91.m96567o(singleMo48412a, c1361a);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1361a.f6993a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            String str3 = ((hcf) lcfVar).f89783a;
            Logger.m3973i("'Next' command failed: %s", str3);
            String string = wj50.m88271j((String) g6f.m43745s0(wl51.m88477a1(str3, new String[]{","}, 0, 6)), "mft_disallow") ? this.f7042f.f20416a.getString(R.string.npv_widget_disallow_next_out_of_skips) : null;
            if (string != null) {
                m23087g(string);
            }
            this.f7043g.m30437b(4, str2, str3);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public final Object m23083c(WidgetInteraction.PauseCommand pauseCommand, String str, ibk ibkVar) {
        C1362b c1362b;
        String str2;
        if (ibkVar instanceof C1362b) {
            c1362b = (C1362b) ibkVar;
            int i = c1362b.f7000d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1362b.f7000d = i - Integer.MIN_VALUE;
            } else {
                c1362b = new C1362b(this, ibkVar);
            }
        } else {
            c1362b = new C1362b(this, ibkVar);
        }
        Object objM96567o = c1362b.f6998b;
        int i2 = c1362b.f7000d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            String pageIdentifier = pauseCommand.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("play_pause_button", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            av91 av91Var = new av91("", "", new dv91("hit", 1), new bv91(ContextTrack.TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", "")), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
            String pageIdentifier2 = pauseCommand.getPageIdentifier();
            C1372l c1372l = this.f7039c;
            c1372l.m23089b(pageIdentifier2);
            c1372l.f7047a.mo57453r(av91Var, null);
            Single singleMo48412a = this.f7038b.mo48412a(new u7p0("proactiveplatforms-widget", false));
            c1362b.f6997a = str;
            c1362b.f7000d = 1;
            objM96567o = zn91.m96567o(singleMo48412a, c1362b);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1362b.f6997a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            String str3 = ((hcf) lcfVar).f89783a;
            Logger.m3973i("'Pause' command failed: %s", str3);
            this.f7043g.m30437b(3, str2, str3);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Object m23084d(WidgetInteraction.PreviousCommand previousCommand, String str, ibk ibkVar) {
        C1368h c1368h;
        String str2;
        if (ibkVar instanceof C1368h) {
            c1368h = (C1368h) ibkVar;
            int i = c1368h.f7028d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1368h.f7028d = i - Integer.MIN_VALUE;
            } else {
                c1368h = new C1368h(this, ibkVar);
            }
        } else {
            c1368h = new C1368h(this, ibkVar);
        }
        Object objM96567o = c1368h.f7026b;
        int i2 = c1368h.f7028d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            String pageIdentifier = previousCommand.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("skip_previous", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            av91 av91Var = new av91("", "", new dv91("hit", 1), new bv91("skip_to_previous", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", ""), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
            String pageIdentifier2 = previousCommand.getPageIdentifier();
            C1372l c1372l = this.f7039c;
            c1372l.m23089b(pageIdentifier2);
            c1372l.f7047a.mo57453r(av91Var, null);
            Single singleMo48412a = this.f7038b.mo48412a(new f8p0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
            c1368h.f7025a = str;
            c1368h.f7028d = 1;
            objM96567o = zn91.m96567o(singleMo48412a, c1368h);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1368h.f7025a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            String str3 = ((hcf) lcfVar).f89783a;
            Logger.m3973i("'Previous' command failed: %s", str3);
            this.f7043g.m30437b(5, str2, str3);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m23085e(WidgetInteraction.SeekBackwardCommand seekBackwardCommand, String str, ibk ibkVar) {
        C1369i c1369i;
        String str2;
        if (ibkVar instanceof C1369i) {
            c1369i = (C1369i) ibkVar;
            int i = c1369i.f7032d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1369i.f7032d = i - Integer.MIN_VALUE;
            } else {
                c1369i = new C1369i(this, ibkVar);
            }
        } else {
            c1369i = new C1369i(this, ibkVar);
        }
        Object objM96567o = c1369i.f7030b;
        int i2 = c1369i.f7032d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            String pageIdentifier = seekBackwardCommand.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("skip_previous", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String strValueOf = String.valueOf(-15000);
            if (strValueOf == null) {
                strValueOf = "";
            }
            av91 av91Var = new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            String pageIdentifier2 = seekBackwardCommand.getPageIdentifier();
            C1372l c1372l = this.f7039c;
            c1372l.m23089b(pageIdentifier2);
            c1372l.f7047a.mo57453r(av91Var, null);
            Single singleMo48412a = this.f7038b.mo48412a(new a8p0(SeekToCommand.builder(-15000L).relative(SeekToCommand.Relative.CURRENT).build()));
            c1369i.f7029a = str;
            c1369i.f7032d = 1;
            objM96567o = zn91.m96567o(singleMo48412a, c1369i);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1369i.f7029a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            String str3 = ((hcf) lcfVar).f89783a;
            Logger.m3973i("'Skip back 15sec' command failed: %s", str3);
            this.f7043g.m30437b(7, str2, str3);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m23086f(WidgetInteraction.SeekForwardCommand seekForwardCommand, String str, ibk ibkVar) {
        C1370j c1370j;
        String str2;
        if (ibkVar instanceof C1370j) {
            c1370j = (C1370j) ibkVar;
            int i = c1370j.f7036d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1370j.f7036d = i - Integer.MIN_VALUE;
            } else {
                c1370j = new C1370j(this, ibkVar);
            }
        } else {
            c1370j = new C1370j(this, ibkVar);
        }
        Object objM96567o = c1370j.f7034b;
        int i2 = c1370j.f7036d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            String pageIdentifier = seekForwardCommand.getPageIdentifier();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
            yt91VarM50626j.f276052f = "7.1.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276048b = pageIdentifier;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("npv", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("playback_controls", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("skip_next", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String strValueOf = String.valueOf(15000);
            if (strValueOf == null) {
                strValueOf = "";
            }
            av91 av91Var = new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            String pageIdentifier2 = seekForwardCommand.getPageIdentifier();
            C1372l c1372l = this.f7039c;
            c1372l.m23089b(pageIdentifier2);
            c1372l.f7047a.mo57453r(av91Var, null);
            Single singleMo48412a = this.f7038b.mo48412a(new a8p0(SeekToCommand.builder(15000L).relative(SeekToCommand.Relative.CURRENT).build()));
            c1370j.f7033a = str;
            c1370j.f7036d = 1;
            objM96567o = zn91.m96567o(singleMo48412a, c1370j);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1370j.f7033a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            String str3 = ((hcf) lcfVar).f89783a;
            Logger.m3973i("'Skip forward 15sec' command failed: %s", str3);
            this.f7043g.m30437b(6, str2, str3);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final void m23087g(String str) {
        Context context = this.f7041e;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_TOOLTIP");
        intent.putExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE", str);
        context.sendBroadcast(intent);
    }
}
