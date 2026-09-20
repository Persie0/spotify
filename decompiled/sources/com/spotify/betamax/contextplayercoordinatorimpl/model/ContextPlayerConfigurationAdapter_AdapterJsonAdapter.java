package com.spotify.betamax.contextplayercoordinatorimpl.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerConfigurationAdapter_AdapterJsonAdapter;", "Lp/hk60;", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerConfigurationAdapter$Adapter;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContextPlayerConfigurationAdapter_AdapterJsonAdapter extends hk60<ContextPlayerConfigurationAdapter$Adapter> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3015a = xl60.C2578b.m91389a("video.subtitles", "video.subtitles_cc", "audio.episode.speed");

    /* JADX INFO: renamed from: b */
    public final hk60 f3016b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3017c;

    /* JADX INFO: renamed from: d */
    public final hk60 f3018d;

    public ContextPlayerConfigurationAdapter_AdapterJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3016b = p0i0Var.m68706f(String.class, gbuVar, "languageTag");
        this.f3017c = p0i0Var.m68706f(Boolean.class, gbuVar, "isClosedCaption");
        this.f3018d = p0i0Var.m68706f(Float.class, gbuVar, "playbackSpeed");
    }

    @Override // p204p.hk60
    public final ContextPlayerConfigurationAdapter$Adapter fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        Boolean bool = null;
        Float f = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3015a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f3016b.fromJson(xl60Var);
            } else if (iMo51071K == 1) {
                bool = (Boolean) this.f3017c.fromJson(xl60Var);
            } else if (iMo51071K == 2) {
                f = (Float) this.f3018d.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new ContextPlayerConfigurationAdapter$Adapter(str, bool, f);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ContextPlayerConfigurationAdapter$Adapter contextPlayerConfigurationAdapter$Adapter) {
        ContextPlayerConfigurationAdapter$Adapter contextPlayerConfigurationAdapter$Adapter2 = contextPlayerConfigurationAdapter$Adapter;
        if (contextPlayerConfigurationAdapter$Adapter2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("video.subtitles");
        this.f3016b.toJson(rm60Var, contextPlayerConfigurationAdapter$Adapter2.languageTag);
        rm60Var.mo56894s("video.subtitles_cc");
        this.f3017c.toJson(rm60Var, contextPlayerConfigurationAdapter$Adapter2.isClosedCaption);
        rm60Var.mo56894s("audio.episode.speed");
        this.f3018d.toJson(rm60Var, contextPlayerConfigurationAdapter$Adapter2.playbackSpeed);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(63, "GeneratedJsonAdapter(ContextPlayerConfigurationAdapter.Adapter)");
    }
}
