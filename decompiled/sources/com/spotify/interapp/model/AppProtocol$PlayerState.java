package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\b\u0007\u0018\u00002\u00020\u0001:\u0001LBs\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0015\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\u001b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b,\u0010\u001b\u001a\u0004\b\b\u0010)\"\u0004\b*\u0010+R*\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010(\u0012\u0004\b/\u0010\u001b\u001a\u0004\b\t\u0010)\"\u0004\b.\u0010+R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u001b\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b=\u0010\u001b\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010\u001b\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010\u001b\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$PlayerState", "Lcom/spotify/interapp/model/a;", "", "contextUri", "contextTitle", "Lcom/spotify/interapp/model/AppProtocol$Track;", "track", "", "isPaused", "isPausedBool", "", "playbackSpeed", "", "playbackPosition", "Lcom/spotify/interapp/model/PlayerOptions;", "playbackOptions", "Lcom/spotify/interapp/model/PlayerRestrictions;", "playbackRestrictions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/interapp/model/AppProtocol$Track;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Long;Lcom/spotify/interapp/model/PlayerOptions;Lcom/spotify/interapp/model/PlayerRestrictions;)V", "c", "Ljava/lang/String;", "getContextUri", "()Ljava/lang/String;", "setContextUri", "(Ljava/lang/String;)V", "getContextUri$annotations", "()V", "d", "getContextTitle", "setContextTitle", "getContextTitle$annotations", "e", "Lcom/spotify/interapp/model/AppProtocol$Track;", "getTrack", "()Lcom/spotify/interapp/model/AppProtocol$Track;", "setTrack", "(Lcom/spotify/interapp/model/AppProtocol$Track;)V", "getTrack$annotations", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setPaused", "(Ljava/lang/Boolean;)V", "isPaused$annotations", "g", "setPausedBool", "isPausedBool$annotations", "h", "Ljava/lang/Float;", "getPlaybackSpeed", "()Ljava/lang/Float;", "setPlaybackSpeed", "(Ljava/lang/Float;)V", "getPlaybackSpeed$annotations", "i", "Ljava/lang/Long;", "getPlaybackPosition", "()Ljava/lang/Long;", "setPlaybackPosition", "(Ljava/lang/Long;)V", "getPlaybackPosition$annotations", "j", "Lcom/spotify/interapp/model/PlayerOptions;", "getPlaybackOptions", "()Lcom/spotify/interapp/model/PlayerOptions;", "setPlaybackOptions", "(Lcom/spotify/interapp/model/PlayerOptions;)V", "getPlaybackOptions$annotations", "k", "Lcom/spotify/interapp/model/PlayerRestrictions;", "getPlaybackRestrictions", "()Lcom/spotify/interapp/model/PlayerRestrictions;", "setPlaybackRestrictions", "(Lcom/spotify/interapp/model/PlayerRestrictions;)V", "getPlaybackRestrictions$annotations", "p/kif1", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$PlayerState extends AbstractC0800a {

    /* JADX INFO: renamed from: l */
    public static final AppProtocol$PlayerState f4367l;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String contextUri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String contextTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final AppProtocol$Track track;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Boolean isPaused;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Boolean isPausedBool;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Float playbackSpeed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Long playbackPosition;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final PlayerOptions playbackOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final PlayerRestrictions playbackRestrictions;

    static {
        Boolean bool = Boolean.TRUE;
        f4367l = new AppProtocol$PlayerState(null, null, null, bool, bool, Float.valueOf(0.0f), 0L, new PlayerOptions(false, 0), new PlayerRestrictions());
    }

    public AppProtocol$PlayerState(@gk60(name = ContextTrack.Metadata.KEY_CONTEXT_URI) String str, @gk60(name = "context_title") String str2, @gk60(name = "track") AppProtocol$Track appProtocol$Track, @gk60(name = "is_paused") Boolean bool, @gk60(name = "is_paused_bool") Boolean bool2, @gk60(name = ContextTrack.Metadata.KEY_PLAYBACK_SPEED) Float f, @gk60(name = "playback_position") Long l, @gk60(name = "playback_options") PlayerOptions playerOptions, @gk60(name = "playback_restrictions") PlayerRestrictions playerRestrictions) {
        this.contextUri = str;
        this.contextTitle = str2;
        this.track = appProtocol$Track;
        this.isPaused = bool;
        this.isPausedBool = bool2;
        this.playbackSpeed = f;
        this.playbackPosition = l;
        this.playbackOptions = playerOptions;
        this.playbackRestrictions = playerRestrictions;
    }

    @gk60(name = "context_title")
    public static /* synthetic */ void getContextTitle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_CONTEXT_URI)
    public static /* synthetic */ void getContextUri$annotations() {
    }

    @gk60(name = "playback_options")
    public static /* synthetic */ void getPlaybackOptions$annotations() {
    }

    @gk60(name = "playback_position")
    public static /* synthetic */ void getPlaybackPosition$annotations() {
    }

    @gk60(name = "playback_restrictions")
    public static /* synthetic */ void getPlaybackRestrictions$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public static /* synthetic */ void getPlaybackSpeed$annotations() {
    }

    @gk60(name = "track")
    public static /* synthetic */ void getTrack$annotations() {
    }

    @gk60(name = "is_paused")
    public static /* synthetic */ void isPaused$annotations() {
    }

    @gk60(name = "is_paused_bool")
    public static /* synthetic */ void isPausedBool$annotations() {
    }
}
