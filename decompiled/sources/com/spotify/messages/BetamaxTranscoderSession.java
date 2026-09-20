package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.lb9;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxTranscoderSession extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_MEMORY_BYTES_AT_START_FIELD_NUMBER = 16;
    public static final int BITRATE_FIELD_NUMBER = 8;
    public static final int BYTES_TRANSFERRED_CACHE_FIELD_NUMBER = 7;
    public static final int BYTES_TRANSFERRED_NETWORK_FIELD_NUMBER = 6;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 13;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 12;
    private static final BetamaxTranscoderSession DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 14;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 15;
    public static final int MS_TRANSCODE_END_FIELD_NUMBER = 4;
    public static final int MS_TRANSCODE_REQUESTED_FIELD_NUMBER = 2;
    public static final int MS_TRANSCODE_START_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 5;
    public static final int RESOLUTION_HEIGHT_FIELD_NUMBER = 10;
    public static final int RESOLUTION_WIDTH_FIELD_NUMBER = 9;
    public static final int TOTAL_MEMORY_BYTES_FIELD_NUMBER = 17;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 1;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 11;
    private long availableMemoryBytesAtStart_;
    private int bitField0_;
    private long bitrate_;
    private long bytesTransferredCache_;
    private long bytesTransferredNetwork_;
    private int errorCode_;
    private long msTranscodeEnd_;
    private long msTranscodeRequested_;
    private long msTranscodeStart_;
    private int resolutionHeight_;
    private int resolutionWidth_;
    private long totalMemoryBytes_;
    private String transcodingId_ = "";
    private String reasonEnd_ = "";
    private String videoCodec_ = "";
    private String connectionTypeStart_ = "";
    private String connectionTypeEnd_ = "";
    private String errorMessage_ = "";

    static {
        BetamaxTranscoderSession betamaxTranscoderSession = new BetamaxTranscoderSession();
        DEFAULT_INSTANCE = betamaxTranscoderSession;
        AbstractC0269h.registerDefaultInstance(BetamaxTranscoderSession.class, betamaxTranscoderSession);
    }

    private BetamaxTranscoderSession() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13684A(BetamaxTranscoderSession betamaxTranscoderSession, int i) {
        betamaxTranscoderSession.bitField0_ |= 256;
        betamaxTranscoderSession.resolutionWidth_ = i;
    }

    /* JADX INFO: renamed from: B */
    public static void m13685B(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 65536;
        betamaxTranscoderSession.totalMemoryBytes_ = j;
    }

    /* JADX INFO: renamed from: C */
    public static void m13686C(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        str.getClass();
        betamaxTranscoderSession.bitField0_ |= 1;
        betamaxTranscoderSession.transcodingId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m13687D(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        str.getClass();
        betamaxTranscoderSession.bitField0_ |= 1024;
        betamaxTranscoderSession.videoCodec_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static lb9 m13688E() {
        return (lb9) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13689n(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 32768;
        betamaxTranscoderSession.availableMemoryBytesAtStart_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m13690o(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 128;
        betamaxTranscoderSession.bitrate_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m13691p(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 64;
        betamaxTranscoderSession.bytesTransferredCache_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13692q(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 32;
        betamaxTranscoderSession.bytesTransferredNetwork_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m13693r(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        betamaxTranscoderSession.bitField0_ |= 4096;
        betamaxTranscoderSession.connectionTypeEnd_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13694s(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        betamaxTranscoderSession.bitField0_ |= 2048;
        betamaxTranscoderSession.connectionTypeStart_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13695t(BetamaxTranscoderSession betamaxTranscoderSession, int i) {
        betamaxTranscoderSession.bitField0_ |= 8192;
        betamaxTranscoderSession.errorCode_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m13696u(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        betamaxTranscoderSession.bitField0_ |= 16384;
        betamaxTranscoderSession.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13697v(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 8;
        betamaxTranscoderSession.msTranscodeEnd_ = j;
    }

    /* JADX INFO: renamed from: w */
    public static void m13698w(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 2;
        betamaxTranscoderSession.msTranscodeRequested_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m13699x(BetamaxTranscoderSession betamaxTranscoderSession, long j) {
        betamaxTranscoderSession.bitField0_ |= 4;
        betamaxTranscoderSession.msTranscodeStart_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m13700y(BetamaxTranscoderSession betamaxTranscoderSession, String str) {
        betamaxTranscoderSession.getClass();
        betamaxTranscoderSession.bitField0_ |= 16;
        betamaxTranscoderSession.reasonEnd_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m13701z(BetamaxTranscoderSession betamaxTranscoderSession, int i) {
        betamaxTranscoderSession.bitField0_ |= 512;
        betamaxTranscoderSession.resolutionHeight_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tင\b\nင\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eင\r\u000fဈ\u000e\u0010ဂ\u000f\u0011ဂ\u0010", new Object[]{"bitField0_", "transcodingId_", "msTranscodeRequested_", "msTranscodeStart_", "msTranscodeEnd_", "reasonEnd_", "bytesTransferredNetwork_", "bytesTransferredCache_", "bitrate_", "resolutionWidth_", "resolutionHeight_", "videoCodec_", "connectionTypeStart_", "connectionTypeEnd_", "errorCode_", "errorMessage_", "availableMemoryBytesAtStart_", "totalMemoryBytes_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxTranscoderSession();
        }
        if (iOrdinal == 4) {
            return new lb9(DEFAULT_INSTANCE);
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
        synchronized (BetamaxTranscoderSession.class) {
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
