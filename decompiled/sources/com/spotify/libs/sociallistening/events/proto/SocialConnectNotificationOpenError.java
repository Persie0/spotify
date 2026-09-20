package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fd31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialConnectNotificationOpenError extends AbstractC0269h implements sre0 {
    private static final SocialConnectNotificationOpenError DEFAULT_INSTANCE;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 1;
    public static final int ERROR_DATA_FIELD_NUMBER = 2;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_DEEPLINK_FIELD_NUMBER = 4;
    private int bitField0_;
    private String errorCategory_ = "";
    private String errorData_ = "";
    private String errorReason_ = "";
    private String targetDeeplink_ = "";

    static {
        SocialConnectNotificationOpenError socialConnectNotificationOpenError = new SocialConnectNotificationOpenError();
        DEFAULT_INSTANCE = socialConnectNotificationOpenError;
        AbstractC0269h.registerDefaultInstance(SocialConnectNotificationOpenError.class, socialConnectNotificationOpenError);
    }

    private SocialConnectNotificationOpenError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12866n(SocialConnectNotificationOpenError socialConnectNotificationOpenError, String str) {
        socialConnectNotificationOpenError.getClass();
        socialConnectNotificationOpenError.bitField0_ |= 1;
        socialConnectNotificationOpenError.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12867o(SocialConnectNotificationOpenError socialConnectNotificationOpenError, String str) {
        socialConnectNotificationOpenError.getClass();
        str.getClass();
        socialConnectNotificationOpenError.bitField0_ |= 2;
        socialConnectNotificationOpenError.errorData_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12868p(SocialConnectNotificationOpenError socialConnectNotificationOpenError, String str) {
        socialConnectNotificationOpenError.getClass();
        socialConnectNotificationOpenError.bitField0_ |= 4;
        socialConnectNotificationOpenError.errorReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12869q(SocialConnectNotificationOpenError socialConnectNotificationOpenError, String str) {
        socialConnectNotificationOpenError.getClass();
        str.getClass();
        socialConnectNotificationOpenError.bitField0_ |= 8;
        socialConnectNotificationOpenError.targetDeeplink_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static fd31 m12870r() {
        return (fd31) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "errorCategory_", "errorData_", "errorReason_", "targetDeeplink_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectNotificationOpenError();
        }
        if (iOrdinal == 4) {
            return new fd31(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectNotificationOpenError.class) {
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
