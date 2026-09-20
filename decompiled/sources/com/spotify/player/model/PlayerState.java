package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.C2244p5;
import p204p.hzq0;
import p204p.pf40;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PlayerState {
    public static final PlayerState EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerState.builder();
        }

        public abstract Builder adBreakContext(AdBreakContext adBreakContext);

        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PlayerState build();

        public abstract Builder contextMetadata(Map<String, String> map);

        public abstract Builder contextRestrictions(Restrictions restrictions);

        public abstract Builder contextUri(String str);

        public abstract Builder contextUrl(String str);

        public abstract Builder duration(Long l);

        public abstract Builder format(Format format);

        public abstract Builder index(ContextIndex contextIndex);

        public abstract Builder isBuffering(boolean z);

        public abstract Builder isPaused(boolean z);

        public abstract Builder isPlaying(boolean z);

        public abstract Builder isSystemInitiated(boolean z);

        public abstract Builder nextTracks(List<ContextTrack> list);

        public abstract Builder options(PlayerOptions playerOptions);

        public abstract Builder pageMetadata(Map<String, String> map);

        public abstract Builder playOrigin(PlayOrigin playOrigin);

        public abstract Builder playbackId(String str);

        public abstract Builder playbackQuality(PlaybackQuality playbackQuality);

        public abstract Builder playbackSpeed(Double d);

        public abstract Builder positionAsOfTimestamp(Long l);

        public abstract Builder prevTracks(List<ContextTrack> list);

        public abstract Builder queueRevision(String str);

        public abstract Builder restrictions(Restrictions restrictions);

        public abstract Builder sessionCommandId(String str);

        public abstract Builder sessionId(String str);

        public abstract Builder signals(List<String> list);

        public abstract Builder sleepTimer(SleepTimer sleepTimer);

        public abstract Builder suppressions(Suppressions suppressions);

        public abstract Builder timestamp(long j);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        Builder builderContextUrl = new AutoValue_PlayerState.Builder().timestamp(0L).contextUri("").contextUrl("");
        Restrictions restrictions = Restrictions.EMPTY;
        Builder builderSuppressions = builderContextUrl.contextRestrictions(restrictions).options(PlayerOptions.EMPTY).restrictions(restrictions).playOrigin(PlayOrigin.create("")).isPlaying(false).isPaused(false).isBuffering(false).isSystemInitiated(false).suppressions(Suppressions.EMPTY);
        List<String> list = Collections.EMPTY_LIST;
        Builder builderNextTracks = builderSuppressions.prevTracks(list).nextTracks(list);
        Map<String, String> map = Collections.EMPTY_MAP;
        return builderNextTracks.contextMetadata(map).pageMetadata(map).sessionId("").queueRevision("0").signals(list).audioStream(AudioStream.DEFAULT);
    }

    public abstract xul0 adBreakContext();

    public abstract AudioStream audioStream();

    public abstract xf40 contextMetadata();

    public abstract Restrictions contextRestrictions();

    public abstract String contextUri();

    public abstract String contextUrl();

    public abstract xul0 duration();

    public abstract xul0 format();

    public abstract xul0 index();

    public abstract boolean isBuffering();

    public abstract boolean isPaused();

    public abstract boolean isPlaying();

    public abstract boolean isSystemInitiated();

    public abstract pf40 nextTracks();

    public abstract PlayerOptions options();

    public abstract xf40 pageMetadata();

    public abstract PlayOrigin playOrigin();

    public abstract xul0 playbackId();

    public abstract xul0 playbackQuality();

    public abstract xul0 playbackSpeed();

    public xul0 position(long j) {
        if (!positionAsOfTimestamp().mo49279c()) {
            return C2244p5.f174033a;
        }
        return new hzq0(Long.valueOf(((Long) positionAsOfTimestamp().mo49278b()).longValue() + ((long) (((Double) playbackSpeed().mo49280e(Double.valueOf(0.0d))).doubleValue() * (j - timestamp())))));
    }

    public abstract xul0 positionAsOfTimestamp();

    public abstract pf40 prevTracks();

    public abstract String queueRevision();

    public abstract Restrictions restrictions();

    public abstract xul0 sessionCommandId();

    public abstract String sessionId();

    public abstract pf40 signals();

    public abstract xul0 sleepTimer();

    public abstract Suppressions suppressions();

    public abstract long timestamp();

    public abstract Builder toBuilder();

    public abstract xul0 track();
}
