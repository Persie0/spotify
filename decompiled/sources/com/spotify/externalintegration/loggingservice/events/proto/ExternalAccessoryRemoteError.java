package com.spotify.externalintegration.loggingservice.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ewx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ExternalAccessoryRemoteError extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 9;
    private static final ExternalAccessoryRemoteError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 3;
    public static final int ERROR_IS_RECOVERABLE_FIELD_NUMBER = 6;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 7;
    public static final int INTEGRATION_FIELD_NUMBER = 8;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOTE_SESSION_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsRecoverable_;
    private String interactionId_ = "";
    private String remoteSessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String impressionId_ = "";
    private String integration_ = "";
    private String action_ = "";

    static {
        ExternalAccessoryRemoteError externalAccessoryRemoteError = new ExternalAccessoryRemoteError();
        DEFAULT_INSTANCE = externalAccessoryRemoteError;
        AbstractC0269h.registerDefaultInstance(ExternalAccessoryRemoteError.class, externalAccessoryRemoteError);
    }

    private ExternalAccessoryRemoteError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10562n(ExternalAccessoryRemoteError externalAccessoryRemoteError, String str) {
        externalAccessoryRemoteError.getClass();
        str.getClass();
        externalAccessoryRemoteError.bitField0_ |= 256;
        externalAccessoryRemoteError.action_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10563o(ExternalAccessoryRemoteError externalAccessoryRemoteError, String str) {
        externalAccessoryRemoteError.getClass();
        str.getClass();
        externalAccessoryRemoteError.bitField0_ |= 8;
        externalAccessoryRemoteError.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m10564p(ExternalAccessoryRemoteError externalAccessoryRemoteError, String str) {
        externalAccessoryRemoteError.getClass();
        str.getClass();
        externalAccessoryRemoteError.bitField0_ |= 128;
        externalAccessoryRemoteError.integration_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m10565q(ExternalAccessoryRemoteError externalAccessoryRemoteError, String str) {
        externalAccessoryRemoteError.getClass();
        str.getClass();
        externalAccessoryRemoteError.bitField0_ |= 1;
        externalAccessoryRemoteError.interactionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static ewx m10566r() {
        return (ewx) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "interactionId_", "remoteSessionId_", "errorDomain_", "errorDescription_", "errorCode_", "errorIsRecoverable_", "impressionId_", "integration_", "action_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryRemoteError();
        }
        if (iOrdinal == 4) {
            return new ewx(DEFAULT_INSTANCE);
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
        synchronized (ExternalAccessoryRemoteError.class) {
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
