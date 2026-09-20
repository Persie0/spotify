package com.spotify.yourupdates.domain;

import com.google.protobuf.AbstractC0269h;
import p204p.fxe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourUpdatesNotificationImpression extends AbstractC0269h implements sre0 {
    public static final int ACTION_URI_FIELD_NUMBER = 7;
    private static final YourUpdatesNotificationImpression DEFAULT_INSTANCE;
    public static final int IS_NEW_FIELD_NUMBER = 3;
    public static final int MESSAGE_ID_FIELD_NUMBER = 6;
    public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isNew_;
    private int position_;
    private String notificationId_ = "";
    private String requestId_ = "";
    private String opportunityId_ = "";
    private String messageId_ = "";
    private String actionUri_ = "";

    static {
        YourUpdatesNotificationImpression yourUpdatesNotificationImpression = new YourUpdatesNotificationImpression();
        DEFAULT_INSTANCE = yourUpdatesNotificationImpression;
        AbstractC0269h.registerDefaultInstance(YourUpdatesNotificationImpression.class, yourUpdatesNotificationImpression);
    }

    private YourUpdatesNotificationImpression() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23260n(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, String str) {
        yourUpdatesNotificationImpression.getClass();
        str.getClass();
        yourUpdatesNotificationImpression.bitField0_ |= 64;
        yourUpdatesNotificationImpression.actionUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23261o(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, boolean z) {
        yourUpdatesNotificationImpression.bitField0_ |= 4;
        yourUpdatesNotificationImpression.isNew_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m23262p(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, String str) {
        yourUpdatesNotificationImpression.getClass();
        str.getClass();
        yourUpdatesNotificationImpression.bitField0_ |= 32;
        yourUpdatesNotificationImpression.messageId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m23263q(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, String str) {
        yourUpdatesNotificationImpression.getClass();
        str.getClass();
        yourUpdatesNotificationImpression.bitField0_ |= 1;
        yourUpdatesNotificationImpression.notificationId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m23264r(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, String str) {
        yourUpdatesNotificationImpression.getClass();
        str.getClass();
        yourUpdatesNotificationImpression.bitField0_ |= 16;
        yourUpdatesNotificationImpression.opportunityId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m23265s(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, int i) {
        yourUpdatesNotificationImpression.bitField0_ |= 2;
        yourUpdatesNotificationImpression.position_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m23266t(YourUpdatesNotificationImpression yourUpdatesNotificationImpression, String str) {
        yourUpdatesNotificationImpression.getClass();
        str.getClass();
        yourUpdatesNotificationImpression.bitField0_ |= 8;
        yourUpdatesNotificationImpression.requestId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static fxe1 m23267u() {
        return (fxe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "notificationId_", "position_", "isNew_", "requestId_", "opportunityId_", "messageId_", "actionUri_"});
        }
        if (iOrdinal == 3) {
            return new YourUpdatesNotificationImpression();
        }
        if (iOrdinal == 4) {
            return new fxe1(DEFAULT_INSTANCE);
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
        synchronized (YourUpdatesNotificationImpression.class) {
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
