package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u89;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxDownloadSession extends AbstractC0269h implements sre0 {
    public static final int BITRATE_FIELD_NUMBER = 7;
    public static final int CONNECTION_TYPE_END_FIELD_NUMBER = 9;
    public static final int CONNECTION_TYPE_START_FIELD_NUMBER = 8;
    private static final BetamaxDownloadSession DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int KBYTES_DOWNLOADED_FIELD_NUMBER = 4;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    public static final int MS_DOWNLOAD_TIME_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 10;
    private int bitField0_;
    private long bitrate_;
    private long kbytesDownloaded_;
    private long msDownloadTime_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String reasonEnd_ = "";
    private String connectionTypeStart_ = "";
    private String connectionTypeEnd_ = "";
    private String videoCodec_ = "";

    static {
        BetamaxDownloadSession betamaxDownloadSession = new BetamaxDownloadSession();
        DEFAULT_INSTANCE = betamaxDownloadSession;
        AbstractC0269h.registerDefaultInstance(BetamaxDownloadSession.class, betamaxDownloadSession);
    }

    private BetamaxDownloadSession() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13606n(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.bitField0_ |= 64;
        betamaxDownloadSession.bitrate_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m13607o(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        betamaxDownloadSession.bitField0_ |= 256;
        betamaxDownloadSession.connectionTypeEnd_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13608p(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.bitField0_ |= 128;
        betamaxDownloadSession.connectionTypeStart_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13609q(BetamaxDownloadSession betamaxDownloadSession) {
        betamaxDownloadSession.getClass();
        betamaxDownloadSession.bitField0_ |= 1;
        betamaxDownloadSession.featureIdentifier_ = "offline-coordinator";
    }

    /* JADX INFO: renamed from: r */
    public static void m13610r(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.bitField0_ |= 8;
        betamaxDownloadSession.kbytesDownloaded_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13611s(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.bitField0_ |= 2;
        betamaxDownloadSession.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13612t(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.bitField0_ |= 16;
        betamaxDownloadSession.msDownloadTime_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m13613u(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.bitField0_ |= 32;
        betamaxDownloadSession.reasonEnd_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13614v(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.bitField0_ |= 4;
        betamaxDownloadSession.sessionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13615w(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.bitField0_ |= 512;
        betamaxDownloadSession.videoCodec_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static u89 m13616x() {
        return (u89) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "kbytesDownloaded_", "msDownloadTime_", "reasonEnd_", "bitrate_", "connectionTypeStart_", "connectionTypeEnd_", "videoCodec_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxDownloadSession();
        }
        if (iOrdinal == 4) {
            return new u89(DEFAULT_INSTANCE);
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
        synchronized (BetamaxDownloadSession.class) {
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
