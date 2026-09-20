package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hkd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPlaybackInitializationStart extends AbstractC0269h implements sre0 {
    public static final int BATTERY_FIELD_NUMBER = 23;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackInitializationStart DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 25;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 24;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 26;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 22;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int PLAY_CONTEXT_FIELD_NUMBER = 21;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 20;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 27;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int battery_;
    private int bitField0_;
    private int bitrate_;
    private long createdTime_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private long mediaDuration_;
    private long playerPosition_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private float volume_;
    private String mediaUrl_ = "";
    private String featureIdentifier_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";
    private String mediaType_ = "";
    private String playerType_ = "";
    private String subtitleLanguage_ = "";
    private String networkState_ = "";
    private String playbackDestination_ = "";
    private String streamingType_ = "";
    private String surface_ = "";
    private String spotifyUri_ = "";
    private String playContext_ = "";

    static {
        MediaPlaybackInitializationStart mediaPlaybackInitializationStart = new MediaPlaybackInitializationStart();
        DEFAULT_INSTANCE = mediaPlaybackInitializationStart;
        AbstractC0269h.registerDefaultInstance(MediaPlaybackInitializationStart.class, mediaPlaybackInitializationStart);
    }

    private MediaPlaybackInitializationStart() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14031A(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 4;
        mediaPlaybackInitializationStart.playbackId_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m14032B(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, long j) {
        mediaPlaybackInitializationStart.bitField0_ |= 256;
        mediaPlaybackInitializationStart.playerPosition_ = j;
    }

    /* JADX INFO: renamed from: C */
    public static void m14033C(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 32;
        mediaPlaybackInitializationStart.playerType_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m14034D(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, int i) {
        mediaPlaybackInitializationStart.bitField0_ |= 8388608;
        mediaPlaybackInitializationStart.sequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: E */
    public static void m14035E(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 8;
        mediaPlaybackInitializationStart.sessionId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14036F(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, float f) {
        mediaPlaybackInitializationStart.bitField0_ |= 1024;
        mediaPlaybackInitializationStart.speed_ = f;
    }

    /* JADX INFO: renamed from: G */
    public static void m14037G(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 33554432;
        mediaPlaybackInitializationStart.spotifyUri_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14038H(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 65536;
        mediaPlaybackInitializationStart.streamingType_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14039I(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 512;
        mediaPlaybackInitializationStart.subtitleLanguage_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m14040J(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 131072;
        mediaPlaybackInitializationStart.surface_ = str;
    }

    /* JADX INFO: renamed from: K */
    public static void m14041K(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, float f) {
        mediaPlaybackInitializationStart.bitField0_ |= 2048;
        mediaPlaybackInitializationStart.volume_ = f;
    }

    /* JADX INFO: renamed from: L */
    public static hkd0 m14042L() {
        return (hkd0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14043n(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, int i) {
        mediaPlaybackInitializationStart.bitField0_ |= 262144;
        mediaPlaybackInitializationStart.battery_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m14044o(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, int i) {
        mediaPlaybackInitializationStart.bitField0_ |= 8192;
        mediaPlaybackInitializationStart.bitrate_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14045p(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, long j) {
        mediaPlaybackInitializationStart.bitField0_ |= 16777216;
        mediaPlaybackInitializationStart.createdTime_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14046q(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 2;
        mediaPlaybackInitializationStart.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14047r(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, boolean z) {
        mediaPlaybackInitializationStart.bitField0_ |= 32768;
        mediaPlaybackInitializationStart.isAudioOnly_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m14048s(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, boolean z) {
        mediaPlaybackInitializationStart.bitField0_ |= 128;
        mediaPlaybackInitializationStart.isPlaying_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m14049t(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, boolean z) {
        mediaPlaybackInitializationStart.bitField0_ |= 524288;
        mediaPlaybackInitializationStart.isPowerSaverActive_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m14050u(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, long j) {
        mediaPlaybackInitializationStart.bitField0_ |= 64;
        mediaPlaybackInitializationStart.mediaDuration_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m14051v(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 16;
        mediaPlaybackInitializationStart.mediaType_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14052w(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 1;
        mediaPlaybackInitializationStart.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14053x(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 4096;
        mediaPlaybackInitializationStart.networkState_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m14054y(MediaPlaybackInitializationStart mediaPlaybackInitializationStart, String str) {
        mediaPlaybackInitializationStart.getClass();
        str.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 67108864;
        mediaPlaybackInitializationStart.playContext_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14055z(MediaPlaybackInitializationStart mediaPlaybackInitializationStart) {
        mediaPlaybackInitializationStart.getClass();
        mediaPlaybackInitializationStart.bitField0_ |= 16384;
        mediaPlaybackInitializationStart.playbackDestination_ = "device";
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014ဈ\u0019\u0015ဈ\u001a\u0016ဈ\u0004\u0017င\u0012\u0018ဇ\u0013\u0019ဇ\u0014\u001aဇ\u0015\u001bဇ\u0016", new Object[]{"bitField0_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "spotifyUri_", "playContext_", "mediaType_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackInitializationStart();
        }
        if (iOrdinal == 4) {
            return new hkd0(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (MediaPlaybackInitializationStart.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
