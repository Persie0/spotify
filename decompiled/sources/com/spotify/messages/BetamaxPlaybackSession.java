package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.da9;
import p204p.ea9;
import p204p.fa9;
import p204p.gva;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxPlaybackSession extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 32;
    public static final int AVERAGE_DEVICE_ORIENTATION_FIELD_NUMBER = 30;
    public static final int CLIENT_METADATA_FIELD_NUMBER = 48;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 23;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 22;
    private static final BetamaxPlaybackSession DEFAULT_INSTANCE;
    public static final int DESKTOP_UI_FIELD_NUMBER = 37;
    public static final int DID_ATTEMPT_TO_PLAY_FIELD_NUMBER = 52;
    public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 25;
    public static final int EXIT_REASON_FIELD_NUMBER = 31;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int IS_ROYALTY_MEDIA_FIELD_NUMBER = 35;
    public static final int KBPS_AVERAGE_BANDWIDTH_FIELD_NUMBER = 24;
    public static final int KBYTES_DOWNLOADED_FIELD_NUMBER = 27;
    public static final int KBYTES_FROM_CACHE_FIELD_NUMBER = 50;
    public static final int KBYTES_PLAYED_FIELD_NUMBER = 26;
    public static final int LAST_USED_SUBTITLE_FIELD_NUMBER = 33;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 46;
    public static final int MEDIA_URL_FIELD_NUMBER = 3;
    public static final int MS_BUFFERING_FORCED_FIELD_NUMBER = 44;
    public static final int MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER = 45;
    public static final int MS_BUFFERING_SEEK_FIELD_NUMBER = 11;
    public static final int MS_BUFFERING_SEEK_LONGEST_FIELD_NUMBER = 12;
    public static final int MS_BUFFERING_STALL_FIELD_NUMBER = 13;
    public static final int MS_BUFFERING_STALL_LONGEST_FIELD_NUMBER = 14;
    public static final int MS_BUFFERING_STUTTER_FIELD_NUMBER = 39;
    public static final int MS_BUFFERING_STUTTER_LONGEST_FIELD_NUMBER = 40;
    public static final int MS_DURATION_FIELD_NUMBER = 6;
    public static final int MS_ENCRYPTION_LOAD_TIME_FIELD_NUMBER = 9;
    public static final int MS_INITIAL_BUFFERING_FIELD_NUMBER = 10;
    public static final int MS_MANIFEST_LOAD_TIME_FIELD_NUMBER = 8;
    public static final int MS_PERCEIVED_TIME_TO_FIRST_FRAME_FIELD_NUMBER = 51;
    public static final int MS_PLAYED_AUDIBLE_FIELD_NUMBER = 53;
    public static final int MS_PLAYED_BACKGROUND_FIELD_NUMBER = 19;
    public static final int MS_PLAYED_EXTERNAL_FIELD_NUMBER = 38;
    public static final int MS_PLAYED_FIELD_NUMBER = 18;
    public static final int MS_PLAYED_FULLSCREEN_FIELD_NUMBER = 20;
    public static final int MS_PLAYED_INTERNAL_FIELD_NUMBER = 47;
    public static final int MS_PLAYED_NOMINAL_FIELD_NUMBER = 34;
    public static final int MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER = 56;
    public static final int MS_PLAYED_PER_SURFACE_FIELD_NUMBER = 49;
    public static final int MS_PLAYED_SUBTITLES_FIELD_NUMBER = 21;
    public static final int MS_PLAYED_VIDEO_DISABLED_FIELD_NUMBER = 43;
    public static final int MS_START_POSITION_FIELD_NUMBER = 4;
    public static final int MS_START_TIME_FIELD_NUMBER = 7;
    public static final int N_DROPPED_FRAMES_FIELD_NUMBER = 29;
    public static final int N_FORCED_REBUFFER_FIELD_NUMBER = 42;
    public static final int N_SEEKBACK_FIELD_NUMBER = 16;
    public static final int N_SEEKFORWARD_FIELD_NUMBER = 17;
    public static final int N_STALLS_FIELD_NUMBER = 15;
    public static final int N_STUTTERS_FIELD_NUMBER = 41;
    public static final int N_VIEW_TRANSITIONS_FIELD_NUMBER = 28;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 54;
    public static final int PLAYER_ID_FIELD_NUMBER = 55;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int START_BITRATE_FIELD_NUMBER = 5;
    public static final int STREAMING_TYPE_FIELD_NUMBER = 36;
    private float aspectRatio_;
    private float averageDeviceOrientation_;
    private int bitField0_;
    private int bitField1_;
    private ihc0 clientMetadata_;
    private String connectionTypeEnd_;
    private String connectionTypeStart_;
    private String desktopUi_;
    private boolean didAttemptToPlay_;
    private String encryptionType_;
    private String exitReason_;
    private String featureIdentifier_;
    private boolean isRoyaltyMedia_;
    private int kbpsAverageBandwidth_;
    private long kbytesDownloaded_;
    private long kbytesFromCache_;
    private long kbytesPlayed_;
    private String lastUsedSubtitle_;
    private String mediaType_;
    private String mediaUrl_;
    private long msBufferingForcedLongest_;
    private long msBufferingForced_;
    private long msBufferingSeekLongest_;
    private long msBufferingSeek_;
    private long msBufferingStallLongest_;
    private long msBufferingStall_;
    private long msBufferingStutterLongest_;
    private long msBufferingStutter_;
    private long msDuration_;
    private long msEncryptionLoadTime_;
    private long msInitialBuffering_;
    private long msManifestLoadTime_;
    private long msPerceivedTimeToFirstFrame_;
    private long msPlayedAudible_;
    private long msPlayedBackground_;
    private long msPlayedExternal_;
    private long msPlayedFullscreen_;
    private long msPlayedInternal_;
    private long msPlayedNominalInternal_;
    private long msPlayedNominal_;
    private ihc0 msPlayedPerSurface_;
    private long msPlayedSubtitles_;
    private long msPlayedVideoDisabled_;
    private long msPlayed_;
    private long msStartPosition_;
    private long msStartTime_;
    private long nDroppedFrames_;
    private int nForcedRebuffer_;
    private int nSeekback_;
    private int nSeekforward_;
    private int nStalls_;
    private int nStutters_;
    private int nViewTransitions_;
    private gva playbackId_;
    private String playerId_;
    private String sessionId_;
    private int startBitrate_;
    private String streamingType_;

    static {
        BetamaxPlaybackSession betamaxPlaybackSession = new BetamaxPlaybackSession();
        DEFAULT_INSTANCE = betamaxPlaybackSession;
        AbstractC0269h.registerDefaultInstance(BetamaxPlaybackSession.class, betamaxPlaybackSession);
    }

    private BetamaxPlaybackSession() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.clientMetadata_ = ihc0Var;
        this.msPlayedPerSurface_ = ihc0Var;
        this.sessionId_ = "";
        this.featureIdentifier_ = "";
        this.mediaUrl_ = "";
        this.connectionTypeStart_ = "";
        this.connectionTypeEnd_ = "";
        this.encryptionType_ = "";
        this.exitReason_ = "";
        this.lastUsedSubtitle_ = "";
        this.streamingType_ = "";
        this.desktopUi_ = "";
        this.mediaType_ = "";
        this.playbackId_ = gva.f84678b;
        this.playerId_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static void m13633A(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 32768;
        betamaxPlaybackSession.kbytesFromCache_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m13634B(BetamaxPlaybackSession betamaxPlaybackSession) {
        betamaxPlaybackSession.bitField0_ |= 33554432;
        betamaxPlaybackSession.kbytesPlayed_ = 0L;
    }

    /* JADX INFO: renamed from: C */
    public static void m13635C(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField1_ |= 1;
        betamaxPlaybackSession.lastUsedSubtitle_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m13636D(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField1_ |= 8192;
        betamaxPlaybackSession.mediaType_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m13637E(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.bitField0_ |= 4;
        betamaxPlaybackSession.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m13638F(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 1024;
        betamaxPlaybackSession.msBufferingSeek_ = j;
    }

    /* JADX INFO: renamed from: G */
    public static void m13639G(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 2048;
        betamaxPlaybackSession.msBufferingSeekLongest_ = j;
    }

    /* JADX INFO: renamed from: H */
    public static void m13640H(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 4096;
        betamaxPlaybackSession.msBufferingStall_ = j;
    }

    /* JADX INFO: renamed from: I */
    public static void m13641I(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 8192;
        betamaxPlaybackSession.msBufferingStallLongest_ = j;
    }

    /* JADX INFO: renamed from: J */
    public static void m13642J(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 64;
        betamaxPlaybackSession.msBufferingStutter_ = j;
    }

    /* JADX INFO: renamed from: K */
    public static void m13643K(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 128;
        betamaxPlaybackSession.msBufferingStutterLongest_ = j;
    }

    /* JADX INFO: renamed from: L */
    public static void m13644L(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 32;
        betamaxPlaybackSession.msDuration_ = j;
    }

    /* JADX INFO: renamed from: M */
    public static void m13645M(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 256;
        betamaxPlaybackSession.msEncryptionLoadTime_ = j;
    }

    /* JADX INFO: renamed from: N */
    public static void m13646N(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 512;
        betamaxPlaybackSession.msInitialBuffering_ = j;
    }

    /* JADX INFO: renamed from: O */
    public static void m13647O(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 128;
        betamaxPlaybackSession.msManifestLoadTime_ = j;
    }

    /* JADX INFO: renamed from: P */
    public static void m13648P(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 65536;
        betamaxPlaybackSession.msPerceivedTimeToFirstFrame_ = j;
    }

    /* JADX INFO: renamed from: Q */
    public static void m13649Q(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 131072;
        betamaxPlaybackSession.msPlayed_ = j;
    }

    /* JADX INFO: renamed from: R */
    public static void m13650R(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 262144;
        betamaxPlaybackSession.msPlayedAudible_ = j;
    }

    /* JADX INFO: renamed from: S */
    public static void m13651S(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 262144;
        betamaxPlaybackSession.msPlayedBackground_ = j;
    }

    /* JADX INFO: renamed from: T */
    public static void m13652T(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 524288;
        betamaxPlaybackSession.msPlayedFullscreen_ = j;
    }

    /* JADX INFO: renamed from: U */
    public static void m13653U(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 16384;
        betamaxPlaybackSession.msPlayedInternal_ = j;
    }

    /* JADX INFO: renamed from: V */
    public static void m13654V(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 2;
        betamaxPlaybackSession.msPlayedNominal_ = j;
    }

    /* JADX INFO: renamed from: W */
    public static void m13655W(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 1048576;
        betamaxPlaybackSession.msPlayedSubtitles_ = j;
    }

    /* JADX INFO: renamed from: X */
    public static void m13656X(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField1_ |= 1024;
        betamaxPlaybackSession.msPlayedVideoDisabled_ = j;
    }

    /* JADX INFO: renamed from: Y */
    public static void m13657Y(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 8;
        betamaxPlaybackSession.msStartPosition_ = j;
    }

    /* JADX INFO: renamed from: Z */
    public static void m13658Z(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 64;
        betamaxPlaybackSession.msStartTime_ = j;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m13659a0(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 268435456;
        betamaxPlaybackSession.nDroppedFrames_ = j;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m13660b0(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField0_ |= 32768;
        betamaxPlaybackSession.nSeekback_ = i;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m13661c0(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField0_ |= 65536;
        betamaxPlaybackSession.nSeekforward_ = i;
    }

    /* JADX INFO: renamed from: d0 */
    public static void m13662d0(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField0_ |= 16384;
        betamaxPlaybackSession.nStalls_ = i;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m13663e0(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField1_ |= 256;
        betamaxPlaybackSession.nStutters_ = i;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m13664f0(BetamaxPlaybackSession betamaxPlaybackSession, cva cvaVar) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField1_ |= 524288;
        betamaxPlaybackSession.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m13665g0(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.bitField1_ |= 1048576;
        betamaxPlaybackSession.playerId_ = str;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m13666h0(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.bitField0_ |= 1;
        betamaxPlaybackSession.sessionId_ = str;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m13667i0(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField0_ |= 16;
        betamaxPlaybackSession.startBitrate_ = i;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m13668j0(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField1_ |= 8;
        betamaxPlaybackSession.streamingType_ = str;
    }

    /* JADX INFO: renamed from: l0 */
    public static da9 m13669l0() {
        return (da9) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13670n(BetamaxPlaybackSession betamaxPlaybackSession) {
        ihc0 ihc0Var = betamaxPlaybackSession.clientMetadata_;
        if (!ihc0Var.f102236a) {
            betamaxPlaybackSession.clientMetadata_ = ihc0Var.m50613h();
        }
        return betamaxPlaybackSession.clientMetadata_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m13671o(BetamaxPlaybackSession betamaxPlaybackSession) {
        ihc0 ihc0Var = betamaxPlaybackSession.msPlayedPerSurface_;
        if (!ihc0Var.f102236a) {
            betamaxPlaybackSession.msPlayedPerSurface_ = ihc0Var.m50613h();
        }
        return betamaxPlaybackSession.msPlayedPerSurface_;
    }

    /* JADX INFO: renamed from: p */
    public static void m13672p(BetamaxPlaybackSession betamaxPlaybackSession, float f) {
        betamaxPlaybackSession.bitField0_ |= Integer.MIN_VALUE;
        betamaxPlaybackSession.aspectRatio_ = f;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13673q(BetamaxPlaybackSession betamaxPlaybackSession, float f) {
        betamaxPlaybackSession.bitField0_ |= 536870912;
        betamaxPlaybackSession.averageDeviceOrientation_ = f;
    }

    /* JADX INFO: renamed from: r */
    public static void m13674r(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField0_ |= 4194304;
        betamaxPlaybackSession.connectionTypeEnd_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13675s(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.bitField0_ |= 2097152;
        betamaxPlaybackSession.connectionTypeStart_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13676t(BetamaxPlaybackSession betamaxPlaybackSession, boolean z) {
        betamaxPlaybackSession.bitField1_ |= 131072;
        betamaxPlaybackSession.didAttemptToPlay_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m13677u(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField0_ |= 16777216;
        betamaxPlaybackSession.encryptionType_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13678v(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        betamaxPlaybackSession.bitField0_ |= 1073741824;
        betamaxPlaybackSession.exitReason_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13679w(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.bitField0_ |= 2;
        betamaxPlaybackSession.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m13680x(BetamaxPlaybackSession betamaxPlaybackSession, boolean z) {
        betamaxPlaybackSession.bitField1_ |= 4;
        betamaxPlaybackSession.isRoyaltyMedia_ = z;
    }

    /* JADX INFO: renamed from: y */
    public static void m13681y(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.bitField0_ |= 8388608;
        betamaxPlaybackSession.kbpsAverageBandwidth_ = i;
    }

    /* JADX INFO: renamed from: z */
    public static void m13682z(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.bitField0_ |= 67108864;
        betamaxPlaybackSession.kbytesDownloaded_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u00018\u0000\u0002\u000188\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဈ\u0015\u0017ဈ\u0016\u0018င\u0017\u0019ဈ\u0018\u001aဂ\u0019\u001bဂ\u001a\u001cင\u001b\u001dဂ\u001c\u001eခ\u001d\u001fဈ\u001e ခ\u001f!ဈ \"ဂ!#ဇ\"$ဈ#%ဈ$&ဂ%'ဂ&(ဂ')င(*င)+ဂ*,ဂ+-ဂ,.ဈ-/ဂ.02122ဂ/3ဂ04ဇ15ဂ26ည37ဈ48ဂ5", new Object[]{"bitField0_", "bitField1_", "sessionId_", "featureIdentifier_", "mediaUrl_", "msStartPosition_", "startBitrate_", "msDuration_", "msStartTime_", "msManifestLoadTime_", "msEncryptionLoadTime_", "msInitialBuffering_", "msBufferingSeek_", "msBufferingSeekLongest_", "msBufferingStall_", "msBufferingStallLongest_", "nStalls_", "nSeekback_", "nSeekforward_", "msPlayed_", "msPlayedBackground_", "msPlayedFullscreen_", "msPlayedSubtitles_", "connectionTypeStart_", "connectionTypeEnd_", "kbpsAverageBandwidth_", "encryptionType_", "kbytesPlayed_", "kbytesDownloaded_", "nViewTransitions_", "nDroppedFrames_", "averageDeviceOrientation_", "exitReason_", "aspectRatio_", "lastUsedSubtitle_", "msPlayedNominal_", "isRoyaltyMedia_", "streamingType_", "desktopUi_", "msPlayedExternal_", "msBufferingStutter_", "msBufferingStutterLongest_", "nStutters_", "nForcedRebuffer_", "msPlayedVideoDisabled_", "msBufferingForced_", "msBufferingForcedLongest_", "mediaType_", "msPlayedInternal_", "clientMetadata_", ea9.f57604a, "msPlayedPerSurface_", fa9.f67491a, "kbytesFromCache_", "msPerceivedTimeToFirstFrame_", "didAttemptToPlay_", "msPlayedAudible_", "playbackId_", "playerId_", "msPlayedNominalInternal_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxPlaybackSession();
        }
        if (iOrdinal == 4) {
            return new da9(DEFAULT_INSTANCE);
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
        synchronized (BetamaxPlaybackSession.class) {
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

    /* JADX INFO: renamed from: k0 */
    public final String m13683k0() {
        return this.featureIdentifier_;
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
