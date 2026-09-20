package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.set0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationInteractionV1 extends AbstractC0269h implements sre0 {
    public static final int APP_DEVICE_ID_FIELD_NUMBER = 6;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 4;
    private static final PushNotificationInteractionV1 DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_ID_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
    private int bitField0_;
    private long timestampMs_;
    private String eventType_ = "";
    private String pushId_ = "";
    private String campaignId_ = "";
    private String data_ = "";
    private String appDeviceId_ = "";

    static {
        PushNotificationInteractionV1 pushNotificationInteractionV1 = new PushNotificationInteractionV1();
        DEFAULT_INSTANCE = pushNotificationInteractionV1;
        AbstractC0269h.registerDefaultInstance(PushNotificationInteractionV1.class, pushNotificationInteractionV1);
    }

    private PushNotificationInteractionV1() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14386n(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.bitField0_ |= 32;
        pushNotificationInteractionV1.appDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14387o(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.bitField0_ |= 4;
        pushNotificationInteractionV1.campaignId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14388p(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.bitField0_ |= 8;
        pushNotificationInteractionV1.data_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14389q(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        pushNotificationInteractionV1.bitField0_ |= 1;
        pushNotificationInteractionV1.eventType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14390r(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.bitField0_ |= 2;
        pushNotificationInteractionV1.pushId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14391s(PushNotificationInteractionV1 pushNotificationInteractionV1, long j) {
        pushNotificationInteractionV1.bitField0_ |= 16;
        pushNotificationInteractionV1.timestampMs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static set0 m14392t() {
        return (set0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "eventType_", "pushId_", "campaignId_", "data_", "timestampMs_", "appDeviceId_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationInteractionV1();
        }
        if (iOrdinal == 4) {
            return new set0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationInteractionV1.class) {
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
