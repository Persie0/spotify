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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_SetPodcastPlaybackSpeedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$SetPodcastPlaybackSpeed;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_SetPodcastPlaybackSpeedJsonAdapter extends hk60<AppProtocol$SetPodcastPlaybackSpeed> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4548a = xl60.C2578b.m91389a(ContextTrack.Metadata.KEY_PLAYBACK_SPEED);

    /* JADX INFO: renamed from: b */
    public final hk60 f4549b;

    public AppProtocol_SetPodcastPlaybackSpeedJsonAdapter(p0i0 p0i0Var) {
        this.f4549b = p0i0Var.m68706f(Float.class, gbu.f78413a, "playbackSpeed");
    }

    @Override // p204p.hk60
    public final AppProtocol$SetPodcastPlaybackSpeed fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Float f = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4548a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                f = (Float) this.f4549b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$SetPodcastPlaybackSpeed(f);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$SetPodcastPlaybackSpeed appProtocol$SetPodcastPlaybackSpeed) {
        AppProtocol$SetPodcastPlaybackSpeed appProtocol$SetPodcastPlaybackSpeed2 = appProtocol$SetPodcastPlaybackSpeed;
        if (appProtocol$SetPodcastPlaybackSpeed2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_PLAYBACK_SPEED);
        this.f4549b.toJson(rm60Var, appProtocol$SetPodcastPlaybackSpeed2.playbackSpeed);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(57, "GeneratedJsonAdapter(AppProtocol.SetPodcastPlaybackSpeed)");
    }
}
