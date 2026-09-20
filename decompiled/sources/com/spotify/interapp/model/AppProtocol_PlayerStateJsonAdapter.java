package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_PlayerStateJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$PlayerState;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_PlayerStateJsonAdapter extends hk60<AppProtocol$PlayerState> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4522a = xl60.C2578b.m91389a(ContextTrack.Metadata.KEY_CONTEXT_URI, "context_title", "track", "is_paused", "is_paused_bool", ContextTrack.Metadata.KEY_PLAYBACK_SPEED, "playback_position", "playback_options", "playback_restrictions");

    /* JADX INFO: renamed from: b */
    public final hk60 f4523b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4524c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4525d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4526e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4527f;

    /* JADX INFO: renamed from: g */
    public final hk60 f4528g;

    /* JADX INFO: renamed from: h */
    public final hk60 f4529h;

    public AppProtocol_PlayerStateJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4523b = p0i0Var.m68706f(String.class, gbuVar, "contextUri");
        this.f4524c = p0i0Var.m68706f(AppProtocol$Track.class, gbuVar, "track");
        this.f4525d = p0i0Var.m68706f(Boolean.class, gbuVar, "isPaused");
        this.f4526e = p0i0Var.m68706f(Float.class, gbuVar, "playbackSpeed");
        this.f4527f = p0i0Var.m68706f(Long.class, gbuVar, "playbackPosition");
        this.f4528g = p0i0Var.m68706f(PlayerOptions.class, gbuVar, "playbackOptions");
        this.f4529h = p0i0Var.m68706f(PlayerRestrictions.class, gbuVar, "playbackRestrictions");
    }

    @Override // p204p.hk60
    public final AppProtocol$PlayerState fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        AppProtocol$Track appProtocol$Track = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Float f = null;
        Long l = null;
        PlayerOptions playerOptions = null;
        PlayerRestrictions playerRestrictions = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4522a);
            hk60 hk60Var = this.f4523b;
            hk60 hk60Var2 = this.f4525d;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 1:
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 2:
                    appProtocol$Track = (AppProtocol$Track) this.f4524c.fromJson(xl60Var);
                    break;
                case 3:
                    bool = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 4:
                    bool2 = (Boolean) hk60Var2.fromJson(xl60Var);
                    break;
                case 5:
                    f = (Float) this.f4526e.fromJson(xl60Var);
                    break;
                case 6:
                    l = (Long) this.f4527f.fromJson(xl60Var);
                    break;
                case 7:
                    playerOptions = (PlayerOptions) this.f4528g.fromJson(xl60Var);
                    break;
                case 8:
                    playerRestrictions = (PlayerRestrictions) this.f4529h.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$PlayerState(str, str2, appProtocol$Track, bool, bool2, f, l, playerOptions, playerRestrictions);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$PlayerState appProtocol$PlayerState) {
        AppProtocol$PlayerState appProtocol$PlayerState2 = appProtocol$PlayerState;
        if (appProtocol$PlayerState2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_CONTEXT_URI);
        String str = appProtocol$PlayerState2.contextUri;
        hk60 hk60Var = this.f4523b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("context_title");
        hk60Var.toJson(rm60Var, appProtocol$PlayerState2.contextTitle);
        rm60Var.mo56894s("track");
        this.f4524c.toJson(rm60Var, appProtocol$PlayerState2.track);
        rm60Var.mo56894s("is_paused");
        Boolean bool = appProtocol$PlayerState2.isPaused;
        hk60 hk60Var2 = this.f4525d;
        hk60Var2.toJson(rm60Var, bool);
        rm60Var.mo56894s("is_paused_bool");
        hk60Var2.toJson(rm60Var, appProtocol$PlayerState2.isPausedBool);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_PLAYBACK_SPEED);
        this.f4526e.toJson(rm60Var, appProtocol$PlayerState2.playbackSpeed);
        rm60Var.mo56894s("playback_position");
        this.f4527f.toJson(rm60Var, appProtocol$PlayerState2.playbackPosition);
        rm60Var.mo56894s("playback_options");
        this.f4528g.toJson(rm60Var, appProtocol$PlayerState2.playbackOptions);
        rm60Var.mo56894s("playback_restrictions");
        this.f4529h.toJson(rm60Var, appProtocol$PlayerState2.playbackRestrictions);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(45, "GeneratedJsonAdapter(AppProtocol.PlayerState)");
    }
}
