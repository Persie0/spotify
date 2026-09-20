package com.spotify.betamax.contextplayercoordinatorimpl.model;

import androidx.annotation.Keep;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.j0c1;
import p204p.ok60;
import p204p.pm71;
import p204p.s7k;
import p204p.wj50;
import p204p.ws81;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m24211d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b?\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002^Bí\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010DR!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010.\u001a\u0004\bM\u00100\"\u0004\bN\u0010OR$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bX\u00100R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\bY\u00100R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b\"\u0010=R\u0017\u0010#\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b]\u0010=¨\u0006_"}, m24212d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand;", "", "Lp/j0c1;", "type", "", "seekToInMs", "endPositionInMs", "stopPositionInMs", "Lp/ws81;", "trackWithPlayOrigin", "", "futureTrackWithPlayOrigins", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "contextPlayerOptions", "", "initiallyPaused", "systemInitiated", "clientOffline", "", "startReason", "Lcom/spotify/player/model/command/options/LoggingParams;", "loggingParameters", "Lcom/spotify/player/model/ContextTrack;", "prefetchTracks", "Lp/s7k;", "configuration", "systemInitiatedTimeMs", "sessionId", "Lp/pm71;", "timeMeasurementBuilderSnapshot", "markerBoundaryStartInMs", "markerBoundaryEndInMs", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand$Marker;", "markers", "isListPlayer", "automaticallySyncToLiveHead", "<init>", "(Lp/j0c1;JLjava/lang/Long;Ljava/lang/Long;Lp/ws81;[Lp/ws81;Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;ZZZLjava/lang/String;Lcom/spotify/player/model/command/options/LoggingParams;[Lcom/spotify/player/model/ContextTrack;Lp/s7k;Ljava/lang/Long;Ljava/lang/String;Lp/pm71;Ljava/lang/Long;Ljava/lang/Long;[Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand$Marker;ZZ)V", "toString", "()Ljava/lang/String;", "Lp/j0c1;", "getType", "()Lp/j0c1;", "J", "getSeekToInMs", "()J", "Ljava/lang/Long;", "getEndPositionInMs", "()Ljava/lang/Long;", "getStopPositionInMs", "Lp/ws81;", "getTrackWithPlayOrigin", "()Lp/ws81;", "[Lp/ws81;", "getFutureTrackWithPlayOrigins", "()[Lp/ws81;", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "getContextPlayerOptions", "()Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerOptions;", "Z", "getInitiallyPaused", "()Z", "getSystemInitiated", "getClientOffline", "Ljava/lang/String;", "getStartReason", "Lcom/spotify/player/model/command/options/LoggingParams;", "getLoggingParameters", "()Lcom/spotify/player/model/command/options/LoggingParams;", "[Lcom/spotify/player/model/ContextTrack;", "getPrefetchTracks", "()[Lcom/spotify/player/model/ContextTrack;", "Lp/s7k;", "getConfiguration", "()Lp/s7k;", "setConfiguration", "(Lp/s7k;)V", "getSystemInitiatedTimeMs", "setSystemInitiatedTimeMs", "(Ljava/lang/Long;)V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "Lp/pm71;", "getTimeMeasurementBuilderSnapshot", "()Lp/pm71;", "setTimeMeasurementBuilderSnapshot", "(Lp/pm71;)V", "getMarkerBoundaryStartInMs", "getMarkerBoundaryEndInMs", "[Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand$Marker;", "getMarkers", "()[Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand$Marker;", "getAutomaticallySyncToLiveHead", "Marker", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = false)
public final class VideoPlayerCommand {
    private final boolean automaticallySyncToLiveHead;
    private final boolean clientOffline;
    private s7k configuration;
    private final ContextPlayerOptions contextPlayerOptions;
    private final Long endPositionInMs;
    private final ws81[] futureTrackWithPlayOrigins;
    private final boolean initiallyPaused;
    private final boolean isListPlayer;
    private final LoggingParams loggingParameters;
    private final Long markerBoundaryEndInMs;
    private final Long markerBoundaryStartInMs;
    private final Marker[] markers;
    private final ContextTrack[] prefetchTracks;
    private final long seekToInMs;
    private String sessionId;
    private final String startReason;
    private final Long stopPositionInMs;
    private final boolean systemInitiated;
    private Long systemInitiatedTimeMs;
    private pm71 timeMeasurementBuilderSnapshot;
    private final ws81 trackWithPlayOrigin;
    private final j0c1 type;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand$Marker;", "", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @ok60(generateAdapter = true)
    public static final /* data */ class Marker {

        /* JADX INFO: renamed from: a */
        public final String f3024a;

        /* JADX INFO: renamed from: b */
        public final Integer f3025b;

        /* JADX INFO: renamed from: c */
        public final Integer f3026c;

        /* JADX INFO: renamed from: d */
        public final Integer f3027d;

        public Marker(String str, Integer num, Integer num2, Integer num3) {
            this.f3024a = str;
            this.f3025b = num;
            this.f3026c = num2;
            this.f3027d = num3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getF3025b() {
            return this.f3025b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF3024a() {
            return this.f3024a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF3026c() {
            return this.f3026c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getF3027d() {
            return this.f3027d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Marker)) {
                return false;
            }
            Marker marker = (Marker) obj;
            return wj50.m88271j(this.f3024a, marker.f3024a) && wj50.m88271j(this.f3025b, marker.f3025b) && wj50.m88271j(this.f3026c, marker.f3026c) && wj50.m88271j(this.f3027d, marker.f3027d);
        }

        public final int hashCode() {
            String str = this.f3024a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f3025b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f3026c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f3027d;
            return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
        }
    }

    public VideoPlayerCommand(j0c1 j0c1Var, long j, Long l, Long l2, ws81 ws81Var, ws81[] ws81VarArr, ContextPlayerOptions contextPlayerOptions, boolean z, boolean z2, boolean z3, String str, LoggingParams loggingParams, ContextTrack[] contextTrackArr, s7k s7kVar, Long l3, String str2, pm71 pm71Var, Long l4, Long l5, Marker[] markerArr, boolean z4, boolean z5) {
        this.type = j0c1Var;
        this.seekToInMs = j;
        this.endPositionInMs = l;
        this.stopPositionInMs = l2;
        this.trackWithPlayOrigin = ws81Var;
        this.futureTrackWithPlayOrigins = ws81VarArr;
        this.contextPlayerOptions = contextPlayerOptions;
        this.initiallyPaused = z;
        this.systemInitiated = z2;
        this.clientOffline = z3;
        this.startReason = str;
        this.loggingParameters = loggingParams;
        this.prefetchTracks = contextTrackArr;
        this.configuration = s7kVar;
        this.systemInitiatedTimeMs = l3;
        this.sessionId = str2;
        this.timeMeasurementBuilderSnapshot = pm71Var;
        this.markerBoundaryStartInMs = l4;
        this.markerBoundaryEndInMs = l5;
        this.markers = markerArr;
        this.isListPlayer = z4;
        this.automaticallySyncToLiveHead = z5;
    }

    public final boolean getAutomaticallySyncToLiveHead() {
        return this.automaticallySyncToLiveHead;
    }

    public final boolean getClientOffline() {
        return this.clientOffline;
    }

    public final s7k getConfiguration() {
        return this.configuration;
    }

    public final ContextPlayerOptions getContextPlayerOptions() {
        return this.contextPlayerOptions;
    }

    public final Long getEndPositionInMs() {
        return this.endPositionInMs;
    }

    public final ws81[] getFutureTrackWithPlayOrigins() {
        return this.futureTrackWithPlayOrigins;
    }

    public final boolean getInitiallyPaused() {
        return this.initiallyPaused;
    }

    public final LoggingParams getLoggingParameters() {
        return this.loggingParameters;
    }

    public final Long getMarkerBoundaryEndInMs() {
        return this.markerBoundaryEndInMs;
    }

    public final Long getMarkerBoundaryStartInMs() {
        return this.markerBoundaryStartInMs;
    }

    public final Marker[] getMarkers() {
        return this.markers;
    }

    public final ContextTrack[] getPrefetchTracks() {
        return this.prefetchTracks;
    }

    public final long getSeekToInMs() {
        return this.seekToInMs;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStartReason() {
        return this.startReason;
    }

    public final Long getStopPositionInMs() {
        return this.stopPositionInMs;
    }

    public final boolean getSystemInitiated() {
        return this.systemInitiated;
    }

    public final Long getSystemInitiatedTimeMs() {
        return this.systemInitiatedTimeMs;
    }

    public final pm71 getTimeMeasurementBuilderSnapshot() {
        return this.timeMeasurementBuilderSnapshot;
    }

    public final ws81 getTrackWithPlayOrigin() {
        return this.trackWithPlayOrigin;
    }

    public final j0c1 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isListPlayer, reason: from getter */
    public final boolean getIsListPlayer() {
        return this.isListPlayer;
    }

    public final void setConfiguration(s7k s7kVar) {
        this.configuration = s7kVar;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSystemInitiatedTimeMs(Long l) {
        this.systemInitiatedTimeMs = l;
    }

    public final void setTimeMeasurementBuilderSnapshot(pm71 pm71Var) {
        this.timeMeasurementBuilderSnapshot = pm71Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 1) {
            ws81 ws81Var = this.trackWithPlayOrigin;
            if (ws81Var != null) {
                sb.append(" playback_id=" + ws81Var.f254558c);
                ContextTrack contextTrack = ws81Var.f254556a;
                if (contextTrack != null) {
                    sb.append(" uri=" + contextTrack.uri());
                }
            }
            ContextPlayerOptions contextPlayerOptions = this.contextPlayerOptions;
            if (contextPlayerOptions != null) {
                sb.append(" shuffling_context=" + contextPlayerOptions.getShufflingContext());
                sb.append(" repeating_context=" + contextPlayerOptions.getRepeatingContext());
                sb.append(" repeating_track=" + contextPlayerOptions.getRepeatingTrack());
            }
            sb.append(" initially_paused=" + this.initiallyPaused);
            sb.append(" client_offline=" + this.clientOffline);
            sb.append(" seek_to=" + this.seekToInMs);
            sb.append(" start_reason=" + this.startReason);
            Marker[] markerArr = this.markers;
            sb.append(" markers=" + (markerArr != null ? Arrays.toString(markerArr) : null));
            sb.append(" is_list_player=" + this.isListPlayer);
        } else if (iOrdinal == 5) {
            sb.append(" seek_to=" + this.seekToInMs);
        } else if (iOrdinal == 6) {
            sb.append(" stop_position=" + this.stopPositionInMs);
        }
        return "VideoPlayerCommand{type=" + this.type + ((Object) sb) + "}";
    }

    public /* synthetic */ VideoPlayerCommand(j0c1 j0c1Var, long j, Long l, Long l2, ws81 ws81Var, ws81[] ws81VarArr, ContextPlayerOptions contextPlayerOptions, boolean z, boolean z2, boolean z3, String str, LoggingParams loggingParams, ContextTrack[] contextTrackArr, s7k s7kVar, Long l3, String str2, pm71 pm71Var, Long l4, Long l5, Marker[] markerArr, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0c1Var, j, l, l2, ws81Var, ws81VarArr, contextPlayerOptions, z, z2, z3, str, loggingParams, contextTrackArr, s7kVar, l3, str2, pm71Var, l4, l5, markerArr, (i & 1048576) != 0 ? false : z4, (i & 2097152) != 0 ? true : z5);
    }
}
