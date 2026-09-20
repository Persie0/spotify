package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uke;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientMessagingPlatformDismissEvent extends AbstractC0269h implements sre0 {
    public static final int BUTTON_IDENTIFIER_FIELD_NUMBER = 12;
    public static final int CMP_MESSAGE_TYPE_FIELD_NUMBER = 14;
    private static final ClientMessagingPlatformDismissEvent DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 7;
    public static final int ENTITY_URI_FIELD_NUMBER = 15;
    public static final int LOCALE_FIELD_NUMBER = 8;
    public static final int LOCAL_MESSAGE_IDENTIFIER_FIELD_NUMBER = 13;
    public static final int MESSAGE_CREATIVE_CAMPAIGN_ID_FIELD_NUMBER = 11;
    public static final int MESSAGE_CREATIVE_ID_FIELD_NUMBER = 4;
    public static final int MESSAGE_CREATIVE_TEMPLATE_ID_FIELD_NUMBER = 10;
    public static final int MESSAGE_CREATIVE_VERSION_FIELD_NUMBER = 9;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_UUID_FIELD_NUMBER = 3;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 6;
    private int bitField0_;
    private long messageCreativeCampaignId_;
    private long messageCreativeId_;
    private long messageCreativeTemplateId_;
    private long messageId_;
    private String opportunityId_ = "";
    private String messageUuid_ = "";
    private String messageFormat_ = "";
    private String trigger_ = "";
    private String dismissType_ = "";
    private String locale_ = "";
    private String messageCreativeVersion_ = "";
    private String buttonIdentifier_ = "";
    private String localMessageIdentifier_ = "";
    private String cmpMessageType_ = "";
    private String entityUri_ = "";

    static {
        ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent = new ClientMessagingPlatformDismissEvent();
        DEFAULT_INSTANCE = clientMessagingPlatformDismissEvent;
        AbstractC0269h.registerDefaultInstance(ClientMessagingPlatformDismissEvent.class, clientMessagingPlatformDismissEvent);
    }

    private ClientMessagingPlatformDismissEvent() {
    }

    /* JADX INFO: renamed from: A */
    public static void m15237A(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 32;
        clientMessagingPlatformDismissEvent.trigger_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static uke m15238B() {
        return (uke) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m15239n(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 2048;
        clientMessagingPlatformDismissEvent.buttonIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15240o(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 8192;
        clientMessagingPlatformDismissEvent.cmpMessageType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15241p(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 64;
        clientMessagingPlatformDismissEvent.dismissType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15242q(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 16384;
        clientMessagingPlatformDismissEvent.entityUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m15243r(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 128;
        clientMessagingPlatformDismissEvent.locale_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m15244s(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, long j) {
        clientMessagingPlatformDismissEvent.bitField0_ |= 1024;
        clientMessagingPlatformDismissEvent.messageCreativeCampaignId_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m15245t(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, long j) {
        clientMessagingPlatformDismissEvent.bitField0_ |= 8;
        clientMessagingPlatformDismissEvent.messageCreativeId_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m15246u(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, long j) {
        clientMessagingPlatformDismissEvent.bitField0_ |= 512;
        clientMessagingPlatformDismissEvent.messageCreativeTemplateId_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m15247v(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 256;
        clientMessagingPlatformDismissEvent.messageCreativeVersion_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m15248w(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 16;
        clientMessagingPlatformDismissEvent.messageFormat_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m15249x(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, long j) {
        clientMessagingPlatformDismissEvent.bitField0_ |= 2;
        clientMessagingPlatformDismissEvent.messageId_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m15250y(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 4;
        clientMessagingPlatformDismissEvent.messageUuid_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m15251z(ClientMessagingPlatformDismissEvent clientMessagingPlatformDismissEvent, String str) {
        clientMessagingPlatformDismissEvent.getClass();
        str.getClass();
        clientMessagingPlatformDismissEvent.bitField0_ |= 1;
        clientMessagingPlatformDismissEvent.opportunityId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဂ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e", new Object[]{"bitField0_", "opportunityId_", "messageId_", "messageUuid_", "messageCreativeId_", "messageFormat_", "trigger_", "dismissType_", "locale_", "messageCreativeVersion_", "messageCreativeTemplateId_", "messageCreativeCampaignId_", "buttonIdentifier_", "localMessageIdentifier_", "cmpMessageType_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformDismissEvent();
        }
        if (iOrdinal == 4) {
            return new uke(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformDismissEvent.class) {
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
