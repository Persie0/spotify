package com.spotify.yourupdates.domain;

import com.google.protobuf.AbstractC0269h;
import p204p.gxe1;
import p204p.hxe1;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourUpdatesNotificationInteraction extends AbstractC0269h implements sre0 {
    public static final int CTA_URI_FIELD_NUMBER = 7;
    private static final YourUpdatesNotificationInteraction DEFAULT_INSTANCE;
    public static final int INTERACTION_DETAILS_FIELD_NUMBER = 3;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 2;
    public static final int MESSAGE_ID_FIELD_NUMBER = 6;
    public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private ihc0 interactionDetails_ = ihc0.f102235b;
    private String notificationId_ = "";
    private String interactionType_ = "";
    private String requestId_ = "";
    private String opportunityId_ = "";
    private String messageId_ = "";
    private String ctaUri_ = "";

    static {
        YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction = new YourUpdatesNotificationInteraction();
        DEFAULT_INSTANCE = yourUpdatesNotificationInteraction;
        AbstractC0269h.registerDefaultInstance(YourUpdatesNotificationInteraction.class, yourUpdatesNotificationInteraction);
    }

    private YourUpdatesNotificationInteraction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23268n(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        str.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 32;
        yourUpdatesNotificationInteraction.ctaUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23269o(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 2;
        yourUpdatesNotificationInteraction.interactionType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23270p(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        str.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 16;
        yourUpdatesNotificationInteraction.messageId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23271q(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        str.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 1;
        yourUpdatesNotificationInteraction.notificationId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m23272r(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        str.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 8;
        yourUpdatesNotificationInteraction.opportunityId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m23273s(YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction, String str) {
        yourUpdatesNotificationInteraction.getClass();
        str.getClass();
        yourUpdatesNotificationInteraction.bitField0_ |= 4;
        yourUpdatesNotificationInteraction.requestId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static gxe1 m23274t() {
        return (gxe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "notificationId_", "interactionType_", "interactionDetails_", hxe1.f96208a, "requestId_", "opportunityId_", "messageId_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new YourUpdatesNotificationInteraction();
        }
        if (iOrdinal == 4) {
            return new gxe1(DEFAULT_INSTANCE);
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
        synchronized (YourUpdatesNotificationInteraction.class) {
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
