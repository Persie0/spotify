package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gkd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPlaybackInitializationEnd extends AbstractC0269h implements sre0 {
    public static final int BATTERY_FIELD_NUMBER = 21;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackInitializationEnd DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 23;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 22;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 24;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 20;
    public static final int MEDIA_URL_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_DESTINATION_FIELD_NUMBER = 14;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYER_POSITION_FIELD_NUMBER = 8;
    public static final int PLAYER_TYPE_FIELD_NUMBER = 5;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 18;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 10;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 16;
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 25;
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

    static {
        MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd = new MediaPlaybackInitializationEnd();
        DEFAULT_INSTANCE = mediaPlaybackInitializationEnd;
        AbstractC0269h.registerDefaultInstance(MediaPlaybackInitializationEnd.class, mediaPlaybackInitializationEnd);
    }

    private MediaPlaybackInitializationEnd() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14008A(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, long j) {
        mediaPlaybackInitializationEnd.bitField0_ |= 256;
        mediaPlaybackInitializationEnd.playerPosition_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m14009B(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 32;
        mediaPlaybackInitializationEnd.playerType_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m14010C(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, int i) {
        mediaPlaybackInitializationEnd.bitField0_ |= 8388608;
        mediaPlaybackInitializationEnd.sequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: D */
    public static void m14011D(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 8;
        mediaPlaybackInitializationEnd.sessionId_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14012E(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, float f) {
        mediaPlaybackInitializationEnd.bitField0_ |= 1024;
        mediaPlaybackInitializationEnd.speed_ = f;
    }

    /* JADX INFO: renamed from: F */
    public static void m14013F(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 65536;
        mediaPlaybackInitializationEnd.streamingType_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m14014G(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 512;
        mediaPlaybackInitializationEnd.subtitleLanguage_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14015H(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 131072;
        mediaPlaybackInitializationEnd.surface_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14016I(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, float f) {
        mediaPlaybackInitializationEnd.bitField0_ |= 2048;
        mediaPlaybackInitializationEnd.volume_ = f;
    }

    /* JADX INFO: renamed from: J */
    public static gkd0 m14017J() {
        return (gkd0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14018n(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, int i) {
        mediaPlaybackInitializationEnd.bitField0_ |= 262144;
        mediaPlaybackInitializationEnd.battery_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m14019o(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, int i) {
        mediaPlaybackInitializationEnd.bitField0_ |= 8192;
        mediaPlaybackInitializationEnd.bitrate_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m14020p(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, long j) {
        mediaPlaybackInitializationEnd.bitField0_ |= 16777216;
        mediaPlaybackInitializationEnd.createdTime_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14021q(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 2;
        mediaPlaybackInitializationEnd.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14022r(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, boolean z) {
        mediaPlaybackInitializationEnd.bitField0_ |= 32768;
        mediaPlaybackInitializationEnd.isAudioOnly_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m14023s(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, boolean z) {
        mediaPlaybackInitializationEnd.bitField0_ |= 128;
        mediaPlaybackInitializationEnd.isPlaying_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m14024t(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, boolean z) {
        mediaPlaybackInitializationEnd.bitField0_ |= 524288;
        mediaPlaybackInitializationEnd.isPowerSaverActive_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m14025u(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, long j) {
        mediaPlaybackInitializationEnd.bitField0_ |= 64;
        mediaPlaybackInitializationEnd.mediaDuration_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m14026v(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 16;
        mediaPlaybackInitializationEnd.mediaType_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14027w(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 1;
        mediaPlaybackInitializationEnd.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14028x(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 4096;
        mediaPlaybackInitializationEnd.networkState_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m14029y(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd) {
        mediaPlaybackInitializationEnd.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 16384;
        mediaPlaybackInitializationEnd.playbackDestination_ = "device";
    }

    /* JADX INFO: renamed from: z */
    public static void m14030z(MediaPlaybackInitializationEnd mediaPlaybackInitializationEnd, String str) {
        mediaPlaybackInitializationEnd.getClass();
        str.getClass();
        mediaPlaybackInitializationEnd.bitField0_ |= 4;
        mediaPlaybackInitializationEnd.playbackId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014ဈ\u0004\u0015င\u0012\u0016ဇ\u0013\u0017ဇ\u0014\u0018ဇ\u0015\u0019ဇ\u0016", new Object[]{"bitField0_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "mediaType_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackInitializationEnd();
        }
        if (iOrdinal == 4) {
            return new gkd0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackInitializationEnd.class) {
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
