package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.k89;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxCDN extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_CDNS_FIELD_NUMBER = 15;
    public static final int CDN_HOST_FIELD_NUMBER = 2;
    public static final int CONTENT_LENGTH_FIELD_NUMBER = 11;
    private static final BetamaxCDN DEFAULT_INSTANCE;
    public static final int MS_REQUEST_TIME_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 13;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 14;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 7;
    public static final int USER_AGENT_FIELD_NUMBER = 4;
    public static final int VERB_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 8;
    public static final int X_CACHE_FIELD_NUMBER = 9;
    public static final int X_CACHE_HITS_FIELD_NUMBER = 10;
    private int bitField0_;
    private long contentLength_;
    private long msRequestTime_;
    private int status_;
    private String sessionId_ = "";
    private String cdnHost_ = "";
    private String userAgent_ = "";
    private String verb_ = "";
    private String uri_ = "";
    private String version_ = "";
    private String xCache_ = "";
    private String xCacheHits_ = "";
    private String requestId_ = "";
    private String requestType_ = "";
    private String availableCdns_ = "";

    static {
        BetamaxCDN betamaxCDN = new BetamaxCDN();
        DEFAULT_INSTANCE = betamaxCDN;
        AbstractC0269h.registerDefaultInstance(BetamaxCDN.class, betamaxCDN);
    }

    private BetamaxCDN() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13582A(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 256;
        betamaxCDN.xCacheHits_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static k89 m13583B() {
        return (k89) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13584n(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 8192;
        betamaxCDN.availableCdns_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13585o(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 2;
        betamaxCDN.cdnHost_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13586p(BetamaxCDN betamaxCDN, long j) {
        betamaxCDN.bitField0_ |= 512;
        betamaxCDN.contentLength_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13587q(BetamaxCDN betamaxCDN, long j) {
        betamaxCDN.bitField0_ |= 1024;
        betamaxCDN.msRequestTime_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m13588r(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 2048;
        betamaxCDN.requestId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13589s(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 4096;
        betamaxCDN.requestType_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13590t(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.bitField0_ |= 1;
        betamaxCDN.sessionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13591u(BetamaxCDN betamaxCDN, int i) {
        betamaxCDN.bitField0_ |= 8;
        betamaxCDN.status_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m13592v(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 32;
        betamaxCDN.uri_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13593w(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 4;
        betamaxCDN.userAgent_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m13594x(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 16;
        betamaxCDN.verb_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m13595y(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 64;
        betamaxCDN.version_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m13596z(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        betamaxCDN.bitField0_ |= 128;
        betamaxCDN.xCache_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005င\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဂ\t\fဂ\n\rဈ\u000b\u000eဈ\f\u000fဈ\r", new Object[]{"bitField0_", "sessionId_", "cdnHost_", "userAgent_", "status_", "verb_", "uri_", "version_", "xCache_", "xCacheHits_", "contentLength_", "msRequestTime_", "requestId_", "requestType_", "availableCdns_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxCDN();
        }
        if (iOrdinal == 4) {
            return new k89(DEFAULT_INSTANCE);
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
        synchronized (BetamaxCDN.class) {
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
