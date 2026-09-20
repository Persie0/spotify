package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vdt0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushAndroidDeviceSettingsV1 extends AbstractC0269h implements sre0 {
    private static final PushAndroidDeviceSettingsV1 DEFAULT_INSTANCE;
    public static final int DEVICE_LANGUAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_NOTIFICATIONS_ENABLED_FIELD_NUMBER = 3;
    public static final int SCREEN_READER_ENABLED_FIELD_NUMBER = 2;
    private int bitField0_;
    private String deviceLanguage_ = "";
    private boolean pushNotificationsEnabled_;
    private boolean screenReaderEnabled_;

    static {
        PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1 = new PushAndroidDeviceSettingsV1();
        DEFAULT_INSTANCE = pushAndroidDeviceSettingsV1;
        AbstractC0269h.registerDefaultInstance(PushAndroidDeviceSettingsV1.class, pushAndroidDeviceSettingsV1);
    }

    private PushAndroidDeviceSettingsV1() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14373n(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, String str) {
        pushAndroidDeviceSettingsV1.getClass();
        pushAndroidDeviceSettingsV1.bitField0_ |= 1;
        pushAndroidDeviceSettingsV1.deviceLanguage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14374o(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, boolean z) {
        pushAndroidDeviceSettingsV1.bitField0_ |= 4;
        pushAndroidDeviceSettingsV1.pushNotificationsEnabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m14375p(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, boolean z) {
        pushAndroidDeviceSettingsV1.bitField0_ |= 2;
        pushAndroidDeviceSettingsV1.screenReaderEnabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static vdt0 m14376q() {
        return (vdt0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "deviceLanguage_", "screenReaderEnabled_", "pushNotificationsEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PushAndroidDeviceSettingsV1();
        }
        if (iOrdinal == 4) {
            return new vdt0(DEFAULT_INSTANCE);
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
        synchronized (PushAndroidDeviceSettingsV1.class) {
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
