package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gle;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientMessagingPlatformRequestErrorEvent extends AbstractC0269h implements sre0 {
    private static final ClientMessagingPlatformRequestErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_DETAILS_FIELD_NUMBER = 4;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String opportunityId_ = "";
    private String trigger_ = "";
    private String errorReason_ = "";
    private String errorDetails_ = "";

    static {
        ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent = new ClientMessagingPlatformRequestErrorEvent();
        DEFAULT_INSTANCE = clientMessagingPlatformRequestErrorEvent;
        AbstractC0269h.registerDefaultInstance(ClientMessagingPlatformRequestErrorEvent.class, clientMessagingPlatformRequestErrorEvent);
    }

    private ClientMessagingPlatformRequestErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15292n(ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent, String str) {
        clientMessagingPlatformRequestErrorEvent.getClass();
        str.getClass();
        clientMessagingPlatformRequestErrorEvent.bitField0_ |= 8;
        clientMessagingPlatformRequestErrorEvent.errorDetails_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15293o(ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent, String str) {
        clientMessagingPlatformRequestErrorEvent.getClass();
        clientMessagingPlatformRequestErrorEvent.bitField0_ |= 4;
        clientMessagingPlatformRequestErrorEvent.errorReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15294p(ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent, String str) {
        clientMessagingPlatformRequestErrorEvent.getClass();
        clientMessagingPlatformRequestErrorEvent.bitField0_ |= 1;
        clientMessagingPlatformRequestErrorEvent.opportunityId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15295q(ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent, String str) {
        clientMessagingPlatformRequestErrorEvent.getClass();
        str.getClass();
        clientMessagingPlatformRequestErrorEvent.bitField0_ |= 2;
        clientMessagingPlatformRequestErrorEvent.trigger_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static gle m15296r() {
        return (gle) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "opportunityId_", "trigger_", "errorReason_", "errorDetails_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformRequestErrorEvent();
        }
        if (iOrdinal == 4) {
            return new gle(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformRequestErrorEvent.class) {
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
