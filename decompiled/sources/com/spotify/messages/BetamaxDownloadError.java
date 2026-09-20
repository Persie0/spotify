package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q89;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxDownloadError extends AbstractC0269h implements sre0 {
    private static final BetamaxDownloadError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 4;
    public static final int ERROR_EXTRA1_FIELD_NUMBER = 7;
    public static final int ERROR_EXTRA2_FIELD_NUMBER = 8;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int errorCode_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String errorExtra1_ = "";
    private String errorExtra2_ = "";

    static {
        BetamaxDownloadError betamaxDownloadError = new BetamaxDownloadError();
        DEFAULT_INSTANCE = betamaxDownloadError;
        AbstractC0269h.registerDefaultInstance(BetamaxDownloadError.class, betamaxDownloadError);
    }

    private BetamaxDownloadError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13597n(BetamaxDownloadError betamaxDownloadError, int i) {
        betamaxDownloadError.bitField0_ |= 16;
        betamaxDownloadError.errorCode_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m13598o(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        betamaxDownloadError.bitField0_ |= 32;
        betamaxDownloadError.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13599p(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        betamaxDownloadError.bitField0_ |= 8;
        betamaxDownloadError.errorDomain_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13600q(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.bitField0_ |= 64;
        betamaxDownloadError.errorExtra1_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13601r(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        betamaxDownloadError.bitField0_ |= 128;
        betamaxDownloadError.errorExtra2_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13602s(BetamaxDownloadError betamaxDownloadError) {
        betamaxDownloadError.getClass();
        betamaxDownloadError.bitField0_ |= 1;
        betamaxDownloadError.featureIdentifier_ = "offline-coordinator";
    }

    /* JADX INFO: renamed from: t */
    public static void m13603t(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.bitField0_ |= 2;
        betamaxDownloadError.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13604u(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.bitField0_ |= 4;
        betamaxDownloadError.sessionId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static q89 m13605v() {
        return (q89) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "errorDomain_", "errorCode_", "errorDescription_", "errorExtra1_", "errorExtra2_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxDownloadError();
        }
        if (iOrdinal == 4) {
            return new q89(DEFAULT_INSTANCE);
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
        synchronized (BetamaxDownloadError.class) {
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
