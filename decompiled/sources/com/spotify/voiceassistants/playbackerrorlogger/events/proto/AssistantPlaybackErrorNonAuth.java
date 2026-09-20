package com.spotify.voiceassistants.playbackerrorlogger.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ec6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AssistantPlaybackErrorNonAuth extends AbstractC0269h implements sre0 {
    public static final int BACKEND_REQUEST_ID_FIELD_NUMBER = 6;
    private static final AssistantPlaybackErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int ERROR_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    public static final int PACKAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_URI_FIELD_NUMBER = 3;
    public static final int USER_ID_FIELD_NUMBER = 7;
    private int bitField0_;
    private String interactionId_ = "";
    private String packageId_ = "";
    private String requestedUri_ = "";
    private String errorType_ = "";
    private String errorDescription_ = "";
    private String backendRequestId_ = "";
    private String userId_ = "";

    static {
        AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth = new AssistantPlaybackErrorNonAuth();
        DEFAULT_INSTANCE = assistantPlaybackErrorNonAuth;
        AbstractC0269h.registerDefaultInstance(AssistantPlaybackErrorNonAuth.class, assistantPlaybackErrorNonAuth);
    }

    private AssistantPlaybackErrorNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22333n(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 32;
        assistantPlaybackErrorNonAuth.backendRequestId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22334o(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 16;
        assistantPlaybackErrorNonAuth.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22335p(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 8;
        assistantPlaybackErrorNonAuth.errorType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22336q(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 1;
        assistantPlaybackErrorNonAuth.interactionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m22337r(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 2;
        assistantPlaybackErrorNonAuth.packageId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m22338s(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 4;
        assistantPlaybackErrorNonAuth.requestedUri_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m22339t(AssistantPlaybackErrorNonAuth assistantPlaybackErrorNonAuth, String str) {
        assistantPlaybackErrorNonAuth.getClass();
        str.getClass();
        assistantPlaybackErrorNonAuth.bitField0_ |= 64;
        assistantPlaybackErrorNonAuth.userId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static ec6 m22340u() {
        return (ec6) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "interactionId_", "packageId_", "requestedUri_", "errorType_", "errorDescription_", "backendRequestId_", "userId_"});
        }
        if (iOrdinal == 3) {
            return new AssistantPlaybackErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new ec6(DEFAULT_INSTANCE);
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
        synchronized (AssistantPlaybackErrorNonAuth.class) {
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
