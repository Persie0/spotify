package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/MediaPlaybackChannelEvent_PauseEventJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/MediaPlaybackChannelEvent$PauseEvent;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MediaPlaybackChannelEvent_PauseEventJsonAdapter extends hk60<MediaPlaybackChannelEvent$PauseEvent> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5215a = xl60.C2578b.m91389a("common", "previousEventUuid", ContextTrack.TrackAction.PAUSE);

    /* JADX INFO: renamed from: b */
    public final hk60 f5216b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5217c;

    /* JADX INFO: renamed from: d */
    public final hk60 f5218d;

    public MediaPlaybackChannelEvent_PauseEventJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5216b = p0i0Var.m68706f(CommonEventFields.class, gbuVar, "common");
        this.f5217c = p0i0Var.m68706f(String.class, gbuVar, "previousEventUuid");
        this.f5218d = p0i0Var.m68706f(PauseMessage.class, gbuVar, ContextTrack.TrackAction.PAUSE);
    }

    @Override // p204p.hk60
    public final MediaPlaybackChannelEvent$PauseEvent fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        CommonEventFields commonEventFields = null;
        String str = null;
        PauseMessage pauseMessage = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5215a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                commonEventFields = (CommonEventFields) this.f5216b.fromJson(xl60Var);
                if (commonEventFields == null) {
                    throw f0b1.m40470x("common", "common", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str = (String) this.f5217c.fromJson(xl60Var);
            } else if (iMo51071K == 2 && (pauseMessage = (PauseMessage) this.f5218d.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x(ContextTrack.TrackAction.PAUSE, ContextTrack.TrackAction.PAUSE, xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (commonEventFields == null) {
            throw f0b1.m40461o("common", "common", xl60Var);
        }
        if (pauseMessage != null) {
            return new MediaPlaybackChannelEvent$PauseEvent(commonEventFields, str, pauseMessage);
        }
        throw f0b1.m40461o(ContextTrack.TrackAction.PAUSE, ContextTrack.TrackAction.PAUSE, xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, MediaPlaybackChannelEvent$PauseEvent mediaPlaybackChannelEvent$PauseEvent) {
        MediaPlaybackChannelEvent$PauseEvent mediaPlaybackChannelEvent$PauseEvent2 = mediaPlaybackChannelEvent$PauseEvent;
        if (mediaPlaybackChannelEvent$PauseEvent2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("common");
        this.f5216b.toJson(rm60Var, mediaPlaybackChannelEvent$PauseEvent2.f5206a);
        rm60Var.mo56894s("previousEventUuid");
        this.f5217c.toJson(rm60Var, mediaPlaybackChannelEvent$PauseEvent2.f5207b);
        rm60Var.mo56894s(ContextTrack.TrackAction.PAUSE);
        this.f5218d.toJson(rm60Var, mediaPlaybackChannelEvent$PauseEvent2.f5208c);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(58, "GeneratedJsonAdapter(MediaPlaybackChannelEvent.PauseEvent)");
    }
}
