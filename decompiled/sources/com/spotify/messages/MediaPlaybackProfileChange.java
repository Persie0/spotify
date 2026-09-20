package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.mkd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaPlaybackProfileChange extends AbstractC0269h implements sre0 {
    public static final int AUDIO_CODEC_FIELD_NUMBER = 28;
    public static final int AUDIO_PROFILE_ID_FIELD_NUMBER = 31;
    public static final int AVG_BITRATE_AUDIO_FIELD_NUMBER = 24;
    public static final int AVG_BITRATE_VIDEO_FIELD_NUMBER = 26;
    public static final int BATTERY_FIELD_NUMBER = 35;
    public static final int BITRATE_FIELD_NUMBER = 13;
    public static final int CREATED_TIME_FIELD_NUMBER = 19;
    private static final MediaPlaybackProfileChange DEFAULT_INSTANCE;
    public static final int ENCODED_DISPLAY_HEIGHT_FIELD_NUMBER = 23;
    public static final int ENCODED_DISPLAY_WIDTH_FIELD_NUMBER = 22;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int FRAME_RATE_FIELD_NUMBER = 30;
    public static final int IS_AUDIO_ONLY_FIELD_NUMBER = 15;
    public static final int IS_BACKGROUNDED_FIELD_NUMBER = 37;
    public static final int IS_PLAYING_FIELD_NUMBER = 7;
    public static final int IS_POWER_SAVER_ACTIVE_FIELD_NUMBER = 36;
    public static final int IS_VIDEO_DISABLED_FIELD_NUMBER = 38;
    public static final int MAX_BITRATE_AUDIO_FIELD_NUMBER = 25;
    public static final int MAX_BITRATE_VIDEO_FIELD_NUMBER = 27;
    public static final int MEDIA_DURATION_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 34;
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
    public static final int SUBTITLES_ACTIVE_FIELD_NUMBER = 39;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 9;
    public static final int SURFACE_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 33;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 29;
    public static final int VIDEO_PROFILE_ID_FIELD_NUMBER = 32;
    public static final int VIEWING_DISPLAY_HEIGHT_FIELD_NUMBER = 21;
    public static final int VIEWING_DISPLAY_WIDTH_FIELD_NUMBER = 20;
    public static final int VOLUME_FIELD_NUMBER = 11;
    private int avgBitrateAudio_;
    private int avgBitrateVideo_;
    private int battery_;
    private int bitField0_;
    private int bitField1_;
    private int bitrate_;
    private long createdTime_;
    private int encodedDisplayHeight_;
    private int encodedDisplayWidth_;
    private int frameRate_;
    private boolean isAudioOnly_;
    private boolean isBackgrounded_;
    private boolean isPlaying_;
    private boolean isPowerSaverActive_;
    private boolean isVideoDisabled_;
    private int maxBitrateAudio_;
    private int maxBitrateVideo_;
    private long mediaDuration_;
    private long playerPosition_;
    private int sequenceNumber_;
    private float speed_;
    private boolean subtitlesActive_;
    private int viewingDisplayHeight_;
    private int viewingDisplayWidth_;
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
    private String audioCodec_ = "";
    private String videoCodec_ = "";
    private String audioProfileId_ = "";
    private String videoProfileId_ = "";
    private String type_ = "";

    static {
        MediaPlaybackProfileChange mediaPlaybackProfileChange = new MediaPlaybackProfileChange();
        DEFAULT_INSTANCE = mediaPlaybackProfileChange;
        AbstractC0269h.registerDefaultInstance(MediaPlaybackProfileChange.class, mediaPlaybackProfileChange);
    }

    private MediaPlaybackProfileChange() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14102A(MediaPlaybackProfileChange mediaPlaybackProfileChange, boolean z) {
        mediaPlaybackProfileChange.bitField0_ |= 524288;
        mediaPlaybackProfileChange.isPowerSaverActive_ = z;
    }

    /* JADX INFO: renamed from: B */
    public static void m14103B(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 1073741824;
        mediaPlaybackProfileChange.maxBitrateAudio_ = i;
    }

    /* JADX INFO: renamed from: C */
    public static void m14104C(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField1_ |= 1;
        mediaPlaybackProfileChange.maxBitrateVideo_ = i;
    }

    /* JADX INFO: renamed from: D */
    public static void m14105D(MediaPlaybackProfileChange mediaPlaybackProfileChange, long j) {
        mediaPlaybackProfileChange.bitField0_ |= 64;
        mediaPlaybackProfileChange.mediaDuration_ = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m14106E(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 16;
        mediaPlaybackProfileChange.mediaType_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14107F(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 1;
        mediaPlaybackProfileChange.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m14108G(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 4096;
        mediaPlaybackProfileChange.networkState_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14109H(MediaPlaybackProfileChange mediaPlaybackProfileChange) {
        mediaPlaybackProfileChange.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 16384;
        mediaPlaybackProfileChange.playbackDestination_ = "device";
    }

    /* JADX INFO: renamed from: I */
    public static void m14110I(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 4;
        mediaPlaybackProfileChange.playbackId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m14111J(MediaPlaybackProfileChange mediaPlaybackProfileChange, long j) {
        mediaPlaybackProfileChange.bitField0_ |= 256;
        mediaPlaybackProfileChange.playerPosition_ = j;
    }

    /* JADX INFO: renamed from: K */
    public static void m14112K(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 32;
        mediaPlaybackProfileChange.playerType_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m14113L(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 8388608;
        mediaPlaybackProfileChange.sequenceNumber_ = i;
    }

    /* JADX INFO: renamed from: M */
    public static void m14114M(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 8;
        mediaPlaybackProfileChange.sessionId_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static void m14115N(MediaPlaybackProfileChange mediaPlaybackProfileChange, float f) {
        mediaPlaybackProfileChange.bitField0_ |= 1024;
        mediaPlaybackProfileChange.speed_ = f;
    }

    /* JADX INFO: renamed from: O */
    public static void m14116O(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 65536;
        mediaPlaybackProfileChange.streamingType_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m14117P(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 512;
        mediaPlaybackProfileChange.subtitleLanguage_ = str;
    }

    /* JADX INFO: renamed from: Q */
    public static void m14118Q(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 131072;
        mediaPlaybackProfileChange.surface_ = str;
    }

    /* JADX INFO: renamed from: R */
    public static void m14119R(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField1_ |= 64;
        mediaPlaybackProfileChange.type_ = str;
    }

    /* JADX INFO: renamed from: S */
    public static void m14120S(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField1_ |= 4;
        mediaPlaybackProfileChange.videoCodec_ = str;
    }

    /* JADX INFO: renamed from: T */
    public static void m14121T(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField1_ |= 32;
        mediaPlaybackProfileChange.videoProfileId_ = str;
    }

    /* JADX INFO: renamed from: U */
    public static void m14122U(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 67108864;
        mediaPlaybackProfileChange.viewingDisplayHeight_ = i;
    }

    /* JADX INFO: renamed from: V */
    public static void m14123V(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 33554432;
        mediaPlaybackProfileChange.viewingDisplayWidth_ = i;
    }

    /* JADX INFO: renamed from: W */
    public static void m14124W(MediaPlaybackProfileChange mediaPlaybackProfileChange, float f) {
        mediaPlaybackProfileChange.bitField0_ |= 2048;
        mediaPlaybackProfileChange.volume_ = f;
    }

    /* JADX INFO: renamed from: X */
    public static mkd0 m14125X() {
        return (mkd0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14126n(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField1_ |= 2;
        mediaPlaybackProfileChange.audioCodec_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14127o(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField1_ |= 16;
        mediaPlaybackProfileChange.audioProfileId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14128p(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 536870912;
        mediaPlaybackProfileChange.avgBitrateAudio_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14129q(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= Integer.MIN_VALUE;
        mediaPlaybackProfileChange.avgBitrateVideo_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m14130r(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 262144;
        mediaPlaybackProfileChange.battery_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m14131s(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 8192;
        mediaPlaybackProfileChange.bitrate_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m14132t(MediaPlaybackProfileChange mediaPlaybackProfileChange, long j) {
        mediaPlaybackProfileChange.bitField0_ |= 16777216;
        mediaPlaybackProfileChange.createdTime_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14133u(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 268435456;
        mediaPlaybackProfileChange.encodedDisplayHeight_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m14134v(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField0_ |= 134217728;
        mediaPlaybackProfileChange.encodedDisplayWidth_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m14135w(MediaPlaybackProfileChange mediaPlaybackProfileChange, String str) {
        mediaPlaybackProfileChange.getClass();
        str.getClass();
        mediaPlaybackProfileChange.bitField0_ |= 2;
        mediaPlaybackProfileChange.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14136x(MediaPlaybackProfileChange mediaPlaybackProfileChange, int i) {
        mediaPlaybackProfileChange.bitField1_ |= 8;
        mediaPlaybackProfileChange.frameRate_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m14137y(MediaPlaybackProfileChange mediaPlaybackProfileChange, boolean z) {
        mediaPlaybackProfileChange.bitField0_ |= 32768;
        mediaPlaybackProfileChange.isAudioOnly_ = z;
    }

    /* JADX INFO: renamed from: z */
    public static void m14138z(MediaPlaybackProfileChange mediaPlaybackProfileChange, boolean z) {
        mediaPlaybackProfileChange.bitField0_ |= 128;
        mediaPlaybackProfileChange.isPlaying_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001'\u0000\u0002\u0001''\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဇ\u0007\bဂ\b\tဈ\t\nခ\n\u000bခ\u000b\fဈ\f\rင\r\u000eဈ\u000e\u000fဇ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012င\u0017\u0013ဂ\u0018\u0014င\u0019\u0015င\u001a\u0016င\u001b\u0017င\u001c\u0018င\u001d\u0019င\u001e\u001aင\u001f\u001bင \u001cဈ!\u001dဈ\"\u001eင#\u001fဈ$ ဈ%!ဈ&\"ဈ\u0004#င\u0012$ဇ\u0013%ဇ\u0014&ဇ\u0015'ဇ\u0016", new Object[]{"bitField0_", "bitField1_", "mediaUrl_", "featureIdentifier_", "playbackId_", "sessionId_", "playerType_", "mediaDuration_", "isPlaying_", "playerPosition_", "subtitleLanguage_", "speed_", "volume_", "networkState_", "bitrate_", "playbackDestination_", "isAudioOnly_", "streamingType_", "surface_", "sequenceNumber_", "createdTime_", "viewingDisplayWidth_", "viewingDisplayHeight_", "encodedDisplayWidth_", "encodedDisplayHeight_", "avgBitrateAudio_", "maxBitrateAudio_", "avgBitrateVideo_", "maxBitrateVideo_", "audioCodec_", "videoCodec_", "frameRate_", "audioProfileId_", "videoProfileId_", "type_", "mediaType_", "battery_", "isPowerSaverActive_", "isBackgrounded_", "isVideoDisabled_", "subtitlesActive_"});
        }
        if (iOrdinal == 3) {
            return new MediaPlaybackProfileChange();
        }
        if (iOrdinal == 4) {
            return new mkd0(DEFAULT_INSTANCE);
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
        synchronized (MediaPlaybackProfileChange.class) {
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
