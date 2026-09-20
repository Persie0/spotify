package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.dkd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPlaybackBeacon extends AbstractC0269h implements sre0 {
    public static final int AUDIO_DECODER_NAME_FIELD_NUMBER = 27;
    public static final int BATTERY_FIELD_NUMBER = 28;
    public static final int BEGIN_TRACKING_TIMESTAMP_FIELD_NUMBER = 21;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackBeacon DEFAULT_INSTANCE;
    public static final int DROPPED_FRAMES_FIELD_NUMBER = 25;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 30;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 29;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 31;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 22;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 20;
    public static final int RENDERED_FRAMES_FIELD_NUMBER = 24;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 32;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int TIME_SINCE_LAST_HEARTBEAT_FIELD_NUMBER = 23;
    public static final int VIDEO_DECODER_NAME_FIELD_NUMBER = 26;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int battery_;
    private long beginTrackingTimestamp_;
    private int bitField0_;
    private int bitrate_;
    private long createdTime_;
    private long droppedFrames_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private long mediaDuration_;
    private long playerPosition_;
    private long renderedFrames_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private long timeSinceLastHeartbeat_;
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
    private String reason_ = "";
    private String videoDecoderName_ = "";
    private String audioDecoderName_ = "";

    static {
        MediaPlaybackBeacon mediaPlaybackBeacon = new MediaPlaybackBeacon();
        DEFAULT_INSTANCE = mediaPlaybackBeacon;
        AbstractC0269h.registerDefaultInstance(MediaPlaybackBeacon.class, mediaPlaybackBeacon);
    }

    private MediaPlaybackBeacon() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13951A(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 4096;
        mediaPlaybackBeacon.networkState_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m13952B(MediaPlaybackBeacon mediaPlaybackBeacon) {
        mediaPlaybackBeacon.getClass();
        mediaPlaybackBeacon.bitField0_ |= 16384;
        mediaPlaybackBeacon.playbackDestination_ = "device";
    }

    /* JADX INFO: renamed from: C */
    public static void m13953C(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 4;
        mediaPlaybackBeacon.playbackId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m13954D(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 256;
        mediaPlaybackBeacon.playerPosition_ = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m13955E(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 32;
        mediaPlaybackBeacon.playerType_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m13956F(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 33554432;
        mediaPlaybackBeacon.reason_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m13957G(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 268435456;
        mediaPlaybackBeacon.renderedFrames_ = j;
    }

    /* JADX INFO: renamed from: H */
    public static void m13958H(MediaPlaybackBeacon mediaPlaybackBeacon, int i) {
        mediaPlaybackBeacon.bitField0_ |= 8388608;
        mediaPlaybackBeacon.sequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: I */
    public static void m13959I(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 8;
        mediaPlaybackBeacon.sessionId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m13960J(MediaPlaybackBeacon mediaPlaybackBeacon, float f) {
        mediaPlaybackBeacon.bitField0_ |= 1024;
        mediaPlaybackBeacon.speed_ = f;
    }

    /* JADX INFO: renamed from: K */
    public static void m13961K(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 65536;
        mediaPlaybackBeacon.streamingType_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m13962L(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 512;
        mediaPlaybackBeacon.subtitleLanguage_ = str;
    }

    /* JADX INFO: renamed from: M */
    public static void m13963M(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 131072;
        mediaPlaybackBeacon.surface_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static void m13964N(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 134217728;
        mediaPlaybackBeacon.timeSinceLastHeartbeat_ = j;
    }

    /* JADX INFO: renamed from: O */
    public static void m13965O(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 1073741824;
        mediaPlaybackBeacon.videoDecoderName_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m13966P(MediaPlaybackBeacon mediaPlaybackBeacon, float f) {
        mediaPlaybackBeacon.bitField0_ |= 2048;
        mediaPlaybackBeacon.volume_ = f;
    }

    /* JADX INFO: renamed from: Q */
    public static dkd0 m13967Q() {
        return (dkd0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13968n(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= Integer.MIN_VALUE;
        mediaPlaybackBeacon.audioDecoderName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13969o(MediaPlaybackBeacon mediaPlaybackBeacon, int i) {
        mediaPlaybackBeacon.bitField0_ |= 262144;
        mediaPlaybackBeacon.battery_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m13970p(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 67108864;
        mediaPlaybackBeacon.beginTrackingTimestamp_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13971q(MediaPlaybackBeacon mediaPlaybackBeacon, int i) {
        mediaPlaybackBeacon.bitField0_ |= 8192;
        mediaPlaybackBeacon.bitrate_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m13972r(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 16777216;
        mediaPlaybackBeacon.createdTime_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13973s(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 536870912;
        mediaPlaybackBeacon.droppedFrames_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m13974t(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 2;
        mediaPlaybackBeacon.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13975u(MediaPlaybackBeacon mediaPlaybackBeacon, boolean z) {
        mediaPlaybackBeacon.bitField0_ |= 32768;
        mediaPlaybackBeacon.isAudioOnly_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m13976v(MediaPlaybackBeacon mediaPlaybackBeacon, boolean z) {
        mediaPlaybackBeacon.bitField0_ |= 128;
        mediaPlaybackBeacon.isPlaying_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m13977w(MediaPlaybackBeacon mediaPlaybackBeacon, boolean z) {
        mediaPlaybackBeacon.bitField0_ |= 524288;
        mediaPlaybackBeacon.isPowerSaverActive_ = z;
    }

    /* JADX INFO: renamed from: x */
    public static void m13978x(MediaPlaybackBeacon mediaPlaybackBeacon, long j) {
        mediaPlaybackBeacon.bitField0_ |= 64;
        mediaPlaybackBeacon.mediaDuration_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m13979y(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 16;
        mediaPlaybackBeacon.mediaType_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m13980z(MediaPlaybackBeacon mediaPlaybackBeacon, String str) {
        mediaPlaybackBeacon.getClass();
        str.getClass();
        mediaPlaybackBeacon.bitField0_ |= 1;
        mediaPlaybackBeacon.mediaUrl_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001  \u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014ဈ\u0019\u0015ဂ\u001a\u0016ဈ\u0004\u0017ဂ\u001b\u0018ဂ\u001c\u0019ဂ\u001d\u001aဈ\u001e\u001bဈ\u001f\u001cင\u0012\u001dဇ\u0013\u001eဇ\u0014\u001fဇ\u0015 ဇ\u0016", new Object[]{"bitField0_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "reason_", "beginTrackingTimestamp_", "mediaType_", "timeSinceLastHeartbeat_", "renderedFrames_", "droppedFrames_", "videoDecoderName_", "audioDecoderName_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackBeacon();
        }
        if (iOrdinal == 4) {
            return new dkd0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackBeacon.class) {
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
