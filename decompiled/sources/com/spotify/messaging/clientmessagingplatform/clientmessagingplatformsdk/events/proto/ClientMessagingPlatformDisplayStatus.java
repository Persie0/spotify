package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vke;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientMessagingPlatformDisplayStatus extends AbstractC0269h implements sre0 {
    public static final int CMP_MESSAGE_TYPE_FIELD_NUMBER = 15;
    private static final ClientMessagingPlatformDisplayStatus DEFAULT_INSTANCE;
    public static final int DISCARD_DETAILS_FIELD_NUMBER = 9;
    public static final int DISCARD_REASON_FIELD_NUMBER = 8;
    public static final int ENTITY_URI_FIELD_NUMBER = 16;
    public static final int LOCALE_FIELD_NUMBER = 10;
    public static final int LOCAL_MESSAGE_IDENTIFIER_FIELD_NUMBER = 14;
    public static final int MESSAGE_CREATIVE_CAMPAIGN_ID_FIELD_NUMBER = 13;
    public static final int MESSAGE_CREATIVE_ID_FIELD_NUMBER = 4;
    public static final int MESSAGE_CREATIVE_TEMPLATE_ID_FIELD_NUMBER = 12;
    public static final int MESSAGE_CREATIVE_VERSION_FIELD_NUMBER = 11;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_UUID_FIELD_NUMBER = 3;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 7;
    public static final int TRIGGER_FIELD_NUMBER = 6;
    private int bitField0_;
    private long messageCreativeCampaignId_;
    private long messageCreativeId_;
    private long messageCreativeTemplateId_;
    private long messageId_;
    private boolean success_;
    private String opportunityId_ = "";
    private String messageUuid_ = "";
    private String messageFormat_ = "";
    private String trigger_ = "";
    private String discardReason_ = "";
    private String discardDetails_ = "";
    private String locale_ = "";
    private String messageCreativeVersion_ = "";
    private String localMessageIdentifier_ = "";
    private String cmpMessageType_ = "";
    private String entityUri_ = "";

    static {
        ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus = new ClientMessagingPlatformDisplayStatus();
        DEFAULT_INSTANCE = clientMessagingPlatformDisplayStatus;
        AbstractC0269h.registerDefaultInstance(ClientMessagingPlatformDisplayStatus.class, clientMessagingPlatformDisplayStatus);
    }

    private ClientMessagingPlatformDisplayStatus() {
    }

    /* JADX INFO: renamed from: A */
    public static void m15252A(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, boolean z) {
        clientMessagingPlatformDisplayStatus.bitField0_ |= 64;
        clientMessagingPlatformDisplayStatus.success_ = z;
    }

    /* JADX INFO: renamed from: B */
    public static void m15253B(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 32;
        clientMessagingPlatformDisplayStatus.trigger_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static vke m15254C() {
        return (vke) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m15255n(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 16384;
        clientMessagingPlatformDisplayStatus.cmpMessageType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15256o(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 256;
        clientMessagingPlatformDisplayStatus.discardDetails_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15257p(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 128;
        clientMessagingPlatformDisplayStatus.discardReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m15258q(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 32768;
        clientMessagingPlatformDisplayStatus.entityUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m15259r(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 512;
        clientMessagingPlatformDisplayStatus.locale_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m15260s(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, long j) {
        clientMessagingPlatformDisplayStatus.bitField0_ |= 4096;
        clientMessagingPlatformDisplayStatus.messageCreativeCampaignId_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m15261t(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, long j) {
        clientMessagingPlatformDisplayStatus.bitField0_ |= 8;
        clientMessagingPlatformDisplayStatus.messageCreativeId_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m15262u(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, long j) {
        clientMessagingPlatformDisplayStatus.bitField0_ |= 2048;
        clientMessagingPlatformDisplayStatus.messageCreativeTemplateId_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m15263v(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 1024;
        clientMessagingPlatformDisplayStatus.messageCreativeVersion_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m15264w(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 16;
        clientMessagingPlatformDisplayStatus.messageFormat_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m15265x(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, long j) {
        clientMessagingPlatformDisplayStatus.bitField0_ |= 2;
        clientMessagingPlatformDisplayStatus.messageId_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m15266y(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 4;
        clientMessagingPlatformDisplayStatus.messageUuid_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m15267z(ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus, String str) {
        clientMessagingPlatformDisplayStatus.getClass();
        str.getClass();
        clientMessagingPlatformDisplayStatus.bitField0_ |= 1;
        clientMessagingPlatformDisplayStatus.opportunityId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဂ\u000b\rဂ\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f", new Object[]{"bitField0_", "opportunityId_", "messageId_", "messageUuid_", "messageCreativeId_", "messageFormat_", "trigger_", "success_", "discardReason_", "discardDetails_", "locale_", "messageCreativeVersion_", "messageCreativeTemplateId_", "messageCreativeCampaignId_", "localMessageIdentifier_", "cmpMessageType_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformDisplayStatus();
        }
        if (iOrdinal == 4) {
            return new vke(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformDisplayStatus.class) {
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
