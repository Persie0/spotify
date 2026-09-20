package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fle;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientMessagingPlatformProtoTransformationFailure extends AbstractC0269h implements sre0 {
    private static final ClientMessagingPlatformProtoTransformationFailure DEFAULT_INSTANCE;
    public static final int MESSAGE_CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_CREATIVE_ID_FIELD_NUMBER = 3;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_UUID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSFORMATION_FAILURE_REASON_FIELD_NUMBER = 6;
    private int bitField0_;
    private long messageCampaignId_;
    private long messageCreativeId_;
    private long messageId_;
    private String messageUuid_ = "";
    private String messageFormat_ = "";
    private String transformationFailureReason_ = "";

    static {
        ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure = new ClientMessagingPlatformProtoTransformationFailure();
        DEFAULT_INSTANCE = clientMessagingPlatformProtoTransformationFailure;
        AbstractC0269h.registerDefaultInstance(ClientMessagingPlatformProtoTransformationFailure.class, clientMessagingPlatformProtoTransformationFailure);
    }

    private ClientMessagingPlatformProtoTransformationFailure() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15285n(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, long j) {
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 2;
        clientMessagingPlatformProtoTransformationFailure.messageCampaignId_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m15286o(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, long j) {
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 4;
        clientMessagingPlatformProtoTransformationFailure.messageCreativeId_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m15287p(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, String str) {
        clientMessagingPlatformProtoTransformationFailure.getClass();
        str.getClass();
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 16;
        clientMessagingPlatformProtoTransformationFailure.messageFormat_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15288q(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, long j) {
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 1;
        clientMessagingPlatformProtoTransformationFailure.messageId_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m15289r(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, String str) {
        clientMessagingPlatformProtoTransformationFailure.getClass();
        str.getClass();
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 8;
        clientMessagingPlatformProtoTransformationFailure.messageUuid_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m15290s(ClientMessagingPlatformProtoTransformationFailure clientMessagingPlatformProtoTransformationFailure, String str) {
        clientMessagingPlatformProtoTransformationFailure.getClass();
        clientMessagingPlatformProtoTransformationFailure.bitField0_ |= 32;
        clientMessagingPlatformProtoTransformationFailure.transformationFailureReason_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static fle m15291t() {
        return (fle) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "messageId_", "messageCampaignId_", "messageCreativeId_", "messageUuid_", "messageFormat_", "transformationFailureReason_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformProtoTransformationFailure();
        }
        if (iOrdinal == 4) {
            return new fle(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformProtoTransformationFailure.class) {
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
