package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qet0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationDisplayedAndroidEvent extends AbstractC0269h implements sre0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 3;
    private static final PushNotificationDisplayedAndroidEvent DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 6;
    public static final int IS_OS_NOTIFICATIONS_ENABLED_FIELD_NUMBER = 8;
    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 7;
    public static final int UI_DOWNGRADE_REASON_FIELD_NUMBER = 5;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOsNotificationsEnabled_;
    private boolean isSuccess_;
    private String uuid_ = "";
    private String messageId_ = "";
    private String appDeviceId_ = "";
    private String uiDowngradeReason_ = "";
    private String error_ = "";
    private String targetUri_ = "";

    static {
        PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent = new PushNotificationDisplayedAndroidEvent();
        DEFAULT_INSTANCE = pushNotificationDisplayedAndroidEvent;
        AbstractC0269h.registerDefaultInstance(PushNotificationDisplayedAndroidEvent.class, pushNotificationDisplayedAndroidEvent);
    }

    private PushNotificationDisplayedAndroidEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14377n(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 4;
        pushNotificationDisplayedAndroidEvent.appDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14378o(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 32;
        pushNotificationDisplayedAndroidEvent.error_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14379p(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, boolean z) {
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 128;
        pushNotificationDisplayedAndroidEvent.isOsNotificationsEnabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14380q(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, boolean z) {
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 8;
        pushNotificationDisplayedAndroidEvent.isSuccess_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m14381r(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 2;
        pushNotificationDisplayedAndroidEvent.messageId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14382s(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 64;
        pushNotificationDisplayedAndroidEvent.targetUri_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14383t(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 16;
        pushNotificationDisplayedAndroidEvent.uiDowngradeReason_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14384u(PushNotificationDisplayedAndroidEvent pushNotificationDisplayedAndroidEvent, String str) {
        pushNotificationDisplayedAndroidEvent.getClass();
        str.getClass();
        pushNotificationDisplayedAndroidEvent.bitField0_ |= 1;
        pushNotificationDisplayedAndroidEvent.uuid_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static qet0 m14385v() {
        return (qet0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"bitField0_", "uuid_", "messageId_", "appDeviceId_", "isSuccess_", "uiDowngradeReason_", "error_", "targetUri_", "isOsNotificationsEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationDisplayedAndroidEvent();
        }
        if (iOrdinal == 4) {
            return new qet0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationDisplayedAndroidEvent.class) {
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
